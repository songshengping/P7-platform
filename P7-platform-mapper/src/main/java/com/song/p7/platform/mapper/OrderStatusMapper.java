package com.song.p7.platform.mapper;

import com.song.p7.platform.pojo.OrderStatus;

public interface OrderStatusMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    OrderStatus selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}