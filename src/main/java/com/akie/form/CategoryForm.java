package com.akie.form;

import lombok.Data;

/**
 * @auther Akie
 * @date 2019/8/28 15:40
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
