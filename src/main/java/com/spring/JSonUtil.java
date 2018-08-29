/*
 * Copyright 2014, mogujie.com
 */
package com.spring;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.type.TypeReference;

import java.lang.reflect.Type;

/**
 * Json工具
 */
public class JSonUtil {

    /**
     * 对象转JSON字符串
     *
     * @param obj 转换的对象
     * @return 转换后的字符串
     */
    public static String object2String(Object obj) {
        return JSON.toJSONString(obj);
    }

    /**
     * JSON字符串转对象
     *
     * @param str   转换的字符串
     * @param clazz 转换后的对象类型
     * @return 转换后的对象
     */
    public static <T> T string2Object(String str, Class<T> clazz) {
        return (T) JSON.parseObject(str, clazz);
    }

    /**
     * 字符串转对象
     *
     * @param str
     * @param type
     * @return
     */
    public static <T> T string2Object(String str, TypeReference<T> type) {
        return JSON.parseObject(str, (Type) type);
    }

    /**
     * JSON字符串转JSON对象
     *
     * @param str 转换的字符串
     * @return 转换后的JSON对象
     */
    public static JSONObject string2JSON(String str) {
        return JSON.parseObject(str);
    }

    /**
     * JSON字符串转JSON数组对象
     *
     * @param str 转换的字符串
     * @return 转换后的JSON对象
     */
    public static JSONArray string2JSONArray(String str) {
        return JSON.parseArray(str);
    }


    public static void main(String[] args) {
        JSONObject js = string2JSON("{\"imageUri\":\"16\\/01\\/26\\/278670a1310a4129956c686b23c0f66a\"}");
        System.out.println(js.get("imageUri"));
    }
}
