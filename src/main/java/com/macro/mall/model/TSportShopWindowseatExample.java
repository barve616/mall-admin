package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportShopWindowseatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportShopWindowseatExample() {
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

        public Criteria andWindowseatIdIsNull() {
            addCriterion("WINDOWSEAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdIsNotNull() {
            addCriterion("WINDOWSEAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdEqualTo(String value) {
            addCriterion("WINDOWSEAT_ID =", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdNotEqualTo(String value) {
            addCriterion("WINDOWSEAT_ID <>", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdGreaterThan(String value) {
            addCriterion("WINDOWSEAT_ID >", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOWSEAT_ID >=", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdLessThan(String value) {
            addCriterion("WINDOWSEAT_ID <", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdLessThanOrEqualTo(String value) {
            addCriterion("WINDOWSEAT_ID <=", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdLike(String value) {
            addCriterion("WINDOWSEAT_ID like", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdNotLike(String value) {
            addCriterion("WINDOWSEAT_ID not like", value, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdIn(List<String> values) {
            addCriterion("WINDOWSEAT_ID in", values, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdNotIn(List<String> values) {
            addCriterion("WINDOWSEAT_ID not in", values, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdBetween(String value1, String value2) {
            addCriterion("WINDOWSEAT_ID between", value1, value2, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatIdNotBetween(String value1, String value2) {
            addCriterion("WINDOWSEAT_ID not between", value1, value2, "windowseatId");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameIsNull() {
            addCriterion("WINDOWSEAT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameIsNotNull() {
            addCriterion("WINDOWSEAT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameEqualTo(String value) {
            addCriterion("WINDOWSEAT_NAME =", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameNotEqualTo(String value) {
            addCriterion("WINDOWSEAT_NAME <>", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameGreaterThan(String value) {
            addCriterion("WINDOWSEAT_NAME >", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOWSEAT_NAME >=", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameLessThan(String value) {
            addCriterion("WINDOWSEAT_NAME <", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameLessThanOrEqualTo(String value) {
            addCriterion("WINDOWSEAT_NAME <=", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameLike(String value) {
            addCriterion("WINDOWSEAT_NAME like", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameNotLike(String value) {
            addCriterion("WINDOWSEAT_NAME not like", value, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameIn(List<String> values) {
            addCriterion("WINDOWSEAT_NAME in", values, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameNotIn(List<String> values) {
            addCriterion("WINDOWSEAT_NAME not in", values, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameBetween(String value1, String value2) {
            addCriterion("WINDOWSEAT_NAME between", value1, value2, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatNameNotBetween(String value1, String value2) {
            addCriterion("WINDOWSEAT_NAME not between", value1, value2, "windowseatName");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdIsNull() {
            addCriterion("WINDOWSEAT_COMMODITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdIsNotNull() {
            addCriterion("WINDOWSEAT_COMMODITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdEqualTo(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID =", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdNotEqualTo(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID <>", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdGreaterThan(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID >", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID >=", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdLessThan(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID <", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID <=", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdLike(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID like", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdNotLike(String value) {
            addCriterion("WINDOWSEAT_COMMODITY_ID not like", value, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdIn(List<String> values) {
            addCriterion("WINDOWSEAT_COMMODITY_ID in", values, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdNotIn(List<String> values) {
            addCriterion("WINDOWSEAT_COMMODITY_ID not in", values, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdBetween(String value1, String value2) {
            addCriterion("WINDOWSEAT_COMMODITY_ID between", value1, value2, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andWindowseatCommodityIdNotBetween(String value1, String value2) {
            addCriterion("WINDOWSEAT_COMMODITY_ID not between", value1, value2, "windowseatCommodityId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("SHOP_ID like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("SHOP_ID not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("CREATE_DATE like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("CREATE_DATE not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
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