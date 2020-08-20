package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DStepActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DStepActivityExample() {
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

        public Criteria andActivityNameIsNull() {
            addCriterion("ACTIVITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("ACTIVITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("ACTIVITY_NAME =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("ACTIVITY_NAME >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("ACTIVITY_NAME <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("ACTIVITY_NAME like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("ACTIVITY_NAME not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("ACTIVITY_NAME in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("ACTIVITY_NAME not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtIsNull() {
            addCriterion("ACTIVITY_START_DT is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtIsNotNull() {
            addCriterion("ACTIVITY_START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtEqualTo(String value) {
            addCriterion("ACTIVITY_START_DT =", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtNotEqualTo(String value) {
            addCriterion("ACTIVITY_START_DT <>", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtGreaterThan(String value) {
            addCriterion("ACTIVITY_START_DT >", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_START_DT >=", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtLessThan(String value) {
            addCriterion("ACTIVITY_START_DT <", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_START_DT <=", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtLike(String value) {
            addCriterion("ACTIVITY_START_DT like", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtNotLike(String value) {
            addCriterion("ACTIVITY_START_DT not like", value, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtIn(List<String> values) {
            addCriterion("ACTIVITY_START_DT in", values, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtNotIn(List<String> values) {
            addCriterion("ACTIVITY_START_DT not in", values, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtBetween(String value1, String value2) {
            addCriterion("ACTIVITY_START_DT between", value1, value2, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityStartDtNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_START_DT not between", value1, value2, "activityStartDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtIsNull() {
            addCriterion("ACTIVITY_END_DT is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtIsNotNull() {
            addCriterion("ACTIVITY_END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtEqualTo(String value) {
            addCriterion("ACTIVITY_END_DT =", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtNotEqualTo(String value) {
            addCriterion("ACTIVITY_END_DT <>", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtGreaterThan(String value) {
            addCriterion("ACTIVITY_END_DT >", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_END_DT >=", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtLessThan(String value) {
            addCriterion("ACTIVITY_END_DT <", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_END_DT <=", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtLike(String value) {
            addCriterion("ACTIVITY_END_DT like", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtNotLike(String value) {
            addCriterion("ACTIVITY_END_DT not like", value, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtIn(List<String> values) {
            addCriterion("ACTIVITY_END_DT in", values, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtNotIn(List<String> values) {
            addCriterion("ACTIVITY_END_DT not in", values, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtBetween(String value1, String value2) {
            addCriterion("ACTIVITY_END_DT between", value1, value2, "activityEndDt");
            return (Criteria) this;
        }

        public Criteria andActivityEndDtNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_END_DT not between", value1, value2, "activityEndDt");
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