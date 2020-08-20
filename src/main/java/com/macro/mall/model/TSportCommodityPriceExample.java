package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSportCommodityPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportCommodityPriceExample() {
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

        public Criteria andDiscountTimePriceIdIsNull() {
            addCriterion("DISCOUNT_TIME_PRICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdIsNotNull() {
            addCriterion("DISCOUNT_TIME_PRICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdEqualTo(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID =", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdNotEqualTo(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID <>", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdGreaterThan(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID >", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID >=", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdLessThan(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID <", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID <=", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdLike(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID like", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdNotLike(String value) {
            addCriterion("DISCOUNT_TIME_PRICE_ID not like", value, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdIn(List<String> values) {
            addCriterion("DISCOUNT_TIME_PRICE_ID in", values, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdNotIn(List<String> values) {
            addCriterion("DISCOUNT_TIME_PRICE_ID not in", values, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdBetween(String value1, String value2) {
            addCriterion("DISCOUNT_TIME_PRICE_ID between", value1, value2, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andDiscountTimePriceIdNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_TIME_PRICE_ID not between", value1, value2, "discountTimePriceId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdIsNull() {
            addCriterion("COMMODITY_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdIsNotNull() {
            addCriterion("COMMODITY_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdEqualTo(String value) {
            addCriterion("COMMODITY_DETAIL_ID =", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdNotEqualTo(String value) {
            addCriterion("COMMODITY_DETAIL_ID <>", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdGreaterThan(String value) {
            addCriterion("COMMODITY_DETAIL_ID >", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_DETAIL_ID >=", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdLessThan(String value) {
            addCriterion("COMMODITY_DETAIL_ID <", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_DETAIL_ID <=", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdLike(String value) {
            addCriterion("COMMODITY_DETAIL_ID like", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdNotLike(String value) {
            addCriterion("COMMODITY_DETAIL_ID not like", value, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdIn(List<String> values) {
            addCriterion("COMMODITY_DETAIL_ID in", values, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdNotIn(List<String> values) {
            addCriterion("COMMODITY_DETAIL_ID not in", values, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdBetween(String value1, String value2) {
            addCriterion("COMMODITY_DETAIL_ID between", value1, value2, "commodityDetailId");
            return (Criteria) this;
        }

        public Criteria andCommodityDetailIdNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_DETAIL_ID not between", value1, value2, "commodityDetailId");
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

        public Criteria andPriceDateIsNull() {
            addCriterion("PRICE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPriceDateIsNotNull() {
            addCriterion("PRICE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDateEqualTo(String value) {
            addCriterion("PRICE_DATE =", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotEqualTo(String value) {
            addCriterion("PRICE_DATE <>", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateGreaterThan(String value) {
            addCriterion("PRICE_DATE >", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_DATE >=", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateLessThan(String value) {
            addCriterion("PRICE_DATE <", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateLessThanOrEqualTo(String value) {
            addCriterion("PRICE_DATE <=", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateLike(String value) {
            addCriterion("PRICE_DATE like", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotLike(String value) {
            addCriterion("PRICE_DATE not like", value, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateIn(List<String> values) {
            addCriterion("PRICE_DATE in", values, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotIn(List<String> values) {
            addCriterion("PRICE_DATE not in", values, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateBetween(String value1, String value2) {
            addCriterion("PRICE_DATE between", value1, value2, "priceDate");
            return (Criteria) this;
        }

        public Criteria andPriceDateNotBetween(String value1, String value2) {
            addCriterion("PRICE_DATE not between", value1, value2, "priceDate");
            return (Criteria) this;
        }

        public Criteria andParceIsNull() {
            addCriterion("PARCE is null");
            return (Criteria) this;
        }

        public Criteria andParceIsNotNull() {
            addCriterion("PARCE is not null");
            return (Criteria) this;
        }

        public Criteria andParceEqualTo(BigDecimal value) {
            addCriterion("PARCE =", value, "parce");
            return (Criteria) this;
        }

        public Criteria andParceNotEqualTo(BigDecimal value) {
            addCriterion("PARCE <>", value, "parce");
            return (Criteria) this;
        }

        public Criteria andParceGreaterThan(BigDecimal value) {
            addCriterion("PARCE >", value, "parce");
            return (Criteria) this;
        }

        public Criteria andParceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARCE >=", value, "parce");
            return (Criteria) this;
        }

        public Criteria andParceLessThan(BigDecimal value) {
            addCriterion("PARCE <", value, "parce");
            return (Criteria) this;
        }

        public Criteria andParceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARCE <=", value, "parce");
            return (Criteria) this;
        }

        public Criteria andParceIn(List<BigDecimal> values) {
            addCriterion("PARCE in", values, "parce");
            return (Criteria) this;
        }

        public Criteria andParceNotIn(List<BigDecimal> values) {
            addCriterion("PARCE not in", values, "parce");
            return (Criteria) this;
        }

        public Criteria andParceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARCE between", value1, value2, "parce");
            return (Criteria) this;
        }

        public Criteria andParceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARCE not between", value1, value2, "parce");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("STOCK is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Short value) {
            addCriterion("STOCK =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Short value) {
            addCriterion("STOCK <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Short value) {
            addCriterion("STOCK >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Short value) {
            addCriterion("STOCK >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Short value) {
            addCriterion("STOCK <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Short value) {
            addCriterion("STOCK <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Short> values) {
            addCriterion("STOCK in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Short> values) {
            addCriterion("STOCK not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Short value1, Short value2) {
            addCriterion("STOCK between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Short value1, Short value2) {
            addCriterion("STOCK not between", value1, value2, "stock");
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