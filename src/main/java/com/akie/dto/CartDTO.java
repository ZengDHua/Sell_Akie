package com.akie.dto;

import lombok.Data;

/**
 * 购物车
 * @auther Akie
 * @date 2019/7/31 22:10
 */
@Data
public class CartDTO {

    /** 商品Id */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
