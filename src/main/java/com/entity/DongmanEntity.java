package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 动漫
 *
 * @author 
 * @email
 */
@TableName("dongman")
public class DongmanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DongmanEntity() {

	}

	public DongmanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dongman{" +
            "id=" + id +
            ", dongmanName=" + dongmanName +
            ", dongmanPhoto=" + dongmanPhoto +
            ", dongmanTypes=" + dongmanTypes +
            ", dongmanClicknum=" + dongmanClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", dongmanDelete=" + dongmanDelete +
            ", dongmanContent=" + dongmanContent +
            ", createTime=" + createTime +
        "}";
    }
}
