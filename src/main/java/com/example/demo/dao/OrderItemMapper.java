package com.example.demo.dao;

import com.example.demo.po.OrderItem;
import com.example.demo.po.OrderItemCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    long countByExample(OrderItemCriteria example);

    int deleteByExample(OrderItemCriteria example);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectByExample(OrderItemCriteria example);

    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemCriteria example);

    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemCriteria example);
}