package com.entity.view;

import com.entity.DongmanLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 动漫留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dongman_liuyan")
public class DongmanLiuyanView extends DongmanLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 dongman
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
				* 动漫类型的值
				*/
				private String dongmanValue;
			/**
			* 点击次数
			*/
			private Integer dongmanClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer dongmanDelete;
			/**
			* 动漫详情
			*/
			private String dongmanContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户宠物号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public DongmanLiuyanView() {

	}

	public DongmanLiuyanView(DongmanLiuyanEntity dongmanLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, dongmanLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set dongman
					/**
					* 获取： 动漫名称
					*/
					public String getDongmanName() {
						return dongmanName;
					}
					/**
					* 设置： 动漫名称
					*/
					public void setDongmanName(String dongmanName) {
						this.dongmanName = dongmanName;
					}
					/**
					* 获取： 动漫照片
					*/
					public String getDongmanPhoto() {
						return dongmanPhoto;
					}
					/**
					* 设置： 动漫照片
					*/
					public void setDongmanPhoto(String dongmanPhoto) {
						this.dongmanPhoto = dongmanPhoto;
					}
					/**
					* 获取： 动漫类型
					*/
					public Integer getDongmanTypes() {
						return dongmanTypes;
					}
					/**
					* 设置： 动漫类型
					*/
					public void setDongmanTypes(Integer dongmanTypes) {
						this.dongmanTypes = dongmanTypes;
					}


						/**
						* 获取： 动漫类型的值
						*/
						public String getDongmanValue() {
							return dongmanValue;
						}
						/**
						* 设置： 动漫类型的值
						*/
						public void setDongmanValue(String dongmanValue) {
							this.dongmanValue = dongmanValue;
						}
					/**
					* 获取： 点击次数
					*/
					public Integer getDongmanClicknum() {
						return dongmanClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setDongmanClicknum(Integer dongmanClicknum) {
						this.dongmanClicknum = dongmanClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getDongmanDelete() {
						return dongmanDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setDongmanDelete(Integer dongmanDelete) {
						this.dongmanDelete = dongmanDelete;
					}
					/**
					* 获取： 动漫详情
					*/
					public String getDongmanContent() {
						return dongmanContent;
					}
					/**
					* 设置： 动漫详情
					*/
					public void setDongmanContent(String dongmanContent) {
						this.dongmanContent = dongmanContent;
					}


































				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户宠物号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户宠物号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
