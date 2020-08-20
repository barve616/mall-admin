package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportDiscountActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportDiscountActivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("ACTIVITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("ACTIVITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("ACTIVITY_ID =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("ACTIVITY_ID <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("ACTIVITY_ID >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("ACTIVITY_ID <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("ACTIVITY_ID like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("ACTIVITY_ID not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("ACTIVITY_ID in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("ACTIVITY_ID not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("ACTIVITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("ACTIVITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("ACTIVITY_NAME =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("ACTIVITY_NAME >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("ACTIVITY_NAME <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("ACTIVITY_NAME like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("ACTIVITY_NAME not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("ACTIVITY_NAME in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("ACTIVITY_NAME not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIsNull() {
            addCriterion("ACTIVITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIsNotNull() {
            addCriterion("ACTIVITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID =", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID <>", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdGreaterThan(String value) {
            addCriterion("ACTIVITY_TYPE_ID >", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID >=", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLessThan(String value) {
            addCriterion("ACTIVITY_TYPE_ID <", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID <=", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLike(String value) {
            addCriterion("ACTIVITY_TYPE_ID like", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotLike(String value) {
            addCriterion("ACTIVITY_TYPE_ID not like", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE_ID in", values, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE_ID not in", values, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE_ID between", value1, value2, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE_ID not between", value1, value2, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNull() {
            addCriterion("PLAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNotNull() {
            addCriterion("PLAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeEqualTo(String value) {
            addCriterion("PLAY_TYPE =", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotEqualTo(String value) {
            addCriterion("PLAY_TYPE <>", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThan(String value) {
            addCriterion("PLAY_TYPE >", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAY_TYPE >=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThan(String value) {
            addCriterion("PLAY_TYPE <", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThanOrEqualTo(String value) {
            addCriterion("PLAY_TYPE <=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLike(String value) {
            addCriterion("PLAY_TYPE like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotLike(String value) {
            addCriterion("PLAY_TYPE not like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIn(List<String> values) {
            addCriterion("PLAY_TYPE in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotIn(List<String> values) {
            addCriterion("PLAY_TYPE not in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeBetween(String value1, String value2) {
            addCriterion("PLAY_TYPE between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotBetween(String value1, String value2) {
            addCriterion("PLAY_TYPE not between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("ACTIVITY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("ACTIVITY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(String value) {
            addCriterion("ACTIVITY_STATUS >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(String value) {
            addCriterion("ACTIVITY_STATUS <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLike(String value) {
            addCriterion("ACTIVITY_STATUS like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotLike(String value) {
            addCriterion("ACTIVITY_STATUS not like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<String> values) {
            addCriterion("ACTIVITY_STATUS in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<String> values) {
            addCriterion("ACTIVITY_STATUS not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(String value1, String value2) {
            addCriterion("ACTIVITY_STATUS between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_STATUS not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andCardLimitIsNull() {
            addCriterion("CARD_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCardLimitIsNotNull() {
            addCriterion("CARD_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCardLimitEqualTo(String value) {
            addCriterion("CARD_LIMIT =", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotEqualTo(String value) {
            addCriterion("CARD_LIMIT <>", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitGreaterThan(String value) {
            addCriterion("CARD_LIMIT >", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_LIMIT >=", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitLessThan(String value) {
            addCriterion("CARD_LIMIT <", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitLessThanOrEqualTo(String value) {
            addCriterion("CARD_LIMIT <=", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitLike(String value) {
            addCriterion("CARD_LIMIT like", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotLike(String value) {
            addCriterion("CARD_LIMIT not like", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitIn(List<String> values) {
            addCriterion("CARD_LIMIT in", values, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotIn(List<String> values) {
            addCriterion("CARD_LIMIT not in", values, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitBetween(String value1, String value2) {
            addCriterion("CARD_LIMIT between", value1, value2, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotBetween(String value1, String value2) {
            addCriterion("CARD_LIMIT not between", value1, value2, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andFullAmountIsNull() {
            addCriterion("FULL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFullAmountIsNotNull() {
            addCriterion("FULL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFullAmountEqualTo(String value) {
            addCriterion("FULL_AMOUNT =", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountNotEqualTo(String value) {
            addCriterion("FULL_AMOUNT <>", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountGreaterThan(String value) {
            addCriterion("FULL_AMOUNT >", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_AMOUNT >=", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountLessThan(String value) {
            addCriterion("FULL_AMOUNT <", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountLessThanOrEqualTo(String value) {
            addCriterion("FULL_AMOUNT <=", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountLike(String value) {
            addCriterion("FULL_AMOUNT like", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountNotLike(String value) {
            addCriterion("FULL_AMOUNT not like", value, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountIn(List<String> values) {
            addCriterion("FULL_AMOUNT in", values, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountNotIn(List<String> values) {
            addCriterion("FULL_AMOUNT not in", values, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountBetween(String value1, String value2) {
            addCriterion("FULL_AMOUNT between", value1, value2, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andFullAmountNotBetween(String value1, String value2) {
            addCriterion("FULL_AMOUNT not between", value1, value2, "fullAmount");
            return (Criteria) this;
        }

        public Criteria andReductionIsNull() {
            addCriterion("REDUCTION is null");
            return (Criteria) this;
        }

        public Criteria andReductionIsNotNull() {
            addCriterion("REDUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andReductionEqualTo(String value) {
            addCriterion("REDUCTION =", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotEqualTo(String value) {
            addCriterion("REDUCTION <>", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionGreaterThan(String value) {
            addCriterion("REDUCTION >", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionGreaterThanOrEqualTo(String value) {
            addCriterion("REDUCTION >=", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionLessThan(String value) {
            addCriterion("REDUCTION <", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionLessThanOrEqualTo(String value) {
            addCriterion("REDUCTION <=", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionLike(String value) {
            addCriterion("REDUCTION like", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotLike(String value) {
            addCriterion("REDUCTION not like", value, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionIn(List<String> values) {
            addCriterion("REDUCTION in", values, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotIn(List<String> values) {
            addCriterion("REDUCTION not in", values, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionBetween(String value1, String value2) {
            addCriterion("REDUCTION between", value1, value2, "reduction");
            return (Criteria) this;
        }

        public Criteria andReductionNotBetween(String value1, String value2) {
            addCriterion("REDUCTION not between", value1, value2, "reduction");
            return (Criteria) this;
        }

        public Criteria andLimitRuleIsNull() {
            addCriterion("LIMIT_RULE is null");
            return (Criteria) this;
        }

        public Criteria andLimitRuleIsNotNull() {
            addCriterion("LIMIT_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitRuleEqualTo(String value) {
            addCriterion("LIMIT_RULE =", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleNotEqualTo(String value) {
            addCriterion("LIMIT_RULE <>", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleGreaterThan(String value) {
            addCriterion("LIMIT_RULE >", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_RULE >=", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleLessThan(String value) {
            addCriterion("LIMIT_RULE <", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_RULE <=", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleLike(String value) {
            addCriterion("LIMIT_RULE like", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleNotLike(String value) {
            addCriterion("LIMIT_RULE not like", value, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleIn(List<String> values) {
            addCriterion("LIMIT_RULE in", values, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleNotIn(List<String> values) {
            addCriterion("LIMIT_RULE not in", values, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleBetween(String value1, String value2) {
            addCriterion("LIMIT_RULE between", value1, value2, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRuleNotBetween(String value1, String value2) {
            addCriterion("LIMIT_RULE not between", value1, value2, "limitRule");
            return (Criteria) this;
        }

        public Criteria andLimitRangeIsNull() {
            addCriterion("LIMIT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andLimitRangeIsNotNull() {
            addCriterion("LIMIT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitRangeEqualTo(String value) {
            addCriterion("LIMIT_RANGE =", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeNotEqualTo(String value) {
            addCriterion("LIMIT_RANGE <>", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeGreaterThan(String value) {
            addCriterion("LIMIT_RANGE >", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_RANGE >=", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeLessThan(String value) {
            addCriterion("LIMIT_RANGE <", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_RANGE <=", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeLike(String value) {
            addCriterion("LIMIT_RANGE like", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeNotLike(String value) {
            addCriterion("LIMIT_RANGE not like", value, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeIn(List<String> values) {
            addCriterion("LIMIT_RANGE in", values, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeNotIn(List<String> values) {
            addCriterion("LIMIT_RANGE not in", values, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeBetween(String value1, String value2) {
            addCriterion("LIMIT_RANGE between", value1, value2, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitRangeNotBetween(String value1, String value2) {
            addCriterion("LIMIT_RANGE not between", value1, value2, "limitRange");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNull() {
            addCriterion("LIMIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumIsNotNull() {
            addCriterion("LIMIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumEqualTo(String value) {
            addCriterion("LIMIT_NUM =", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotEqualTo(String value) {
            addCriterion("LIMIT_NUM <>", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThan(String value) {
            addCriterion("LIMIT_NUM >", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_NUM >=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThan(String value) {
            addCriterion("LIMIT_NUM <", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_NUM <=", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumLike(String value) {
            addCriterion("LIMIT_NUM like", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotLike(String value) {
            addCriterion("LIMIT_NUM not like", value, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumIn(List<String> values) {
            addCriterion("LIMIT_NUM in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotIn(List<String> values) {
            addCriterion("LIMIT_NUM not in", values, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumBetween(String value1, String value2) {
            addCriterion("LIMIT_NUM between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andLimitNumNotBetween(String value1, String value2) {
            addCriterion("LIMIT_NUM not between", value1, value2, "limitNum");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionIsNull() {
            addCriterion("IMMEDIATELY_REDUCTION is null");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionIsNotNull() {
            addCriterion("IMMEDIATELY_REDUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionEqualTo(String value) {
            addCriterion("IMMEDIATELY_REDUCTION =", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionNotEqualTo(String value) {
            addCriterion("IMMEDIATELY_REDUCTION <>", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionGreaterThan(String value) {
            addCriterion("IMMEDIATELY_REDUCTION >", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionGreaterThanOrEqualTo(String value) {
            addCriterion("IMMEDIATELY_REDUCTION >=", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionLessThan(String value) {
            addCriterion("IMMEDIATELY_REDUCTION <", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionLessThanOrEqualTo(String value) {
            addCriterion("IMMEDIATELY_REDUCTION <=", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionLike(String value) {
            addCriterion("IMMEDIATELY_REDUCTION like", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionNotLike(String value) {
            addCriterion("IMMEDIATELY_REDUCTION not like", value, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionIn(List<String> values) {
            addCriterion("IMMEDIATELY_REDUCTION in", values, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionNotIn(List<String> values) {
            addCriterion("IMMEDIATELY_REDUCTION not in", values, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionBetween(String value1, String value2) {
            addCriterion("IMMEDIATELY_REDUCTION between", value1, value2, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andImmediatelyReductionNotBetween(String value1, String value2) {
            addCriterion("IMMEDIATELY_REDUCTION not between", value1, value2, "immediatelyReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(String value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(String value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLike(String value) {
            addCriterion("DISCOUNT like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotLike(String value) {
            addCriterion("DISCOUNT not like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<String> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelIsNull() {
            addCriterion("ONLINE_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelIsNotNull() {
            addCriterion("ONLINE_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelEqualTo(String value) {
            addCriterion("ONLINE_CHANNEL =", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelNotEqualTo(String value) {
            addCriterion("ONLINE_CHANNEL <>", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelGreaterThan(String value) {
            addCriterion("ONLINE_CHANNEL >", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_CHANNEL >=", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelLessThan(String value) {
            addCriterion("ONLINE_CHANNEL <", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_CHANNEL <=", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelLike(String value) {
            addCriterion("ONLINE_CHANNEL like", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelNotLike(String value) {
            addCriterion("ONLINE_CHANNEL not like", value, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelIn(List<String> values) {
            addCriterion("ONLINE_CHANNEL in", values, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelNotIn(List<String> values) {
            addCriterion("ONLINE_CHANNEL not in", values, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelBetween(String value1, String value2) {
            addCriterion("ONLINE_CHANNEL between", value1, value2, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andOnlineChannelNotBetween(String value1, String value2) {
            addCriterion("ONLINE_CHANNEL not between", value1, value2, "onlineChannel");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("NOTICE =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("NOTICE <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("NOTICE >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("NOTICE <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("NOTICE <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("NOTICE like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("NOTICE not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("NOTICE in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("NOTICE not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("NOTICE between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("NOTICE not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("BRIEF is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("BRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("BRIEF =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("BRIEF <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("BRIEF >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("BRIEF >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("BRIEF <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("BRIEF <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("BRIEF like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("BRIEF not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("BRIEF in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("BRIEF not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("BRIEF between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("BRIEF not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNull() {
            addCriterion("ACTIVITY_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIsNotNull() {
            addCriterion("ACTIVITY_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeEqualTo(String value) {
            addCriterion("ACTIVITY_START_TIME =", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotEqualTo(String value) {
            addCriterion("ACTIVITY_START_TIME <>", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThan(String value) {
            addCriterion("ACTIVITY_START_TIME >", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_START_TIME >=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThan(String value) {
            addCriterion("ACTIVITY_START_TIME <", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_START_TIME <=", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeLike(String value) {
            addCriterion("ACTIVITY_START_TIME like", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotLike(String value) {
            addCriterion("ACTIVITY_START_TIME not like", value, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeIn(List<String> values) {
            addCriterion("ACTIVITY_START_TIME in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotIn(List<String> values) {
            addCriterion("ACTIVITY_START_TIME not in", values, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeBetween(String value1, String value2) {
            addCriterion("ACTIVITY_START_TIME between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStartTimeNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_START_TIME not between", value1, value2, "activityStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNull() {
            addCriterion("ACTIVITY_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIsNotNull() {
            addCriterion("ACTIVITY_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeEqualTo(String value) {
            addCriterion("ACTIVITY_END_TIME =", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotEqualTo(String value) {
            addCriterion("ACTIVITY_END_TIME <>", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThan(String value) {
            addCriterion("ACTIVITY_END_TIME >", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_END_TIME >=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThan(String value) {
            addCriterion("ACTIVITY_END_TIME <", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_END_TIME <=", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeLike(String value) {
            addCriterion("ACTIVITY_END_TIME like", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotLike(String value) {
            addCriterion("ACTIVITY_END_TIME not like", value, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeIn(List<String> values) {
            addCriterion("ACTIVITY_END_TIME in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotIn(List<String> values) {
            addCriterion("ACTIVITY_END_TIME not in", values, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeBetween(String value1, String value2) {
            addCriterion("ACTIVITY_END_TIME between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityEndTimeNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_END_TIME not between", value1, value2, "activityEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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