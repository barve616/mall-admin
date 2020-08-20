//package com.macro.mall.base.controller;
//
//import com.macro.mall.base.dao.UmsMValueDao;
//import com.macro.mall.common.base.CodeParam;
//import com.macro.mall.common.base.MValues;
//import com.macro.mall.common.sevice.CacheService;
//import com.macro.mall.common.sevice.RedisLockService;
//import com.macro.mall.util.MLog;
//import io.swagger.annotations.Api;
//import org.redisson.api.RLock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.PostConstruct;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Api(tags = "TestController", description = "测试刷新")
//@Controller
//@RequestMapping("")
//public class TestController {
//
//
//    @Autowired
//    private UmsMValueDao umsMValueDao;
//
//    @Autowired
//    private RedisLockService redisLockService;
//
//    @Autowired
//    private CacheService cacheService;
//
//    @PostConstruct
//    public void setConfig() {
//        initConifg();
//    }
//
//    @ResponseBody
//    @RequestMapping(value="/test",method = RequestMethod.GET)
//    public Object test() throws Exception {
//        Map<String, Object> map = new HashMap<String, Object>();
//        initConifg();
//        map.put("message", "成功");
//        map.put("size", MValues.map.size());
//        return map;
//    }
//
//    public void initConifg() {
//        List<CodeParam> paramList = umsMValueDao.getAll();
//        MLog.info("初始化配置：size:" + paramList.size());
//        if (paramList != null && paramList.size() > 0) {
//            Map<String, String> mapTemp = new HashMap<>();
//            for (CodeParam key : paramList) {
//                mapTemp.put(key.getParamType(), key.getParamValue());
//            }
//            MValues.map.clear();
//            MValues.map.putAll(mapTemp);
//        }
//    }
//
//
//
//
////    @ResponseBody
////    @RequestMapping(value="/test2",method = RequestMethod.GET)
////    public Map test2() {
////        Map<String, Object> map = new HashMap<String, Object>();
////        RLock key = redisLockService.createLock("test lock");
////        try {
////            boolean isGetLock = redisLockService.tryLock(key, 5L, 100L);
////            if (isGetLock) {
////                cacheService.refresh("test lock cache:", "test");
////                String xx = cacheService.getCache(String.class, "test lock cache:");
////                map.put("xx", xx);
////                redisLockService.unlock(key);
////            }
////        } catch (Exception e) {
////            MLog.tt2(e.getMessage());
////        }
////        return map;
////    }
//
//
//}
