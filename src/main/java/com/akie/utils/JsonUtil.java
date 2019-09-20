package com.akie.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @auther Akie
 * @date 2019/8/5 22:19
 */
public class JsonUtil {

    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
