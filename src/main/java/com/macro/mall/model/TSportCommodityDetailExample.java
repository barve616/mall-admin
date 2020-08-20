package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSportCommodityDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportCommodityDetailExample() {
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

        public Criteria andPosCommodityIdIsNull() {
            addCriterion("POS_COMMODITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdIsNotNull() {
            addCriterion("POS_COMMODITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdEqualTo(String value) {
            addCriterion("POS_COMMODITY_ID =", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdNotEqualTo(String value) {
            addCriterion("POS_COMMODITY_ID <>", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdGreaterThan(String value) {
            addCriterion("POS_COMMODITY_ID >", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_COMMODITY_ID >=", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdLessThan(String value) {
            addCriterion("POS_COMMODITY_ID <", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("POS_COMMODITY_ID <=", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdLike(String value) {
            addCriterion("POS_COMMODITY_ID like", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdNotLike(String value) {
            addCriterion("POS_COMMODITY_ID not like", value, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdIn(List<String> values) {
            addCriterion("POS_COMMODITY_ID in", values, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdNotIn(List<String> values) {
            addCriterion("POS_COMMODITY_ID not in", values, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdBetween(String value1, String value2) {
            addCriterion("POS_COMMODITY_ID between", value1, value2, "posCommodityId");
            return (Criteria) this;
        }

        public Criteria andPosCommodityIdNotBetween(String value1, String value2) {
            addCriterion("POS_COMMODITY_ID not between", value1, value2, "posCommodityId");
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

        public Criteria andRotationnChartUrlIsNull() {
            addCriterion("ROTATIONN_CHART_URL is null");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlIsNotNull() {
            addCriterion("ROTATIONN_CHART_URL is not null");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_URL =", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlNotEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_URL <>", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlGreaterThan(String value) {
            addCriterion("ROTATIONN_CHART_URL >", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_URL >=", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlLessThan(String value) {
            addCriterion("ROTATIONN_CHART_URL <", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlLessThanOrEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_URL <=", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlLike(String value) {
            addCriterion("ROTATIONN_CHART_URL like", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlNotLike(String value) {
            addCriterion("ROTATIONN_CHART_URL not like", value, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlIn(List<String> values) {
            addCriterion("ROTATIONN_CHART_URL in", values, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlNotIn(List<String> values) {
            addCriterion("ROTATIONN_CHART_URL not in", values, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlBetween(String value1, String value2) {
            addCriterion("ROTATIONN_CHART_URL between", value1, value2, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andRotationnChartUrlNotBetween(String value1, String value2) {
            addCriterion("ROTATIONN_CHART_URL not between", value1, value2, "rotationnChartUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("COMMODITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("COMMODITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("COMMODITY_NAME =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("COMMODITY_NAME <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("COMMODITY_NAME >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("COMMODITY_NAME <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_NAME <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("COMMODITY_NAME like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("COMMODITY_NAME not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("COMMODITY_NAME in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("COMMODITY_NAME not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_NAME not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityStateIsNull() {
            addCriterion("COMMODITY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStateIsNotNull() {
            addCriterion("COMMODITY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStateEqualTo(String value) {
            addCriterion("COMMODITY_STATE =", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateNotEqualTo(String value) {
            addCriterion("COMMODITY_STATE <>", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateGreaterThan(String value) {
            addCriterion("COMMODITY_STATE >", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_STATE >=", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateLessThan(String value) {
            addCriterion("COMMODITY_STATE <", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_STATE <=", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateLike(String value) {
            addCriterion("COMMODITY_STATE like", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateNotLike(String value) {
            addCriterion("COMMODITY_STATE not like", value, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateIn(List<String> values) {
            addCriterion("COMMODITY_STATE in", values, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateNotIn(List<String> values) {
            addCriterion("COMMODITY_STATE not in", values, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateBetween(String value1, String value2) {
            addCriterion("COMMODITY_STATE between", value1, value2, "commodityState");
            return (Criteria) this;
        }

        public Criteria andCommodityStateNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_STATE not between", value1, value2, "commodityState");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIsNull() {
            addCriterion("MONTHLY_SALES is null");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIsNotNull() {
            addCriterion("MONTHLY_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesEqualTo(Short value) {
            addCriterion("MONTHLY_SALES =", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotEqualTo(Short value) {
            addCriterion("MONTHLY_SALES <>", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesGreaterThan(Short value) {
            addCriterion("MONTHLY_SALES >", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesGreaterThanOrEqualTo(Short value) {
            addCriterion("MONTHLY_SALES >=", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLessThan(Short value) {
            addCriterion("MONTHLY_SALES <", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesLessThanOrEqualTo(Short value) {
            addCriterion("MONTHLY_SALES <=", value, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesIn(List<Short> values) {
            addCriterion("MONTHLY_SALES in", values, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotIn(List<Short> values) {
            addCriterion("MONTHLY_SALES not in", values, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesBetween(Short value1, Short value2) {
            addCriterion("MONTHLY_SALES between", value1, value2, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andMonthlySalesNotBetween(Short value1, Short value2) {
            addCriterion("MONTHLY_SALES not between", value1, value2, "monthlySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesIsNull() {
            addCriterion("COMMODITY_SALES is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesIsNotNull() {
            addCriterion("COMMODITY_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesEqualTo(Short value) {
            addCriterion("COMMODITY_SALES =", value, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesNotEqualTo(Short value) {
            addCriterion("COMMODITY_SALES <>", value, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesGreaterThan(Short value) {
            addCriterion("COMMODITY_SALES >", value, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesGreaterThanOrEqualTo(Short value) {
            addCriterion("COMMODITY_SALES >=", value, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesLessThan(Short value) {
            addCriterion("COMMODITY_SALES <", value, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesLessThanOrEqualTo(Short value) {
            addCriterion("COMMODITY_SALES <=", value, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesIn(List<Short> values) {
            addCriterion("COMMODITY_SALES in", values, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesNotIn(List<Short> values) {
            addCriterion("COMMODITY_SALES not in", values, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesBetween(Short value1, Short value2) {
            addCriterion("COMMODITY_SALES between", value1, value2, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommoditySalesNotBetween(Short value1, Short value2) {
            addCriterion("COMMODITY_SALES not between", value1, value2, "commoditySales");
            return (Criteria) this;
        }

        public Criteria andCommodityStockIsNull() {
            addCriterion("COMMODITY_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStockIsNotNull() {
            addCriterion("COMMODITY_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStockEqualTo(String value) {
            addCriterion("COMMODITY_STOCK =", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotEqualTo(String value) {
            addCriterion("COMMODITY_STOCK <>", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockGreaterThan(String value) {
            addCriterion("COMMODITY_STOCK >", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_STOCK >=", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockLessThan(String value) {
            addCriterion("COMMODITY_STOCK <", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_STOCK <=", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockLike(String value) {
            addCriterion("COMMODITY_STOCK like", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotLike(String value) {
            addCriterion("COMMODITY_STOCK not like", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockIn(List<String> values) {
            addCriterion("COMMODITY_STOCK in", values, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotIn(List<String> values) {
            addCriterion("COMMODITY_STOCK not in", values, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockBetween(String value1, String value2) {
            addCriterion("COMMODITY_STOCK between", value1, value2, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_STOCK not between", value1, value2, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andReserveDaysIsNull() {
            addCriterion("RESERVE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andReserveDaysIsNotNull() {
            addCriterion("RESERVE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andReserveDaysEqualTo(String value) {
            addCriterion("RESERVE_DAYS =", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysNotEqualTo(String value) {
            addCriterion("RESERVE_DAYS <>", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysGreaterThan(String value) {
            addCriterion("RESERVE_DAYS >", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE_DAYS >=", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysLessThan(String value) {
            addCriterion("RESERVE_DAYS <", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysLessThanOrEqualTo(String value) {
            addCriterion("RESERVE_DAYS <=", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysLike(String value) {
            addCriterion("RESERVE_DAYS like", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysNotLike(String value) {
            addCriterion("RESERVE_DAYS not like", value, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysIn(List<String> values) {
            addCriterion("RESERVE_DAYS in", values, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysNotIn(List<String> values) {
            addCriterion("RESERVE_DAYS not in", values, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysBetween(String value1, String value2) {
            addCriterion("RESERVE_DAYS between", value1, value2, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andReserveDaysNotBetween(String value1, String value2) {
            addCriterion("RESERVE_DAYS not between", value1, value2, "reserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysIsNull() {
            addCriterion("ADVANCE_RESERVE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysIsNotNull() {
            addCriterion("ADVANCE_RESERVE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysEqualTo(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS =", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysNotEqualTo(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS <>", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysGreaterThan(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS >", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS >=", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysLessThan(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS <", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysLessThanOrEqualTo(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS <=", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysLike(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS like", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysNotLike(String value) {
            addCriterion("ADVANCE_RESERVE_DAYS not like", value, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysIn(List<String> values) {
            addCriterion("ADVANCE_RESERVE_DAYS in", values, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysNotIn(List<String> values) {
            addCriterion("ADVANCE_RESERVE_DAYS not in", values, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysBetween(String value1, String value2) {
            addCriterion("ADVANCE_RESERVE_DAYS between", value1, value2, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andAdvanceReserveDaysNotBetween(String value1, String value2) {
            addCriterion("ADVANCE_RESERVE_DAYS not between", value1, value2, "advanceReserveDays");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreIsNull() {
            addCriterion("COMMODITY_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreIsNotNull() {
            addCriterion("COMMODITY_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreEqualTo(String value) {
            addCriterion("COMMODITY_SCORE =", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreNotEqualTo(String value) {
            addCriterion("COMMODITY_SCORE <>", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreGreaterThan(String value) {
            addCriterion("COMMODITY_SCORE >", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_SCORE >=", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreLessThan(String value) {
            addCriterion("COMMODITY_SCORE <", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_SCORE <=", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreLike(String value) {
            addCriterion("COMMODITY_SCORE like", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreNotLike(String value) {
            addCriterion("COMMODITY_SCORE not like", value, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreIn(List<String> values) {
            addCriterion("COMMODITY_SCORE in", values, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreNotIn(List<String> values) {
            addCriterion("COMMODITY_SCORE not in", values, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreBetween(String value1, String value2) {
            addCriterion("COMMODITY_SCORE between", value1, value2, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andCommodityScoreNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_SCORE not between", value1, value2, "commodityScore");
            return (Criteria) this;
        }

        public Criteria andDailyPriceIsNull() {
            addCriterion("DAILY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDailyPriceIsNotNull() {
            addCriterion("DAILY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPriceEqualTo(BigDecimal value) {
            addCriterion("DAILY_PRICE =", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceNotEqualTo(BigDecimal value) {
            addCriterion("DAILY_PRICE <>", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceGreaterThan(BigDecimal value) {
            addCriterion("DAILY_PRICE >", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DAILY_PRICE >=", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceLessThan(BigDecimal value) {
            addCriterion("DAILY_PRICE <", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DAILY_PRICE <=", value, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceIn(List<BigDecimal> values) {
            addCriterion("DAILY_PRICE in", values, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceNotIn(List<BigDecimal> values) {
            addCriterion("DAILY_PRICE not in", values, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAILY_PRICE between", value1, value2, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andDailyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAILY_PRICE not between", value1, value2, "dailyPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceIsNull() {
            addCriterion("VACATION_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andVacationPriceIsNotNull() {
            addCriterion("VACATION_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andVacationPriceEqualTo(BigDecimal value) {
            addCriterion("VACATION_PRICE =", value, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceNotEqualTo(BigDecimal value) {
            addCriterion("VACATION_PRICE <>", value, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceGreaterThan(BigDecimal value) {
            addCriterion("VACATION_PRICE >", value, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VACATION_PRICE >=", value, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceLessThan(BigDecimal value) {
            addCriterion("VACATION_PRICE <", value, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VACATION_PRICE <=", value, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceIn(List<BigDecimal> values) {
            addCriterion("VACATION_PRICE in", values, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceNotIn(List<BigDecimal> values) {
            addCriterion("VACATION_PRICE not in", values, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VACATION_PRICE between", value1, value2, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andVacationPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VACATION_PRICE not between", value1, value2, "vacationPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceIsNull() {
            addCriterion("HOLIDAY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceIsNotNull() {
            addCriterion("HOLIDAY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceEqualTo(BigDecimal value) {
            addCriterion("HOLIDAY_PRICE =", value, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceNotEqualTo(BigDecimal value) {
            addCriterion("HOLIDAY_PRICE <>", value, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceGreaterThan(BigDecimal value) {
            addCriterion("HOLIDAY_PRICE >", value, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOLIDAY_PRICE >=", value, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceLessThan(BigDecimal value) {
            addCriterion("HOLIDAY_PRICE <", value, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOLIDAY_PRICE <=", value, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceIn(List<BigDecimal> values) {
            addCriterion("HOLIDAY_PRICE in", values, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceNotIn(List<BigDecimal> values) {
            addCriterion("HOLIDAY_PRICE not in", values, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOLIDAY_PRICE between", value1, value2, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andHolidayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOLIDAY_PRICE not between", value1, value2, "holidayPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldIsNull() {
            addCriterion("COMMODITY_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldIsNotNull() {
            addCriterion("COMMODITY_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldEqualTo(String value) {
            addCriterion("COMMODITY_FIELD =", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldNotEqualTo(String value) {
            addCriterion("COMMODITY_FIELD <>", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldGreaterThan(String value) {
            addCriterion("COMMODITY_FIELD >", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FIELD >=", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldLessThan(String value) {
            addCriterion("COMMODITY_FIELD <", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_FIELD <=", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldLike(String value) {
            addCriterion("COMMODITY_FIELD like", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldNotLike(String value) {
            addCriterion("COMMODITY_FIELD not like", value, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldIn(List<String> values) {
            addCriterion("COMMODITY_FIELD in", values, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldNotIn(List<String> values) {
            addCriterion("COMMODITY_FIELD not in", values, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldBetween(String value1, String value2) {
            addCriterion("COMMODITY_FIELD between", value1, value2, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityFieldNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_FIELD not between", value1, value2, "commodityField");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeIsNull() {
            addCriterion("COMMODITY_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeIsNotNull() {
            addCriterion("COMMODITY_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeEqualTo(String value) {
            addCriterion("COMMODITY_DESCRIBE =", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeNotEqualTo(String value) {
            addCriterion("COMMODITY_DESCRIBE <>", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeGreaterThan(String value) {
            addCriterion("COMMODITY_DESCRIBE >", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_DESCRIBE >=", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeLessThan(String value) {
            addCriterion("COMMODITY_DESCRIBE <", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_DESCRIBE <=", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeLike(String value) {
            addCriterion("COMMODITY_DESCRIBE like", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeNotLike(String value) {
            addCriterion("COMMODITY_DESCRIBE not like", value, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeIn(List<String> values) {
            addCriterion("COMMODITY_DESCRIBE in", values, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeNotIn(List<String> values) {
            addCriterion("COMMODITY_DESCRIBE not in", values, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeBetween(String value1, String value2) {
            addCriterion("COMMODITY_DESCRIBE between", value1, value2, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andCommodityDescribeNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_DESCRIBE not between", value1, value2, "commodityDescribe");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsIsNull() {
            addCriterion("PURCHASE_LIMITS is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsIsNotNull() {
            addCriterion("PURCHASE_LIMITS is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsEqualTo(String value) {
            addCriterion("PURCHASE_LIMITS =", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsNotEqualTo(String value) {
            addCriterion("PURCHASE_LIMITS <>", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsGreaterThan(String value) {
            addCriterion("PURCHASE_LIMITS >", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_LIMITS >=", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsLessThan(String value) {
            addCriterion("PURCHASE_LIMITS <", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_LIMITS <=", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsLike(String value) {
            addCriterion("PURCHASE_LIMITS like", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsNotLike(String value) {
            addCriterion("PURCHASE_LIMITS not like", value, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsIn(List<String> values) {
            addCriterion("PURCHASE_LIMITS in", values, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsNotIn(List<String> values) {
            addCriterion("PURCHASE_LIMITS not in", values, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsBetween(String value1, String value2) {
            addCriterion("PURCHASE_LIMITS between", value1, value2, "purchaseLimits");
            return (Criteria) this;
        }

        public Criteria andPurchaseLimitsNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_LIMITS not between", value1, value2, "purchaseLimits");
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

        public Criteria andOnFrameTimeIsNull() {
            addCriterion("ON_FRAME_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeIsNotNull() {
            addCriterion("ON_FRAME_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeEqualTo(String value) {
            addCriterion("ON_FRAME_TIME =", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeNotEqualTo(String value) {
            addCriterion("ON_FRAME_TIME <>", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeGreaterThan(String value) {
            addCriterion("ON_FRAME_TIME >", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ON_FRAME_TIME >=", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeLessThan(String value) {
            addCriterion("ON_FRAME_TIME <", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeLessThanOrEqualTo(String value) {
            addCriterion("ON_FRAME_TIME <=", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeLike(String value) {
            addCriterion("ON_FRAME_TIME like", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeNotLike(String value) {
            addCriterion("ON_FRAME_TIME not like", value, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeIn(List<String> values) {
            addCriterion("ON_FRAME_TIME in", values, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeNotIn(List<String> values) {
            addCriterion("ON_FRAME_TIME not in", values, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeBetween(String value1, String value2) {
            addCriterion("ON_FRAME_TIME between", value1, value2, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnFrameTimeNotBetween(String value1, String value2) {
            addCriterion("ON_FRAME_TIME not between", value1, value2, "onFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeIsNull() {
            addCriterion("OFF_FRAME_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeIsNotNull() {
            addCriterion("OFF_FRAME_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeEqualTo(String value) {
            addCriterion("OFF_FRAME_TIME =", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeNotEqualTo(String value) {
            addCriterion("OFF_FRAME_TIME <>", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeGreaterThan(String value) {
            addCriterion("OFF_FRAME_TIME >", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_FRAME_TIME >=", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeLessThan(String value) {
            addCriterion("OFF_FRAME_TIME <", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeLessThanOrEqualTo(String value) {
            addCriterion("OFF_FRAME_TIME <=", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeLike(String value) {
            addCriterion("OFF_FRAME_TIME like", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeNotLike(String value) {
            addCriterion("OFF_FRAME_TIME not like", value, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeIn(List<String> values) {
            addCriterion("OFF_FRAME_TIME in", values, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeNotIn(List<String> values) {
            addCriterion("OFF_FRAME_TIME not in", values, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeBetween(String value1, String value2) {
            addCriterion("OFF_FRAME_TIME between", value1, value2, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOffFrameTimeNotBetween(String value1, String value2) {
            addCriterion("OFF_FRAME_TIME not between", value1, value2, "offFrameTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeIsNull() {
            addCriterion("ON_SALE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeIsNotNull() {
            addCriterion("ON_SALE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeEqualTo(String value) {
            addCriterion("ON_SALE_TIME =", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotEqualTo(String value) {
            addCriterion("ON_SALE_TIME <>", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeGreaterThan(String value) {
            addCriterion("ON_SALE_TIME >", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ON_SALE_TIME >=", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeLessThan(String value) {
            addCriterion("ON_SALE_TIME <", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeLessThanOrEqualTo(String value) {
            addCriterion("ON_SALE_TIME <=", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeLike(String value) {
            addCriterion("ON_SALE_TIME like", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotLike(String value) {
            addCriterion("ON_SALE_TIME not like", value, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeIn(List<String> values) {
            addCriterion("ON_SALE_TIME in", values, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotIn(List<String> values) {
            addCriterion("ON_SALE_TIME not in", values, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeBetween(String value1, String value2) {
            addCriterion("ON_SALE_TIME between", value1, value2, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOnSaleTimeNotBetween(String value1, String value2) {
            addCriterion("ON_SALE_TIME not between", value1, value2, "onSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeIsNull() {
            addCriterion("OFF_SALE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeIsNotNull() {
            addCriterion("OFF_SALE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeEqualTo(String value) {
            addCriterion("OFF_SALE_TIME =", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeNotEqualTo(String value) {
            addCriterion("OFF_SALE_TIME <>", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeGreaterThan(String value) {
            addCriterion("OFF_SALE_TIME >", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OFF_SALE_TIME >=", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeLessThan(String value) {
            addCriterion("OFF_SALE_TIME <", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeLessThanOrEqualTo(String value) {
            addCriterion("OFF_SALE_TIME <=", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeLike(String value) {
            addCriterion("OFF_SALE_TIME like", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeNotLike(String value) {
            addCriterion("OFF_SALE_TIME not like", value, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeIn(List<String> values) {
            addCriterion("OFF_SALE_TIME in", values, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeNotIn(List<String> values) {
            addCriterion("OFF_SALE_TIME not in", values, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeBetween(String value1, String value2) {
            addCriterion("OFF_SALE_TIME between", value1, value2, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andOffSaleTimeNotBetween(String value1, String value2) {
            addCriterion("OFF_SALE_TIME not between", value1, value2, "offSaleTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNull() {
            addCriterion("USE_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIsNotNull() {
            addCriterion("USE_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeEqualTo(String value) {
            addCriterion("USE_START_TIME =", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotEqualTo(String value) {
            addCriterion("USE_START_TIME <>", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThan(String value) {
            addCriterion("USE_START_TIME >", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("USE_START_TIME >=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThan(String value) {
            addCriterion("USE_START_TIME <", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLessThanOrEqualTo(String value) {
            addCriterion("USE_START_TIME <=", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeLike(String value) {
            addCriterion("USE_START_TIME like", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotLike(String value) {
            addCriterion("USE_START_TIME not like", value, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeIn(List<String> values) {
            addCriterion("USE_START_TIME in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotIn(List<String> values) {
            addCriterion("USE_START_TIME not in", values, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeBetween(String value1, String value2) {
            addCriterion("USE_START_TIME between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseStartTimeNotBetween(String value1, String value2) {
            addCriterion("USE_START_TIME not between", value1, value2, "useStartTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNull() {
            addCriterion("USE_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIsNotNull() {
            addCriterion("USE_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeEqualTo(String value) {
            addCriterion("USE_END_TIME =", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotEqualTo(String value) {
            addCriterion("USE_END_TIME <>", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThan(String value) {
            addCriterion("USE_END_TIME >", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("USE_END_TIME >=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThan(String value) {
            addCriterion("USE_END_TIME <", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLessThanOrEqualTo(String value) {
            addCriterion("USE_END_TIME <=", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeLike(String value) {
            addCriterion("USE_END_TIME like", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotLike(String value) {
            addCriterion("USE_END_TIME not like", value, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeIn(List<String> values) {
            addCriterion("USE_END_TIME in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotIn(List<String> values) {
            addCriterion("USE_END_TIME not in", values, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeBetween(String value1, String value2) {
            addCriterion("USE_END_TIME between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andUseEndTimeNotBetween(String value1, String value2) {
            addCriterion("USE_END_TIME not between", value1, value2, "useEndTime");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNull() {
            addCriterion("LIMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNotNull() {
            addCriterion("LIMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDateEqualTo(String value) {
            addCriterion("LIMIT_DATE =", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotEqualTo(String value) {
            addCriterion("LIMIT_DATE <>", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThan(String value) {
            addCriterion("LIMIT_DATE >", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_DATE >=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThan(String value) {
            addCriterion("LIMIT_DATE <", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_DATE <=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLike(String value) {
            addCriterion("LIMIT_DATE like", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotLike(String value) {
            addCriterion("LIMIT_DATE not like", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIn(List<String> values) {
            addCriterion("LIMIT_DATE in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotIn(List<String> values) {
            addCriterion("LIMIT_DATE not in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateBetween(String value1, String value2) {
            addCriterion("LIMIT_DATE between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotBetween(String value1, String value2) {
            addCriterion("LIMIT_DATE not between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIsNull() {
            addCriterion("DETAIL_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIsNotNull() {
            addCriterion("DETAIL_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkEqualTo(String value) {
            addCriterion("DETAIL_REMARK =", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotEqualTo(String value) {
            addCriterion("DETAIL_REMARK <>", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkGreaterThan(String value) {
            addCriterion("DETAIL_REMARK >", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_REMARK >=", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLessThan(String value) {
            addCriterion("DETAIL_REMARK <", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_REMARK <=", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkLike(String value) {
            addCriterion("DETAIL_REMARK like", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotLike(String value) {
            addCriterion("DETAIL_REMARK not like", value, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkIn(List<String> values) {
            addCriterion("DETAIL_REMARK in", values, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotIn(List<String> values) {
            addCriterion("DETAIL_REMARK not in", values, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkBetween(String value1, String value2) {
            addCriterion("DETAIL_REMARK between", value1, value2, "detailRemark");
            return (Criteria) this;
        }

        public Criteria andDetailRemarkNotBetween(String value1, String value2) {
            addCriterion("DETAIL_REMARK not between", value1, value2, "detailRemark");
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