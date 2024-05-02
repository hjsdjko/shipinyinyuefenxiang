package com.entity.model;

import com.entity.DongmanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 动漫
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DongmanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 动漫名称
     */
    private String dongmanName;


    /**
     * 动漫照片
     */
    private String dongmanPhoto;


    /**
     * 动漫类型
     */
    private Integer dongmanTypes;


    /**
     * 点击次数
     */
    private Integer dongmanClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer dongmanDelete;


    /**
     * 动漫详情
     */
    private String dongmanContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：动漫名称
	 */
    public String getDongmanName() {
        return dongmanName;
    }


    /**
	 * 设置：动漫名称
	 */
    public void setDongmanName(String dongmanName) {
        this.dongmanName = dongmanName;
    }
    /**
	 * 获取：动漫照片
	 */
    public String getDongmanPhoto() {
        return dongmanPhoto;
    }


    /**
	 * 设置：动漫照片
	 */
    public void setDongmanPhoto(String dongmanPhoto) {
        this.dongmanPhoto = dongmanPhoto;
    }
    /**
	 * 获取：动漫类型
	 */
    public Integer getDongmanTypes() {
        return dongmanTypes;
    }


    /**
	 * 设置：动漫类型
	 */
    public void setDongmanTypes(Integer dongmanTypes) {
        this.dongmanTypes = dongmanTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getDongmanClicknum() {
        return dongmanClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setDongmanClicknum(Integer dongmanClicknum) {
        this.dongmanClicknum = dongmanClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDongmanDelete() {
        return dongmanDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setDongmanDelete(Integer dongmanDelete) {
        this.dongmanDelete = dongmanDelete;
    }
    /**
	 * 获取：动漫详情
	 */
    public String getDongmanContent() {
        return dongmanContent;
    }


    /**
	 * 设置：动漫详情
	 */
    public void setDongmanContent(String dongmanContent) {
        this.dongmanContent = dongmanContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
