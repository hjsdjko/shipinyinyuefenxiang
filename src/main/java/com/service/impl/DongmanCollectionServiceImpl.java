package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.DongmanCollectionDao;
import com.entity.DongmanCollectionEntity;
import com.service.DongmanCollectionService;
import com.entity.view.DongmanCollectionView;

/**
 * 动漫收藏 服务实现类
 */
@Service("dongmanCollectionService")
@Transactional
public class DongmanCollectionServiceImpl extends ServiceImpl<DongmanCollectionDao, DongmanCollectionEntity> implements DongmanCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DongmanCollectionView> page =new Query<DongmanCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
