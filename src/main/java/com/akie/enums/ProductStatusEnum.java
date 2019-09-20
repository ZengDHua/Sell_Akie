package com.akie.enums;

import lombok.Getter;

/**
 * 商品状态
 * @auther Akie
 * @date 2019/7/28 13:17
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
