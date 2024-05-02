package com.entity.view;

import com.entity.ShipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 视频
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipin")
public class ShipinView extends ShipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 视频类型的值
		*/
		private String shipinValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ShipinView() {

	}

	public ShipinView(ShipinEntity shipinEntity) {
		try {
			BeanUtils.copyProperties(this, shipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
















}
