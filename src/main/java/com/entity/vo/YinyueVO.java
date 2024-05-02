package com.entity.vo;

import com.entity.YinyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 音乐
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yinyue")
public class YinyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 音乐名称
     */

    @TableField(value = "yinyue_name")
    private String yinyueName;


    /**
     * 音乐照片
     */

    @TableField(value = "yinyue_photo")
    private String yinyuePhoto;


    /**
     * 音乐类型
     */

    @TableField(value = "yinyue_types")
    private Integer yinyueTypes;


    /**
     * 音乐
     */

    @TableField(value = "yinyue_music")
    private String yinyueMusic;


    /**
     * 点击次数
     */

    @TableField(value = "yinyue_clicknum")
    private Integer yinyueClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "yinyue_delete")
    private Integer yinyueDelete;


    /**
     * 音乐介绍
     */

    @TableField(value = "yinyue_content")
    private String yinyueContent;


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
	 * 设置：音乐名称
	 */
    public String getYinyueName() {
        return yinyueName;
    }


    /**
	 * 获取：音乐名称
	 */

    public void setYinyueName(String yinyueName) {
        this.yinyueName = yinyueName;
    }
    /**
	 * 设置：音乐照片
	 */
    public String getYinyuePhoto() {
        return yinyuePhoto;
    }


    /**
	 * 获取：音乐照片
	 */

    public void setYinyuePhoto(String yinyuePhoto) {
        this.yinyuePhoto = yinyuePhoto;
    }
    /**
	 * 设置：音乐类型
	 */
    public Integer getYinyueTypes() {
        return yinyueTypes;
    }


    /**
	 * 获取：音乐类型
	 */

    public void setYinyueTypes(Integer yinyueTypes) {
        this.yinyueTypes = yinyueTypes;
    }
    /**
	 * 设置：音乐
	 */
    public String getYinyueMusic() {
        return yinyueMusic;
    }


    /**
	 * 获取：音乐
	 */

    public void setYinyueMusic(String yinyueMusic) {
        this.yinyueMusic = yinyueMusic;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getYinyueClicknum() {
        return yinyueClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setYinyueClicknum(Integer yinyueClicknum) {
        this.yinyueClicknum = yinyueClicknum;
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
    public Integer getYinyueDelete() {
        return yinyueDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYinyueDelete(Integer yinyueDelete) {
        this.yinyueDelete = yinyueDelete;
    }
    /**
	 * 设置：音乐介绍
	 */
    public String getYinyueContent() {
        return yinyueContent;
    }


    /**
	 * 获取：音乐介绍
	 */

    public void setYinyueContent(String yinyueContent) {
        this.yinyueContent = yinyueContent;
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
