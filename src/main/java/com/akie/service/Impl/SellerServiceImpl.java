package com.akie.service.Impl;

import com.akie.dataobject.SellerInfo;
import com.akie.repository.SellerInfoRepository;
import com.akie.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther Akie
 * @date 2019/8/29 14:45
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
