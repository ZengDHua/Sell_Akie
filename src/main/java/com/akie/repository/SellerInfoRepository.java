package com.akie.repository;

import com.akie.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther Akie
 * @date 2019/8/28 23:12
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}
