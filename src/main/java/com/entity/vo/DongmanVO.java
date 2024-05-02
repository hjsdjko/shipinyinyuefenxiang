package com.entity.vo;

import com.entity.DongmanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 动漫
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dongman")
public class DongmanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 动漫名称
     */

    @TableField(value = "dongman_name")
    private String dongmanName;


    /**
     * 动漫照片
     */

    @TableField(value = "dongman_photo")
    private String dongmanPhoto;


    /**
     * 动漫类型
     */

    @TableField(value = "dongman_types")
    private Integer dongmanTypes;


    /**
     * 点击次数
     */

    @TableField(value = "dongman_clicknum")
    private Integer dongmanClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "dongman_delete")
    private Integer dongmanDelete;


    /**
     * 动漫详情
     */

    @TableField(value = "dongman_content")
    private String dongmanContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：动漫名称
	 */
    public String getDongmanName() {
        return dongmanName;
    }


    /**
	 * 获取：动漫名称
	 */

    public void setDongmanName(String dongmanName) {
        this.dongmanName = dongmanName;
    }
    /**
	 * 设置：动漫照片
	 */
    public String getDongmanPhoto() {
        return dongmanPhoto;
    }


    /**
	 * 获取：动漫照片
	 */

    public void setDongmanPhoto(String dongmanPhoto) {
        this.dongmanPhoto = dongmanPhoto;
    }
    /**
	 * 设置：动漫类型
	 */
    public Integer getDongmanTypes() {
        return dongmanTypes;
    }


    /**
	 * 获取：动漫类型
	 */

    public void setDongmanTypes(Integer dongmanTypes) {
        this.dongmanTypes = dongmanTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getDongmanClicknum() {
        return dongmanClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setDongmanClicknum(Integer dongmanClicknum) {
        this.dongmanClicknum = dongmanClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDongmanDelete() {
        return dongmanDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDongmanDelete(Integer dongmanDelete) {
        this.dongmanDelete = dongmanDelete;
    }
    /**
	 * 设置：动漫详情
	 */
    public String getDongmanContent() {
        return dongmanContent;
    }


    /**
	 * 获取：动漫详情
	 */

    public void setDongmanContent(String dongmanContent) {
        this.dongmanContent = dongmanContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
