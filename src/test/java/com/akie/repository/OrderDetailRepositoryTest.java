package com.akie.repository;

import com.akie.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private  OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567810");
        orderDetail.setOrderId("111112");
        orderDetail.setProductIcon("http:xxxxxx.jpg");
        orderDetail.setProductId("11112");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(3.8));
        orderDetail.setProductQuantity(3);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("11111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}