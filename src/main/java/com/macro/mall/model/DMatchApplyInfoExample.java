package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DMatchApplyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DMatchApplyInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNull() {
            addCriterion("MATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNotNull() {
            addCriterion("MATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchIdEqualTo(String value) {
            addCriterion("MATCH_ID =", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotEqualTo(String value) {
            addCriterion("MATCH_ID <>", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThan(String value) {
            addCriterion("MATCH_ID >", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_ID >=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThan(String value) {
            addCriterion("MATCH_ID <", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThanOrEqualTo(String value) {
            addCriterion("MATCH_ID <=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLike(String value) {
            addCriterion("MATCH_ID like", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotLike(String value) {
            addCriterion("MATCH_ID not like", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdIn(List<String> values) {
            addCriterion("MATCH_ID in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotIn(List<String> values) {
            addCriterion("MATCH_ID not in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdBetween(String value1, String value2) {
            addCriterion("MATCH_ID between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotBetween(String value1, String value2) {
            addCriterion("MATCH_ID not between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNull() {
            addCriterion("MATCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNotNull() {
            addCriterion("MATCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeEqualTo(String value) {
            addCriterion("MATCH_TYPE =", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotEqualTo(String value) {
            addCriterion("MATCH_TYPE <>", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThan(String value) {
            addCriterion("MATCH_TYPE >", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_TYPE >=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThan(String value) {
            addCriterion("MATCH_TYPE <", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThanOrEqualTo(String value) {
            addCriterion("MATCH_TYPE <=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLike(String value) {
            addCriterion("MATCH_TYPE like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotLike(String value) {
            addCriterion("MATCH_TYPE not like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIn(List<String> values) {
            addCriterion("MATCH_TYPE in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotIn(List<String> values) {
            addCriterion("MATCH_TYPE not in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeBetween(String value1, String value2) {
            addCriterion("MATCH_TYPE between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotBetween(String value1, String value2) {
            addCriterion("MATCH_TYPE not between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("TEAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("TEAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("TEAM_ID =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("TEAM_ID <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("TEAM_ID >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_ID >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("TEAM_ID <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("TEAM_ID <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("TEAM_ID like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("TEAM_ID not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("TEAM_ID in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("TEAM_ID not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("TEAM_ID between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("TEAM_ID not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("USER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("USER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("USER_PHONE =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("USER_PHONE <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("USER_PHONE >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PHONE >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("USER_PHONE <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("USER_PHONE <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("USER_PHONE like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("USER_PHONE not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("USER_PHONE in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("USER_PHONE not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("USER_PHONE between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("USER_PHONE not between", value1, value2, "userPhone");
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

        public Criteria andBankCardIsNull() {
            addCriterion("BANK_CARD is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("BANK_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("BANK_CARD =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("BANK_CARD <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("BANK_CARD >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("BANK_CARD <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("BANK_CARD like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("BANK_CARD not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("BANK_CARD in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("BANK_CARD not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("BANK_CARD between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD not between", value1, value2, "bankCard");
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

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andOtherParamIsNull() {
            addCriterion("OTHER_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andOtherParamIsNotNull() {
            addCriterion("OTHER_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andOtherParamEqualTo(String value) {
            addCriterion("OTHER_PARAM =", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamNotEqualTo(String value) {
            addCriterion("OTHER_PARAM <>", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamGreaterThan(String value) {
            addCriterion("OTHER_PARAM >", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_PARAM >=", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamLessThan(String value) {
            addCriterion("OTHER_PARAM <", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamLessThanOrEqualTo(String value) {
            addCriterion("OTHER_PARAM <=", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamLike(String value) {
            addCriterion("OTHER_PARAM like", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamNotLike(String value) {
            addCriterion("OTHER_PARAM not like", value, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamIn(List<String> values) {
            addCriterion("OTHER_PARAM in", values, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamNotIn(List<String> values) {
            addCriterion("OTHER_PARAM not in", values, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamBetween(String value1, String value2) {
            addCriterion("OTHER_PARAM between", value1, value2, "otherParam");
            return (Criteria) this;
        }

        public Criteria andOtherParamNotBetween(String value1, String value2) {
            addCriterion("OTHER_PARAM not between", value1, value2, "otherParam");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateIsNull() {
            addCriterion("APPLY_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateIsNotNull() {
            addCriterion("APPLY_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateEqualTo(String value) {
            addCriterion("APPLY_CREATE_DATE =", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotEqualTo(String value) {
            addCriterion("APPLY_CREATE_DATE <>", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateGreaterThan(String value) {
            addCriterion("APPLY_CREATE_DATE >", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CREATE_DATE >=", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateLessThan(String value) {
            addCriterion("APPLY_CREATE_DATE <", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CREATE_DATE <=", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateLike(String value) {
            addCriterion("APPLY_CREATE_DATE like", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotLike(String value) {
            addCriterion("APPLY_CREATE_DATE not like", value, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateIn(List<String> values) {
            addCriterion("APPLY_CREATE_DATE in", values, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotIn(List<String> values) {
            addCriterion("APPLY_CREATE_DATE not in", values, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateBetween(String value1, String value2) {
            addCriterion("APPLY_CREATE_DATE between", value1, value2, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateDateNotBetween(String value1, String value2) {
            addCriterion("APPLY_CREATE_DATE not between", value1, value2, "applyCreateDate");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeIsNull() {
            addCriterion("APPLY_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeIsNotNull() {
            addCriterion("APPLY_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeEqualTo(String value) {
            addCriterion("APPLY_CREATE_TIME =", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeNotEqualTo(String value) {
            addCriterion("APPLY_CREATE_TIME <>", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeGreaterThan(String value) {
            addCriterion("APPLY_CREATE_TIME >", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CREATE_TIME >=", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeLessThan(String value) {
            addCriterion("APPLY_CREATE_TIME <", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CREATE_TIME <=", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeLike(String value) {
            addCriterion("APPLY_CREATE_TIME like", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeNotLike(String value) {
            addCriterion("APPLY_CREATE_TIME not like", value, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeIn(List<String> values) {
            addCriterion("APPLY_CREATE_TIME in", values, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeNotIn(List<String> values) {
            addCriterion("APPLY_CREATE_TIME not in", values, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeBetween(String value1, String value2) {
            addCriterion("APPLY_CREATE_TIME between", value1, value2, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplyCreateTimeNotBetween(String value1, String value2) {
            addCriterion("APPLY_CREATE_TIME not between", value1, value2, "applyCreateTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateIsNull() {
            addCriterion("APPLY_SUCCESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateIsNotNull() {
            addCriterion("APPLY_SUCCESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_DATE =", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateNotEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_DATE <>", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateGreaterThan(String value) {
            addCriterion("APPLY_SUCCESS_DATE >", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_DATE >=", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateLessThan(String value) {
            addCriterion("APPLY_SUCCESS_DATE <", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_DATE <=", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateLike(String value) {
            addCriterion("APPLY_SUCCESS_DATE like", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateNotLike(String value) {
            addCriterion("APPLY_SUCCESS_DATE not like", value, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateIn(List<String> values) {
            addCriterion("APPLY_SUCCESS_DATE in", values, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateNotIn(List<String> values) {
            addCriterion("APPLY_SUCCESS_DATE not in", values, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateBetween(String value1, String value2) {
            addCriterion("APPLY_SUCCESS_DATE between", value1, value2, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessDateNotBetween(String value1, String value2) {
            addCriterion("APPLY_SUCCESS_DATE not between", value1, value2, "applySuccessDate");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeIsNull() {
            addCriterion("APPLY_SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeIsNotNull() {
            addCriterion("APPLY_SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_TIME =", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeNotEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_TIME <>", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeGreaterThan(String value) {
            addCriterion("APPLY_SUCCESS_TIME >", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_TIME >=", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeLessThan(String value) {
            addCriterion("APPLY_SUCCESS_TIME <", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_SUCCESS_TIME <=", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeLike(String value) {
            addCriterion("APPLY_SUCCESS_TIME like", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeNotLike(String value) {
            addCriterion("APPLY_SUCCESS_TIME not like", value, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeIn(List<String> values) {
            addCriterion("APPLY_SUCCESS_TIME in", values, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeNotIn(List<String> values) {
            addCriterion("APPLY_SUCCESS_TIME not in", values, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeBetween(String value1, String value2) {
            addCriterion("APPLY_SUCCESS_TIME between", value1, value2, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplySuccessTimeNotBetween(String value1, String value2) {
            addCriterion("APPLY_SUCCESS_TIME not between", value1, value2, "applySuccessTime");
            return (Criteria) this;
        }

        public Criteria andApplyChannelIsNull() {
            addCriterion("APPLY_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andApplyChannelIsNotNull() {
            addCriterion("APPLY_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andApplyChannelEqualTo(String value) {
            addCriterion("APPLY_CHANNEL =", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelNotEqualTo(String value) {
            addCriterion("APPLY_CHANNEL <>", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelGreaterThan(String value) {
            addCriterion("APPLY_CHANNEL >", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CHANNEL >=", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelLessThan(String value) {
            addCriterion("APPLY_CHANNEL <", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CHANNEL <=", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelLike(String value) {
            addCriterion("APPLY_CHANNEL like", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelNotLike(String value) {
            addCriterion("APPLY_CHANNEL not like", value, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelIn(List<String> values) {
            addCriterion("APPLY_CHANNEL in", values, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelNotIn(List<String> values) {
            addCriterion("APPLY_CHANNEL not in", values, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelBetween(String value1, String value2) {
            addCriterion("APPLY_CHANNEL between", value1, value2, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyChannelNotBetween(String value1, String value2) {
            addCriterion("APPLY_CHANNEL not between", value1, value2, "applyChannel");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNull() {
            addCriterion("APPLY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNotNull() {
            addCriterion("APPLY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStateEqualTo(String value) {
            addCriterion("APPLY_STATE =", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotEqualTo(String value) {
            addCriterion("APPLY_STATE <>", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThan(String value) {
            addCriterion("APPLY_STATE >", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_STATE >=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThan(String value) {
            addCriterion("APPLY_STATE <", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_STATE <=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLike(String value) {
            addCriterion("APPLY_STATE like", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotLike(String value) {
            addCriterion("APPLY_STATE not like", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIn(List<String> values) {
            addCriterion("APPLY_STATE in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotIn(List<String> values) {
            addCriterion("APPLY_STATE not in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateBetween(String value1, String value2) {
            addCriterion("APPLY_STATE between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotBetween(String value1, String value2) {
            addCriterion("APPLY_STATE not between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoIsNull() {
            addCriterion("SAFE_ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoIsNotNull() {
            addCriterion("SAFE_ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoEqualTo(String value) {
            addCriterion("SAFE_ORDERNO =", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoNotEqualTo(String value) {
            addCriterion("SAFE_ORDERNO <>", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoGreaterThan(String value) {
            addCriterion("SAFE_ORDERNO >", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("SAFE_ORDERNO >=", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoLessThan(String value) {
            addCriterion("SAFE_ORDERNO <", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoLessThanOrEqualTo(String value) {
            addCriterion("SAFE_ORDERNO <=", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoLike(String value) {
            addCriterion("SAFE_ORDERNO like", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoNotLike(String value) {
            addCriterion("SAFE_ORDERNO not like", value, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoIn(List<String> values) {
            addCriterion("SAFE_ORDERNO in", values, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoNotIn(List<String> values) {
            addCriterion("SAFE_ORDERNO not in", values, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoBetween(String value1, String value2) {
            addCriterion("SAFE_ORDERNO between", value1, value2, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andSafeOrdernoNotBetween(String value1, String value2) {
            addCriterion("SAFE_ORDERNO not between", value1, value2, "safeOrderno");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameIsNull() {
            addCriterion("EMERGENCY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameIsNotNull() {
            addCriterion("EMERGENCY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameEqualTo(String value) {
            addCriterion("EMERGENCY_NAME =", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameNotEqualTo(String value) {
            addCriterion("EMERGENCY_NAME <>", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameGreaterThan(String value) {
            addCriterion("EMERGENCY_NAME >", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_NAME >=", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameLessThan(String value) {
            addCriterion("EMERGENCY_NAME <", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameLessThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_NAME <=", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameLike(String value) {
            addCriterion("EMERGENCY_NAME like", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameNotLike(String value) {
            addCriterion("EMERGENCY_NAME not like", value, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameIn(List<String> values) {
            addCriterion("EMERGENCY_NAME in", values, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameNotIn(List<String> values) {
            addCriterion("EMERGENCY_NAME not in", values, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameBetween(String value1, String value2) {
            addCriterion("EMERGENCY_NAME between", value1, value2, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyNameNotBetween(String value1, String value2) {
            addCriterion("EMERGENCY_NAME not between", value1, value2, "emergencyName");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIsNull() {
            addCriterion("EMERGENCY_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIsNotNull() {
            addCriterion("EMERGENCY_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE =", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE <>", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneGreaterThan(String value) {
            addCriterion("EMERGENCY_PHONE >", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE >=", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLessThan(String value) {
            addCriterion("EMERGENCY_PHONE <", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLessThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_PHONE <=", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneLike(String value) {
            addCriterion("EMERGENCY_PHONE like", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotLike(String value) {
            addCriterion("EMERGENCY_PHONE not like", value, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneIn(List<String> values) {
            addCriterion("EMERGENCY_PHONE in", values, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotIn(List<String> values) {
            addCriterion("EMERGENCY_PHONE not in", values, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneBetween(String value1, String value2) {
            addCriterion("EMERGENCY_PHONE between", value1, value2, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyPhoneNotBetween(String value1, String value2) {
            addCriterion("EMERGENCY_PHONE not between", value1, value2, "emergencyPhone");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressIsNull() {
            addCriterion("EMERGENCY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressIsNotNull() {
            addCriterion("EMERGENCY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressEqualTo(String value) {
            addCriterion("EMERGENCY_ADDRESS =", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressNotEqualTo(String value) {
            addCriterion("EMERGENCY_ADDRESS <>", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressGreaterThan(String value) {
            addCriterion("EMERGENCY_ADDRESS >", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_ADDRESS >=", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressLessThan(String value) {
            addCriterion("EMERGENCY_ADDRESS <", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressLessThanOrEqualTo(String value) {
            addCriterion("EMERGENCY_ADDRESS <=", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressLike(String value) {
            addCriterion("EMERGENCY_ADDRESS like", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressNotLike(String value) {
            addCriterion("EMERGENCY_ADDRESS not like", value, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressIn(List<String> values) {
            addCriterion("EMERGENCY_ADDRESS in", values, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressNotIn(List<String> values) {
            addCriterion("EMERGENCY_ADDRESS not in", values, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressBetween(String value1, String value2) {
            addCriterion("EMERGENCY_ADDRESS between", value1, value2, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyAddressNotBetween(String value1, String value2) {
            addCriterion("EMERGENCY_ADDRESS not between", value1, value2, "emergencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeIsNull() {
            addCriterion("UPDATE_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeIsNotNull() {
            addCriterion("UPDATE_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeEqualTo(String value) {
            addCriterion("UPDATE_DATE_TIME =", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_DATE_TIME <>", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeGreaterThan(String value) {
            addCriterion("UPDATE_DATE_TIME >", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE_TIME >=", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeLessThan(String value) {
            addCriterion("UPDATE_DATE_TIME <", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DATE_TIME <=", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeLike(String value) {
            addCriterion("UPDATE_DATE_TIME like", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeNotLike(String value) {
            addCriterion("UPDATE_DATE_TIME not like", value, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeIn(List<String> values) {
            addCriterion("UPDATE_DATE_TIME in", values, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_DATE_TIME not in", values, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE_TIME between", value1, value2, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DATE_TIME not between", value1, value2, "updateDateTime");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("COMMUNITY is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("COMMUNITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("COMMUNITY =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("COMMUNITY <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("COMMUNITY >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITY >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("COMMUNITY <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITY <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("COMMUNITY like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("COMMUNITY not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("COMMUNITY in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("COMMUNITY not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("COMMUNITY between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("COMMUNITY not between", value1, value2, "community");
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