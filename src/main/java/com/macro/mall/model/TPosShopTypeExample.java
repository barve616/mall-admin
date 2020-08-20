package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPosShopTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPosShopTypeExample() {
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

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("COMMODITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("COMMODITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_ID =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_ID <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(String value) {
            addCriterion("COMMODITY_TYPE_ID >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_ID >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(String value) {
            addCriterion("COMMODITY_TYPE_ID <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_ID <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLike(String value) {
            addCriterion("COMMODITY_TYPE_ID like", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotLike(String value) {
            addCriterion("COMMODITY_TYPE_ID not like", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_ID in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_ID not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_ID between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_ID not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdIsNull() {
            addCriterion("POS_SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosShopIdIsNotNull() {
            addCriterion("POS_SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosShopIdEqualTo(String value) {
            addCriterion("POS_SHOP_ID =", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdNotEqualTo(String value) {
            addCriterion("POS_SHOP_ID <>", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdGreaterThan(String value) {
            addCriterion("POS_SHOP_ID >", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_SHOP_ID >=", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdLessThan(String value) {
            addCriterion("POS_SHOP_ID <", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdLessThanOrEqualTo(String value) {
            addCriterion("POS_SHOP_ID <=", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdLike(String value) {
            addCriterion("POS_SHOP_ID like", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdNotLike(String value) {
            addCriterion("POS_SHOP_ID not like", value, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdIn(List<String> values) {
            addCriterion("POS_SHOP_ID in", values, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdNotIn(List<String> values) {
            addCriterion("POS_SHOP_ID not in", values, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdBetween(String value1, String value2) {
            addCriterion("POS_SHOP_ID between", value1, value2, "posShopId");
            return (Criteria) this;
        }

        public Criteria andPosShopIdNotBetween(String value1, String value2) {
            addCriterion("POS_SHOP_ID not between", value1, value2, "posShopId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIsNull() {
            addCriterion("COMMODITY_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIsNotNull() {
            addCriterion("COMMODITY_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NAME =", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NAME <>", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameGreaterThan(String value) {
            addCriterion("COMMODITY_TYPE_NAME >", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NAME >=", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLessThan(String value) {
            addCriterion("COMMODITY_TYPE_NAME <", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NAME <=", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLike(String value) {
            addCriterion("COMMODITY_TYPE_NAME like", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotLike(String value) {
            addCriterion("COMMODITY_TYPE_NAME not like", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_NAME in", values, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_NAME not in", values, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_NAME between", value1, value2, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_NAME not between", value1, value2, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidIsNull() {
            addCriterion("COMMODITY_TYPE_PID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidIsNotNull() {
            addCriterion("COMMODITY_TYPE_PID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_PID =", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidNotEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_PID <>", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidGreaterThan(String value) {
            addCriterion("COMMODITY_TYPE_PID >", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_PID >=", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidLessThan(String value) {
            addCriterion("COMMODITY_TYPE_PID <", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_PID <=", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidLike(String value) {
            addCriterion("COMMODITY_TYPE_PID like", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidNotLike(String value) {
            addCriterion("COMMODITY_TYPE_PID not like", value, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_PID in", values, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidNotIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_PID not in", values, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_PID between", value1, value2, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andCommodityTypePidNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_PID not between", value1, value2, "commodityTypePid");
            return (Criteria) this;
        }

        public Criteria andStratumIsNull() {
            addCriterion("STRATUM is null");
            return (Criteria) this;
        }

        public Criteria andStratumIsNotNull() {
            addCriterion("STRATUM is not null");
            return (Criteria) this;
        }

        public Criteria andStratumEqualTo(String value) {
            addCriterion("STRATUM =", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumNotEqualTo(String value) {
            addCriterion("STRATUM <>", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumGreaterThan(String value) {
            addCriterion("STRATUM >", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumGreaterThanOrEqualTo(String value) {
            addCriterion("STRATUM >=", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumLessThan(String value) {
            addCriterion("STRATUM <", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumLessThanOrEqualTo(String value) {
            addCriterion("STRATUM <=", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumLike(String value) {
            addCriterion("STRATUM like", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumNotLike(String value) {
            addCriterion("STRATUM not like", value, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumIn(List<String> values) {
            addCriterion("STRATUM in", values, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumNotIn(List<String> values) {
            addCriterion("STRATUM not in", values, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumBetween(String value1, String value2) {
            addCriterion("STRATUM between", value1, value2, "stratum");
            return (Criteria) this;
        }

        public Criteria andStratumNotBetween(String value1, String value2) {
            addCriterion("STRATUM not between", value1, value2, "stratum");
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

        public Criteria andCommodityTypeNoIsNull() {
            addCriterion("COMMODITY_TYPE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoIsNotNull() {
            addCriterion("COMMODITY_TYPE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NO =", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NO <>", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoGreaterThan(String value) {
            addCriterion("COMMODITY_TYPE_NO >", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NO >=", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoLessThan(String value) {
            addCriterion("COMMODITY_TYPE_NO <", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_NO <=", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoLike(String value) {
            addCriterion("COMMODITY_TYPE_NO like", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotLike(String value) {
            addCriterion("COMMODITY_TYPE_NO not like", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_NO in", values, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_NO not in", values, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_NO between", value1, value2, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_NO not between", value1, value2, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
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