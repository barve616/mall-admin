package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DMatchTimingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DMatchTimingInfoExample() {
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

        public Criteria andTimerNameIsNull() {
            addCriterion("TIMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTimerNameIsNotNull() {
            addCriterion("TIMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTimerNameEqualTo(String value) {
            addCriterion("TIMER_NAME =", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotEqualTo(String value) {
            addCriterion("TIMER_NAME <>", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameGreaterThan(String value) {
            addCriterion("TIMER_NAME >", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TIMER_NAME >=", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLessThan(String value) {
            addCriterion("TIMER_NAME <", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLessThanOrEqualTo(String value) {
            addCriterion("TIMER_NAME <=", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLike(String value) {
            addCriterion("TIMER_NAME like", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotLike(String value) {
            addCriterion("TIMER_NAME not like", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameIn(List<String> values) {
            addCriterion("TIMER_NAME in", values, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotIn(List<String> values) {
            addCriterion("TIMER_NAME not in", values, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameBetween(String value1, String value2) {
            addCriterion("TIMER_NAME between", value1, value2, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotBetween(String value1, String value2) {
            addCriterion("TIMER_NAME not between", value1, value2, "timerName");
            return (Criteria) this;
        }

        public Criteria andStartDtIsNull() {
            addCriterion("START_DT is null");
            return (Criteria) this;
        }

        public Criteria andStartDtIsNotNull() {
            addCriterion("START_DT is not null");
            return (Criteria) this;
        }

        public Criteria andStartDtEqualTo(String value) {
            addCriterion("START_DT =", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotEqualTo(String value) {
            addCriterion("START_DT <>", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtGreaterThan(String value) {
            addCriterion("START_DT >", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtGreaterThanOrEqualTo(String value) {
            addCriterion("START_DT >=", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLessThan(String value) {
            addCriterion("START_DT <", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLessThanOrEqualTo(String value) {
            addCriterion("START_DT <=", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtLike(String value) {
            addCriterion("START_DT like", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotLike(String value) {
            addCriterion("START_DT not like", value, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtIn(List<String> values) {
            addCriterion("START_DT in", values, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotIn(List<String> values) {
            addCriterion("START_DT not in", values, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtBetween(String value1, String value2) {
            addCriterion("START_DT between", value1, value2, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartDtNotBetween(String value1, String value2) {
            addCriterion("START_DT not between", value1, value2, "startDt");
            return (Criteria) this;
        }

        public Criteria andStartTimesIsNull() {
            addCriterion("START_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andStartTimesIsNotNull() {
            addCriterion("START_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimesEqualTo(String value) {
            addCriterion("START_TIMES =", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesNotEqualTo(String value) {
            addCriterion("START_TIMES <>", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesGreaterThan(String value) {
            addCriterion("START_TIMES >", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIMES >=", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesLessThan(String value) {
            addCriterion("START_TIMES <", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesLessThanOrEqualTo(String value) {
            addCriterion("START_TIMES <=", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesLike(String value) {
            addCriterion("START_TIMES like", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesNotLike(String value) {
            addCriterion("START_TIMES not like", value, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesIn(List<String> values) {
            addCriterion("START_TIMES in", values, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesNotIn(List<String> values) {
            addCriterion("START_TIMES not in", values, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesBetween(String value1, String value2) {
            addCriterion("START_TIMES between", value1, value2, "startTimes");
            return (Criteria) this;
        }

        public Criteria andStartTimesNotBetween(String value1, String value2) {
            addCriterion("START_TIMES not between", value1, value2, "startTimes");
            return (Criteria) this;
        }

        public Criteria andEndDtIsNull() {
            addCriterion("END_DT is null");
            return (Criteria) this;
        }

        public Criteria andEndDtIsNotNull() {
            addCriterion("END_DT is not null");
            return (Criteria) this;
        }

        public Criteria andEndDtEqualTo(String value) {
            addCriterion("END_DT =", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotEqualTo(String value) {
            addCriterion("END_DT <>", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtGreaterThan(String value) {
            addCriterion("END_DT >", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtGreaterThanOrEqualTo(String value) {
            addCriterion("END_DT >=", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLessThan(String value) {
            addCriterion("END_DT <", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLessThanOrEqualTo(String value) {
            addCriterion("END_DT <=", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtLike(String value) {
            addCriterion("END_DT like", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotLike(String value) {
            addCriterion("END_DT not like", value, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtIn(List<String> values) {
            addCriterion("END_DT in", values, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotIn(List<String> values) {
            addCriterion("END_DT not in", values, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtBetween(String value1, String value2) {
            addCriterion("END_DT between", value1, value2, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndDtNotBetween(String value1, String value2) {
            addCriterion("END_DT not between", value1, value2, "endDt");
            return (Criteria) this;
        }

        public Criteria andEndTimesIsNull() {
            addCriterion("END_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andEndTimesIsNotNull() {
            addCriterion("END_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimesEqualTo(String value) {
            addCriterion("END_TIMES =", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesNotEqualTo(String value) {
            addCriterion("END_TIMES <>", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesGreaterThan(String value) {
            addCriterion("END_TIMES >", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIMES >=", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesLessThan(String value) {
            addCriterion("END_TIMES <", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesLessThanOrEqualTo(String value) {
            addCriterion("END_TIMES <=", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesLike(String value) {
            addCriterion("END_TIMES like", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesNotLike(String value) {
            addCriterion("END_TIMES not like", value, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesIn(List<String> values) {
            addCriterion("END_TIMES in", values, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesNotIn(List<String> values) {
            addCriterion("END_TIMES not in", values, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesBetween(String value1, String value2) {
            addCriterion("END_TIMES between", value1, value2, "endTimes");
            return (Criteria) this;
        }

        public Criteria andEndTimesNotBetween(String value1, String value2) {
            addCriterion("END_TIMES not between", value1, value2, "endTimes");
            return (Criteria) this;
        }

        public Criteria andExeInfoIsNull() {
            addCriterion("EXE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andExeInfoIsNotNull() {
            addCriterion("EXE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andExeInfoEqualTo(String value) {
            addCriterion("EXE_INFO =", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoNotEqualTo(String value) {
            addCriterion("EXE_INFO <>", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoGreaterThan(String value) {
            addCriterion("EXE_INFO >", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXE_INFO >=", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoLessThan(String value) {
            addCriterion("EXE_INFO <", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoLessThanOrEqualTo(String value) {
            addCriterion("EXE_INFO <=", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoLike(String value) {
            addCriterion("EXE_INFO like", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoNotLike(String value) {
            addCriterion("EXE_INFO not like", value, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoIn(List<String> values) {
            addCriterion("EXE_INFO in", values, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoNotIn(List<String> values) {
            addCriterion("EXE_INFO not in", values, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoBetween(String value1, String value2) {
            addCriterion("EXE_INFO between", value1, value2, "exeInfo");
            return (Criteria) this;
        }

        public Criteria andExeInfoNotBetween(String value1, String value2) {
            addCriterion("EXE_INFO not between", value1, value2, "exeInfo");
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