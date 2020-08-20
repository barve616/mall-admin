package com.macro.mall.base.service.impl;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.base.dao.CityInfoDao;
import com.macro.mall.base.dao.FunInfoDao;
import com.macro.mall.base.dto.FunInfo;
import com.macro.mall.base.dto.topConfig.CityInfo;
import com.macro.mall.base.service.FunInfoNewService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FunInfoNewServiceImpl implements FunInfoNewService {

    @Autowired
    private FunInfoDao funInfoDao;
    @Autowired
    private CityInfoDao cityInfoDao;
    @Override
    public CommonResult findAll(HttpServletResponse response) {
        // 下单
        List<FunInfo> findAll = funInfoDao.findAll();
        String funId = "";
        List<FunInfo> tempList = new ArrayList<FunInfo>();
        List<Object> returnList = new ArrayList<Object>();
        for (FunInfo funInfo : findAll) {
            // 判断是否是一级列表
            if (StringUtils.isNullOrEmpty(funInfo.getFunPid())) {
                funId = funInfo.getFunId();
                for (FunInfo temp : findAll) {
                    if (!StringUtils.isNullOrEmpty(temp.getFunPid()) && funId.equals(temp.getFunPid())) {
                        tempList.add(temp);
                    }
                }
                if (tempList.size() > 0) {
                    funInfo.setFunInfo(tempList);
                }
                returnList.add(funInfo);
                tempList = new ArrayList<FunInfo>();
            }

        }
        return CommonResult.success(returnList);
    }

    @Override
    public CommonResult getCityInfo(HttpServletResponse response) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        List<CityInfo> tempList = new ArrayList<CityInfo>();
        List<Object> returnList = new ArrayList<Object>();
        List<CityInfo> list = null;
        try {
            list = cityInfoDao.getCityMapInfo();
            if (list == null || list.size() == 0) {

            } else {
                for (CityInfo cityInfo : list) {
                    if (StringUtils.isNullOrEmpty(cityInfo.getProvinceId())) {
                        String cityId = cityInfo.getCityId();
                        for (CityInfo temp : list) {
                            if (!StringUtils.isNullOrEmpty(temp.getProvinceId())
                                    && temp.getProvinceId().equals(cityId)) {
                                tempList.add(temp);
                            }
                        }
                        returnMap.put("provinceId", cityInfo.getCityId());// 功能
                        returnMap.put("provinceName", cityInfo.getName());// 功能
                        if (tempList.size() > 0) {
                            returnList.add(returnMap);
                            returnMap.put("cityList", tempList);// 功能
                        } else {
                            cityInfo.setProvinceId(cityId);
                            tempList.add(cityInfo);
                            returnMap.put("cityList", tempList);// 功能
                        }
                        tempList = new ArrayList<CityInfo>();
                        returnMap = new HashMap<String, Object>();
                    }
                }
            }

        } catch (Exception e) {
            return CommonResult.failed("获取数据失败");
        }
        returnMap.put("list", list);
        return CommonResult.success(returnList);
    }
}
