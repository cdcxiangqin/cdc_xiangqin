package com.cdc.blinddate.util;

import com.alibaba.fastjson.JSON;
import com.cdc.blinddate.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @name: JsonUtil
 * @description: 进一步封装fastjson的json工具类
 * @author: 纪佳鸿
 * @time: 2018/8/11 17:15
 */
public class JsonUtil {
    /**
     * @name: toJSONString
     * @description: 将对象转为json字符串
     * @author: 纪佳鸿
     * @time: 2018/8/11 17:16
     */
    public static String toJSONString(Object obj){
        return JSON.toJSONString(obj);
    }

    /**
     * @name: mapToObject
     * @description: 将map转为对象
     * @author: 纪佳鸿
     * @time: 2018/8/11 17:16
     */
    public static Object mapToObject(Map inputMap,Class tClass){
        String inputString=toJSONString(inputMap);
        Object obj=JSON.parseObject(inputString,tClass);
        return obj;
    }

    public static void main(String[] args){
        Map map=new HashMap();
        map.put("username","user1");
        map.put("age","11");
        map.put("password","111");
        User u=(User)mapToObject(map,User.class);
        System.out.println(u);
    }
}
