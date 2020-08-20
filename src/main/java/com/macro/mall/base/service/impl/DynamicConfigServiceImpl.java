package com.macro.mall.base.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.base.MValues;
import com.macro.mall.common.util.StringDeal;
import com.macro.mall.base.dao.FunInfoDao;
import com.macro.mall.base.dao.TModuleConfigDao;
import com.macro.mall.base.dao.TMsgTypeDao;
import com.macro.mall.base.dao.TSpoContentRegionDao;
import com.macro.mall.base.dto.FunInfo;
import com.macro.mall.base.dto.topConfig.*;
import com.macro.mall.base.service.DynamicConfigService;
import com.mysql.cj.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DynamicConfigServiceImpl implements DynamicConfigService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicConfigServiceImpl.class);

    @Autowired
    private TModuleConfigDao tModuleConfigDao;

    @Autowired
    private TSpoContentRegionDao tSpoContentRegionDao;

    @Autowired
    private FunInfoDao funInfoDao;

    @Autowired
    private ImgUtilsService imgUtilsService;
    @Autowired
    private TMsgTypeDao tMsgTypeDao;


    /**
     *  查询首页配置
     * @param bean
     * @return
     */
    @Override
    public CommonResult getList(IndexSearchBean bean) {
        List<TModuleConfig> topLunBoList = new ArrayList();
        List<TModuleConfig> navBtnList = new ArrayList();
        List<TModuleConfig> bxwList = new ArrayList();
        List<TModuleConfig> zjdaList = new ArrayList();
        List<TModuleConfig> cgydList = new ArrayList();
        List<TModuleConfig> zxlyList = new ArrayList();
        List<TModuleConfig> jfrdList = new ArrayList();
        List<TModuleConfig> zjbxList = new ArrayList();
        if (StringUtils.isNullOrEmpty(bean.getUserPlt())) {
            return  CommonResult.failed("上送渠道不能为空");

        }
        String userPlt = bean.getUserPlt();
        Map returnMap = new HashMap();
        try {
            List<TModuleConfig> list = tModuleConfigDao.selectInfoByChannleAndCity(userPlt);
            if (!StringUtils.isNullOrEmpty(bean.getCityId())) {
                for(int i = 0;i<list.size();i++){
                    //根据id查询
                    TSpoContentRegion search = new TSpoContentRegion();
                    search.setCityId(bean.getCityId());
                    search.setContentId(list.get(i).getId());
                    TSpoContentRegion city = tSpoContentRegionDao.selectIndexCityInfo(search);
                    if(null == city){
                        list.remove(i);
                    }
                }
            }

            for(int i = 0;i<list.size();i++){
                if("00".equals(list.get(i).getFunId())){
                    topLunBoList.add(list.get(i));
                }
                if("01".equals(list.get(i).getFunId())){
                    navBtnList.add(list.get(i));
                }
                if("02".equals(list.get(i).getFunId())){
                    bxwList.add(list.get(i));
                }
                if("03".equals(list.get(i).getFunId())){
                    zjdaList.add(list.get(i));
                }
                if("04".equals(list.get(i).getFunId())){
                    cgydList.add(list.get(i));
                }
                if("05".equals(list.get(i).getFunId())){
                    zxlyList.add(list.get(i));
                }
                if("06".equals(list.get(i).getFunId())){
                    jfrdList.add(list.get(i));
                }
                if("07".equals(list.get(i).getFunId())){
                    zjbxList.add(list.get(i));
                }
            }
            returnMap.put("topLunBoList", topLunBoList);
            returnMap.put("navBtnList", navBtnList);
            returnMap.put("bxwList", bxwList);
            returnMap.put("zjdaList", zjdaList);
            returnMap.put("cgydList", cgydList);
            returnMap.put("zxlyList", zxlyList);
            returnMap.put("jfrdList", jfrdList);
            returnMap.put("zjbxList", zjbxList);

        }catch (Exception e){
            e.printStackTrace();
            return  CommonResult.failed("查询失败");
        }
        return  CommonResult.success(returnMap);

    }

    /**
     * 查询，删除配置
     * @param bean
     * @return
     */
    @Override
    public CommonResult selAndDelCOnfig(TModulBean bean) {
        //查询
        if ("01".equals(bean.getType())) {
            try {
//				TModuleConfig dls = new TModuleConfig();
//				dls.setFunId(bean.getFunId());
//				if(!StringUtils.isNullOrEmpty(bean.getId())){
//					dls.setId(bean.getId());
//				}
//				if(!StringUtils.isNullOrEmpty(bean.getChannel())){
//					dls.setChannel(bean.getChannel());
//				}
                // 默认显示第一页
                if (bean.getPage() == null) {
                    bean.setPage(1);
                }
                // 函数来指定 page(第几页) 和 pageSize(每页显示几条记录) 两个参数
                PageHelper.startPage(bean.getPage(), 5);
                List<TModuleResult> returnList = new ArrayList();
                try {
                    // 查找列表
                    List<TModuleConfig> findList = tModuleConfigDao.getTModuleConfigList(bean);
                    for (int i = 0; i < findList.size(); i++) {
//                        TModuleResult tModuleResult = new TModuleResult();
//                        tModuleResult.setId(findList.get(i).getId());
//                        tModuleResult.setFunId(findList.get(i).getFunId());
//                        tModuleResult.setFunImage(findList.get(i).getFunImage());
//                        tModuleResult.setFunTitle(findList.get(i).getFunTitle());
//                        tModuleResult.setRegion(findList.get(i).getRegion());
//                        tModuleResult.setChannel(findList.get(i).getChannel());
//                        tModuleResult.setFunState(findList.get(i).getFunState());
//                        tModuleResult.setStartDate(findList.get(i).getStartDate());
//                        tModuleResult.setEndDate(findList.get(i).getEndDate());
//                        tModuleResult.setKeyWord(findList.get(i).getKeyWord());
//                        tModuleResult.setJumpType(findList.get(i).getJumpType());
//                        tModuleResult.setJumpLink(findList.get(i).getJumpLink());
//                        tModuleResult.setUiJumpId(findList.get(i).getUiJumpId());
//                        tModuleResult.setUiParamValue(findList.get(i).getUiParamValue());
//                        tModuleResult.setMsgType(findList.get(i).getMsgType());
                        //根据id查询name和列表
                        if (!StringUtils.isNullOrEmpty(findList.get(i).getUiJumpId())) {
                            FunInfo info = (FunInfo) funInfoDao.findByfunId(findList.get(i).getUiJumpId());
                            findList.get(i).setUiJumpName(info.getFunName());
                            findList.get(i).setUiJumpPid(info.getFunPid());
                        }
                        if ("on".equals(findList.get(i).getRegion())){
                            List<TSpoContentRegion>	regionInfoList = tSpoContentRegionDao.getContentCityInfo(findList.get(i).getId());
                            findList.get(i).setContentRegionInfo(regionInfoList);
                        }

                    }
//                    PageInfo pageInfo = new PageInfo(findList);
//                    return CommonResult.success(pageInfo);
                } catch (Exception e) {
                    LOGGER.error("查询动态配置列表失败" + "===========" + e.getMessage());
                    return CommonResult.failed("查询动态配置列表失败");
                }
                PageInfo<TModuleResult> pageInfo = new PageInfo<TModuleResult>(returnList);
                return CommonResult.success(pageInfo);
            } catch (Exception e) {
                LOGGER.error(e.getMessage());
            }

        } else if ("02".equals(bean.getType())) {

            String list = bean.getId();
            String[] ids = list.split(",");
            try {
                tModuleConfigDao.deleteTModuleConfigByid(ids);
            } catch (Exception e) {
                LOGGER.error("删除失败"+e.getMessage());
                return CommonResult.failed("删除失败");
            }
            //删除成功删除城市信息
            tSpoContentRegionDao.deleteCityInfoByIDs(ids);
            return CommonResult.success("删除成功");


        }else{
            return CommonResult.failed("上送操作类型不合法");
        }
        return null;
    }

    /**
     * 新增，修改配置
     * @param config
     * @param type
     * @return
     */
    @Override
    public CommonResult addOrUpdateInfo(TModuleConfig config, String type) throws Exception {
        if("01".equals(type)){
            List<TModuleConfig> infoList = new ArrayList<TModuleConfig>();
            //判断渠道
            String[] channels = config.getChannel().split(",");
            for(int i = 0;i < channels.length; i++){
                String channel = channels[i];
                TModuleConfig bean = new TModuleConfig();
                bean.setFunId(config.getFunId());
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                bean.setId(uuid);
//				处理本地图片
                String uploadImgUrl = null;
                try {
                    uploadImgUrl = imgUtilsService.uploadImg(config.getFunImage(), "file");
                } catch (Exception e) {
                    LOGGER.error("图片上传失败"+"==========="+e.getMessage());
                    return CommonResult.failed("上传图片失败");
                }
                bean.setFunImage(uploadImgUrl);
                bean.setFunTitle(config.getFunTitle());
                bean.setStartDate(config.getStartDate());
                bean.setEndDate(config.getEndDate());
                bean.setRegion(config.getRegion());
                bean.setMsgType(config.getMsgType());
                bean.setMsgInfo(config.getMsgInfo());
                //处理限制区域信息
                if("on".equals(config.getRegion())){
                    List<TSpoContentRegion> cityList = new ArrayList();
                    String cityId = config.getCityId();
                    if (StringUtils.isNullOrEmpty(cityId)) {
                        return CommonResult.failed("区域限制城市id上送为空");
                    }
                    String[] cityIds = cityId.split(",");
                    for(String str : cityIds){
                        String[] split2 = str.split("-");
                        if(split2.length == 2){
                            TSpoContentRegion temp = new TSpoContentRegion();
                            temp.setId("top"+ StringDeal.getID());
                            temp.setContentId(bean.getId());
                            temp.setProvinceId(split2[0]);
                            temp.setCityId(split2[1]);
                            cityList.add(temp);
                        }else{
                            LOGGER.error("城市id数据格式有误"+split2);
                        }
                    }
                    //保存城市信息
                    try {
                        tSpoContentRegionDao.insertCityIdList(cityList);
                    } catch (Exception e) {
                        LOGGER.error("保存城市限制信息失败"+"==========="+e.getMessage());
                        return CommonResult.failed("保存城市限制信息失败");
                    }
                }
                bean.setChannel(channel);
                bean.setKeyWord(config.getKeyWord());
                bean.setFunState(config.getFunState());
                //跳转类型
                String jumpType = getkeyValue(channel, config.getJumpType());
                bean.setJumpType(jumpType);
                if("1".equals(jumpType)){
                    bean.setUiJumpId(config.getUiJumpId());
                    bean.setUiParamValue(config.getUiParamValue());
                }else if("2".equals(jumpType)){
                    bean.setJumpLink(getkeyValue(channel, config.getJumpLink()));
                }


                infoList.add(bean);
                //入库
            }
            try {
                tModuleConfigDao.insertInfoList(infoList);
                return CommonResult.success("添加成功");
            } catch (Exception e) {
                LOGGER.error(e.getMessage());
                return CommonResult.success("添加失败");

            }
            //修改
        }else if("02".equals(type)){
            if (StringUtils.isNullOrEmpty(config.getId())) {
                return CommonResult.failed("上送id为空");
            }
            if("on".equals(config.getRegion())){
                if (StringUtils.isNullOrEmpty(config.getCityId())) {
                    return CommonResult.failed("上送城市id为空");

                }
            }
            //处理本地图片
            if (!StringUtils.isNullOrEmpty(config.getFunImage())) {
                String uploadImgUrl = null;
                try {
                    uploadImgUrl = imgUtilsService.uploadImg(config.getFunImage(), "file");
                } catch (Exception e) {
                    LOGGER.error("图片上传失败"+"==========="+e.getMessage());
                    return CommonResult.failed("图片上传失败");

                }
                config.setFunImage(uploadImgUrl);
            }
            String jumpType = getkeyValue(config.getChannel(), config.getJumpType());
            System.out.println(config.getJumpLink());
            if (!StringUtils.isNullOrEmpty(config.getJumpLink())) {
                config.setJumpLink(getkeyValue(config.getChannel(), config.getJumpLink()));
            }
            config.setJumpType(jumpType);
            try {
                tModuleConfigDao.updateModuleConfig(config);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error(e.getMessage());
                return CommonResult.failed("更新失败");

            }
            //更新成功 先删 再增
            try {
                tSpoContentRegionDao.deleteContentRegionInfo(config.getId());
            } catch (Exception e) {
                LOGGER.error("删除限制城市id"+"==========="+e.getMessage());
                return CommonResult.failed("删除限制城市id失败");

            }
            if("on".equals(config.getRegion())){
                List<TSpoContentRegion> cityList = new ArrayList();
                String cityId = config.getCityId();
                if (StringUtils.isNullOrEmpty(cityId)) {
                    return CommonResult.failed("区域限制城市id上送为空");
                }
                String[] cityIds = cityId.split(",");
                for(String str : cityIds){
                    String[] split2 = str.split("-");
                    if(split2.length == 2){
                        TSpoContentRegion temp = new TSpoContentRegion();
                        temp.setId("top"+ StringDeal.getID());
                        temp.setContentId(config.getId());
                        temp.setProvinceId(split2[0]);
                        temp.setCityId(split2[1]);
                        cityList.add(temp);
                    }else{
                        LOGGER.error("城市id数据格式有误"+split2);
                        return CommonResult.failed("系统异常");

                    }
                }
                //保存城市信息
                try {
                    tSpoContentRegionDao.insertCityIdList(cityList);
                } catch (Exception e) {
                    LOGGER.error("保存城市限制信息失败"+"==========="+e.getMessage());
                    return CommonResult.failed("保存城市限制信息失败");
                }
            }
            return CommonResult.success("操作成功");
        }else{
            return CommonResult.failed("上送操作类型不合法");
        }
    }
    /**
     * 转换方法
     * @param str
     * @return
     * @throws Exception
     */
    public String getkeyValue(String key,String str) throws Exception{
        Map<String,String> map = new HashMap();
        String[] split = str.split(",");
        for(String s : split){
            String[] split2 = s.split("-");
            if(split2.length == 2){
                map.put(split2[0], split2[1]);
            }else{
                return null;
            }
        }
        return map.get(key);

    }
    /**
     * 上架下架
     * @param id
     * @param funState
     * @return
     * @throws Exception
     */
    public CommonResult updateState(String id, String funState){

        Map map = new HashMap();
        String[] ids = id.split(",");
        map.put("id", ids);
        map.put("funState", funState);
        try {
            tModuleConfigDao.updateFunStateById(map);
            return CommonResult.success("操作成功");

        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed("操作失败");
        }
    }
    /**
     * 查询资讯列表

     * @return
     * @throws Exception
     */
    public CommonResult selectMsgInfo()  {
        List list = new ArrayList();
        Map map = new HashMap();
        String msgType = MValues.get("msgType");
        String[] split1 = msgType.split(",");
        for(String str:split1){
            String[] split2 = str.split("-");
            TMsgType bean = new TMsgType();
            bean.setMsgType(split2[0]);
            bean.setMsgInfo(split2[1]);
            list.add(bean);

        }
        return CommonResult.success(list);
    }
}
