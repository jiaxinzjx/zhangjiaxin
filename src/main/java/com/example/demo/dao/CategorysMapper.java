package com.example.demo.dao;

import com.example.demo.po.Categorys;
import com.example.demo.po.CategorysCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategorysMapper {
    long countByExample(CategorysCriteria example);

    int deleteByExample(CategorysCriteria example);

    int deleteByPrimaryKey(Integer vcategoryid);

    int insert(Categorys record);

    int insertSelective(Categorys record);

    List<Categorys> selectByExample(CategorysCriteria example);

    Categorys selectByPrimaryKey(Integer vcategoryid);

    int updateByExampleSelective(@Param("record") Categorys record, @Param("example") CategorysCriteria example);

    int updateByExample(@Param("record") Categorys record, @Param("example") CategorysCriteria example);

    int updateByPrimaryKeySelective(Categorys record);

    int updateByPrimaryKey(Categorys record);
}