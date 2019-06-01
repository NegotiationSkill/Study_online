package com.study_online.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbProfessionitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProfessionitemExample() {
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

        public Criteria andProfessionIdIsNull() {
            addCriterion("profession_id is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIsNotNull() {
            addCriterion("profession_id is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionIdEqualTo(String value) {
            addCriterion("profession_id =", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotEqualTo(String value) {
            addCriterion("profession_id <>", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdGreaterThan(String value) {
            addCriterion("profession_id >", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("profession_id >=", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLessThan(String value) {
            addCriterion("profession_id <", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLessThanOrEqualTo(String value) {
            addCriterion("profession_id <=", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdLike(String value) {
            addCriterion("profession_id like", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotLike(String value) {
            addCriterion("profession_id not like", value, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdIn(List<String> values) {
            addCriterion("profession_id in", values, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotIn(List<String> values) {
            addCriterion("profession_id not in", values, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdBetween(String value1, String value2) {
            addCriterion("profession_id between", value1, value2, "professionId");
            return (Criteria) this;
        }

        public Criteria andProfessionIdNotBetween(String value1, String value2) {
            addCriterion("profession_id not between", value1, value2, "professionId");
            return (Criteria) this;
        }

        public Criteria andDeanIdIsNull() {
            addCriterion("dean_id is null");
            return (Criteria) this;
        }

        public Criteria andDeanIdIsNotNull() {
            addCriterion("dean_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeanIdEqualTo(String value) {
            addCriterion("dean_id =", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdNotEqualTo(String value) {
            addCriterion("dean_id <>", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdGreaterThan(String value) {
            addCriterion("dean_id >", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdGreaterThanOrEqualTo(String value) {
            addCriterion("dean_id >=", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdLessThan(String value) {
            addCriterion("dean_id <", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdLessThanOrEqualTo(String value) {
            addCriterion("dean_id <=", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdLike(String value) {
            addCriterion("dean_id like", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdNotLike(String value) {
            addCriterion("dean_id not like", value, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdIn(List<String> values) {
            addCriterion("dean_id in", values, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdNotIn(List<String> values) {
            addCriterion("dean_id not in", values, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdBetween(String value1, String value2) {
            addCriterion("dean_id between", value1, value2, "deanId");
            return (Criteria) this;
        }

        public Criteria andDeanIdNotBetween(String value1, String value2) {
            addCriterion("dean_id not between", value1, value2, "deanId");
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