package com.entity.view;

import com.entity.YinyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 音乐
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yinyue")
public class YinyueView extends YinyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 音乐类型的值
		*/
		private String yinyueValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public YinyueView() {

	}

	public YinyueView(YinyueEntity yinyueEntity) {
		try {
			BeanUtils.copyProperties(this, yinyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 音乐类型的值
			*/
			public String getYinyueValue() {
				return yinyueValue;
			}
			/**
			* 设置： 音乐类型的值
			*/
			public void setYinyueValue(String yinyueValue) {
				this.yinyueValue = yinyueValue;
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
