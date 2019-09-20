package com.akie.dataobject.mapper;

import com.akie.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @auther Akie
 * @date 2019/9/3 21:14
 */
public interface ProductCategoryMapper {

    //通过map方式写入
    @Insert("insert into product_category(category_name,category_type) values(#{category_name,jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER})")
    //字段名category_name之类的可以使用categoryName代替，但由于值是从map里面取的，所以map里面的字段名也要对应
    int insertByMap(Map<String,Object> map);

    //通过对象写入,注意要跟ProductCategory里写的字段名保持一致
    @Insert("insert into product_category(category_name,category_type) values(#{categoryName,jdbcType=VARCHAR},#{categoryType,jdbcType=INTEGER})")
    int insertByObject(ProductCategory productCategory);

    @Select("select * from product_category where category_type = #{categoryType}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType")
    })
    ProductCategory findByCategoryType(Integer categoryType);

    @Select("select * from product_category where category_name = #{categoryName}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType")
    })
    //jpa里面查出多条数据会显示第一条，mybatis则不行，会报错，因此要改为List类型
    List<ProductCategory> findByCategoryName(String categoryName);

    //可能是mybatis版本问题，此处传入2个参数不用加@Param("objectName")注解在Object objectName前面也不会报错直接通过测试
    //网上找到的解释，我此处的依赖是mybatis-spring-boot-starter Version2.1.0
    //1.如果接口方法有一个或多个参数，并且使用了@Param注解，sql语句中的参数用注解的value值，
    //2.如果接口方法的参数只有一个，并且没有使用@Parma注解sql语句直接使用任何名称均可。
    //3.如果接口的方法有多个参数，并且没有使用@Parma注解，sql语句使用#{arg0}-#{argn}或者#{param1}-#{paramn}是不会错的。
    //4.sql语句中的参数占位符名称和接口方法的参数名称没有什么关系。
    @Update("update product_category set category_name = #{categoryName} where category_type = #{categoryType}")
    int updateByCategoryType(String categoryName, Integer categoryType);

    @Update("update product_category set category_name = #{categoryName} where category_type = #{categoryType}")
    int updateByObject(ProductCategory productCategory);

    @Delete("delete from product_category where category_type = #{categoryType}")
    int deleteByCategoryType(Integer categoryType);

    //mybatis使用xml文件方式 这里只需要写个方法声明一下就行了，然后去resource下建一个包在里面建一个xml文件
    //注意要跟这里的类名一致
    ProductCategory selectByCategoryType(Integer categoryType);
}
