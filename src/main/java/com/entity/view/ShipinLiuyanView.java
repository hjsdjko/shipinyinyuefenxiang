package com.entity.view;

import com.entity.ShipinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 视频留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipin_liuyan")
public class ShipinLiuyanView extends ShipinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shipin
			/**
			* 视频名称
			*/
			private String shipinName;
			/**
			* 视频照片
			*/
			private String shipinPhoto;
			/**
			* 视频类型
			*/
			private Integer shipinTypes;
				/**
				* 视频类型的值
				*/
				private String shipinValue;
			/**
			* 视频
			*/
			private String shipinVideo;
			/**
			* 点击次数
			*/
			private Integer shipinClicknum;
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
			private Integer shipinDelete;
			/**
			* 视频介绍
			*/
			private String shipinContent;

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

	public ShipinLiuyanView() {

	}

	public ShipinLiuyanView(ShipinLiuyanEntity shipinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, shipinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set shipin
					/**
					* 获取： 视频名称
					*/
					public String getShipinName() {
						return shipinName;
					}
					/**
					* 设置： 视频名称
					*/
					public void setShipinName(String shipinName) {
						this.shipinName = shipinName;
					}
					/**
					* 获取： 视频照片
					*/
					public String getShipinPhoto() {
						return shipinPhoto;
					}
					/**
					* 设置： 视频照片
					*/
					public void setShipinPhoto(String shipinPhoto) {
						this.shipinPhoto = shipinPhoto;
					}
					/**
					* 获取： 视频类型
					*/
					public Integer getShipinTypes() {
						return shipinTypes;
					}
					/**
					* 设置： 视频类型
					*/
					public void setShipinTypes(Integer shipinTypes) {
						this.shipinTypes = shipinTypes;
					}


						/**
						* 获取： 视频类型的值
						*/
						public String getShipinValue() {
							return shipinValue;
						}
						/**
						* 设置： 视频类型的值
						*/
						public void setShipinValue(String shipinValue) {
							this.shipinValue = shipinValue;
						}
					/**
					* 获取： 视频
					*/
					public String getShipinVideo() {
						return shipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setShipinVideo(String shipinVideo) {
						this.shipinVideo = shipinVideo;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getShipinClicknum() {
						return shipinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShipinClicknum(Integer shipinClicknum) {
						this.shipinClicknum = shipinClicknum;
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
					public Integer getShipinDelete() {
						return shipinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShipinDelete(Integer shipinDelete) {
						this.shipinDelete = shipinDelete;
					}
					/**
					* 获取： 视频介绍
					*/
					public String getShipinContent() {
						return shipinContent;
					}
					/**
					* 设置： 视频介绍
					*/
					public void setShipinContent(String shipinContent) {
						this.shipinContent = shipinContent;
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
