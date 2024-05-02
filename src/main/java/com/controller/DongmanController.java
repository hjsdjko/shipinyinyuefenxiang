
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 动漫
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/dongman")
public class DongmanController {
    private static final Logger logger = LoggerFactory.getLogger(DongmanController.class);

    @Autowired
    private DongmanService dongmanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("dongmanDeleteStart",1);params.put("dongmanDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = dongmanService.queryPage(params);

        //字典表数据转换
        List<DongmanView> list =(List<DongmanView>)page.getList();
        for(DongmanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DongmanEntity dongman = dongmanService.selectById(id);
        if(dongman !=null){
            //entity转view
            DongmanView view = new DongmanView();
            BeanUtils.copyProperties( dongman , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DongmanEntity dongman, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dongman:{}",this.getClass().getName(),dongman.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<DongmanEntity> queryWrapper = new EntityWrapper<DongmanEntity>()
            .eq("dongman_name", dongman.getDongmanName())
            .eq("dongman_types", dongman.getDongmanTypes())
            .eq("dongman_clicknum", dongman.getDongmanClicknum())
            .eq("shangxia_types", dongman.getShangxiaTypes())
            .eq("dongman_delete", dongman.getDongmanDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DongmanEntity dongmanEntity = dongmanService.selectOne(queryWrapper);
        if(dongmanEntity==null){
            dongman.setDongmanClicknum(1);
            dongman.setShangxiaTypes(1);
            dongman.setDongmanDelete(1);
            dongman.setCreateTime(new Date());
            dongmanService.insert(dongman);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DongmanEntity dongman, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,dongman:{}",this.getClass().getName(),dongman.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<DongmanEntity> queryWrapper = new EntityWrapper<DongmanEntity>()
            .notIn("id",dongman.getId())
            .andNew()
            .eq("dongman_name", dongman.getDongmanName())
            .eq("dongman_types", dongman.getDongmanTypes())
            .eq("dongman_clicknum", dongman.getDongmanClicknum())
            .eq("shangxia_types", dongman.getShangxiaTypes())
            .eq("dongman_delete", dongman.getDongmanDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DongmanEntity dongmanEntity = dongmanService.selectOne(queryWrapper);
        if("".equals(dongman.getDongmanPhoto()) || "null".equals(dongman.getDongmanPhoto())){
                dongman.setDongmanPhoto(null);
        }
        if(dongmanEntity==null){
            dongmanService.updateById(dongman);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<DongmanEntity> list = new ArrayList<>();
        for(Integer id:ids){
            DongmanEntity dongmanEntity = new DongmanEntity();
            dongmanEntity.setId(id);
            dongmanEntity.setDongmanDelete(2);
            list.add(dongmanEntity);
        }
        if(list != null && list.size() >0){
            dongmanService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<DongmanEntity> dongmanList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            DongmanEntity dongmanEntity = new DongmanEntity();
//                            dongmanEntity.setDongmanName(data.get(0));                    //动漫名称 要改的
//                            dongmanEntity.setDongmanPhoto("");//照片
//                            dongmanEntity.setDongmanTypes(Integer.valueOf(data.get(0)));   //动漫类型 要改的
//                            dongmanEntity.setDongmanClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            dongmanEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            dongmanEntity.setDongmanDelete(1);//逻辑删除字段
//                            dongmanEntity.setDongmanContent("");//照片
//                            dongmanEntity.setCreateTime(date);//时间
                            dongmanList.add(dongmanEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        dongmanService.insertBatch(dongmanList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","dongman_clicknum");
        }
        PageUtils page = dongmanService.queryPage(params);

        //字典表数据转换
        List<DongmanView> list =(List<DongmanView>)page.getList();
        for(DongmanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DongmanEntity dongman = dongmanService.selectById(id);
            if(dongman !=null){

                //点击数量加1
                dongman.setDongmanClicknum(dongman.getDongmanClicknum()+1);
                dongmanService.updateById(dongman);

                //entity转view
                DongmanView view = new DongmanView();
                BeanUtils.copyProperties( dongman , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody DongmanEntity dongman, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,dongman:{}",this.getClass().getName(),dongman.toString());
        Wrapper<DongmanEntity> queryWrapper = new EntityWrapper<DongmanEntity>()
            .eq("dongman_name", dongman.getDongmanName())
            .eq("dongman_types", dongman.getDongmanTypes())
            .eq("dongman_clicknum", dongman.getDongmanClicknum())
            .eq("shangxia_types", dongman.getShangxiaTypes())
            .eq("dongman_delete", dongman.getDongmanDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DongmanEntity dongmanEntity = dongmanService.selectOne(queryWrapper);
        if(dongmanEntity==null){
            dongman.setDongmanDelete(1);
            dongman.setCreateTime(new Date());
        dongmanService.insert(dongman);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
