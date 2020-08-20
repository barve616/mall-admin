package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportCoachTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportCoachTeamExample() {
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

        public Criteria andCoachNameIsNull() {
            addCriterion("COACH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNotNull() {
            addCriterion("COACH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCoachNameEqualTo(String value) {
            addCriterion("COACH_NAME =", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotEqualTo(String value) {
            addCriterion("COACH_NAME <>", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThan(String value) {
            addCriterion("COACH_NAME >", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_NAME >=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThan(String value) {
            addCriterion("COACH_NAME <", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThanOrEqualTo(String value) {
            addCriterion("COACH_NAME <=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLike(String value) {
            addCriterion("COACH_NAME like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotLike(String value) {
            addCriterion("COACH_NAME not like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameIn(List<String> values) {
            addCriterion("COACH_NAME in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotIn(List<String> values) {
            addCriterion("COACH_NAME not in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameBetween(String value1, String value2) {
            addCriterion("COACH_NAME between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotBetween(String value1, String value2) {
            addCriterion("COACH_NAME not between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachGenderIsNull() {
            addCriterion("COACH_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andCoachGenderIsNotNull() {
            addCriterion("COACH_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andCoachGenderEqualTo(String value) {
            addCriterion("COACH_GENDER =", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderNotEqualTo(String value) {
            addCriterion("COACH_GENDER <>", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderGreaterThan(String value) {
            addCriterion("COACH_GENDER >", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_GENDER >=", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderLessThan(String value) {
            addCriterion("COACH_GENDER <", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderLessThanOrEqualTo(String value) {
            addCriterion("COACH_GENDER <=", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderLike(String value) {
            addCriterion("COACH_GENDER like", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderNotLike(String value) {
            addCriterion("COACH_GENDER not like", value, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderIn(List<String> values) {
            addCriterion("COACH_GENDER in", values, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderNotIn(List<String> values) {
            addCriterion("COACH_GENDER not in", values, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderBetween(String value1, String value2) {
            addCriterion("COACH_GENDER between", value1, value2, "coachGender");
            return (Criteria) this;
        }

        public Criteria andCoachGenderNotBetween(String value1, String value2) {
            addCriterion("COACH_GENDER not between", value1, value2, "coachGender");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("SPECIALTY is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("SPECIALTY is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("SPECIALTY =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("SPECIALTY <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("SPECIALTY >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALTY >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("SPECIALTY <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("SPECIALTY <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("SPECIALTY like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("SPECIALTY not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("SPECIALTY in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("SPECIALTY not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("SPECIALTY between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("SPECIALTY not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeIsNull() {
            addCriterion("TEACHING_AGE is null");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeIsNotNull() {
            addCriterion("TEACHING_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeEqualTo(String value) {
            addCriterion("TEACHING_AGE =", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeNotEqualTo(String value) {
            addCriterion("TEACHING_AGE <>", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeGreaterThan(String value) {
            addCriterion("TEACHING_AGE >", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHING_AGE >=", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeLessThan(String value) {
            addCriterion("TEACHING_AGE <", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeLessThanOrEqualTo(String value) {
            addCriterion("TEACHING_AGE <=", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeLike(String value) {
            addCriterion("TEACHING_AGE like", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeNotLike(String value) {
            addCriterion("TEACHING_AGE not like", value, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeIn(List<String> values) {
            addCriterion("TEACHING_AGE in", values, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeNotIn(List<String> values) {
            addCriterion("TEACHING_AGE not in", values, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeBetween(String value1, String value2) {
            addCriterion("TEACHING_AGE between", value1, value2, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andTeachingAgeNotBetween(String value1, String value2) {
            addCriterion("TEACHING_AGE not between", value1, value2, "teachingAge");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlIsNull() {
            addCriterion("COACH_HEAD_URL is null");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlIsNotNull() {
            addCriterion("COACH_HEAD_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlEqualTo(String value) {
            addCriterion("COACH_HEAD_URL =", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlNotEqualTo(String value) {
            addCriterion("COACH_HEAD_URL <>", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlGreaterThan(String value) {
            addCriterion("COACH_HEAD_URL >", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("COACH_HEAD_URL >=", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlLessThan(String value) {
            addCriterion("COACH_HEAD_URL <", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("COACH_HEAD_URL <=", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlLike(String value) {
            addCriterion("COACH_HEAD_URL like", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlNotLike(String value) {
            addCriterion("COACH_HEAD_URL not like", value, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlIn(List<String> values) {
            addCriterion("COACH_HEAD_URL in", values, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlNotIn(List<String> values) {
            addCriterion("COACH_HEAD_URL not in", values, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlBetween(String value1, String value2) {
            addCriterion("COACH_HEAD_URL between", value1, value2, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andCoachHeadUrlNotBetween(String value1, String value2) {
            addCriterion("COACH_HEAD_URL not between", value1, value2, "coachHeadUrl");
            return (Criteria) this;
        }

        public Criteria andWorkStateIsNull() {
            addCriterion("WORK_STATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkStateIsNotNull() {
            addCriterion("WORK_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStateEqualTo(String value) {
            addCriterion("WORK_STATE =", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotEqualTo(String value) {
            addCriterion("WORK_STATE <>", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateGreaterThan(String value) {
            addCriterion("WORK_STATE >", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_STATE >=", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLessThan(String value) {
            addCriterion("WORK_STATE <", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLessThanOrEqualTo(String value) {
            addCriterion("WORK_STATE <=", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLike(String value) {
            addCriterion("WORK_STATE like", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotLike(String value) {
            addCriterion("WORK_STATE not like", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateIn(List<String> values) {
            addCriterion("WORK_STATE in", values, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotIn(List<String> values) {
            addCriterion("WORK_STATE not in", values, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateBetween(String value1, String value2) {
            addCriterion("WORK_STATE between", value1, value2, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotBetween(String value1, String value2) {
            addCriterion("WORK_STATE not between", value1, value2, "workState");
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