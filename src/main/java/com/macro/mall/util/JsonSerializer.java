package com.macro.mall.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class JsonSerializer {
    /**
     * JSON序列化
     *
     * @param object 对象
     * @return JSON字符串
     */
    public static byte[] setBody(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsBytes(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * JSON序列化
     *
     * @param object 对象
     * @return JSON字符串
     */
    public static Object toBody(byte[] object, Class<?> classType) {
        try {
            return new ObjectMapper().readValue(new String(object), classType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * JSON序列化
     *
     * @param object 对象
     * @return JSON字符串
     */
    public static String serialize(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * JSON字符串反序列化
     *
     * @param jsonStr JSON字符串
     * @return a Map
     */
    public static Map deserialize(String jsonStr) {
        try {
            return deserialize(jsonStr, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap();
        }
    }

    public static <T> T deserialize(String jsonStr, Class<T> classType) {
        try {
            return new ObjectMapper().readValue(jsonStr, classType);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}