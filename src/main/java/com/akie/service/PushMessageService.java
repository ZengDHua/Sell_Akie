package com.akie.service;

import com.akie.dto.OrderDTO;

/**
 * 推送消息
 * @auther Akie
 * @date 2019/9/2 15:46
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
