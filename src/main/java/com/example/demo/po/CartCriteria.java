package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class CartCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartCriteria() {
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

        public Criteria andVcidIsNull() {
            addCriterion("vCid is null");
            return (Criteria) this;
        }

        public Criteria andVcidIsNotNull() {
            addCriterion("vCid is not null");
            return (Criteria) this;
        }

        public Criteria andVcidEqualTo(String value) {
            addCriterion("vCid =", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotEqualTo(String value) {
            addCriterion("vCid <>", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidGreaterThan(String value) {
            addCriterion("vCid >", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidGreaterThanOrEqualTo(String value) {
            addCriterion("vCid >=", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLessThan(String value) {
            addCriterion("vCid <", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLessThanOrEqualTo(String value) {
            addCriterion("vCid <=", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLike(String value) {
            addCriterion("vCid like", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotLike(String value) {
            addCriterion("vCid not like", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidIn(List<String> values) {
            addCriterion("vCid in", values, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotIn(List<String> values) {
            addCriterion("vCid not in", values, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidBetween(String value1, String value2) {
            addCriterion("vCid between", value1, value2, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotBetween(String value1, String value2) {
            addCriterion("vCid not between", value1, value2, "vcid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidIsNull() {
            addCriterion("vGoodsId is null");
            return (Criteria) this;
        }

        public Criteria andVgoodsidIsNotNull() {
            addCriterion("vGoodsId is not null");
            return (Criteria) this;
        }

        public Criteria andVgoodsidEqualTo(Integer value) {
            addCriterion("vGoodsId =", value, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidNotEqualTo(Integer value) {
            addCriterion("vGoodsId <>", value, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidGreaterThan(Integer value) {
            addCriterion("vGoodsId >", value, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vGoodsId >=", value, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidLessThan(Integer value) {
            addCriterion("vGoodsId <", value, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("vGoodsId <=", value, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidIn(List<Integer> values) {
            addCriterion("vGoodsId in", values, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidNotIn(List<Integer> values) {
            addCriterion("vGoodsId not in", values, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidBetween(Integer value1, Integer value2) {
            addCriterion("vGoodsId between", value1, value2, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andVgoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("vGoodsId not between", value1, value2, "vgoodsid");
            return (Criteria) this;
        }

        public Criteria andMamountIsNull() {
            addCriterion("mAmount is null");
            return (Criteria) this;
        }

        public Criteria andMamountIsNotNull() {
            addCriterion("mAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMamountEqualTo(Integer value) {
            addCriterion("mAmount =", value, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountNotEqualTo(Integer value) {
            addCriterion("mAmount <>", value, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountGreaterThan(Integer value) {
            addCriterion("mAmount >", value, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("mAmount >=", value, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountLessThan(Integer value) {
            addCriterion("mAmount <", value, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountLessThanOrEqualTo(Integer value) {
            addCriterion("mAmount <=", value, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountIn(List<Integer> values) {
            addCriterion("mAmount in", values, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountNotIn(List<Integer> values) {
            addCriterion("mAmount not in", values, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountBetween(Integer value1, Integer value2) {
            addCriterion("mAmount between", value1, value2, "mamount");
            return (Criteria) this;
        }

        public Criteria andMamountNotBetween(Integer value1, Integer value2) {
            addCriterion("mAmount not between", value1, value2, "mamount");
            return (Criteria) this;
        }

        public Criteria andMsummoneyIsNull() {
            addCriterion("mSumMoney is null");
            return (Criteria) this;
        }

        public Criteria andMsummoneyIsNotNull() {
            addCriterion("mSumMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMsummoneyEqualTo(Integer value) {
            addCriterion("mSumMoney =", value, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyNotEqualTo(Integer value) {
            addCriterion("mSumMoney <>", value, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyGreaterThan(Integer value) {
            addCriterion("mSumMoney >", value, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mSumMoney >=", value, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyLessThan(Integer value) {
            addCriterion("mSumMoney <", value, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyLessThanOrEqualTo(Integer value) {
            addCriterion("mSumMoney <=", value, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyIn(List<Integer> values) {
            addCriterion("mSumMoney in", values, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyNotIn(List<Integer> values) {
            addCriterion("mSumMoney not in", values, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyBetween(Integer value1, Integer value2) {
            addCriterion("mSumMoney between", value1, value2, "msummoney");
            return (Criteria) this;
        }

        public Criteria andMsummoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("mSumMoney not between", value1, value2, "msummoney");
            return (Criteria) this;
        }

        public Criteria andVuseridIsNull() {
            addCriterion("vUserId is null");
            return (Criteria) this;
        }

        public Criteria andVuseridIsNotNull() {
            addCriterion("vUserId is not null");
            return (Criteria) this;
        }

        public Criteria andVuseridEqualTo(String value) {
            addCriterion("vUserId =", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridNotEqualTo(String value) {
            addCriterion("vUserId <>", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridGreaterThan(String value) {
            addCriterion("vUserId >", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridGreaterThanOrEqualTo(String value) {
            addCriterion("vUserId >=", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridLessThan(String value) {
            addCriterion("vUserId <", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridLessThanOrEqualTo(String value) {
            addCriterion("vUserId <=", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridLike(String value) {
            addCriterion("vUserId like", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridNotLike(String value) {
            addCriterion("vUserId not like", value, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridIn(List<String> values) {
            addCriterion("vUserId in", values, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridNotIn(List<String> values) {
            addCriterion("vUserId not in", values, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridBetween(String value1, String value2) {
            addCriterion("vUserId between", value1, value2, "vuserid");
            return (Criteria) this;
        }

        public Criteria andVuseridNotBetween(String value1, String value2) {
            addCriterion("vUserId not between", value1, value2, "vuserid");
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