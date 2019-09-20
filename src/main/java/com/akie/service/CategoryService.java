package com.akie.service;

import com.akie.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @auther Akie
 * @date 2019/7/27 19:23
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
