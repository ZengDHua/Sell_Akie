package com.akie.dataobject.mapper;

import com.akie.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
//@SpringBootTest//默认情况下，@SpringBootTest不会启动服务器。您可以使用webEnvironment 属性@SpringBootTest来进一步优化测试的运行方式：
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;//IDEA报错但并不影响结果

    @Test
    public void insertByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("category_name","没有卯月1");
        map.put("category_type",102);
        int result = mapper.insertByMap(map);
        Assert.assertEquals(1,result);
    }

    @Test
    public void insertByObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("没有卯月2");
        productCategory.setCategoryType(103);
        int result = mapper.insertByObject(productCategory);
        Assert.assertEquals(1,result);
    }

    @Test
    public void findByCategoryType(){
        ProductCategory result = mapper.findByCategoryType(102);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryName(){
        List<ProductCategory> result = mapper.findByCategoryName("没有卯月");
        Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void updateByCategoryType(){
        int result = mapper.updateByCategoryType("没有卯月的分类", 102);
        Assert.assertEquals(1,result);
    }

    @Test
    public void updateByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("没有卯月");
        productCategory.setCategoryType(102);
        int result = mapper.updateByObject(productCategory);
        Assert.assertEquals(1,result);
    }

    @Test
    public void deleteByCategoryType(){
        int result = mapper.deleteByCategoryType(101);
        Assert.assertEquals(1,result);
    }

    @Test
    public void selectByCategoryType(){
        ProductCategory productCategory = mapper.selectByCategoryType(102);
        Assert.assertNotNull(productCategory);
    }
}