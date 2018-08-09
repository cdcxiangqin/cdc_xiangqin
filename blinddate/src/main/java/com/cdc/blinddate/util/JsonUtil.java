package com.cdc.blinddate.util;

import com.alibaba.fastjson.JSON;

public class JsonUtil {
    public static String toJSONString(Object obj){
        return JSON.toJSONString(obj);
    }
}
