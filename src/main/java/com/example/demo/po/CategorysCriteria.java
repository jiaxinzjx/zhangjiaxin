package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class CategorysCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategorysCriteria() {
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

        public Criteria andVcategoryidIsNull() {
            addCriterion("vCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andVcategoryidIsNotNull() {
            addCriterion("vCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andVcategoryidEqualTo(Integer value) {
            addCriterion("vCategoryId =", value, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidNotEqualTo(Integer value) {
            addCriterion("vCategoryId <>", value, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidGreaterThan(Integer value) {
            addCriterion("vCategoryId >", value, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vCategoryId >=", value, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidLessThan(Integer value) {
            addCriterion("vCategoryId <", value, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("vCategoryId <=", value, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidIn(List<Integer> values) {
            addCriterion("vCategoryId in", values, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidNotIn(List<Integer> values) {
            addCriterion("vCategoryId not in", values, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("vCategoryId between", value1, value2, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("vCategoryId not between", value1, value2, "vcategoryid");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleIsNull() {
            addCriterion("vCategoryTitle is null");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleIsNotNull() {
            addCriterion("vCategoryTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleEqualTo(String value) {
            addCriterion("vCategoryTitle =", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleNotEqualTo(String value) {
            addCriterion("vCategoryTitle <>", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleGreaterThan(String value) {
            addCriterion("vCategoryTitle >", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleGreaterThanOrEqualTo(String value) {
            addCriterion("vCategoryTitle >=", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleLessThan(String value) {
            addCriterion("vCategoryTitle <", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleLessThanOrEqualTo(String value) {
            addCriterion("vCategoryTitle <=", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleLike(String value) {
            addCriterion("vCategoryTitle like", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleNotLike(String value) {
            addCriterion("vCategoryTitle not like", value, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleIn(List<String> values) {
            addCriterion("vCategoryTitle in", values, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleNotIn(List<String> values) {
            addCriterion("vCategoryTitle not in", values, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleBetween(String value1, String value2) {
            addCriterion("vCategoryTitle between", value1, value2, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVcategorytitleNotBetween(String value1, String value2) {
            addCriterion("vCategoryTitle not between", value1, value2, "vcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidIsNull() {
            addCriterion("vBigCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidIsNotNull() {
            addCriterion("vBigCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidEqualTo(Integer value) {
            addCriterion("vBigCategoryId =", value, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidNotEqualTo(Integer value) {
            addCriterion("vBigCategoryId <>", value, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidGreaterThan(Integer value) {
            addCriterion("vBigCategoryId >", value, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vBigCategoryId >=", value, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidLessThan(Integer value) {
            addCriterion("vBigCategoryId <", value, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("vBigCategoryId <=", value, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidIn(List<Integer> values) {
            addCriterion("vBigCategoryId in", values, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidNotIn(List<Integer> values) {
            addCriterion("vBigCategoryId not in", values, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("vBigCategoryId between", value1, value2, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("vBigCategoryId not between", value1, value2, "vbigcategoryid");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleIsNull() {
            addCriterion("vBigCategoryTitle is null");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleIsNotNull() {
            addCriterion("vBigCategoryTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleEqualTo(String value) {
            addCriterion("vBigCategoryTitle =", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleNotEqualTo(String value) {
            addCriterion("vBigCategoryTitle <>", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleGreaterThan(String value) {
            addCriterion("vBigCategoryTitle >", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleGreaterThanOrEqualTo(String value) {
            addCriterion("vBigCategoryTitle >=", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleLessThan(String value) {
            addCriterion("vBigCategoryTitle <", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleLessThanOrEqualTo(String value) {
            addCriterion("vBigCategoryTitle <=", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleLike(String value) {
            addCriterion("vBigCategoryTitle like", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleNotLike(String value) {
            addCriterion("vBigCategoryTitle not like", value, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleIn(List<String> values) {
            addCriterion("vBigCategoryTitle in", values, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleNotIn(List<String> values) {
            addCriterion("vBigCategoryTitle not in", values, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleBetween(String value1, String value2) {
            addCriterion("vBigCategoryTitle between", value1, value2, "vbigcategorytitle");
            return (Criteria) this;
        }

        public Criteria andVbigcategorytitleNotBetween(String value1, String value2) {
            addCriterion("vBigCategoryTitle not between", value1, value2, "vbigcategorytitle");
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