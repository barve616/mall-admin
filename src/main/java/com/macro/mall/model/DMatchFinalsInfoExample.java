package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class DMatchFinalsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DMatchFinalsInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNull() {
            addCriterion("MATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNotNull() {
            addCriterion("MATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatchIdEqualTo(String value) {
            addCriterion("MATCH_ID =", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotEqualTo(String value) {
            addCriterion("MATCH_ID <>", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThan(String value) {
            addCriterion("MATCH_ID >", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATCH_ID >=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThan(String value) {
            addCriterion("MATCH_ID <", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThanOrEqualTo(String value) {
            addCriterion("MATCH_ID <=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLike(String value) {
            addCriterion("MATCH_ID like", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotLike(String value) {
            addCriterion("MATCH_ID not like", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdIn(List<String> values) {
            addCriterion("MATCH_ID in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotIn(List<String> values) {
            addCriterion("MATCH_ID not in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdBetween(String value1, String value2) {
            addCriterion("MATCH_ID between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotBetween(String value1, String value2) {
            addCriterion("MATCH_ID not between", value1, value2, "matchId");
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

        public Criteria andCertNoIsNull() {
            addCriterion("CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("CERT_NO =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("CERT_NO <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("CERT_NO >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NO >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("CERT_NO <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_NO <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("CERT_NO like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("CERT_NO not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("CERT_NO in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("CERT_NO not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("CERT_NO between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("CERT_NO not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
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

        public Criteria andDetailsIsNull() {
            addCriterion("DETAILS is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("DETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("DETAILS =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("DETAILS <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("DETAILS >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILS >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("DETAILS <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("DETAILS <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("DETAILS like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("DETAILS not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("DETAILS in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("DETAILS not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("DETAILS between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("DETAILS not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(String value) {
            addCriterion("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(String value) {
            addCriterion("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(String value) {
            addCriterion("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(String value) {
            addCriterion("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(String value) {
            addCriterion("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLike(String value) {
            addCriterion("CREAT_TIME like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotLike(String value) {
            addCriterion("CREAT_TIME not like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<String> values) {
            addCriterion("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<String> values) {
            addCriterion("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(String value1, String value2) {
            addCriterion("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(String value1, String value2) {
            addCriterion("CREAT_TIME not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIsNull() {
            addCriterion("REMOVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIsNotNull() {
            addCriterion("REMOVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeEqualTo(String value) {
            addCriterion("REMOVE_TIME =", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotEqualTo(String value) {
            addCriterion("REMOVE_TIME <>", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeGreaterThan(String value) {
            addCriterion("REMOVE_TIME >", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REMOVE_TIME >=", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLessThan(String value) {
            addCriterion("REMOVE_TIME <", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLessThanOrEqualTo(String value) {
            addCriterion("REMOVE_TIME <=", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeLike(String value) {
            addCriterion("REMOVE_TIME like", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotLike(String value) {
            addCriterion("REMOVE_TIME not like", value, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeIn(List<String> values) {
            addCriterion("REMOVE_TIME in", values, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotIn(List<String> values) {
            addCriterion("REMOVE_TIME not in", values, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeBetween(String value1, String value2) {
            addCriterion("REMOVE_TIME between", value1, value2, "removeTime");
            return (Criteria) this;
        }

        public Criteria andRemoveTimeNotBetween(String value1, String value2) {
            addCriterion("REMOVE_TIME not between", value1, value2, "removeTime");
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