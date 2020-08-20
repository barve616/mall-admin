package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportCommodityActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportCommodityActivityExample() {
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("COMMODITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("COMMODITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(String value) {
            addCriterion("COMMODITY_ID =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(String value) {
            addCriterion("COMMODITY_ID <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(String value) {
            addCriterion("COMMODITY_ID >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_ID >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(String value) {
            addCriterion("COMMODITY_ID <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_ID <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLike(String value) {
            addCriterion("COMMODITY_ID like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotLike(String value) {
            addCriterion("COMMODITY_ID not like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<String> values) {
            addCriterion("COMMODITY_ID in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<String> values) {
            addCriterion("COMMODITY_ID not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(String value1, String value2) {
            addCriterion("COMMODITY_ID between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_ID not between", value1, value2, "commodityId");
            return (Criteria) this;
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

        public Criteria andActivityStockIsNull() {
            addCriterion("ACTIVITY_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andActivityStockIsNotNull() {
            addCriterion("ACTIVITY_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStockEqualTo(String value) {
            addCriterion("ACTIVITY_STOCK =", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotEqualTo(String value) {
            addCriterion("ACTIVITY_STOCK <>", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockGreaterThan(String value) {
            addCriterion("ACTIVITY_STOCK >", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_STOCK >=", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockLessThan(String value) {
            addCriterion("ACTIVITY_STOCK <", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_STOCK <=", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockLike(String value) {
            addCriterion("ACTIVITY_STOCK like", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotLike(String value) {
            addCriterion("ACTIVITY_STOCK not like", value, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockIn(List<String> values) {
            addCriterion("ACTIVITY_STOCK in", values, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotIn(List<String> values) {
            addCriterion("ACTIVITY_STOCK not in", values, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockBetween(String value1, String value2) {
            addCriterion("ACTIVITY_STOCK between", value1, value2, "activityStock");
            return (Criteria) this;
        }

        public Criteria andActivityStockNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_STOCK not between", value1, value2, "activityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateIsNull() {
            addCriterion("COMMODITY_ACTIVITY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateIsNotNull() {
            addCriterion("COMMODITY_ACTIVITY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateEqualTo(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE =", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateNotEqualTo(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE <>", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateGreaterThan(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE >", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE >=", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateLessThan(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE <", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE <=", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateLike(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE like", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateNotLike(String value) {
            addCriterion("COMMODITY_ACTIVITY_STATE not like", value, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateIn(List<String> values) {
            addCriterion("COMMODITY_ACTIVITY_STATE in", values, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateNotIn(List<String> values) {
            addCriterion("COMMODITY_ACTIVITY_STATE not in", values, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateBetween(String value1, String value2) {
            addCriterion("COMMODITY_ACTIVITY_STATE between", value1, value2, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andCommodityActivityStateNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_ACTIVITY_STATE not between", value1, value2, "commodityActivityState");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdIsNull() {
            addCriterion("TIME_SLOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdIsNotNull() {
            addCriterion("TIME_SLOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdEqualTo(String value) {
            addCriterion("TIME_SLOT_ID =", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdNotEqualTo(String value) {
            addCriterion("TIME_SLOT_ID <>", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdGreaterThan(String value) {
            addCriterion("TIME_SLOT_ID >", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_SLOT_ID >=", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdLessThan(String value) {
            addCriterion("TIME_SLOT_ID <", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdLessThanOrEqualTo(String value) {
            addCriterion("TIME_SLOT_ID <=", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdLike(String value) {
            addCriterion("TIME_SLOT_ID like", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdNotLike(String value) {
            addCriterion("TIME_SLOT_ID not like", value, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdIn(List<String> values) {
            addCriterion("TIME_SLOT_ID in", values, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdNotIn(List<String> values) {
            addCriterion("TIME_SLOT_ID not in", values, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdBetween(String value1, String value2) {
            addCriterion("TIME_SLOT_ID between", value1, value2, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andTimeSlotIdNotBetween(String value1, String value2) {
            addCriterion("TIME_SLOT_ID not between", value1, value2, "timeSlotId");
            return (Criteria) this;
        }

        public Criteria andSpikePriceIsNull() {
            addCriterion("SPIKE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSpikePriceIsNotNull() {
            addCriterion("SPIKE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSpikePriceEqualTo(String value) {
            addCriterion("SPIKE_PRICE =", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceNotEqualTo(String value) {
            addCriterion("SPIKE_PRICE <>", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceGreaterThan(String value) {
            addCriterion("SPIKE_PRICE >", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceGreaterThanOrEqualTo(String value) {
            addCriterion("SPIKE_PRICE >=", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceLessThan(String value) {
            addCriterion("SPIKE_PRICE <", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceLessThanOrEqualTo(String value) {
            addCriterion("SPIKE_PRICE <=", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceLike(String value) {
            addCriterion("SPIKE_PRICE like", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceNotLike(String value) {
            addCriterion("SPIKE_PRICE not like", value, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceIn(List<String> values) {
            addCriterion("SPIKE_PRICE in", values, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceNotIn(List<String> values) {
            addCriterion("SPIKE_PRICE not in", values, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceBetween(String value1, String value2) {
            addCriterion("SPIKE_PRICE between", value1, value2, "spikePrice");
            return (Criteria) this;
        }

        public Criteria andSpikePriceNotBetween(String value1, String value2) {
            addCriterion("SPIKE_PRICE not between", value1, value2, "spikePrice");
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