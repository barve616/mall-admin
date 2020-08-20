package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportCommodityTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportCommodityTypeExample() {
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

        public Criteria andCommodityPIdIsNull() {
            addCriterion("COMMODITY_P_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdIsNotNull() {
            addCriterion("COMMODITY_P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdEqualTo(String value) {
            addCriterion("COMMODITY_P_ID =", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdNotEqualTo(String value) {
            addCriterion("COMMODITY_P_ID <>", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdGreaterThan(String value) {
            addCriterion("COMMODITY_P_ID >", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_P_ID >=", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdLessThan(String value) {
            addCriterion("COMMODITY_P_ID <", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_P_ID <=", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdLike(String value) {
            addCriterion("COMMODITY_P_ID like", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdNotLike(String value) {
            addCriterion("COMMODITY_P_ID not like", value, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdIn(List<String> values) {
            addCriterion("COMMODITY_P_ID in", values, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdNotIn(List<String> values) {
            addCriterion("COMMODITY_P_ID not in", values, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdBetween(String value1, String value2) {
            addCriterion("COMMODITY_P_ID between", value1, value2, "commodityPId");
            return (Criteria) this;
        }

        public Criteria andCommodityPIdNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_P_ID not between", value1, value2, "commodityPId");
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

        public Criteria andCommodityTypeStatusIsNull() {
            addCriterion("COMMODITY_TYPE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusIsNotNull() {
            addCriterion("COMMODITY_TYPE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_STATUS =", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusNotEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_STATUS <>", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusGreaterThan(String value) {
            addCriterion("COMMODITY_TYPE_STATUS >", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_STATUS >=", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusLessThan(String value) {
            addCriterion("COMMODITY_TYPE_STATUS <", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TYPE_STATUS <=", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusLike(String value) {
            addCriterion("COMMODITY_TYPE_STATUS like", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusNotLike(String value) {
            addCriterion("COMMODITY_TYPE_STATUS not like", value, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_STATUS in", values, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusNotIn(List<String> values) {
            addCriterion("COMMODITY_TYPE_STATUS not in", values, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_STATUS between", value1, value2, "commodityTypeStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeStatusNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_TYPE_STATUS not between", value1, value2, "commodityTypeStatus");
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