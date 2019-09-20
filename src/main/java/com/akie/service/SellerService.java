package com.akie.service;

import com.akie.dataobject.SellerInfo;

/**
 * 卖家端
 * @auther Akie
 * @date 2019/8/29 14:43
 */
public interface SellerService {

    /**
     * 拖过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
