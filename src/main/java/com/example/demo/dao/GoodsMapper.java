package com.example.demo.dao;

import com.example.demo.po.Goods;
import com.example.demo.po.GoodsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    long countByExample(GoodsCriteria example);

    int deleteByExample(GoodsCriteria example);

    int deleteByPrimaryKey(Integer vgoodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsCriteria example);

    Goods selectByPrimaryKey(Integer vgoodsid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsCriteria example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}