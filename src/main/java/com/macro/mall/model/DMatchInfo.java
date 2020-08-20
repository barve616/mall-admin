package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;
import java.math.BigDecimal;


public class DMatchInfo implements Serializable {

    @ApiModelProperty(value = "赛事id")
    private String matchId;

    @ApiModelProperty(value = "赛事主办方")
    private String matchSponsor;

    @ApiModelProperty(value = "赛事大项id")
    private String matchTypeId;

    @ApiModelProperty(value = "赛事组别(小项Id）")
    private String matchGroupId;

    @ApiModelProperty(value = "赛事名称")
    private String matchName;

    @ApiModelProperty(value = "赛事地址")
    private String matchAddress;

    @ApiModelProperty(value = "赛事图片地址")
    private String matchPhoto;

    @ApiModelProperty(value = "报名开始时间")
    private String matchApplyStartTime;

    @ApiModelProperty(value = "报名结束时间")
    private String matchApplyEndTime;

    @ApiModelProperty(value = "赛事开始时间")
    private String matchStartTime;

    @ApiModelProperty(value = "赛事截止时间")
    private String matchEndTime;

    @ApiModelProperty(value = "是否有报名费用   1是  0否")
    private String matchPayFlag;

    @ApiModelProperty(value = "报名费用")
    private BigDecimal matchPayMoney;

    @ApiModelProperty(value = "报名费商户ID")
    private String matchPayMerId;

    @ApiModelProperty(value = "是否必须购买保险   1是  0否")
    private String matchInsureFlag;

    @ApiModelProperty(value = "保险费用")
    private BigDecimal matchInsureMoney;

    @ApiModelProperty(value = "保险费商户ID")
    private String matchInsureMerId;

    @ApiModelProperty(value = " 0 个人赛   1团队赛")
    private String matchType;

    @ApiModelProperty(value = "人数限制")
    private Integer matchNumLimit;

    @ApiModelProperty(value = "队伍限制限制")
    private Integer matchGroupLimit;

    @ApiModelProperty(value = "队伍人数限制")
    private Integer matchGroupNumLimit;

    @ApiModelProperty(value = "报名采集信息")
    private String matchApplyParam;

    @ApiModelProperty(value = " 0 不开启   1开启")
    private String matchVoteFlag;

    @ApiModelProperty(value = "1上线  0下线 2审核中")
    private String matchState;

    @ApiModelProperty(value = "赛事简介")
    private byte[] matchDes;

    private  String matchDesString;
    private  String matchNoticeString;
    private  String matchRulesString;
    private  String matchAttentionString;

    private  String matchDesTitle;
    private  String matchNoticeTitle;
    private  String matchRulesTitle;
    private  String matchAttentionTitle;

    @ApiModelProperty(value = "报名须知")
    private byte[] matchNotice;

    @ApiModelProperty(value = "赛事规程")
    private byte[] matchRules;

    @ApiModelProperty(value = "注意事项")
    private byte[] matchAttention;

    @ApiModelProperty(value = "项目类型")
    private String match;



    @ApiModelProperty(value = "开始时间")
    private  String startTime;

    @ApiModelProperty(value = "结束时间")
    private  String endTime;


    @ApiModelProperty(value = "赛事大项id")
    private String matchMaxId;

    @ApiModelProperty(value = "赛事小项id")
    private String matchMinId;

    @ApiModelProperty(value = "赛事大项名称")
    private String matchMaxName;

    @ApiModelProperty(value = "赛事小项名称")
    private String matchMinDetail;

    @ApiModelProperty(value = "赛事类型")
    private String matchTp;

    @ApiModelProperty(value = "赛事类型名称")
    private String matchTpName;


    @ApiModelProperty(value = "赛事报表下载Key值")
    private String matchKey;

    @ApiModelProperty(value="报名时间")
    private  String applyTime;

    @ApiModelProperty(value="0 常规赛 1 预赛 2 决赛")
    private  String matchFinalsFlag;

    private  String matchPhotoDetail;
    private  String matchGenderFlag;
    private  String matchAgeFlag;
    private  Integer matchMaxAge;
    private  Integer matchMinAge;
    private  Integer matchStockNum;
    private  Integer matchGroupMaxLimit;
    @ApiModelProperty(value = "创建时间")
    private  String matchCreateTime;
    @ApiModelProperty(value = "报名成功人数")
    private  String num;
    @ApiModelProperty(value = "参赛团队数")
    private  String teamNum;
    @ApiModelProperty(value = "报名总人数")
    private  String totalNum;
    @ApiModelProperty(value = "退赛成功人数")
    private  String removeMatchNum;
    @ApiModelProperty(value = "带支付人数")
    private  String stayPayNum;
    @ApiModelProperty(value = "报名取消人数")
    private  String removeSignNum;
    @ApiModelProperty(value = "参赛团队数")
    private  String successTeamNum;
    @ApiModelProperty(value = "组队失败数")
    private String  errTeamNum;
    @ApiModelProperty(value = "组队中队伍数")
    private  String teamingNum;
    @ApiModelProperty(value = "审核失败队伍数")
    private  String auditingErrNum;
    @ApiModelProperty(value = "审核状态   0 待审核    1  审核通过  2 审核不通过")
    private  String matchCheckState;
    @ApiModelProperty(value = "审核人名称")
    private  String matchCheckName;
    @ApiModelProperty(value = "审核时间")
    private  String matchCheckTime;
    @ApiModelProperty(value = "审核原因")
    private  String matchCheckDes;
    @ApiModelProperty(value = "创建人")
    private String matchCreateName;

    @ApiModelProperty(value = "审核赛事标记")
    private String flag;

    @ApiModelProperty(value = "预赛Id")
    private String  matchPreId;

    private String  matchPreName;



    public String getMatchPreName() {
        return matchPreName;
    }

    public void setMatchPreName(String matchPreName) {
        this.matchPreName = matchPreName;
    }

    public String getMatchPreId() {
        return matchPreId;
    }

    public void setMatchPreId(String matchPreId) {
        this.matchPreId = matchPreId;
    }


    @ApiModelProperty(value = "赛事类型码")
    private String matchCode;

    public String getMatchCode() {
        return matchCode;
    }

    public void setMatchCode(String matchCode) {
        this.matchCode = matchCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMatchCheckState() {
        return matchCheckState;
    }

    public void setMatchCheckState(String matchCheckState) {
        this.matchCheckState = matchCheckState;
    }

    public String getMatchCheckName() {
        return matchCheckName;
    }

    public void setMatchCheckName(String matchCheckName) {
        this.matchCheckName = matchCheckName;
    }

    public String getMatchCheckTime() {
        return matchCheckTime;
    }

    public void setMatchCheckTime(String matchCheckTime) {
        this.matchCheckTime = matchCheckTime;
    }

    public String getMatchCheckDes() {
        return matchCheckDes;
    }

    public void setMatchCheckDes(String matchCheckDes) {
        this.matchCheckDes = matchCheckDes;
    }

    public String getMatchCreateName() {
        return matchCreateName;
    }

    public void setMatchCreateName(String matchCreateName) {
        this.matchCreateName = matchCreateName;
    }

    public String getMatchDesTitle() {
        return matchDesTitle;
    }

    public void setMatchDesTitle(String matchDesTitle) {
        this.matchDesTitle = matchDesTitle;
    }

    public String getMatchNoticeTitle() {
        return matchNoticeTitle;
    }

    public void setMatchNoticeTitle(String matchNoticeTitle) {
        this.matchNoticeTitle = matchNoticeTitle;
    }

    public String getMatchRulesTitle() {
        return matchRulesTitle;
    }

    public void setMatchRulesTitle(String matchRulesTitle) {
        this.matchRulesTitle = matchRulesTitle;
    }

    public String getMatchAttentionTitle() {
        return matchAttentionTitle;
    }

    public void setMatchAttentionTitle(String matchAttentionTitle) {
        this.matchAttentionTitle = matchAttentionTitle;
    }

    public String getMatchSponsor() {
        return matchSponsor;
    }

    public void setMatchSponsor(String matchSponsor) {
        this.matchSponsor = matchSponsor;
    }

    public String getMatchDesString() {
        return matchDesString;
    }

    public void setMatchDesString(String matchDesString) {
        this.matchDesString = matchDesString;
    }

    public String getMatchNoticeString() {
        return matchNoticeString;
    }

    public void setMatchNoticeString(String matchNoticeString) {
        this.matchNoticeString = matchNoticeString;
    }

    public String getMatchRulesString() {
        return matchRulesString;
    }

    public void setMatchRulesString(String matchRulesString) {
        this.matchRulesString = matchRulesString;
    }

    public String getMatchAttentionString() {
        return matchAttentionString;
    }

    public void setMatchAttentionString(String matchAttentionString) {
        this.matchAttentionString = matchAttentionString;
    }

    public String getMatchFinalsFlag() {
        return matchFinalsFlag;
    }

    public void setMatchFinalsFlag(String matchFinalsFlag) {
        this.matchFinalsFlag = matchFinalsFlag;
    }

    public String getErrTeamNum() {
        return errTeamNum;
    }

    public void setErrTeamNum(String errTeamNum) {
        this.errTeamNum = errTeamNum;
    }

    public String getTeamingNum() {
        return teamingNum;
    }

    public void setTeamingNum(String teamingNum) {
        this.teamingNum = teamingNum;
    }

    public String getAuditingErrNum() {
        return auditingErrNum;
    }

    public void setAuditingErrNum(String auditingErrNum) {
        this.auditingErrNum = auditingErrNum;
    }

    public String getMatchPhotoDetail() {
        return matchPhotoDetail;
    }

    public void setMatchPhotoDetail(String matchPhotoDetail) {
        this.matchPhotoDetail = matchPhotoDetail;
    }

    public String getMatchGenderFlag() {
        return matchGenderFlag;
    }

    public void setMatchGenderFlag(String matchGenderFlag) {
        this.matchGenderFlag = matchGenderFlag;
    }

    public String getMatchAgeFlag() {
        return matchAgeFlag;
    }

    public void setMatchAgeFlag(String matchAgeFlag) {
        this.matchAgeFlag = matchAgeFlag;
    }

    public Integer getMatchMaxAge() {
        return matchMaxAge;
    }

    public void setMatchMaxAge(Integer matchMaxAge) {
        this.matchMaxAge = matchMaxAge;
    }

    public Integer getMatchMinAge() {
        return matchMinAge;
    }

    public void setMatchMinAge(Integer matchMinAge) {
        this.matchMinAge = matchMinAge;
    }

    public Integer getMatchStockNum() {
        return matchStockNum;
    }

    public void setMatchStockNum(Integer matchStockNum) {
        this.matchStockNum = matchStockNum;
    }

    public Integer getMatchGroupMaxLimit() {
        return matchGroupMaxLimit;
    }

    public void setMatchGroupMaxLimit(Integer matchGroupMaxLimit) {
        this.matchGroupMaxLimit = matchGroupMaxLimit;
    }

    public String getMatchCreateTime() {
        return matchCreateTime;
    }

    public void setMatchCreateTime(String matchCreateTime) {
        this.matchCreateTime = matchCreateTime;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public String getRemoveMatchNum() {
        return removeMatchNum;
    }

    public void setRemoveMatchNum(String removeMatchNum) {
        this.removeMatchNum = removeMatchNum;
    }

    public String getStayPayNum() {
        return stayPayNum;
    }

    public void setStayPayNum(String stayPayNum) {
        this.stayPayNum = stayPayNum;
    }

    public String getRemoveSignNum() {
        return removeSignNum;
    }

    public void setRemoveSignNum(String removeSignNum) {
        this.removeSignNum = removeSignNum;
    }

    public String getSuccessTeamNum() {
        return successTeamNum;
    }

    public void setSuccessTeamNum(String successTeamNum) {
        this.successTeamNum = successTeamNum;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getMatchKey() {
        return matchKey;
    }

    public void setMatchKey(String matchKey) {
        this.matchKey = matchKey;
    }

    public String getMatchTp() {

        return matchTp;
    }

    public void setMatchTp(String matchTp) {
        this.matchTp = matchTp;
    }

    public String getMatchTpName() {
        return matchTpName;
    }

    public void setMatchTpName(String matchTpName) {
        this.matchTpName = matchTpName;
    }

    public String getMatchMaxId() {
        return matchMaxId;
    }

    public void setMatchMaxId(String matchMaxId) {
        this.matchMaxId = matchMaxId;
    }

    public String getMatchMinId() {
        return matchMinId;
    }

    public void setMatchMinId(String matchMinId) {
        this.matchMinId = matchMinId;
    }

    public String getMatchMaxName() {
        return matchMaxName;
    }

    public void setMatchMaxName(String matchMaxName) {
        this.matchMaxName = matchMaxName;
    }

    public String getMatchMinDetail() {
        return matchMinDetail;
    }

    public void setMatchMinDetail(String matchMinDetail) {
        this.matchMinDetail = matchMinDetail;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(String teamNum) {
        this.teamNum = teamNum;
    }

    /**
     * @return MATCH_ID
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * @param matchId
     */
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    /**
     * @return MATCH_TYPE_ID
     */
    public String getMatchTypeId() {
        return matchTypeId;
    }

    /**
     * @param matchTypeId
     */
    public void setMatchTypeId(String matchTypeId) {
        this.matchTypeId = matchTypeId;
    }

    /**
     * @return MATCH_GROUP_ID
     */
    public String getMatchGroupId() {
        return matchGroupId;
    }

    /**
     * @param matchGroupId
     */
    public void setMatchGroupId(String matchGroupId) {
        this.matchGroupId = matchGroupId;
    }

    /**
     * @return MATCH_NAME
     */
    public String getMatchName() {
        return matchName;
    }

    /**
     * @param matchName
     */
    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    /**
     * @return MATCH_ADDRESS
     */
    public String getMatchAddress() {
        return matchAddress;
    }

    /**
     * @param matchAddress
     */
    public void setMatchAddress(String matchAddress) {
        this.matchAddress = matchAddress;
    }

    /**
     * @return MATCH_PHOTO
     */
    public String getMatchPhoto() {
        return matchPhoto;
    }

    /**
     * @param matchPhoto
     */
    public void setMatchPhoto(String matchPhoto) {
        this.matchPhoto = matchPhoto;
    }

    /**
     * @return MATCH_APPLY_START_TIME
     */
    public String getMatchApplyStartTime() {
        return matchApplyStartTime;
    }

    /**
     * @param matchApplyStartTime
     */
    public void setMatchApplyStartTime(String matchApplyStartTime) {
        this.matchApplyStartTime = matchApplyStartTime;
    }

    /**
     * @return MATCH_APPLY_END_TIME
     */
    public String getMatchApplyEndTime() {
        return matchApplyEndTime;
    }

    /**
     * @param matchApplyEndTime
     */
    public void setMatchApplyEndTime(String matchApplyEndTime) {
        this.matchApplyEndTime = matchApplyEndTime;
    }

    /**
     * @return MATCH_START_TIME
     */
    public String getMatchStartTime() {
        return matchStartTime;
    }

    /**
     * @param matchStartTime
     */
    public void setMatchStartTime(String matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    /**
     * @return MATCH_END_TIME
     */
    public String getMatchEndTime() {
        return matchEndTime;
    }

    /**
     * @param matchEndTime
     */
    public void setMatchEndTime(String matchEndTime) {
        this.matchEndTime = matchEndTime;
    }

    /**
     * @return MATCH_PAY_FLAG
     */
    public String getMatchPayFlag() {
        return matchPayFlag;
    }

    /**
     * @param matchPayFlag
     */
    public void setMatchPayFlag(String matchPayFlag) {
        this.matchPayFlag = matchPayFlag;
    }

    /**
     * @return MATCH_PAY_MONEY
     */
    public BigDecimal getMatchPayMoney() {
        return matchPayMoney;
    }

    /**
     * @param matchPayMoney
     */
    public void setMatchPayMoney(BigDecimal matchPayMoney) {
        this.matchPayMoney = matchPayMoney;
    }

    /**
     * @return MATCH_PAY_MER_ID
     */
    public String getMatchPayMerId() {
        return matchPayMerId;
    }

    /**
     * @param matchPayMerId
     */
    public void setMatchPayMerId(String matchPayMerId) {
        this.matchPayMerId = matchPayMerId;
    }

    /**
     * @return MATCH_INSURE_FLAG
     */
    public String getMatchInsureFlag() {
        return matchInsureFlag;
    }

    /**
     * @param matchInsureFlag
     */
    public void setMatchInsureFlag(String matchInsureFlag) {
        this.matchInsureFlag = matchInsureFlag;
    }

    /**
     * @return MATCH_INSURE_MONEY
     */
    public BigDecimal getMatchInsureMoney() {
        return matchInsureMoney;
    }

    /**
     * @param matchInsureMoney
     */
    public void setMatchInsureMoney(BigDecimal matchInsureMoney) {
        this.matchInsureMoney = matchInsureMoney;
    }

    /**
     * @return MATCH_INSURE_MER_ID
     */
    public String getMatchInsureMerId() {
        return matchInsureMerId;
    }

    /**
     * @param matchInsureMerId
     */
    public void setMatchInsureMerId(String matchInsureMerId) {
        this.matchInsureMerId = matchInsureMerId;
    }

    /**
     * @return MATCH_TYPE
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * @param matchType
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * @return MATCH_NUM_LIMIT
     */
    public Integer getMatchNumLimit() {
        return matchNumLimit;
    }

    /**
     * @param matchNumLimit
     */
    public void setMatchNumLimit(Integer matchNumLimit) {
        this.matchNumLimit = matchNumLimit;
    }

    /**
     * @return MATCH_GROUP_LIMIT
     */
    public Integer getMatchGroupLimit() {
        return matchGroupLimit;
    }

    /**
     * @param matchGroupLimit
     */
    public void setMatchGroupLimit(Integer matchGroupLimit) {
        this.matchGroupLimit = matchGroupLimit;
    }

    /**
     * @return MATCH_GROUP_NUM_LIMIT
     */
    public Integer getMatchGroupNumLimit() {
        return matchGroupNumLimit;
    }

    /**
     * @param matchGroupNumLimit
     */
    public void setMatchGroupNumLimit(Integer matchGroupNumLimit) {
        this.matchGroupNumLimit = matchGroupNumLimit;
    }

    /**
     * @return MATCH_APPLY_PARAM
     */
    public String getMatchApplyParam() {
        return matchApplyParam;
    }

    /**
     * @param matchApplyParam
     */
    public void setMatchApplyParam(String matchApplyParam) {
        this.matchApplyParam = matchApplyParam;
    }

    /**
     * @return MATCH_VOTE_FLAG
     */
    public String getMatchVoteFlag() {
        return matchVoteFlag;
    }

    /**
     * @param matchVoteFlag
     */
    public void setMatchVoteFlag(String matchVoteFlag) {
        this.matchVoteFlag = matchVoteFlag;
    }

    /**
     * @return MATCH_STATE
     */
    public String getMatchState() {
        return matchState;
    }

    /**
     * @param matchState
     */
    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    /**
     * @return MATCH_DES
     */
    public byte[] getMatchDes() {
        return matchDes;
    }

    /**
     * @param matchDes
     */
    public void setMatchDes(byte[] matchDes) {
        this.matchDes = matchDes;
    }

    /**
     * @return MATCH_NOTICE
     */
    public byte[] getMatchNotice() {
        return matchNotice;
    }

    /**
     * @param matchNotice
     */
    public void setMatchNotice(byte[] matchNotice) {
        this.matchNotice = matchNotice;
    }

    /**
     * @return MATCH_RULES
     */
    public byte[] getMatchRules() {
        return matchRules;
    }

    /**
     * @param matchRules
     */
    public void setMatchRules(byte[] matchRules) {
        this.matchRules = matchRules;
    }

    /**
     * @return MATCH_ATTENTION
     */
    public byte[] getMatchAttention() {
        return matchAttention;
    }

    /**
     * @param matchAttention
     */
    public void setMatchAttention(byte[] matchAttention) {
        this.matchAttention = matchAttention;
    }
}
