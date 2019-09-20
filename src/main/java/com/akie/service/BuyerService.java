package com.akie.service;

import com.akie.dto.OrderDTO;

/**
 * 买家
 * @auther Akie
 * @date 2019/8/3 21:17
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
