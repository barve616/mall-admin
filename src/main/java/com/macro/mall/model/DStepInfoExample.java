package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DStepInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DStepInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserNmIsNull() {
            addCriterion("USER_NM is null");
            return (Criteria) this;
        }

        public Criteria andUserNmIsNotNull() {
            addCriterion("USER_NM is not null");
            return (Criteria) this;
        }

        public Criteria andUserNmEqualTo(String value) {
            addCriterion("USER_NM =", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotEqualTo(String value) {
            addCriterion("USER_NM <>", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmGreaterThan(String value) {
            addCriterion("USER_NM >", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NM >=", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLessThan(String value) {
            addCriterion("USER_NM <", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLessThanOrEqualTo(String value) {
            addCriterion("USER_NM <=", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmLike(String value) {
            addCriterion("USER_NM like", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotLike(String value) {
            addCriterion("USER_NM not like", value, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmIn(List<String> values) {
            addCriterion("USER_NM in", values, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotIn(List<String> values) {
            addCriterion("USER_NM not in", values, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmBetween(String value1, String value2) {
            addCriterion("USER_NM between", value1, value2, "userNm");
            return (Criteria) this;
        }

        public Criteria andUserNmNotBetween(String value1, String value2) {
            addCriterion("USER_NM not between", value1, value2, "userNm");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNull() {
            addCriterion("CERT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNotNull() {
            addCriterion("CERT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertIdEqualTo(String value) {
            addCriterion("CERT_ID =", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotEqualTo(String value) {
            addCriterion("CERT_ID <>", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThan(String value) {
            addCriterion("CERT_ID >", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_ID >=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThan(String value) {
            addCriterion("CERT_ID <", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThanOrEqualTo(String value) {
            addCriterion("CERT_ID <=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLike(String value) {
            addCriterion("CERT_ID like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotLike(String value) {
            addCriterion("CERT_ID not like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdIn(List<String> values) {
            addCriterion("CERT_ID in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotIn(List<String> values) {
            addCriterion("CERT_ID not in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdBetween(String value1, String value2) {
            addCriterion("CERT_ID between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotBetween(String value1, String value2) {
            addCriterion("CERT_ID not between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("APPLY_DATE like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("APPLY_DATE not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("APPLY_TIME =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("APPLY_TIME <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("APPLY_TIME >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("APPLY_TIME <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TIME <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("APPLY_TIME like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("APPLY_TIME not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("APPLY_TIME in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("APPLY_TIME not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("APPLY_TIME between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TIME not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNull() {
            addCriterion("STEP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStepNumIsNotNull() {
            addCriterion("STEP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStepNumEqualTo(String value) {
            addCriterion("STEP_NUM =", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotEqualTo(String value) {
            addCriterion("STEP_NUM <>", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThan(String value) {
            addCriterion("STEP_NUM >", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_NUM >=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThan(String value) {
            addCriterion("STEP_NUM <", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLessThanOrEqualTo(String value) {
            addCriterion("STEP_NUM <=", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumLike(String value) {
            addCriterion("STEP_NUM like", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotLike(String value) {
            addCriterion("STEP_NUM not like", value, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumIn(List<String> values) {
            addCriterion("STEP_NUM in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotIn(List<String> values) {
            addCriterion("STEP_NUM not in", values, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumBetween(String value1, String value2) {
            addCriterion("STEP_NUM between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepNumNotBetween(String value1, String value2) {
            addCriterion("STEP_NUM not between", value1, value2, "stepNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumIsNull() {
            addCriterion("STEP_TOTAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumIsNotNull() {
            addCriterion("STEP_TOTAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumEqualTo(String value) {
            addCriterion("STEP_TOTAL_NUM =", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumNotEqualTo(String value) {
            addCriterion("STEP_TOTAL_NUM <>", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumGreaterThan(String value) {
            addCriterion("STEP_TOTAL_NUM >", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_TOTAL_NUM >=", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumLessThan(String value) {
            addCriterion("STEP_TOTAL_NUM <", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumLessThanOrEqualTo(String value) {
            addCriterion("STEP_TOTAL_NUM <=", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumLike(String value) {
            addCriterion("STEP_TOTAL_NUM like", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumNotLike(String value) {
            addCriterion("STEP_TOTAL_NUM not like", value, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumIn(List<String> values) {
            addCriterion("STEP_TOTAL_NUM in", values, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumNotIn(List<String> values) {
            addCriterion("STEP_TOTAL_NUM not in", values, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumBetween(String value1, String value2) {
            addCriterion("STEP_TOTAL_NUM between", value1, value2, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepTotalNumNotBetween(String value1, String value2) {
            addCriterion("STEP_TOTAL_NUM not between", value1, value2, "stepTotalNum");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateIsNull() {
            addCriterion("STEP_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateIsNotNull() {
            addCriterion("STEP_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateEqualTo(String value) {
            addCriterion("STEP_UPDATE_DATE =", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateNotEqualTo(String value) {
            addCriterion("STEP_UPDATE_DATE <>", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateGreaterThan(String value) {
            addCriterion("STEP_UPDATE_DATE >", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_UPDATE_DATE >=", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateLessThan(String value) {
            addCriterion("STEP_UPDATE_DATE <", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("STEP_UPDATE_DATE <=", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateLike(String value) {
            addCriterion("STEP_UPDATE_DATE like", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateNotLike(String value) {
            addCriterion("STEP_UPDATE_DATE not like", value, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateIn(List<String> values) {
            addCriterion("STEP_UPDATE_DATE in", values, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateNotIn(List<String> values) {
            addCriterion("STEP_UPDATE_DATE not in", values, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateBetween(String value1, String value2) {
            addCriterion("STEP_UPDATE_DATE between", value1, value2, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepUpdateDateNotBetween(String value1, String value2) {
            addCriterion("STEP_UPDATE_DATE not between", value1, value2, "stepUpdateDate");
            return (Criteria) this;
        }

        public Criteria andStepInfoIsNull() {
            addCriterion("STEP_INFO is null");
            return (Criteria) this;
        }

        public Criteria andStepInfoIsNotNull() {
            addCriterion("STEP_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andStepInfoEqualTo(String value) {
            addCriterion("STEP_INFO =", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoNotEqualTo(String value) {
            addCriterion("STEP_INFO <>", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoGreaterThan(String value) {
            addCriterion("STEP_INFO >", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_INFO >=", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoLessThan(String value) {
            addCriterion("STEP_INFO <", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoLessThanOrEqualTo(String value) {
            addCriterion("STEP_INFO <=", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoLike(String value) {
            addCriterion("STEP_INFO like", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoNotLike(String value) {
            addCriterion("STEP_INFO not like", value, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoIn(List<String> values) {
            addCriterion("STEP_INFO in", values, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoNotIn(List<String> values) {
            addCriterion("STEP_INFO not in", values, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoBetween(String value1, String value2) {
            addCriterion("STEP_INFO between", value1, value2, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andStepInfoNotBetween(String value1, String value2) {
            addCriterion("STEP_INFO not between", value1, value2, "stepInfo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andUserPltIsNull() {
            addCriterion("USER_PLT is null");
            return (Criteria) this;
        }

        public Criteria andUserPltIsNotNull() {
            addCriterion("USER_PLT is not null");
            return (Criteria) this;
        }

        public Criteria andUserPltEqualTo(String value) {
            addCriterion("USER_PLT =", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltNotEqualTo(String value) {
            addCriterion("USER_PLT <>", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltGreaterThan(String value) {
            addCriterion("USER_PLT >", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PLT >=", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltLessThan(String value) {
            addCriterion("USER_PLT <", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltLessThanOrEqualTo(String value) {
            addCriterion("USER_PLT <=", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltLike(String value) {
            addCriterion("USER_PLT like", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltNotLike(String value) {
            addCriterion("USER_PLT not like", value, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltIn(List<String> values) {
            addCriterion("USER_PLT in", values, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltNotIn(List<String> values) {
            addCriterion("USER_PLT not in", values, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltBetween(String value1, String value2) {
            addCriterion("USER_PLT between", value1, value2, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserPltNotBetween(String value1, String value2) {
            addCriterion("USER_PLT not between", value1, value2, "userPlt");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andStepDaysIsNull() {
            addCriterion("STEP_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andStepDaysIsNotNull() {
            addCriterion("STEP_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andStepDaysEqualTo(String value) {
            addCriterion("STEP_DAYS =", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysNotEqualTo(String value) {
            addCriterion("STEP_DAYS <>", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysGreaterThan(String value) {
            addCriterion("STEP_DAYS >", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_DAYS >=", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysLessThan(String value) {
            addCriterion("STEP_DAYS <", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysLessThanOrEqualTo(String value) {
            addCriterion("STEP_DAYS <=", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysLike(String value) {
            addCriterion("STEP_DAYS like", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysNotLike(String value) {
            addCriterion("STEP_DAYS not like", value, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysIn(List<String> values) {
            addCriterion("STEP_DAYS in", values, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysNotIn(List<String> values) {
            addCriterion("STEP_DAYS not in", values, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysBetween(String value1, String value2) {
            addCriterion("STEP_DAYS between", value1, value2, "stepDays");
            return (Criteria) this;
        }

        public Criteria andStepDaysNotBetween(String value1, String value2) {
            addCriterion("STEP_DAYS not between", value1, value2, "stepDays");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}