package com.macro.mall.searchkeywords.service;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.searchkeywords.model.KeyWordVO;
import com.macro.mall.mapper.TSportSearchInfoMapper;
import com.macro.mall.mapper.TSportSearchRecommendMapper;
import com.macro.mall.model.TSportSearchInfo;
import com.macro.mall.model.TSportSearchInfoExample;
import com.macro.mall.model.TSportSearchRecommend;
import com.macro.mall.model.TSportSearchRecommendExample;
import com.macro.mall.util.MLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
public class KeyWordService {
    @Autowired
    TSportSearchInfoMapper tSportSearchInfoMapper;
    @Autowired
    TSportSearchRecommendMapper tSportSearchRecommendMapper;
    //增加关键字
    public CommonResult addKeyWord(KeyWordVO keyWordVO){
        TSportSearchInfo tSportSearchInfo=null;
        TSportSearchRecommend tSportSearchRecommend=null;
        String id=UUID.randomUUID().toString().replace("-", "");;//关键字id
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateTime=dateFormat.format(date);
        if (keyWordVO!=null){
            String keyWord = keyWordVO.getKeyWord();//获取关键词
            String type = keyWordVO.getType();//获取类型 01铺底02推荐
            if (StringUtils.isEmpty(keyWord)){
                MLog.error("关键字为空");
            }
            if (StringUtils.isEmpty(type)){
                MLog.error("类型为空");
            }
            try {
                //判断如果是01就添加铺底词
                if ("01".equals(type)){
                    tSportSearchInfo.setId(id);
                    tSportSearchInfo.setKeyWord(keyWord);
                    tSportSearchInfo.setState("00");
                    tSportSearchInfo.setCreateTime(dateTime);
                    tSportSearchInfo.setUpdateTime(dateTime);
                    tSportSearchInfoMapper.insert(tSportSearchInfo);
                    return CommonResult.success("添加成功");
                } else if ("02".equals(type)){
                    tSportSearchRecommend.setId(id);
                    tSportSearchRecommend.setKeyWord(keyWord);
                    tSportSearchRecommend.setState("00");
                    tSportSearchRecommend.setCreateTime(dateTime);
                    tSportSearchRecommend.setUpdateTime(dateTime);
                    tSportSearchRecommendMapper.insert(tSportSearchRecommend);
                    return CommonResult.success("添加成功");
                }
            }catch (Exception e){
                e.printStackTrace();
                MLog.error("添加失败");
            }
        }
        return null;
    }
    //修改铺底关键字
    public CommonResult upDateSearchKeyWord(TSportSearchInfo tSportSearchInfo) throws Exception{
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateTime=dateFormat.format(date);
        String id = tSportSearchInfo.getId();
        String keyWord = tSportSearchInfo.getKeyWord();
        if(tSportSearchInfo!=null){
            if (StringUtils.isEmpty(id)){
                MLog.error("搜索词id为空");
                return CommonResult.failed("搜索词id不能为空");
            }
            if (StringUtils.isEmpty(keyWord)){
                MLog.error("关键字为空");
                return CommonResult.failed("关键字不能为空");
            }
            try{
                TSportSearchInfoExample example = new TSportSearchInfoExample();
                TSportSearchInfoExample.Criteria criteria = example.createCriteria();
                criteria.andIdEqualTo(id);
                tSportSearchInfoMapper.updateByExample(tSportSearchInfo,example);
                return CommonResult.success("修改成功");
            }catch (Exception e){
                e.printStackTrace();
                MLog.error("修改失败");
            }
        }else {
            MLog.error("关键字信息为空");
            throw new Exception("关键字信息为空");
        }
        return null;
    }

    //修改推荐关键字
    public CommonResult upDateRecommendKeyWord(TSportSearchRecommend tSportSearchRecommend) throws Exception{
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateTime=dateFormat.format(date);
        String id = tSportSearchRecommend.getId();
        String keyWord = tSportSearchRecommend.getKeyWord();
        if(tSportSearchRecommend!=null){
            if (StringUtils.isEmpty(id)){
                MLog.error("搜索词id为空");
                return CommonResult.failed("搜索词id不能为空");
            }
            if (StringUtils.isEmpty(keyWord)){
                MLog.error("关键字为空");
                return CommonResult.failed("关键字不能为空");
            }
            try{
                TSportSearchRecommendExample example = new TSportSearchRecommendExample();
                TSportSearchRecommendExample.Criteria criteria = example.createCriteria();
                criteria.andIdEqualTo(id);
                tSportSearchRecommendMapper.updateByExample(tSportSearchRecommend,example);
                return CommonResult.success("修改成功");
            }catch (Exception e){
                e.printStackTrace();
                MLog.error("修改失败");
            }
        }else {
            MLog.error("关键字信息为空");
            throw new Exception("关键字信息为空");
        }
        return null;
    }
    //关键字上下架
    public CommonResult upDateStateById(KeyWordVO keyWordVO) throws Exception{
        if (keyWordVO!=null){
            String id = keyWordVO.getId();
            String state = keyWordVO.getState();
            String type = keyWordVO.getType();
            if (StringUtils.isEmpty(id)){
                MLog.error("搜索词id为空");
                return CommonResult.failed("搜索词id不能为空");
            }
            if (StringUtils.isEmpty(state)){
                MLog.error("搜索词状态为空");
                return CommonResult.failed("搜索词状态不能为空");
            }
            if (StringUtils.isEmpty(type)){
                MLog.error("搜索词类型为空");
                return CommonResult.failed("搜索词类型不能为空");
            }
            try {
                if ("01".equals(type)){
                    tSportSearchInfoMapper.updateStateById(id,state);
                }else if ("02".equals(type)){
                    tSportSearchRecommendMapper.updateStateById(id,state);
                }

            }catch (Exception e){
                e.printStackTrace();
                MLog.error("操作失败");
            }
        }else {
            return CommonResult.failed("搜索词信息为空");
        }
        return null;
    }

}
