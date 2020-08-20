package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DSpoOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DSpoOrderInfoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andMerNameIsNull() {
            addCriterion("MER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("MER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("MER_NAME =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("MER_NAME <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("MER_NAME >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("MER_NAME >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("MER_NAME <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("MER_NAME <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("MER_NAME like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("MER_NAME not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("MER_NAME in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("MER_NAME not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("MER_NAME between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("MER_NAME not between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("MER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("MER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(String value) {
            addCriterion("MER_ID =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(String value) {
            addCriterion("MER_ID <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(String value) {
            addCriterion("MER_ID >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(String value) {
            addCriterion("MER_ID >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(String value) {
            addCriterion("MER_ID <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(String value) {
            addCriterion("MER_ID <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLike(String value) {
            addCriterion("MER_ID like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotLike(String value) {
            addCriterion("MER_ID not like", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<String> values) {
            addCriterion("MER_ID in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<String> values) {
            addCriterion("MER_ID not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(String value1, String value2) {
            addCriterion("MER_ID between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(String value1, String value2) {
            addCriterion("MER_ID not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNull() {
            addCriterion("TERM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNotNull() {
            addCriterion("TERM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTermIdEqualTo(String value) {
            addCriterion("TERM_ID =", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotEqualTo(String value) {
            addCriterion("TERM_ID <>", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThan(String value) {
            addCriterion("TERM_ID >", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERM_ID >=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThan(String value) {
            addCriterion("TERM_ID <", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThanOrEqualTo(String value) {
            addCriterion("TERM_ID <=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLike(String value) {
            addCriterion("TERM_ID like", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotLike(String value) {
            addCriterion("TERM_ID not like", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdIn(List<String> values) {
            addCriterion("TERM_ID in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotIn(List<String> values) {
            addCriterion("TERM_ID not in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdBetween(String value1, String value2) {
            addCriterion("TERM_ID between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotBetween(String value1, String value2) {
            addCriterion("TERM_ID not between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNull() {
            addCriterion("PAY_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIsNotNull() {
            addCriterion("PAY_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPayMoneyEqualTo(BigDecimal value) {
            addCriterion("PAY_MONEY =", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotEqualTo(BigDecimal value) {
            addCriterion("PAY_MONEY <>", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThan(BigDecimal value) {
            addCriterion("PAY_MONEY >", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_MONEY >=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThan(BigDecimal value) {
            addCriterion("PAY_MONEY <", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_MONEY <=", value, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyIn(List<BigDecimal> values) {
            addCriterion("PAY_MONEY in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotIn(List<BigDecimal> values) {
            addCriterion("PAY_MONEY not in", values, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_MONEY between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_MONEY not between", value1, value2, "payMoney");
            return (Criteria) this;
        }

        public Criteria andPayPointIsNull() {
            addCriterion("PAY_POINT is null");
            return (Criteria) this;
        }

        public Criteria andPayPointIsNotNull() {
            addCriterion("PAY_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPayPointEqualTo(BigDecimal value) {
            addCriterion("PAY_POINT =", value, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointNotEqualTo(BigDecimal value) {
            addCriterion("PAY_POINT <>", value, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointGreaterThan(BigDecimal value) {
            addCriterion("PAY_POINT >", value, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_POINT >=", value, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointLessThan(BigDecimal value) {
            addCriterion("PAY_POINT <", value, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_POINT <=", value, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointIn(List<BigDecimal> values) {
            addCriterion("PAY_POINT in", values, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointNotIn(List<BigDecimal> values) {
            addCriterion("PAY_POINT not in", values, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_POINT between", value1, value2, "payPoint");
            return (Criteria) this;
        }

        public Criteria andPayPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_POINT not between", value1, value2, "payPoint");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtIsNull() {
            addCriterion("TIME_OUT_DT is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtIsNotNull() {
            addCriterion("TIME_OUT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtEqualTo(String value) {
            addCriterion("TIME_OUT_DT =", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtNotEqualTo(String value) {
            addCriterion("TIME_OUT_DT <>", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtGreaterThan(String value) {
            addCriterion("TIME_OUT_DT >", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_OUT_DT >=", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtLessThan(String value) {
            addCriterion("TIME_OUT_DT <", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtLessThanOrEqualTo(String value) {
            addCriterion("TIME_OUT_DT <=", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtLike(String value) {
            addCriterion("TIME_OUT_DT like", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtNotLike(String value) {
            addCriterion("TIME_OUT_DT not like", value, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtIn(List<String> values) {
            addCriterion("TIME_OUT_DT in", values, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtNotIn(List<String> values) {
            addCriterion("TIME_OUT_DT not in", values, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtBetween(String value1, String value2) {
            addCriterion("TIME_OUT_DT between", value1, value2, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andTimeOutDtNotBetween(String value1, String value2) {
            addCriterion("TIME_OUT_DT not between", value1, value2, "timeOutDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtIsNull() {
            addCriterion("CREAT_DT is null");
            return (Criteria) this;
        }

        public Criteria andCreatDtIsNotNull() {
            addCriterion("CREAT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatDtEqualTo(String value) {
            addCriterion("CREAT_DT =", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotEqualTo(String value) {
            addCriterion("CREAT_DT <>", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtGreaterThan(String value) {
            addCriterion("CREAT_DT >", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtGreaterThanOrEqualTo(String value) {
            addCriterion("CREAT_DT >=", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtLessThan(String value) {
            addCriterion("CREAT_DT <", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtLessThanOrEqualTo(String value) {
            addCriterion("CREAT_DT <=", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtLike(String value) {
            addCriterion("CREAT_DT like", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotLike(String value) {
            addCriterion("CREAT_DT not like", value, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtIn(List<String> values) {
            addCriterion("CREAT_DT in", values, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotIn(List<String> values) {
            addCriterion("CREAT_DT not in", values, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtBetween(String value1, String value2) {
            addCriterion("CREAT_DT between", value1, value2, "creatDt");
            return (Criteria) this;
        }

        public Criteria andCreatDtNotBetween(String value1, String value2) {
            addCriterion("CREAT_DT not between", value1, value2, "creatDt");
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

        public Criteria andReSqCodeIsNull() {
            addCriterion("RE_SQ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReSqCodeIsNotNull() {
            addCriterion("RE_SQ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReSqCodeEqualTo(String value) {
            addCriterion("RE_SQ_CODE =", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeNotEqualTo(String value) {
            addCriterion("RE_SQ_CODE <>", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeGreaterThan(String value) {
            addCriterion("RE_SQ_CODE >", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RE_SQ_CODE >=", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeLessThan(String value) {
            addCriterion("RE_SQ_CODE <", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeLessThanOrEqualTo(String value) {
            addCriterion("RE_SQ_CODE <=", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeLike(String value) {
            addCriterion("RE_SQ_CODE like", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeNotLike(String value) {
            addCriterion("RE_SQ_CODE not like", value, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeIn(List<String> values) {
            addCriterion("RE_SQ_CODE in", values, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeNotIn(List<String> values) {
            addCriterion("RE_SQ_CODE not in", values, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeBetween(String value1, String value2) {
            addCriterion("RE_SQ_CODE between", value1, value2, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andReSqCodeNotBetween(String value1, String value2) {
            addCriterion("RE_SQ_CODE not between", value1, value2, "reSqCode");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdIsNull() {
            addCriterion("ZDZ_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdIsNotNull() {
            addCriterion("ZDZ_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdEqualTo(String value) {
            addCriterion("ZDZ_ORDER_ID =", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdNotEqualTo(String value) {
            addCriterion("ZDZ_ORDER_ID <>", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdGreaterThan(String value) {
            addCriterion("ZDZ_ORDER_ID >", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ZDZ_ORDER_ID >=", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdLessThan(String value) {
            addCriterion("ZDZ_ORDER_ID <", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ZDZ_ORDER_ID <=", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdLike(String value) {
            addCriterion("ZDZ_ORDER_ID like", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdNotLike(String value) {
            addCriterion("ZDZ_ORDER_ID not like", value, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdIn(List<String> values) {
            addCriterion("ZDZ_ORDER_ID in", values, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdNotIn(List<String> values) {
            addCriterion("ZDZ_ORDER_ID not in", values, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdBetween(String value1, String value2) {
            addCriterion("ZDZ_ORDER_ID between", value1, value2, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andZdzOrderIdNotBetween(String value1, String value2) {
            addCriterion("ZDZ_ORDER_ID not between", value1, value2, "zdzOrderId");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(String value) {
            addCriterion("PAY_DATE =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(String value) {
            addCriterion("PAY_DATE <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(String value) {
            addCriterion("PAY_DATE >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_DATE >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(String value) {
            addCriterion("PAY_DATE <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(String value) {
            addCriterion("PAY_DATE <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLike(String value) {
            addCriterion("PAY_DATE like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotLike(String value) {
            addCriterion("PAY_DATE not like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<String> values) {
            addCriterion("PAY_DATE in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<String> values) {
            addCriterion("PAY_DATE not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(String value1, String value2) {
            addCriterion("PAY_DATE between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(String value1, String value2) {
            addCriterion("PAY_DATE not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("PAY_TIME =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("PAY_TIME <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("PAY_TIME >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TIME >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("PAY_TIME <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TIME <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("PAY_TIME like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("PAY_TIME not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("PAY_TIME in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("PAY_TIME not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("PAY_TIME between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("PAY_TIME not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNull() {
            addCriterion("RETURN_MSG is null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIsNotNull() {
            addCriterion("RETURN_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMsgEqualTo(String value) {
            addCriterion("RETURN_MSG =", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotEqualTo(String value) {
            addCriterion("RETURN_MSG <>", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThan(String value) {
            addCriterion("RETURN_MSG >", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_MSG >=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThan(String value) {
            addCriterion("RETURN_MSG <", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLessThanOrEqualTo(String value) {
            addCriterion("RETURN_MSG <=", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgLike(String value) {
            addCriterion("RETURN_MSG like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotLike(String value) {
            addCriterion("RETURN_MSG not like", value, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgIn(List<String> values) {
            addCriterion("RETURN_MSG in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotIn(List<String> values) {
            addCriterion("RETURN_MSG not in", values, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgBetween(String value1, String value2) {
            addCriterion("RETURN_MSG between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnMsgNotBetween(String value1, String value2) {
            addCriterion("RETURN_MSG not between", value1, value2, "returnMsg");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(String value) {
            addCriterion("RETURN_DATE =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(String value) {
            addCriterion("RETURN_DATE <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(String value) {
            addCriterion("RETURN_DATE >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_DATE >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(String value) {
            addCriterion("RETURN_DATE <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(String value) {
            addCriterion("RETURN_DATE <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLike(String value) {
            addCriterion("RETURN_DATE like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotLike(String value) {
            addCriterion("RETURN_DATE not like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<String> values) {
            addCriterion("RETURN_DATE in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<String> values) {
            addCriterion("RETURN_DATE not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(String value1, String value2) {
            addCriterion("RETURN_DATE between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(String value1, String value2) {
            addCriterion("RETURN_DATE not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateIsNull() {
            addCriterion("RETURN_PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateIsNotNull() {
            addCriterion("RETURN_PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_DATE =", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateNotEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_DATE <>", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateGreaterThan(String value) {
            addCriterion("RETURN_PURCHASE_DATE >", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_DATE >=", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateLessThan(String value) {
            addCriterion("RETURN_PURCHASE_DATE <", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateLessThanOrEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_DATE <=", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateLike(String value) {
            addCriterion("RETURN_PURCHASE_DATE like", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateNotLike(String value) {
            addCriterion("RETURN_PURCHASE_DATE not like", value, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateIn(List<String> values) {
            addCriterion("RETURN_PURCHASE_DATE in", values, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateNotIn(List<String> values) {
            addCriterion("RETURN_PURCHASE_DATE not in", values, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateBetween(String value1, String value2) {
            addCriterion("RETURN_PURCHASE_DATE between", value1, value2, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseDateNotBetween(String value1, String value2) {
            addCriterion("RETURN_PURCHASE_DATE not between", value1, value2, "returnPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeIsNull() {
            addCriterion("RETURN_PURCHASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeIsNotNull() {
            addCriterion("RETURN_PURCHASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_TIME =", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeNotEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_TIME <>", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeGreaterThan(String value) {
            addCriterion("RETURN_PURCHASE_TIME >", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_TIME >=", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeLessThan(String value) {
            addCriterion("RETURN_PURCHASE_TIME <", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_PURCHASE_TIME <=", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeLike(String value) {
            addCriterion("RETURN_PURCHASE_TIME like", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeNotLike(String value) {
            addCriterion("RETURN_PURCHASE_TIME not like", value, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeIn(List<String> values) {
            addCriterion("RETURN_PURCHASE_TIME in", values, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeNotIn(List<String> values) {
            addCriterion("RETURN_PURCHASE_TIME not in", values, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeBetween(String value1, String value2) {
            addCriterion("RETURN_PURCHASE_TIME between", value1, value2, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andReturnPurchaseTimeNotBetween(String value1, String value2) {
            addCriterion("RETURN_PURCHASE_TIME not between", value1, value2, "returnPurchaseTime");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNull() {
            addCriterion("SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNotNull() {
            addCriterion("SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNoEqualTo(String value) {
            addCriterion("SEQ_NO =", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotEqualTo(String value) {
            addCriterion("SEQ_NO <>", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThan(String value) {
            addCriterion("SEQ_NO >", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NO >=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThan(String value) {
            addCriterion("SEQ_NO <", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NO <=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLike(String value) {
            addCriterion("SEQ_NO like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotLike(String value) {
            addCriterion("SEQ_NO not like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoIn(List<String> values) {
            addCriterion("SEQ_NO in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotIn(List<String> values) {
            addCriterion("SEQ_NO not in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoBetween(String value1, String value2) {
            addCriterion("SEQ_NO between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotBetween(String value1, String value2) {
            addCriterion("SEQ_NO not between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andIsCouponIsNull() {
            addCriterion("IS_COUPON is null");
            return (Criteria) this;
        }

        public Criteria andIsCouponIsNotNull() {
            addCriterion("IS_COUPON is not null");
            return (Criteria) this;
        }

        public Criteria andIsCouponEqualTo(String value) {
            addCriterion("IS_COUPON =", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotEqualTo(String value) {
            addCriterion("IS_COUPON <>", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponGreaterThan(String value) {
            addCriterion("IS_COUPON >", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponGreaterThanOrEqualTo(String value) {
            addCriterion("IS_COUPON >=", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponLessThan(String value) {
            addCriterion("IS_COUPON <", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponLessThanOrEqualTo(String value) {
            addCriterion("IS_COUPON <=", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponLike(String value) {
            addCriterion("IS_COUPON like", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotLike(String value) {
            addCriterion("IS_COUPON not like", value, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponIn(List<String> values) {
            addCriterion("IS_COUPON in", values, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotIn(List<String> values) {
            addCriterion("IS_COUPON not in", values, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponBetween(String value1, String value2) {
            addCriterion("IS_COUPON between", value1, value2, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andIsCouponNotBetween(String value1, String value2) {
            addCriterion("IS_COUPON not between", value1, value2, "isCoupon");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoIsNull() {
            addCriterion("MER_SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoIsNotNull() {
            addCriterion("MER_SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoEqualTo(String value) {
            addCriterion("MER_SEQ_NO =", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoNotEqualTo(String value) {
            addCriterion("MER_SEQ_NO <>", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoGreaterThan(String value) {
            addCriterion("MER_SEQ_NO >", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("MER_SEQ_NO >=", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoLessThan(String value) {
            addCriterion("MER_SEQ_NO <", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoLessThanOrEqualTo(String value) {
            addCriterion("MER_SEQ_NO <=", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoLike(String value) {
            addCriterion("MER_SEQ_NO like", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoNotLike(String value) {
            addCriterion("MER_SEQ_NO not like", value, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoIn(List<String> values) {
            addCriterion("MER_SEQ_NO in", values, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoNotIn(List<String> values) {
            addCriterion("MER_SEQ_NO not in", values, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoBetween(String value1, String value2) {
            addCriterion("MER_SEQ_NO between", value1, value2, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andMerSeqNoNotBetween(String value1, String value2) {
            addCriterion("MER_SEQ_NO not between", value1, value2, "merSeqNo");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("PAY_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("PAY_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("PAY_CHANNEL =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("PAY_CHANNEL >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("PAY_CHANNEL <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("PAY_CHANNEL like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("PAY_CHANNEL not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("PAY_CHANNEL in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL not between", value1, value2, "payChannel");
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

        public Criteria andPayCardTypeIsNull() {
            addCriterion("PAY_CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeIsNotNull() {
            addCriterion("PAY_CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeEqualTo(String value) {
            addCriterion("PAY_CARD_TYPE =", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeNotEqualTo(String value) {
            addCriterion("PAY_CARD_TYPE <>", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeGreaterThan(String value) {
            addCriterion("PAY_CARD_TYPE >", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CARD_TYPE >=", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeLessThan(String value) {
            addCriterion("PAY_CARD_TYPE <", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_CARD_TYPE <=", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeLike(String value) {
            addCriterion("PAY_CARD_TYPE like", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeNotLike(String value) {
            addCriterion("PAY_CARD_TYPE not like", value, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeIn(List<String> values) {
            addCriterion("PAY_CARD_TYPE in", values, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeNotIn(List<String> values) {
            addCriterion("PAY_CARD_TYPE not in", values, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeBetween(String value1, String value2) {
            addCriterion("PAY_CARD_TYPE between", value1, value2, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayCardTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_CARD_TYPE not between", value1, value2, "payCardType");
            return (Criteria) this;
        }

        public Criteria andPayStagesIsNull() {
            addCriterion("PAY_STAGES is null");
            return (Criteria) this;
        }

        public Criteria andPayStagesIsNotNull() {
            addCriterion("PAY_STAGES is not null");
            return (Criteria) this;
        }

        public Criteria andPayStagesEqualTo(String value) {
            addCriterion("PAY_STAGES =", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesNotEqualTo(String value) {
            addCriterion("PAY_STAGES <>", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesGreaterThan(String value) {
            addCriterion("PAY_STAGES >", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_STAGES >=", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesLessThan(String value) {
            addCriterion("PAY_STAGES <", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesLessThanOrEqualTo(String value) {
            addCriterion("PAY_STAGES <=", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesLike(String value) {
            addCriterion("PAY_STAGES like", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesNotLike(String value) {
            addCriterion("PAY_STAGES not like", value, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesIn(List<String> values) {
            addCriterion("PAY_STAGES in", values, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesNotIn(List<String> values) {
            addCriterion("PAY_STAGES not in", values, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesBetween(String value1, String value2) {
            addCriterion("PAY_STAGES between", value1, value2, "payStages");
            return (Criteria) this;
        }

        public Criteria andPayStagesNotBetween(String value1, String value2) {
            addCriterion("PAY_STAGES not between", value1, value2, "payStages");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIsNull() {
            addCriterion("PRODUCT_PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIsNotNull() {
            addCriterion("PRODUCT_PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlEqualTo(String value) {
            addCriterion("PRODUCT_PIC_URL =", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotEqualTo(String value) {
            addCriterion("PRODUCT_PIC_URL <>", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlGreaterThan(String value) {
            addCriterion("PRODUCT_PIC_URL >", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PIC_URL >=", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLessThan(String value) {
            addCriterion("PRODUCT_PIC_URL <", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PIC_URL <=", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlLike(String value) {
            addCriterion("PRODUCT_PIC_URL like", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotLike(String value) {
            addCriterion("PRODUCT_PIC_URL not like", value, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlIn(List<String> values) {
            addCriterion("PRODUCT_PIC_URL in", values, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotIn(List<String> values) {
            addCriterion("PRODUCT_PIC_URL not in", values, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlBetween(String value1, String value2) {
            addCriterion("PRODUCT_PIC_URL between", value1, value2, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andProductPicUrlNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PIC_URL not between", value1, value2, "productPicUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlIsNull() {
            addCriterion("ORDER_DETAIL_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlIsNotNull() {
            addCriterion("ORDER_DETAIL_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlEqualTo(String value) {
            addCriterion("ORDER_DETAIL_URL =", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlNotEqualTo(String value) {
            addCriterion("ORDER_DETAIL_URL <>", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlGreaterThan(String value) {
            addCriterion("ORDER_DETAIL_URL >", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DETAIL_URL >=", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlLessThan(String value) {
            addCriterion("ORDER_DETAIL_URL <", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DETAIL_URL <=", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlLike(String value) {
            addCriterion("ORDER_DETAIL_URL like", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlNotLike(String value) {
            addCriterion("ORDER_DETAIL_URL not like", value, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlIn(List<String> values) {
            addCriterion("ORDER_DETAIL_URL in", values, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlNotIn(List<String> values) {
            addCriterion("ORDER_DETAIL_URL not in", values, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlBetween(String value1, String value2) {
            addCriterion("ORDER_DETAIL_URL between", value1, value2, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderDetailUrlNotBetween(String value1, String value2) {
            addCriterion("ORDER_DETAIL_URL not between", value1, value2, "orderDetailUrl");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeIsNull() {
            addCriterion("ORDER_SEC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeIsNotNull() {
            addCriterion("ORDER_SEC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeEqualTo(String value) {
            addCriterion("ORDER_SEC_TYPE =", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeNotEqualTo(String value) {
            addCriterion("ORDER_SEC_TYPE <>", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeGreaterThan(String value) {
            addCriterion("ORDER_SEC_TYPE >", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SEC_TYPE >=", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeLessThan(String value) {
            addCriterion("ORDER_SEC_TYPE <", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SEC_TYPE <=", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeLike(String value) {
            addCriterion("ORDER_SEC_TYPE like", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeNotLike(String value) {
            addCriterion("ORDER_SEC_TYPE not like", value, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeIn(List<String> values) {
            addCriterion("ORDER_SEC_TYPE in", values, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeNotIn(List<String> values) {
            addCriterion("ORDER_SEC_TYPE not in", values, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeBetween(String value1, String value2) {
            addCriterion("ORDER_SEC_TYPE between", value1, value2, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andOrderSecTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_SEC_TYPE not between", value1, value2, "orderSecType");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNull() {
            addCriterion("TOKEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTokenIdIsNotNull() {
            addCriterion("TOKEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTokenIdEqualTo(String value) {
            addCriterion("TOKEN_ID =", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotEqualTo(String value) {
            addCriterion("TOKEN_ID <>", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThan(String value) {
            addCriterion("TOKEN_ID >", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN_ID >=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThan(String value) {
            addCriterion("TOKEN_ID <", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLessThanOrEqualTo(String value) {
            addCriterion("TOKEN_ID <=", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdLike(String value) {
            addCriterion("TOKEN_ID like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotLike(String value) {
            addCriterion("TOKEN_ID not like", value, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdIn(List<String> values) {
            addCriterion("TOKEN_ID in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotIn(List<String> values) {
            addCriterion("TOKEN_ID not in", values, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdBetween(String value1, String value2) {
            addCriterion("TOKEN_ID between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andTokenIdNotBetween(String value1, String value2) {
            addCriterion("TOKEN_ID not between", value1, value2, "tokenId");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeIsNull() {
            addCriterion("MER_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeIsNotNull() {
            addCriterion("MER_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeEqualTo(String value) {
            addCriterion("MER_PAY_TYPE =", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeNotEqualTo(String value) {
            addCriterion("MER_PAY_TYPE <>", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeGreaterThan(String value) {
            addCriterion("MER_PAY_TYPE >", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_PAY_TYPE >=", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeLessThan(String value) {
            addCriterion("MER_PAY_TYPE <", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeLessThanOrEqualTo(String value) {
            addCriterion("MER_PAY_TYPE <=", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeLike(String value) {
            addCriterion("MER_PAY_TYPE like", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeNotLike(String value) {
            addCriterion("MER_PAY_TYPE not like", value, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeIn(List<String> values) {
            addCriterion("MER_PAY_TYPE in", values, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeNotIn(List<String> values) {
            addCriterion("MER_PAY_TYPE not in", values, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeBetween(String value1, String value2) {
            addCriterion("MER_PAY_TYPE between", value1, value2, "merPayType");
            return (Criteria) this;
        }

        public Criteria andMerPayTypeNotBetween(String value1, String value2) {
            addCriterion("MER_PAY_TYPE not between", value1, value2, "merPayType");
            return (Criteria) this;
        }

        public Criteria andIsOverseasIsNull() {
            addCriterion("IS_OVERSEAS is null");
            return (Criteria) this;
        }

        public Criteria andIsOverseasIsNotNull() {
            addCriterion("IS_OVERSEAS is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverseasEqualTo(String value) {
            addCriterion("IS_OVERSEAS =", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasNotEqualTo(String value) {
            addCriterion("IS_OVERSEAS <>", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasGreaterThan(String value) {
            addCriterion("IS_OVERSEAS >", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OVERSEAS >=", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasLessThan(String value) {
            addCriterion("IS_OVERSEAS <", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasLessThanOrEqualTo(String value) {
            addCriterion("IS_OVERSEAS <=", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasLike(String value) {
            addCriterion("IS_OVERSEAS like", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasNotLike(String value) {
            addCriterion("IS_OVERSEAS not like", value, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasIn(List<String> values) {
            addCriterion("IS_OVERSEAS in", values, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasNotIn(List<String> values) {
            addCriterion("IS_OVERSEAS not in", values, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasBetween(String value1, String value2) {
            addCriterion("IS_OVERSEAS between", value1, value2, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andIsOverseasNotBetween(String value1, String value2) {
            addCriterion("IS_OVERSEAS not between", value1, value2, "isOverseas");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeIsNull() {
            addCriterion("MER_CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeIsNotNull() {
            addCriterion("MER_CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeEqualTo(String value) {
            addCriterion("MER_CARD_TYPE =", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeNotEqualTo(String value) {
            addCriterion("MER_CARD_TYPE <>", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeGreaterThan(String value) {
            addCriterion("MER_CARD_TYPE >", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MER_CARD_TYPE >=", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeLessThan(String value) {
            addCriterion("MER_CARD_TYPE <", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeLessThanOrEqualTo(String value) {
            addCriterion("MER_CARD_TYPE <=", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeLike(String value) {
            addCriterion("MER_CARD_TYPE like", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeNotLike(String value) {
            addCriterion("MER_CARD_TYPE not like", value, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeIn(List<String> values) {
            addCriterion("MER_CARD_TYPE in", values, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeNotIn(List<String> values) {
            addCriterion("MER_CARD_TYPE not in", values, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeBetween(String value1, String value2) {
            addCriterion("MER_CARD_TYPE between", value1, value2, "merCardType");
            return (Criteria) this;
        }

        public Criteria andMerCardTypeNotBetween(String value1, String value2) {
            addCriterion("MER_CARD_TYPE not between", value1, value2, "merCardType");
            return (Criteria) this;
        }

        public Criteria andCardBinIsNull() {
            addCriterion("CARD_BIN is null");
            return (Criteria) this;
        }

        public Criteria andCardBinIsNotNull() {
            addCriterion("CARD_BIN is not null");
            return (Criteria) this;
        }

        public Criteria andCardBinEqualTo(String value) {
            addCriterion("CARD_BIN =", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinNotEqualTo(String value) {
            addCriterion("CARD_BIN <>", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinGreaterThan(String value) {
            addCriterion("CARD_BIN >", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_BIN >=", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinLessThan(String value) {
            addCriterion("CARD_BIN <", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinLessThanOrEqualTo(String value) {
            addCriterion("CARD_BIN <=", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinLike(String value) {
            addCriterion("CARD_BIN like", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinNotLike(String value) {
            addCriterion("CARD_BIN not like", value, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinIn(List<String> values) {
            addCriterion("CARD_BIN in", values, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinNotIn(List<String> values) {
            addCriterion("CARD_BIN not in", values, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinBetween(String value1, String value2) {
            addCriterion("CARD_BIN between", value1, value2, "cardBin");
            return (Criteria) this;
        }

        public Criteria andCardBinNotBetween(String value1, String value2) {
            addCriterion("CARD_BIN not between", value1, value2, "cardBin");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIsNull() {
            addCriterion("INTEGRAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIsNotNull() {
            addCriterion("INTEGRAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdEqualTo(String value) {
            addCriterion("INTEGRAL_ID =", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotEqualTo(String value) {
            addCriterion("INTEGRAL_ID <>", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdGreaterThan(String value) {
            addCriterion("INTEGRAL_ID >", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTEGRAL_ID >=", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLessThan(String value) {
            addCriterion("INTEGRAL_ID <", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLessThanOrEqualTo(String value) {
            addCriterion("INTEGRAL_ID <=", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdLike(String value) {
            addCriterion("INTEGRAL_ID like", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotLike(String value) {
            addCriterion("INTEGRAL_ID not like", value, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdIn(List<String> values) {
            addCriterion("INTEGRAL_ID in", values, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotIn(List<String> values) {
            addCriterion("INTEGRAL_ID not in", values, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdBetween(String value1, String value2) {
            addCriterion("INTEGRAL_ID between", value1, value2, "integralId");
            return (Criteria) this;
        }

        public Criteria andIntegralIdNotBetween(String value1, String value2) {
            addCriterion("INTEGRAL_ID not between", value1, value2, "integralId");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIsNull() {
            addCriterion("DISCOUNTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIsNotNull() {
            addCriterion("DISCOUNTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTPRICE =", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTPRICE <>", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNTPRICE >", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTPRICE >=", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceLessThan(BigDecimal value) {
            addCriterion("DISCOUNTPRICE <", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTPRICE <=", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTPRICE in", values, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTPRICE not in", values, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTPRICE between", value1, value2, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTPRICE not between", value1, value2, "discountprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIsNull() {
            addCriterion("NORMALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIsNotNull() {
            addCriterion("NORMALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNormalpriceEqualTo(BigDecimal value) {
            addCriterion("NORMALPRICE =", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotEqualTo(BigDecimal value) {
            addCriterion("NORMALPRICE <>", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceGreaterThan(BigDecimal value) {
            addCriterion("NORMALPRICE >", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NORMALPRICE >=", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceLessThan(BigDecimal value) {
            addCriterion("NORMALPRICE <", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NORMALPRICE <=", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIn(List<BigDecimal> values) {
            addCriterion("NORMALPRICE in", values, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotIn(List<BigDecimal> values) {
            addCriterion("NORMALPRICE not in", values, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NORMALPRICE between", value1, value2, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NORMALPRICE not between", value1, value2, "normalprice");
            return (Criteria) this;
        }

        public Criteria andAccountchannelIsNull() {
            addCriterion("ACCOUNTCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andAccountchannelIsNotNull() {
            addCriterion("ACCOUNTCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andAccountchannelEqualTo(String value) {
            addCriterion("ACCOUNTCHANNEL =", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelNotEqualTo(String value) {
            addCriterion("ACCOUNTCHANNEL <>", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelGreaterThan(String value) {
            addCriterion("ACCOUNTCHANNEL >", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTCHANNEL >=", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelLessThan(String value) {
            addCriterion("ACCOUNTCHANNEL <", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTCHANNEL <=", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelLike(String value) {
            addCriterion("ACCOUNTCHANNEL like", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelNotLike(String value) {
            addCriterion("ACCOUNTCHANNEL not like", value, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelIn(List<String> values) {
            addCriterion("ACCOUNTCHANNEL in", values, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelNotIn(List<String> values) {
            addCriterion("ACCOUNTCHANNEL not in", values, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelBetween(String value1, String value2) {
            addCriterion("ACCOUNTCHANNEL between", value1, value2, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andAccountchannelNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTCHANNEL not between", value1, value2, "accountchannel");
            return (Criteria) this;
        }

        public Criteria andWtpnoIsNull() {
            addCriterion("WTPNO is null");
            return (Criteria) this;
        }

        public Criteria andWtpnoIsNotNull() {
            addCriterion("WTPNO is not null");
            return (Criteria) this;
        }

        public Criteria andWtpnoEqualTo(String value) {
            addCriterion("WTPNO =", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoNotEqualTo(String value) {
            addCriterion("WTPNO <>", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoGreaterThan(String value) {
            addCriterion("WTPNO >", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoGreaterThanOrEqualTo(String value) {
            addCriterion("WTPNO >=", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoLessThan(String value) {
            addCriterion("WTPNO <", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoLessThanOrEqualTo(String value) {
            addCriterion("WTPNO <=", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoLike(String value) {
            addCriterion("WTPNO like", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoNotLike(String value) {
            addCriterion("WTPNO not like", value, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoIn(List<String> values) {
            addCriterion("WTPNO in", values, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoNotIn(List<String> values) {
            addCriterion("WTPNO not in", values, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoBetween(String value1, String value2) {
            addCriterion("WTPNO between", value1, value2, "wtpno");
            return (Criteria) this;
        }

        public Criteria andWtpnoNotBetween(String value1, String value2) {
            addCriterion("WTPNO not between", value1, value2, "wtpno");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyIsNull() {
            addCriterion("PAY_REAL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyIsNotNull() {
            addCriterion("PAY_REAL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_MONEY =", value, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyNotEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_MONEY <>", value, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyGreaterThan(BigDecimal value) {
            addCriterion("PAY_REAL_MONEY >", value, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_MONEY >=", value, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyLessThan(BigDecimal value) {
            addCriterion("PAY_REAL_MONEY <", value, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_MONEY <=", value, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyIn(List<BigDecimal> values) {
            addCriterion("PAY_REAL_MONEY in", values, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyNotIn(List<BigDecimal> values) {
            addCriterion("PAY_REAL_MONEY not in", values, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_REAL_MONEY between", value1, value2, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_REAL_MONEY not between", value1, value2, "payRealMoney");
            return (Criteria) this;
        }

        public Criteria andPayRealPointIsNull() {
            addCriterion("PAY_REAL_POINT is null");
            return (Criteria) this;
        }

        public Criteria andPayRealPointIsNotNull() {
            addCriterion("PAY_REAL_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPayRealPointEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_POINT =", value, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointNotEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_POINT <>", value, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointGreaterThan(BigDecimal value) {
            addCriterion("PAY_REAL_POINT >", value, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_POINT >=", value, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointLessThan(BigDecimal value) {
            addCriterion("PAY_REAL_POINT <", value, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_REAL_POINT <=", value, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointIn(List<BigDecimal> values) {
            addCriterion("PAY_REAL_POINT in", values, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointNotIn(List<BigDecimal> values) {
            addCriterion("PAY_REAL_POINT not in", values, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_REAL_POINT between", value1, value2, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andPayRealPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_REAL_POINT not between", value1, value2, "payRealPoint");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("ORDERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("ORDERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(String value) {
            addCriterion("ORDERDATE =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(String value) {
            addCriterion("ORDERDATE <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(String value) {
            addCriterion("ORDERDATE >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDATE >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(String value) {
            addCriterion("ORDERDATE <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(String value) {
            addCriterion("ORDERDATE <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLike(String value) {
            addCriterion("ORDERDATE like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotLike(String value) {
            addCriterion("ORDERDATE not like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<String> values) {
            addCriterion("ORDERDATE in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<String> values) {
            addCriterion("ORDERDATE not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(String value1, String value2) {
            addCriterion("ORDERDATE between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(String value1, String value2) {
            addCriterion("ORDERDATE not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNull() {
            addCriterion("CONTACTSNAME is null");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNotNull() {
            addCriterion("CONTACTSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactsnameEqualTo(String value) {
            addCriterion("CONTACTSNAME =", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotEqualTo(String value) {
            addCriterion("CONTACTSNAME <>", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThan(String value) {
            addCriterion("CONTACTSNAME >", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTSNAME >=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThan(String value) {
            addCriterion("CONTACTSNAME <", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThanOrEqualTo(String value) {
            addCriterion("CONTACTSNAME <=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLike(String value) {
            addCriterion("CONTACTSNAME like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotLike(String value) {
            addCriterion("CONTACTSNAME not like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameIn(List<String> values) {
            addCriterion("CONTACTSNAME in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotIn(List<String> values) {
            addCriterion("CONTACTSNAME not in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameBetween(String value1, String value2) {
            addCriterion("CONTACTSNAME between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotBetween(String value1, String value2) {
            addCriterion("CONTACTSNAME not between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNull() {
            addCriterion("CONTACTSPHONE is null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNotNull() {
            addCriterion("CONTACTSPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneEqualTo(String value) {
            addCriterion("CONTACTSPHONE =", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotEqualTo(String value) {
            addCriterion("CONTACTSPHONE <>", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThan(String value) {
            addCriterion("CONTACTSPHONE >", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTSPHONE >=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThan(String value) {
            addCriterion("CONTACTSPHONE <", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThanOrEqualTo(String value) {
            addCriterion("CONTACTSPHONE <=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLike(String value) {
            addCriterion("CONTACTSPHONE like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotLike(String value) {
            addCriterion("CONTACTSPHONE not like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIn(List<String> values) {
            addCriterion("CONTACTSPHONE in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotIn(List<String> values) {
            addCriterion("CONTACTSPHONE not in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneBetween(String value1, String value2) {
            addCriterion("CONTACTSPHONE between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotBetween(String value1, String value2) {
            addCriterion("CONTACTSPHONE not between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyIsNull() {
            addCriterion("DISCOUNTMONEY is null");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyIsNotNull() {
            addCriterion("DISCOUNTMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTMONEY =", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTMONEY <>", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNTMONEY >", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTMONEY >=", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyLessThan(BigDecimal value) {
            addCriterion("DISCOUNTMONEY <", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTMONEY <=", value, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTMONEY in", values, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTMONEY not in", values, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTMONEY between", value1, value2, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andDiscountmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTMONEY not between", value1, value2, "discountmoney");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("UNION_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("UNION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("UNION_ID =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("UNION_ID <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("UNION_ID >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNION_ID >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("UNION_ID <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("UNION_ID <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("UNION_ID like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("UNION_ID not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("UNION_ID in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("UNION_ID not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("UNION_ID between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("UNION_ID not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("OPEN_ID =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("OPEN_ID <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("OPEN_ID >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_ID >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("OPEN_ID <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("OPEN_ID <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("OPEN_ID like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("OPEN_ID not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("OPEN_ID in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("OPEN_ID not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("OPEN_ID between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("OPEN_ID not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIsNull() {
            addCriterion("RETURN_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIsNotNull() {
            addCriterion("RETURN_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyEqualTo(String value) {
            addCriterion("RETURN_MONEY =", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotEqualTo(String value) {
            addCriterion("RETURN_MONEY <>", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyGreaterThan(String value) {
            addCriterion("RETURN_MONEY >", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_MONEY >=", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLessThan(String value) {
            addCriterion("RETURN_MONEY <", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLessThanOrEqualTo(String value) {
            addCriterion("RETURN_MONEY <=", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLike(String value) {
            addCriterion("RETURN_MONEY like", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotLike(String value) {
            addCriterion("RETURN_MONEY not like", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIn(List<String> values) {
            addCriterion("RETURN_MONEY in", values, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotIn(List<String> values) {
            addCriterion("RETURN_MONEY not in", values, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyBetween(String value1, String value2) {
            addCriterion("RETURN_MONEY between", value1, value2, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotBetween(String value1, String value2) {
            addCriterion("RETURN_MONEY not between", value1, value2, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andUseCouponIsNull() {
            addCriterion("USE_COUPON is null");
            return (Criteria) this;
        }

        public Criteria andUseCouponIsNotNull() {
            addCriterion("USE_COUPON is not null");
            return (Criteria) this;
        }

        public Criteria andUseCouponEqualTo(String value) {
            addCriterion("USE_COUPON =", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponNotEqualTo(String value) {
            addCriterion("USE_COUPON <>", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponGreaterThan(String value) {
            addCriterion("USE_COUPON >", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponGreaterThanOrEqualTo(String value) {
            addCriterion("USE_COUPON >=", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponLessThan(String value) {
            addCriterion("USE_COUPON <", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponLessThanOrEqualTo(String value) {
            addCriterion("USE_COUPON <=", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponLike(String value) {
            addCriterion("USE_COUPON like", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponNotLike(String value) {
            addCriterion("USE_COUPON not like", value, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponIn(List<String> values) {
            addCriterion("USE_COUPON in", values, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponNotIn(List<String> values) {
            addCriterion("USE_COUPON not in", values, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponBetween(String value1, String value2) {
            addCriterion("USE_COUPON between", value1, value2, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andUseCouponNotBetween(String value1, String value2) {
            addCriterion("USE_COUPON not between", value1, value2, "useCoupon");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyIsNull() {
            addCriterion("PAY_LAST_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyIsNotNull() {
            addCriterion("PAY_LAST_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyEqualTo(String value) {
            addCriterion("PAY_LAST_MONEY =", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyNotEqualTo(String value) {
            addCriterion("PAY_LAST_MONEY <>", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyGreaterThan(String value) {
            addCriterion("PAY_LAST_MONEY >", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_LAST_MONEY >=", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyLessThan(String value) {
            addCriterion("PAY_LAST_MONEY <", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyLessThanOrEqualTo(String value) {
            addCriterion("PAY_LAST_MONEY <=", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyLike(String value) {
            addCriterion("PAY_LAST_MONEY like", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyNotLike(String value) {
            addCriterion("PAY_LAST_MONEY not like", value, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyIn(List<String> values) {
            addCriterion("PAY_LAST_MONEY in", values, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyNotIn(List<String> values) {
            addCriterion("PAY_LAST_MONEY not in", values, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyBetween(String value1, String value2) {
            addCriterion("PAY_LAST_MONEY between", value1, value2, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andPayLastMoneyNotBetween(String value1, String value2) {
            addCriterion("PAY_LAST_MONEY not between", value1, value2, "payLastMoney");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("ORDER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("ORDER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("ORDER_SOURCE =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("ORDER_SOURCE <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("ORDER_SOURCE >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("ORDER_SOURCE <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("ORDER_SOURCE like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("ORDER_SOURCE not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("ORDER_SOURCE in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("ORDER_SOURCE not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("TRADE_TYPE like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("TRADE_TYPE not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
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