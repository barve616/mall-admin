package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class TSportTimeSlotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSportTimeSlotExample() {
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

        public Criteria andTimeSlotNameIsNull() {
            addCriterion("TIME_SLOT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameIsNotNull() {
            addCriterion("TIME_SLOT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameEqualTo(String value) {
            addCriterion("TIME_SLOT_NAME =", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameNotEqualTo(String value) {
            addCriterion("TIME_SLOT_NAME <>", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameGreaterThan(String value) {
            addCriterion("TIME_SLOT_NAME >", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_SLOT_NAME >=", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameLessThan(String value) {
            addCriterion("TIME_SLOT_NAME <", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameLessThanOrEqualTo(String value) {
            addCriterion("TIME_SLOT_NAME <=", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameLike(String value) {
            addCriterion("TIME_SLOT_NAME like", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameNotLike(String value) {
            addCriterion("TIME_SLOT_NAME not like", value, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameIn(List<String> values) {
            addCriterion("TIME_SLOT_NAME in", values, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameNotIn(List<String> values) {
            addCriterion("TIME_SLOT_NAME not in", values, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameBetween(String value1, String value2) {
            addCriterion("TIME_SLOT_NAME between", value1, value2, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andTimeSlotNameNotBetween(String value1, String value2) {
            addCriterion("TIME_SLOT_NAME not between", value1, value2, "timeSlotName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("CYCLE =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("CYCLE <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("CYCLE >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("CYCLE >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("CYCLE <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("CYCLE <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("CYCLE like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("CYCLE not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("CYCLE in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("CYCLE not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("CYCLE between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("CYCLE not between", value1, value2, "cycle");
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

        public Criteria andCycleTypeIsNull() {
            addCriterion("CYCLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCycleTypeIsNotNull() {
            addCriterion("CYCLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCycleTypeEqualTo(String value) {
            addCriterion("CYCLE_TYPE =", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeNotEqualTo(String value) {
            addCriterion("CYCLE_TYPE <>", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeGreaterThan(String value) {
            addCriterion("CYCLE_TYPE >", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CYCLE_TYPE >=", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeLessThan(String value) {
            addCriterion("CYCLE_TYPE <", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeLessThanOrEqualTo(String value) {
            addCriterion("CYCLE_TYPE <=", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeLike(String value) {
            addCriterion("CYCLE_TYPE like", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeNotLike(String value) {
            addCriterion("CYCLE_TYPE not like", value, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeIn(List<String> values) {
            addCriterion("CYCLE_TYPE in", values, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeNotIn(List<String> values) {
            addCriterion("CYCLE_TYPE not in", values, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeBetween(String value1, String value2) {
            addCriterion("CYCLE_TYPE between", value1, value2, "cycleType");
            return (Criteria) this;
        }

        public Criteria andCycleTypeNotBetween(String value1, String value2) {
            addCriterion("CYCLE_TYPE not between", value1, value2, "cycleType");
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