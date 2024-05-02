package com.entity.view;

import com.entity.DongmanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 动漫
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dongman")
public class DongmanView extends DongmanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 动漫类型的值
		*/
		private String dongmanValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public DongmanView() {

	}

	public DongmanView(DongmanEntity dongmanEntity) {
		try {
			BeanUtils.copyProperties(this, dongmanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
