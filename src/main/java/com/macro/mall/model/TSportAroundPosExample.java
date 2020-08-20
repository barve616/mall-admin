package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportAroundPosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportAroundPosExample() {
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

        public Criteria andAroundPosIdIsNull() {
            addCriterion("AROUND_POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdIsNotNull() {
            addCriterion("AROUND_POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdEqualTo(String value) {
            addCriterion("AROUND_POS_ID =", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdNotEqualTo(String value) {
            addCriterion("AROUND_POS_ID <>", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdGreaterThan(String value) {
            addCriterion("AROUND_POS_ID >", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("AROUND_POS_ID >=", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdLessThan(String value) {
            addCriterion("AROUND_POS_ID <", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdLessThanOrEqualTo(String value) {
            addCriterion("AROUND_POS_ID <=", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdLike(String value) {
            addCriterion("AROUND_POS_ID like", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdNotLike(String value) {
            addCriterion("AROUND_POS_ID not like", value, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdIn(List<String> values) {
            addCriterion("AROUND_POS_ID in", values, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdNotIn(List<String> values) {
            addCriterion("AROUND_POS_ID not in", values, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdBetween(String value1, String value2) {
            addCriterion("AROUND_POS_ID between", value1, value2, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andAroundPosIdNotBetween(String value1, String value2) {
            addCriterion("AROUND_POS_ID not between", value1, value2, "aroundPosId");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("CREATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("CREATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(String value) {
            addCriterion("CREATE_DT =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(String value) {
            addCriterion("CREATE_DT <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(String value) {
            addCriterion("CREATE_DT >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DT >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(String value) {
            addCriterion("CREATE_DT <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DT <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLike(String value) {
            addCriterion("CREATE_DT like", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotLike(String value) {
            addCriterion("CREATE_DT not like", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<String> values) {
            addCriterion("CREATE_DT in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<String> values) {
            addCriterion("CREATE_DT not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(String value1, String value2) {
            addCriterion("CREATE_DT between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(String value1, String value2) {
            addCriterion("CREATE_DT not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNull() {
            addCriterion("UPDATE_DT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNotNull() {
            addCriterion("UPDATE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtEqualTo(String value) {
            addCriterion("UPDATE_DT =", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotEqualTo(String value) {
            addCriterion("UPDATE_DT <>", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThan(String value) {
            addCriterion("UPDATE_DT >", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_DT >=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThan(String value) {
            addCriterion("UPDATE_DT <", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_DT <=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLike(String value) {
            addCriterion("UPDATE_DT like", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotLike(String value) {
            addCriterion("UPDATE_DT not like", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIn(List<String> values) {
            addCriterion("UPDATE_DT in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotIn(List<String> values) {
            addCriterion("UPDATE_DT not in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtBetween(String value1, String value2) {
            addCriterion("UPDATE_DT between", value1, value2, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotBetween(String value1, String value2) {
            addCriterion("UPDATE_DT not between", value1, value2, "updateDt");
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

        public Criteria andPosNameIsNull() {
            addCriterion("POS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNotNull() {
            addCriterion("POS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPosNameEqualTo(String value) {
            addCriterion("POS_NAME =", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotEqualTo(String value) {
            addCriterion("POS_NAME <>", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThan(String value) {
            addCriterion("POS_NAME >", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThanOrEqualTo(String value) {
            addCriterion("POS_NAME >=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThan(String value) {
            addCriterion("POS_NAME <", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThanOrEqualTo(String value) {
            addCriterion("POS_NAME <=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLike(String value) {
            addCriterion("POS_NAME like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotLike(String value) {
            addCriterion("POS_NAME not like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameIn(List<String> values) {
            addCriterion("POS_NAME in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotIn(List<String> values) {
            addCriterion("POS_NAME not in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameBetween(String value1, String value2) {
            addCriterion("POS_NAME between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotBetween(String value1, String value2) {
            addCriterion("POS_NAME not between", value1, value2, "posName");
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

        public Criteria andStreetCodeIsNull() {
            addCriterion("STREET_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIsNotNull() {
            addCriterion("STREET_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStreetCodeEqualTo(String value) {
            addCriterion("STREET_CODE =", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotEqualTo(String value) {
            addCriterion("STREET_CODE <>", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeGreaterThan(String value) {
            addCriterion("STREET_CODE >", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STREET_CODE >=", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLessThan(String value) {
            addCriterion("STREET_CODE <", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLessThanOrEqualTo(String value) {
            addCriterion("STREET_CODE <=", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeLike(String value) {
            addCriterion("STREET_CODE like", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotLike(String value) {
            addCriterion("STREET_CODE not like", value, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeIn(List<String> values) {
            addCriterion("STREET_CODE in", values, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotIn(List<String> values) {
            addCriterion("STREET_CODE not in", values, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeBetween(String value1, String value2) {
            addCriterion("STREET_CODE between", value1, value2, "streetCode");
            return (Criteria) this;
        }

        public Criteria andStreetCodeNotBetween(String value1, String value2) {
            addCriterion("STREET_CODE not between", value1, value2, "streetCode");
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

        public Criteria andBusinessTimeTypeIsNull() {
            addCriterion("BUSINESS_TIME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeIsNotNull() {
            addCriterion("BUSINESS_TIME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeEqualTo(String value) {
            addCriterion("BUSINESS_TIME_TYPE =", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TIME_TYPE <>", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TIME_TYPE >", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TIME_TYPE >=", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeLessThan(String value) {
            addCriterion("BUSINESS_TIME_TYPE <", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TIME_TYPE <=", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeLike(String value) {
            addCriterion("BUSINESS_TIME_TYPE like", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeNotLike(String value) {
            addCriterion("BUSINESS_TIME_TYPE not like", value, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeIn(List<String> values) {
            addCriterion("BUSINESS_TIME_TYPE in", values, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TIME_TYPE not in", values, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TIME_TYPE between", value1, value2, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessTimeTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TIME_TYPE not between", value1, value2, "businessTimeType");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIsNull() {
            addCriterion("BUSINESS_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIsNotNull() {
            addCriterion("BUSINESS_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeEqualTo(String value) {
            addCriterion("BUSINESS_START_TIME =", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotEqualTo(String value) {
            addCriterion("BUSINESS_START_TIME <>", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeGreaterThan(String value) {
            addCriterion("BUSINESS_START_TIME >", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_START_TIME >=", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLessThan(String value) {
            addCriterion("BUSINESS_START_TIME <", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_START_TIME <=", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLike(String value) {
            addCriterion("BUSINESS_START_TIME like", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotLike(String value) {
            addCriterion("BUSINESS_START_TIME not like", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIn(List<String> values) {
            addCriterion("BUSINESS_START_TIME in", values, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotIn(List<String> values) {
            addCriterion("BUSINESS_START_TIME not in", values, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeBetween(String value1, String value2) {
            addCriterion("BUSINESS_START_TIME between", value1, value2, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_START_TIME not between", value1, value2, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIsNull() {
            addCriterion("BUSINESS_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIsNotNull() {
            addCriterion("BUSINESS_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeEqualTo(String value) {
            addCriterion("BUSINESS_END_TIME =", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotEqualTo(String value) {
            addCriterion("BUSINESS_END_TIME <>", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeGreaterThan(String value) {
            addCriterion("BUSINESS_END_TIME >", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_END_TIME >=", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLessThan(String value) {
            addCriterion("BUSINESS_END_TIME <", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_END_TIME <=", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLike(String value) {
            addCriterion("BUSINESS_END_TIME like", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotLike(String value) {
            addCriterion("BUSINESS_END_TIME not like", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIn(List<String> values) {
            addCriterion("BUSINESS_END_TIME in", values, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotIn(List<String> values) {
            addCriterion("BUSINESS_END_TIME not in", values, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeBetween(String value1, String value2) {
            addCriterion("BUSINESS_END_TIME between", value1, value2, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_END_TIME not between", value1, value2, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIsNull() {
            addCriterion("FACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIsNotNull() {
            addCriterion("FACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesEqualTo(String value) {
            addCriterion("FACILITIES =", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotEqualTo(String value) {
            addCriterion("FACILITIES <>", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesGreaterThan(String value) {
            addCriterion("FACILITIES >", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("FACILITIES >=", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLessThan(String value) {
            addCriterion("FACILITIES <", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("FACILITIES <=", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesLike(String value) {
            addCriterion("FACILITIES like", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotLike(String value) {
            addCriterion("FACILITIES not like", value, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesIn(List<String> values) {
            addCriterion("FACILITIES in", values, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotIn(List<String> values) {
            addCriterion("FACILITIES not in", values, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesBetween(String value1, String value2) {
            addCriterion("FACILITIES between", value1, value2, "facilities");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNotBetween(String value1, String value2) {
            addCriterion("FACILITIES not between", value1, value2, "facilities");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("LABEL is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("LABEL =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("LABEL <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("LABEL >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("LABEL <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("LABEL <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("LABEL like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("LABEL not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("LABEL in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("LABEL not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("LABEL between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("LABEL not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andShopLogoIsNull() {
            addCriterion("SHOP_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andShopLogoIsNotNull() {
            addCriterion("SHOP_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andShopLogoEqualTo(String value) {
            addCriterion("SHOP_LOGO =", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotEqualTo(String value) {
            addCriterion("SHOP_LOGO <>", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoGreaterThan(String value) {
            addCriterion("SHOP_LOGO >", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_LOGO >=", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoLessThan(String value) {
            addCriterion("SHOP_LOGO <", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoLessThanOrEqualTo(String value) {
            addCriterion("SHOP_LOGO <=", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoLike(String value) {
            addCriterion("SHOP_LOGO like", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotLike(String value) {
            addCriterion("SHOP_LOGO not like", value, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoIn(List<String> values) {
            addCriterion("SHOP_LOGO in", values, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotIn(List<String> values) {
            addCriterion("SHOP_LOGO not in", values, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoBetween(String value1, String value2) {
            addCriterion("SHOP_LOGO between", value1, value2, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andShopLogoNotBetween(String value1, String value2) {
            addCriterion("SHOP_LOGO not between", value1, value2, "shopLogo");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicIsNull() {
            addCriterion("ROTATION_CHART_PIC is null");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicIsNotNull() {
            addCriterion("ROTATION_CHART_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicEqualTo(String value) {
            addCriterion("ROTATION_CHART_PIC =", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicNotEqualTo(String value) {
            addCriterion("ROTATION_CHART_PIC <>", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicGreaterThan(String value) {
            addCriterion("ROTATION_CHART_PIC >", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicGreaterThanOrEqualTo(String value) {
            addCriterion("ROTATION_CHART_PIC >=", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicLessThan(String value) {
            addCriterion("ROTATION_CHART_PIC <", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicLessThanOrEqualTo(String value) {
            addCriterion("ROTATION_CHART_PIC <=", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicLike(String value) {
            addCriterion("ROTATION_CHART_PIC like", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicNotLike(String value) {
            addCriterion("ROTATION_CHART_PIC not like", value, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicIn(List<String> values) {
            addCriterion("ROTATION_CHART_PIC in", values, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicNotIn(List<String> values) {
            addCriterion("ROTATION_CHART_PIC not in", values, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicBetween(String value1, String value2) {
            addCriterion("ROTATION_CHART_PIC between", value1, value2, "rotationChartPic");
            return (Criteria) this;
        }

        public Criteria andRotationChartPicNotBetween(String value1, String value2) {
            addCriterion("ROTATION_CHART_PIC not between", value1, value2, "rotationChartPic");
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

        public Criteria andAroundPosTypeIsNull() {
            addCriterion("AROUND_POS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeIsNotNull() {
            addCriterion("AROUND_POS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeEqualTo(String value) {
            addCriterion("AROUND_POS_TYPE =", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeNotEqualTo(String value) {
            addCriterion("AROUND_POS_TYPE <>", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeGreaterThan(String value) {
            addCriterion("AROUND_POS_TYPE >", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeGreaterThanOrEqualTo(String value) {
            addCriterion("AROUND_POS_TYPE >=", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeLessThan(String value) {
            addCriterion("AROUND_POS_TYPE <", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeLessThanOrEqualTo(String value) {
            addCriterion("AROUND_POS_TYPE <=", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeLike(String value) {
            addCriterion("AROUND_POS_TYPE like", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeNotLike(String value) {
            addCriterion("AROUND_POS_TYPE not like", value, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeIn(List<String> values) {
            addCriterion("AROUND_POS_TYPE in", values, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeNotIn(List<String> values) {
            addCriterion("AROUND_POS_TYPE not in", values, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeBetween(String value1, String value2) {
            addCriterion("AROUND_POS_TYPE between", value1, value2, "aroundPosType");
            return (Criteria) this;
        }

        public Criteria andAroundPosTypeNotBetween(String value1, String value2) {
            addCriterion("AROUND_POS_TYPE not between", value1, value2, "aroundPosType");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("PRICE like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("PRICE not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPosTypeIsNull() {
            addCriterion("POS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosTypeIsNotNull() {
            addCriterion("POS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosTypeEqualTo(String value) {
            addCriterion("POS_TYPE =", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotEqualTo(String value) {
            addCriterion("POS_TYPE <>", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeGreaterThan(String value) {
            addCriterion("POS_TYPE >", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POS_TYPE >=", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeLessThan(String value) {
            addCriterion("POS_TYPE <", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeLessThanOrEqualTo(String value) {
            addCriterion("POS_TYPE <=", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeLike(String value) {
            addCriterion("POS_TYPE like", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotLike(String value) {
            addCriterion("POS_TYPE not like", value, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeIn(List<String> values) {
            addCriterion("POS_TYPE in", values, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotIn(List<String> values) {
            addCriterion("POS_TYPE not in", values, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeBetween(String value1, String value2) {
            addCriterion("POS_TYPE between", value1, value2, "posType");
            return (Criteria) this;
        }

        public Criteria andPosTypeNotBetween(String value1, String value2) {
            addCriterion("POS_TYPE not between", value1, value2, "posType");
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