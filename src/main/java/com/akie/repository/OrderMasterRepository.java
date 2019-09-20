package com.akie.repository;

import com.akie.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther Akie
 * @date 2019/7/29 22:18
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid (String buyerOpenid, Pageable pageable);
}
