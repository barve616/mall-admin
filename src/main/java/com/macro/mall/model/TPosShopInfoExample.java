package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TPosShopInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPosShopInfoExample() {
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

        public Criteria andShopLabelIsNull() {
            addCriterion("SHOP_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andShopLabelIsNotNull() {
            addCriterion("SHOP_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andShopLabelEqualTo(String value) {
            addCriterion("SHOP_LABEL =", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelNotEqualTo(String value) {
            addCriterion("SHOP_LABEL <>", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelGreaterThan(String value) {
            addCriterion("SHOP_LABEL >", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_LABEL >=", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelLessThan(String value) {
            addCriterion("SHOP_LABEL <", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelLessThanOrEqualTo(String value) {
            addCriterion("SHOP_LABEL <=", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelLike(String value) {
            addCriterion("SHOP_LABEL like", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelNotLike(String value) {
            addCriterion("SHOP_LABEL not like", value, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelIn(List<String> values) {
            addCriterion("SHOP_LABEL in", values, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelNotIn(List<String> values) {
            addCriterion("SHOP_LABEL not in", values, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelBetween(String value1, String value2) {
            addCriterion("SHOP_LABEL between", value1, value2, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopLabelNotBetween(String value1, String value2) {
            addCriterion("SHOP_LABEL not between", value1, value2, "shopLabel");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameIsNull() {
            addCriterion("SHOP_ENGLISH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameIsNotNull() {
            addCriterion("SHOP_ENGLISH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameEqualTo(String value) {
            addCriterion("SHOP_ENGLISH_NAME =", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameNotEqualTo(String value) {
            addCriterion("SHOP_ENGLISH_NAME <>", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameGreaterThan(String value) {
            addCriterion("SHOP_ENGLISH_NAME >", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ENGLISH_NAME >=", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameLessThan(String value) {
            addCriterion("SHOP_ENGLISH_NAME <", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ENGLISH_NAME <=", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameLike(String value) {
            addCriterion("SHOP_ENGLISH_NAME like", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameNotLike(String value) {
            addCriterion("SHOP_ENGLISH_NAME not like", value, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameIn(List<String> values) {
            addCriterion("SHOP_ENGLISH_NAME in", values, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameNotIn(List<String> values) {
            addCriterion("SHOP_ENGLISH_NAME not in", values, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameBetween(String value1, String value2) {
            addCriterion("SHOP_ENGLISH_NAME between", value1, value2, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopEnglishNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_ENGLISH_NAME not between", value1, value2, "shopEnglishName");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("SHOP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("SHOP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("SHOP_TYPE =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("SHOP_TYPE <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("SHOP_TYPE >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_TYPE >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("SHOP_TYPE <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("SHOP_TYPE <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("SHOP_TYPE like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("SHOP_TYPE not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("SHOP_TYPE in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("SHOP_TYPE not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("SHOP_TYPE between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("SHOP_TYPE not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIsNull() {
            addCriterion("SHOP_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIsNotNull() {
            addCriterion("SHOP_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionEqualTo(String value) {
            addCriterion("SHOP_DESCRIPTION =", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotEqualTo(String value) {
            addCriterion("SHOP_DESCRIPTION <>", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionGreaterThan(String value) {
            addCriterion("SHOP_DESCRIPTION >", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_DESCRIPTION >=", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLessThan(String value) {
            addCriterion("SHOP_DESCRIPTION <", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLessThanOrEqualTo(String value) {
            addCriterion("SHOP_DESCRIPTION <=", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLike(String value) {
            addCriterion("SHOP_DESCRIPTION like", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotLike(String value) {
            addCriterion("SHOP_DESCRIPTION not like", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIn(List<String> values) {
            addCriterion("SHOP_DESCRIPTION in", values, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotIn(List<String> values) {
            addCriterion("SHOP_DESCRIPTION not in", values, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionBetween(String value1, String value2) {
            addCriterion("SHOP_DESCRIPTION between", value1, value2, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotBetween(String value1, String value2) {
            addCriterion("SHOP_DESCRIPTION not between", value1, value2, "shopDescription");
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

        public Criteria andShopAddressIsNull() {
            addCriterion("SHOP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("SHOP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("SHOP_ADDRESS =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("SHOP_ADDRESS >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("SHOP_ADDRESS <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("SHOP_ADDRESS like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("SHOP_ADDRESS not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("SHOP_ADDRESS in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("SHOP_ADDRESS not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageIsNull() {
            addCriterion("SEARCH_PAGE_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageIsNotNull() {
            addCriterion("SEARCH_PAGE_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageEqualTo(String value) {
            addCriterion("SEARCH_PAGE_IMAGE =", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageNotEqualTo(String value) {
            addCriterion("SEARCH_PAGE_IMAGE <>", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageGreaterThan(String value) {
            addCriterion("SEARCH_PAGE_IMAGE >", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCH_PAGE_IMAGE >=", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageLessThan(String value) {
            addCriterion("SEARCH_PAGE_IMAGE <", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageLessThanOrEqualTo(String value) {
            addCriterion("SEARCH_PAGE_IMAGE <=", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageLike(String value) {
            addCriterion("SEARCH_PAGE_IMAGE like", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageNotLike(String value) {
            addCriterion("SEARCH_PAGE_IMAGE not like", value, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageIn(List<String> values) {
            addCriterion("SEARCH_PAGE_IMAGE in", values, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageNotIn(List<String> values) {
            addCriterion("SEARCH_PAGE_IMAGE not in", values, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageBetween(String value1, String value2) {
            addCriterion("SEARCH_PAGE_IMAGE between", value1, value2, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andSearchPageImageNotBetween(String value1, String value2) {
            addCriterion("SEARCH_PAGE_IMAGE not between", value1, value2, "searchPageImage");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoIsNull() {
            addCriterion("ROTATIONN_CHART_INFO is null");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoIsNotNull() {
            addCriterion("ROTATIONN_CHART_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_INFO =", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoNotEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_INFO <>", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoGreaterThan(String value) {
            addCriterion("ROTATIONN_CHART_INFO >", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_INFO >=", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoLessThan(String value) {
            addCriterion("ROTATIONN_CHART_INFO <", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoLessThanOrEqualTo(String value) {
            addCriterion("ROTATIONN_CHART_INFO <=", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoLike(String value) {
            addCriterion("ROTATIONN_CHART_INFO like", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoNotLike(String value) {
            addCriterion("ROTATIONN_CHART_INFO not like", value, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoIn(List<String> values) {
            addCriterion("ROTATIONN_CHART_INFO in", values, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoNotIn(List<String> values) {
            addCriterion("ROTATIONN_CHART_INFO not in", values, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoBetween(String value1, String value2) {
            addCriterion("ROTATIONN_CHART_INFO between", value1, value2, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andRotationnChartInfoNotBetween(String value1, String value2) {
            addCriterion("ROTATIONN_CHART_INFO not between", value1, value2, "rotationnChartInfo");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatIsNull() {
            addCriterion("SHOP_WINDOW_SEAT is null");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatIsNotNull() {
            addCriterion("SHOP_WINDOW_SEAT is not null");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatEqualTo(String value) {
            addCriterion("SHOP_WINDOW_SEAT =", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatNotEqualTo(String value) {
            addCriterion("SHOP_WINDOW_SEAT <>", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatGreaterThan(String value) {
            addCriterion("SHOP_WINDOW_SEAT >", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_WINDOW_SEAT >=", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatLessThan(String value) {
            addCriterion("SHOP_WINDOW_SEAT <", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatLessThanOrEqualTo(String value) {
            addCriterion("SHOP_WINDOW_SEAT <=", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatLike(String value) {
            addCriterion("SHOP_WINDOW_SEAT like", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatNotLike(String value) {
            addCriterion("SHOP_WINDOW_SEAT not like", value, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatIn(List<String> values) {
            addCriterion("SHOP_WINDOW_SEAT in", values, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatNotIn(List<String> values) {
            addCriterion("SHOP_WINDOW_SEAT not in", values, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatBetween(String value1, String value2) {
            addCriterion("SHOP_WINDOW_SEAT between", value1, value2, "shopWindowSeat");
            return (Criteria) this;
        }

        public Criteria andShopWindowSeatNotBetween(String value1, String value2) {
            addCriterion("SHOP_WINDOW_SEAT not between", value1, value2, "shopWindowSeat");
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

        public Criteria andCoachIdIsNull() {
            addCriterion("COACH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNotNull() {
            addCriterion("COACH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCoachIdEqualTo(String value) {
            addCriterion("COACH_ID =", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotEqualTo(String value) {
            addCriterion("COACH_ID <>", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThan(String value) {
            addCriterion("COACH_ID >", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_ID >=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThan(String value) {
            addCriterion("COACH_ID <", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThanOrEqualTo(String value) {
            addCriterion("COACH_ID <=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLike(String value) {
            addCriterion("COACH_ID like", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotLike(String value) {
            addCriterion("COACH_ID not like", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIn(List<String> values) {
            addCriterion("COACH_ID in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotIn(List<String> values) {
            addCriterion("COACH_ID not in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdBetween(String value1, String value2) {
            addCriterion("COACH_ID between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotBetween(String value1, String value2) {
            addCriterion("COACH_ID not between", value1, value2, "coachId");
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

        public Criteria andTermNameIsNull() {
            addCriterion("TERM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTermNameIsNotNull() {
            addCriterion("TERM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTermNameEqualTo(String value) {
            addCriterion("TERM_NAME =", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotEqualTo(String value) {
            addCriterion("TERM_NAME <>", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameGreaterThan(String value) {
            addCriterion("TERM_NAME >", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameGreaterThanOrEqualTo(String value) {
            addCriterion("TERM_NAME >=", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameLessThan(String value) {
            addCriterion("TERM_NAME <", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameLessThanOrEqualTo(String value) {
            addCriterion("TERM_NAME <=", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameLike(String value) {
            addCriterion("TERM_NAME like", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotLike(String value) {
            addCriterion("TERM_NAME not like", value, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameIn(List<String> values) {
            addCriterion("TERM_NAME in", values, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotIn(List<String> values) {
            addCriterion("TERM_NAME not in", values, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameBetween(String value1, String value2) {
            addCriterion("TERM_NAME between", value1, value2, "termName");
            return (Criteria) this;
        }

        public Criteria andTermNameNotBetween(String value1, String value2) {
            addCriterion("TERM_NAME not between", value1, value2, "termName");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNull() {
            addCriterion("SHOP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andShopStatusIsNotNull() {
            addCriterion("SHOP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andShopStatusEqualTo(String value) {
            addCriterion("SHOP_STATUS =", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotEqualTo(String value) {
            addCriterion("SHOP_STATUS <>", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThan(String value) {
            addCriterion("SHOP_STATUS >", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_STATUS >=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThan(String value) {
            addCriterion("SHOP_STATUS <", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLessThanOrEqualTo(String value) {
            addCriterion("SHOP_STATUS <=", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusLike(String value) {
            addCriterion("SHOP_STATUS like", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotLike(String value) {
            addCriterion("SHOP_STATUS not like", value, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusIn(List<String> values) {
            addCriterion("SHOP_STATUS in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotIn(List<String> values) {
            addCriterion("SHOP_STATUS not in", values, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusBetween(String value1, String value2) {
            addCriterion("SHOP_STATUS between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andShopStatusNotBetween(String value1, String value2) {
            addCriterion("SHOP_STATUS not between", value1, value2, "shopStatus");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataIsNull() {
            addCriterion("SEARCH_FOUNDATION_DATA is null");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataIsNotNull() {
            addCriterion("SEARCH_FOUNDATION_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataEqualTo(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA =", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataNotEqualTo(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA <>", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataGreaterThan(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA >", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA >=", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataLessThan(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA <", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataLessThanOrEqualTo(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA <=", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataLike(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA like", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataNotLike(String value) {
            addCriterion("SEARCH_FOUNDATION_DATA not like", value, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataIn(List<String> values) {
            addCriterion("SEARCH_FOUNDATION_DATA in", values, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataNotIn(List<String> values) {
            addCriterion("SEARCH_FOUNDATION_DATA not in", values, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataBetween(String value1, String value2) {
            addCriterion("SEARCH_FOUNDATION_DATA between", value1, value2, "searchFoundationData");
            return (Criteria) this;
        }

        public Criteria andSearchFoundationDataNotBetween(String value1, String value2) {
            addCriterion("SEARCH_FOUNDATION_DATA not between", value1, value2, "searchFoundationData");
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