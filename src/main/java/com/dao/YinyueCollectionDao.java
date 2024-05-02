package com.dao;

import com.entity.YinyueCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YinyueCollectionView;

/**
 * 音乐收藏 Dao 接口
 *
 * @author 
 */
public interface YinyueCollectionDao extends BaseMapper<YinyueCollectionEntity> {

   List<YinyueCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
