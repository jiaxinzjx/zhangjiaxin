package com.example.demo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderItemCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemCriteria() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andVorderidIsNull() {
            addCriterion("vOrderId is null");
            return (Criteria) this;
        }

        public Criteria andVorderidIsNotNull() {
            addCriterion("vOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andVorderidEqualTo(String value) {
            addCriterion("vOrderId =", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidNotEqualTo(String value) {
            addCriterion("vOrderId <>", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidGreaterThan(String value) {
            addCriterion("vOrderId >", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidGreaterThanOrEqualTo(String value) {
            addCriterion("vOrderId >=", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidLessThan(String value) {
            addCriterion("vOrderId <", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidLessThanOrEqualTo(String value) {
            addCriterion("vOrderId <=", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidLike(String value) {
            addCriterion("vOrderId like", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidNotLike(String value) {
            addCriterion("vOrderId not like", value, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidIn(List<String> values) {
            addCriterion("vOrderId in", values, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidNotIn(List<String> values) {
            addCriterion("vOrderId not in", values, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidBetween(String value1, String value2) {
            addCriterion("vOrderId between", value1, value2, "vorderid");
            return (Criteria) this;
        }

        public Criteria andVorderidNotBetween(String value1, String value2) {
            addCriterion("vOrderId not between", value1, value2, "vorderid");
            return (Criteria) this;
        }

        public Criteria andDdateIsNull() {
            addCriterion("dDate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("dDate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(Date value) {
            addCriterion("dDate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(Date value) {
            addCriterion("dDate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(Date value) {
            addCriterion("dDate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dDate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(Date value) {
            addCriterion("dDate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(Date value) {
            addCriterion("dDate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<Date> values) {
            addCriterion("dDate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<Date> values) {
            addCriterion("dDate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(Date value1, Date value2) {
            addCriterion("dDate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(Date value1, Date value2) {
            addCriterion("dDate not between", value1, value2, "ddate");
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

        public Criteria andVgoodstitleIsNull() {
            addCriterion("vGoodsTitle is null");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleIsNotNull() {
            addCriterion("vGoodsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleEqualTo(String value) {
            addCriterion("vGoodsTitle =", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleNotEqualTo(String value) {
            addCriterion("vGoodsTitle <>", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleGreaterThan(String value) {
            addCriterion("vGoodsTitle >", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleGreaterThanOrEqualTo(String value) {
            addCriterion("vGoodsTitle >=", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleLessThan(String value) {
            addCriterion("vGoodsTitle <", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleLessThanOrEqualTo(String value) {
            addCriterion("vGoodsTitle <=", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleLike(String value) {
            addCriterion("vGoodsTitle like", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleNotLike(String value) {
            addCriterion("vGoodsTitle not like", value, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleIn(List<String> values) {
            addCriterion("vGoodsTitle in", values, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleNotIn(List<String> values) {
            addCriterion("vGoodsTitle not in", values, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleBetween(String value1, String value2) {
            addCriterion("vGoodsTitle between", value1, value2, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVgoodstitleNotBetween(String value1, String value2) {
            addCriterion("vGoodsTitle not between", value1, value2, "vgoodstitle");
            return (Criteria) this;
        }

        public Criteria andVspecIsNull() {
            addCriterion("vSpec is null");
            return (Criteria) this;
        }

        public Criteria andVspecIsNotNull() {
            addCriterion("vSpec is not null");
            return (Criteria) this;
        }

        public Criteria andVspecEqualTo(String value) {
            addCriterion("vSpec =", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecNotEqualTo(String value) {
            addCriterion("vSpec <>", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecGreaterThan(String value) {
            addCriterion("vSpec >", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecGreaterThanOrEqualTo(String value) {
            addCriterion("vSpec >=", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecLessThan(String value) {
            addCriterion("vSpec <", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecLessThanOrEqualTo(String value) {
            addCriterion("vSpec <=", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecLike(String value) {
            addCriterion("vSpec like", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecNotLike(String value) {
            addCriterion("vSpec not like", value, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecIn(List<String> values) {
            addCriterion("vSpec in", values, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecNotIn(List<String> values) {
            addCriterion("vSpec not in", values, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecBetween(String value1, String value2) {
            addCriterion("vSpec between", value1, value2, "vspec");
            return (Criteria) this;
        }

        public Criteria andVspecNotBetween(String value1, String value2) {
            addCriterion("vSpec not between", value1, value2, "vspec");
            return (Criteria) this;
        }

        public Criteria andVunitIsNull() {
            addCriterion("vUnit is null");
            return (Criteria) this;
        }

        public Criteria andVunitIsNotNull() {
            addCriterion("vUnit is not null");
            return (Criteria) this;
        }

        public Criteria andVunitEqualTo(String value) {
            addCriterion("vUnit =", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotEqualTo(String value) {
            addCriterion("vUnit <>", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitGreaterThan(String value) {
            addCriterion("vUnit >", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitGreaterThanOrEqualTo(String value) {
            addCriterion("vUnit >=", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitLessThan(String value) {
            addCriterion("vUnit <", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitLessThanOrEqualTo(String value) {
            addCriterion("vUnit <=", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitLike(String value) {
            addCriterion("vUnit like", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotLike(String value) {
            addCriterion("vUnit not like", value, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitIn(List<String> values) {
            addCriterion("vUnit in", values, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotIn(List<String> values) {
            addCriterion("vUnit not in", values, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitBetween(String value1, String value2) {
            addCriterion("vUnit between", value1, value2, "vunit");
            return (Criteria) this;
        }

        public Criteria andVunitNotBetween(String value1, String value2) {
            addCriterion("vUnit not between", value1, value2, "vunit");
            return (Criteria) this;
        }

        public Criteria andMpriceIsNull() {
            addCriterion("mPrice is null");
            return (Criteria) this;
        }

        public Criteria andMpriceIsNotNull() {
            addCriterion("mPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMpriceEqualTo(Integer value) {
            addCriterion("mPrice =", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotEqualTo(Integer value) {
            addCriterion("mPrice <>", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceGreaterThan(Integer value) {
            addCriterion("mPrice >", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("mPrice >=", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceLessThan(Integer value) {
            addCriterion("mPrice <", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceLessThanOrEqualTo(Integer value) {
            addCriterion("mPrice <=", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceIn(List<Integer> values) {
            addCriterion("mPrice in", values, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotIn(List<Integer> values) {
            addCriterion("mPrice not in", values, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceBetween(Integer value1, Integer value2) {
            addCriterion("mPrice between", value1, value2, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("mPrice not between", value1, value2, "mprice");
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

        public Criteria andMmoneyIsNull() {
            addCriterion("mMoney is null");
            return (Criteria) this;
        }

        public Criteria andMmoneyIsNotNull() {
            addCriterion("mMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMmoneyEqualTo(Integer value) {
            addCriterion("mMoney =", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotEqualTo(Integer value) {
            addCriterion("mMoney <>", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyGreaterThan(Integer value) {
            addCriterion("mMoney >", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("mMoney >=", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLessThan(Integer value) {
            addCriterion("mMoney <", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("mMoney <=", value, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyIn(List<Integer> values) {
            addCriterion("mMoney in", values, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotIn(List<Integer> values) {
            addCriterion("mMoney not in", values, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyBetween(Integer value1, Integer value2) {
            addCriterion("mMoney between", value1, value2, "mmoney");
            return (Criteria) this;
        }

        public Criteria andMmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("mMoney not between", value1, value2, "mmoney");
            return (Criteria) this;
        }

        public Criteria andVimageIsNull() {
            addCriterion("vImage is null");
            return (Criteria) this;
        }

        public Criteria andVimageIsNotNull() {
            addCriterion("vImage is not null");
            return (Criteria) this;
        }

        public Criteria andVimageEqualTo(String value) {
            addCriterion("vImage =", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageNotEqualTo(String value) {
            addCriterion("vImage <>", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageGreaterThan(String value) {
            addCriterion("vImage >", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageGreaterThanOrEqualTo(String value) {
            addCriterion("vImage >=", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageLessThan(String value) {
            addCriterion("vImage <", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageLessThanOrEqualTo(String value) {
            addCriterion("vImage <=", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageLike(String value) {
            addCriterion("vImage like", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageNotLike(String value) {
            addCriterion("vImage not like", value, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageIn(List<String> values) {
            addCriterion("vImage in", values, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageNotIn(List<String> values) {
            addCriterion("vImage not in", values, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageBetween(String value1, String value2) {
            addCriterion("vImage between", value1, value2, "vimage");
            return (Criteria) this;
        }

        public Criteria andVimageNotBetween(String value1, String value2) {
            addCriterion("vImage not between", value1, value2, "vimage");
            return (Criteria) this;
        }

        public Criteria andVsupplieridIsNull() {
            addCriterion("vSupplierId is null");
            return (Criteria) this;
        }

        public Criteria andVsupplieridIsNotNull() {
            addCriterion("vSupplierId is not null");
            return (Criteria) this;
        }

        public Criteria andVsupplieridEqualTo(Integer value) {
            addCriterion("vSupplierId =", value, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridNotEqualTo(Integer value) {
            addCriterion("vSupplierId <>", value, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridGreaterThan(Integer value) {
            addCriterion("vSupplierId >", value, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("vSupplierId >=", value, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridLessThan(Integer value) {
            addCriterion("vSupplierId <", value, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("vSupplierId <=", value, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridIn(List<Integer> values) {
            addCriterion("vSupplierId in", values, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridNotIn(List<Integer> values) {
            addCriterion("vSupplierId not in", values, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridBetween(Integer value1, Integer value2) {
            addCriterion("vSupplierId between", value1, value2, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("vSupplierId not between", value1, value2, "vsupplierid");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleIsNull() {
            addCriterion("vSupplierTitle is null");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleIsNotNull() {
            addCriterion("vSupplierTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleEqualTo(String value) {
            addCriterion("vSupplierTitle =", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleNotEqualTo(String value) {
            addCriterion("vSupplierTitle <>", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleGreaterThan(String value) {
            addCriterion("vSupplierTitle >", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleGreaterThanOrEqualTo(String value) {
            addCriterion("vSupplierTitle >=", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleLessThan(String value) {
            addCriterion("vSupplierTitle <", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleLessThanOrEqualTo(String value) {
            addCriterion("vSupplierTitle <=", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleLike(String value) {
            addCriterion("vSupplierTitle like", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleNotLike(String value) {
            addCriterion("vSupplierTitle not like", value, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleIn(List<String> values) {
            addCriterion("vSupplierTitle in", values, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleNotIn(List<String> values) {
            addCriterion("vSupplierTitle not in", values, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleBetween(String value1, String value2) {
            addCriterion("vSupplierTitle between", value1, value2, "vsuppliertitle");
            return (Criteria) this;
        }

        public Criteria andVsuppliertitleNotBetween(String value1, String value2) {
            addCriterion("vSupplierTitle not between", value1, value2, "vsuppliertitle");
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