package com.dao;

import com.entity.YinyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YinyueView;

/**
 * 音乐 Dao 接口
 *
 * @author 
 */
public interface YinyueDao extends BaseMapper<YinyueEntity> {

   List<YinyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
