package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSportCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportCommodityExample() {
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

        public Criteria andShopCommodityTypeIsNull() {
            addCriterion("SHOP_COMMODITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeIsNotNull() {
            addCriterion("SHOP_COMMODITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeEqualTo(String value) {
            addCriterion("SHOP_COMMODITY_TYPE =", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeNotEqualTo(String value) {
            addCriterion("SHOP_COMMODITY_TYPE <>", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeGreaterThan(String value) {
            addCriterion("SHOP_COMMODITY_TYPE >", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_COMMODITY_TYPE >=", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeLessThan(String value) {
            addCriterion("SHOP_COMMODITY_TYPE <", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeLessThanOrEqualTo(String value) {
            addCriterion("SHOP_COMMODITY_TYPE <=", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeLike(String value) {
            addCriterion("SHOP_COMMODITY_TYPE like", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeNotLike(String value) {
            addCriterion("SHOP_COMMODITY_TYPE not like", value, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeIn(List<String> values) {
            addCriterion("SHOP_COMMODITY_TYPE in", values, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeNotIn(List<String> values) {
            addCriterion("SHOP_COMMODITY_TYPE not in", values, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeBetween(String value1, String value2) {
            addCriterion("SHOP_COMMODITY_TYPE between", value1, value2, "shopCommodityType");
            return (Criteria) this;
        }

        public Criteria andShopCommodityTypeNotBetween(String value1, String value2) {
            addCriterion("SHOP_COMMODITY_TYPE not between", value1, value2, "shopCommodityType");
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

        public Criteria andPosIdIsNull() {
            addCriterion("POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(String value) {
            addCriterion("POS_ID =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(String value) {
            addCriterion("POS_ID <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(String value) {
            addCriterion("POS_ID >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_ID >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(String value) {
            addCriterion("POS_ID <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(String value) {
            addCriterion("POS_ID <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLike(String value) {
            addCriterion("POS_ID like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("POS_ID not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<String> values) {
            addCriterion("POS_ID in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<String> values) {
            addCriterion("POS_ID not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(String value1, String value2) {
            addCriterion("POS_ID between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(String value1, String value2) {
            addCriterion("POS_ID not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("BRAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("BRAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(String value) {
            addCriterion("BRAND_ID =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(String value) {
            addCriterion("BRAND_ID <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(String value) {
            addCriterion("BRAND_ID >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_ID >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(String value) {
            addCriterion("BRAND_ID <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(String value) {
            addCriterion("BRAND_ID <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(String value) {
            addCriterion("BRAND_ID like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(String value) {
            addCriterion("BRAND_ID not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<String> values) {
            addCriterion("BRAND_ID in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<String> values) {
            addCriterion("BRAND_ID not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(String value1, String value2) {
            addCriterion("BRAND_ID between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(String value1, String value2) {
            addCriterion("BRAND_ID not between", value1, value2, "brandId");
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

        public Criteria andCommodityStockEqualTo(Short value) {
            addCriterion("COMMODITY_STOCK =", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotEqualTo(Short value) {
            addCriterion("COMMODITY_STOCK <>", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockGreaterThan(Short value) {
            addCriterion("COMMODITY_STOCK >", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockGreaterThanOrEqualTo(Short value) {
            addCriterion("COMMODITY_STOCK >=", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockLessThan(Short value) {
            addCriterion("COMMODITY_STOCK <", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockLessThanOrEqualTo(Short value) {
            addCriterion("COMMODITY_STOCK <=", value, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockIn(List<Short> values) {
            addCriterion("COMMODITY_STOCK in", values, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotIn(List<Short> values) {
            addCriterion("COMMODITY_STOCK not in", values, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockBetween(Short value1, Short value2) {
            addCriterion("COMMODITY_STOCK between", value1, value2, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andCommodityStockNotBetween(Short value1, Short value2) {
            addCriterion("COMMODITY_STOCK not between", value1, value2, "commodityStock");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("SITE is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("SITE =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("SITE <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("SITE >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("SITE >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("SITE <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("SITE <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("SITE like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("SITE not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("SITE in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("SITE not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("SITE between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("SITE not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("REGION_CODE like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("REGION_CODE not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
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

        public Criteria andCommodityDailyPriceIsNull() {
            addCriterion("COMMODITY_DAILY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceIsNotNull() {
            addCriterion("COMMODITY_DAILY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_DAILY_PRICE =", value, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_DAILY_PRICE <>", value, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_DAILY_PRICE >", value, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_DAILY_PRICE >=", value, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceLessThan(BigDecimal value) {
            addCriterion("COMMODITY_DAILY_PRICE <", value, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_DAILY_PRICE <=", value, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_DAILY_PRICE in", values, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_DAILY_PRICE not in", values, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_DAILY_PRICE between", value1, value2, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityDailyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_DAILY_PRICE not between", value1, value2, "commodityDailyPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceIsNull() {
            addCriterion("COMMODITY_MIN_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceIsNotNull() {
            addCriterion("COMMODITY_MIN_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MIN_PRICE =", value, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MIN_PRICE <>", value, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_MIN_PRICE >", value, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MIN_PRICE >=", value, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceLessThan(BigDecimal value) {
            addCriterion("COMMODITY_MIN_PRICE <", value, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MIN_PRICE <=", value, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_MIN_PRICE in", values, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_MIN_PRICE not in", values, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_MIN_PRICE between", value1, value2, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_MIN_PRICE not between", value1, value2, "commodityMinPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceIsNull() {
            addCriterion("COMMODITY_MAX_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceIsNotNull() {
            addCriterion("COMMODITY_MAX_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MAX_PRICE =", value, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MAX_PRICE <>", value, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceGreaterThan(BigDecimal value) {
            addCriterion("COMMODITY_MAX_PRICE >", value, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MAX_PRICE >=", value, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceLessThan(BigDecimal value) {
            addCriterion("COMMODITY_MAX_PRICE <", value, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMODITY_MAX_PRICE <=", value, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_MAX_PRICE in", values, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("COMMODITY_MAX_PRICE not in", values, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_MAX_PRICE between", value1, value2, "commodityMaxPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityMaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMODITY_MAX_PRICE not between", value1, value2, "commodityMaxPrice");
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

        public Criteria andExamineStatusIsNull() {
            addCriterion("EXAMINE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andExamineStatusIsNotNull() {
            addCriterion("EXAMINE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andExamineStatusEqualTo(String value) {
            addCriterion("EXAMINE_STATUS =", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotEqualTo(String value) {
            addCriterion("EXAMINE_STATUS <>", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusGreaterThan(String value) {
            addCriterion("EXAMINE_STATUS >", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_STATUS >=", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusLessThan(String value) {
            addCriterion("EXAMINE_STATUS <", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_STATUS <=", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusLike(String value) {
            addCriterion("EXAMINE_STATUS like", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotLike(String value) {
            addCriterion("EXAMINE_STATUS not like", value, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusIn(List<String> values) {
            addCriterion("EXAMINE_STATUS in", values, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotIn(List<String> values) {
            addCriterion("EXAMINE_STATUS not in", values, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusBetween(String value1, String value2) {
            addCriterion("EXAMINE_STATUS between", value1, value2, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineStatusNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_STATUS not between", value1, value2, "examineStatus");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonIsNull() {
            addCriterion("EXAMINE_FAILURE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonIsNotNull() {
            addCriterion("EXAMINE_FAILURE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonEqualTo(String value) {
            addCriterion("EXAMINE_FAILURE_REASON =", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonNotEqualTo(String value) {
            addCriterion("EXAMINE_FAILURE_REASON <>", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonGreaterThan(String value) {
            addCriterion("EXAMINE_FAILURE_REASON >", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_FAILURE_REASON >=", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonLessThan(String value) {
            addCriterion("EXAMINE_FAILURE_REASON <", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_FAILURE_REASON <=", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonLike(String value) {
            addCriterion("EXAMINE_FAILURE_REASON like", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonNotLike(String value) {
            addCriterion("EXAMINE_FAILURE_REASON not like", value, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonIn(List<String> values) {
            addCriterion("EXAMINE_FAILURE_REASON in", values, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonNotIn(List<String> values) {
            addCriterion("EXAMINE_FAILURE_REASON not in", values, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonBetween(String value1, String value2) {
            addCriterion("EXAMINE_FAILURE_REASON between", value1, value2, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineFailureReasonNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_FAILURE_REASON not between", value1, value2, "examineFailureReason");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNull() {
            addCriterion("EXAMINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNotNull() {
            addCriterion("EXAMINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeEqualTo(String value) {
            addCriterion("EXAMINE_TIME =", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotEqualTo(String value) {
            addCriterion("EXAMINE_TIME <>", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThan(String value) {
            addCriterion("EXAMINE_TIME >", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_TIME >=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThan(String value) {
            addCriterion("EXAMINE_TIME <", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_TIME <=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLike(String value) {
            addCriterion("EXAMINE_TIME like", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotLike(String value) {
            addCriterion("EXAMINE_TIME not like", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIn(List<String> values) {
            addCriterion("EXAMINE_TIME in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotIn(List<String> values) {
            addCriterion("EXAMINE_TIME not in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeBetween(String value1, String value2) {
            addCriterion("EXAMINE_TIME between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_TIME not between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExaminePersonIsNull() {
            addCriterion("EXAMINE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andExaminePersonIsNotNull() {
            addCriterion("EXAMINE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andExaminePersonEqualTo(String value) {
            addCriterion("EXAMINE_PERSON =", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonNotEqualTo(String value) {
            addCriterion("EXAMINE_PERSON <>", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonGreaterThan(String value) {
            addCriterion("EXAMINE_PERSON >", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_PERSON >=", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonLessThan(String value) {
            addCriterion("EXAMINE_PERSON <", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_PERSON <=", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonLike(String value) {
            addCriterion("EXAMINE_PERSON like", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonNotLike(String value) {
            addCriterion("EXAMINE_PERSON not like", value, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonIn(List<String> values) {
            addCriterion("EXAMINE_PERSON in", values, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonNotIn(List<String> values) {
            addCriterion("EXAMINE_PERSON not in", values, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonBetween(String value1, String value2) {
            addCriterion("EXAMINE_PERSON between", value1, value2, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andExaminePersonNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_PERSON not between", value1, value2, "examinePerson");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("STORE_ID like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("STORE_ID not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeIsNull() {
            addCriterion("COMMODITY_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeIsNotNull() {
            addCriterion("COMMODITY_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeEqualTo(String value) {
            addCriterion("COMMODITY_LONGITUDE =", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeNotEqualTo(String value) {
            addCriterion("COMMODITY_LONGITUDE <>", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeGreaterThan(String value) {
            addCriterion("COMMODITY_LONGITUDE >", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_LONGITUDE >=", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeLessThan(String value) {
            addCriterion("COMMODITY_LONGITUDE <", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_LONGITUDE <=", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeLike(String value) {
            addCriterion("COMMODITY_LONGITUDE like", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeNotLike(String value) {
            addCriterion("COMMODITY_LONGITUDE not like", value, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeIn(List<String> values) {
            addCriterion("COMMODITY_LONGITUDE in", values, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeNotIn(List<String> values) {
            addCriterion("COMMODITY_LONGITUDE not in", values, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeBetween(String value1, String value2) {
            addCriterion("COMMODITY_LONGITUDE between", value1, value2, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLongitudeNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_LONGITUDE not between", value1, value2, "commodityLongitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeIsNull() {
            addCriterion("COMMODITY_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeIsNotNull() {
            addCriterion("COMMODITY_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeEqualTo(String value) {
            addCriterion("COMMODITY_LATITUDE =", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeNotEqualTo(String value) {
            addCriterion("COMMODITY_LATITUDE <>", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeGreaterThan(String value) {
            addCriterion("COMMODITY_LATITUDE >", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_LATITUDE >=", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeLessThan(String value) {
            addCriterion("COMMODITY_LATITUDE <", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_LATITUDE <=", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeLike(String value) {
            addCriterion("COMMODITY_LATITUDE like", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeNotLike(String value) {
            addCriterion("COMMODITY_LATITUDE not like", value, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeIn(List<String> values) {
            addCriterion("COMMODITY_LATITUDE in", values, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeNotIn(List<String> values) {
            addCriterion("COMMODITY_LATITUDE not in", values, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeBetween(String value1, String value2) {
            addCriterion("COMMODITY_LATITUDE between", value1, value2, "commodityLatitude");
            return (Criteria) this;
        }

        public Criteria andCommodityLatitudeNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_LATITUDE not between", value1, value2, "commodityLatitude");
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