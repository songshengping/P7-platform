package com.song.p7.platform.mapper;

import com.song.p7.platform.pojo.ItemsParam;

public interface ItemsParamMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemsParam record);

    int insertSelective(ItemsParam record);

    ItemsParam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsParam record);

    int updateByPrimaryKey(ItemsParam record);
}