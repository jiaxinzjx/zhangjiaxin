package com.example.demo.dao;

import com.example.demo.po.Cart;
import com.example.demo.po.CartCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    long countByExample(CartCriteria example);

    int deleteByExample(CartCriteria example);

    int deleteByPrimaryKey(String vcid);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExample(CartCriteria example);

    Cart selectByPrimaryKey(String vcid);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartCriteria example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartCriteria example);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}