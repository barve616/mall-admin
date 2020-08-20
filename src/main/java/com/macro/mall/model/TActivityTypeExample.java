package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TActivityTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TActivityTypeExample() {
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

        public Criteria andActivityTypeIdIsNull() {
            addCriterion("ACTIVITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIsNotNull() {
            addCriterion("ACTIVITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID =", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID <>", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdGreaterThan(String value) {
            addCriterion("ACTIVITY_TYPE_ID >", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID >=", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLessThan(String value) {
            addCriterion("ACTIVITY_TYPE_ID <", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_ID <=", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdLike(String value) {
            addCriterion("ACTIVITY_TYPE_ID like", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotLike(String value) {
            addCriterion("ACTIVITY_TYPE_ID not like", value, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE_ID in", values, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE_ID not in", values, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE_ID between", value1, value2, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE_ID not between", value1, value2, "activityTypeId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameIsNull() {
            addCriterion("ACTIVITY_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameIsNotNull() {
            addCriterion("ACTIVITY_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_NAME =", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_NAME <>", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameGreaterThan(String value) {
            addCriterion("ACTIVITY_TYPE_NAME >", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_NAME >=", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameLessThan(String value) {
            addCriterion("ACTIVITY_TYPE_NAME <", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE_NAME <=", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameLike(String value) {
            addCriterion("ACTIVITY_TYPE_NAME like", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotLike(String value) {
            addCriterion("ACTIVITY_TYPE_NAME not like", value, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE_NAME in", values, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE_NAME not in", values, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE_NAME between", value1, value2, "activityTypeName");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE_NAME not between", value1, value2, "activityTypeName");
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