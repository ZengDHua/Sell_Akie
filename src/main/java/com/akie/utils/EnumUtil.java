package com.akie.utils;

import com.akie.enums.CodeEnum;

/**
 * @auther Akie
 * @date 2019/8/22 16:13
 */
public class EnumUtil {

    public static <T extends CodeEnum>T getByCode(Integer code, Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
