package com.akie.dataobject.dao;

import com.akie.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @auther Akie
 * @date 2019/9/4 15:53
 */
public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    public int insertByMap(Map<String,Object> map){
        return mapper.insertByMap(map);
    }
}
