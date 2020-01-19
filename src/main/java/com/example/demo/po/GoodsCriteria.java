package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCriteria() {
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

        public Criteria andMpricesIsNull() {
            addCriterion("mPriceS is null");
            return (Criteria) this;
        }

        public Criteria andMpricesIsNotNull() {
            addCriterion("mPriceS is not null");
            return (Criteria) this;
        }

        public Criteria andMpricesEqualTo(Integer value) {
            addCriterion("mPriceS =", value, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesNotEqualTo(Integer value) {
            addCriterion("mPriceS <>", value, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesGreaterThan(Integer value) {
            addCriterion("mPriceS >", value, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesGreaterThanOrEqualTo(Integer value) {
            addCriterion("mPriceS >=", value, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesLessThan(Integer value) {
            addCriterion("mPriceS <", value, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesLessThanOrEqualTo(Integer value) {
            addCriterion("mPriceS <=", value, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesIn(List<Integer> values) {
            addCriterion("mPriceS in", values, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesNotIn(List<Integer> values) {
            addCriterion("mPriceS not in", values, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesBetween(Integer value1, Integer value2) {
            addCriterion("mPriceS between", value1, value2, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricesNotBetween(Integer value1, Integer value2) {
            addCriterion("mPriceS not between", value1, value2, "mprices");
            return (Criteria) this;
        }

        public Criteria andMpricepIsNull() {
            addCriterion("mPriceP is null");
            return (Criteria) this;
        }

        public Criteria andMpricepIsNotNull() {
            addCriterion("mPriceP is not null");
            return (Criteria) this;
        }

        public Criteria andMpricepEqualTo(Integer value) {
            addCriterion("mPriceP =", value, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepNotEqualTo(Integer value) {
            addCriterion("mPriceP <>", value, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepGreaterThan(Integer value) {
            addCriterion("mPriceP >", value, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepGreaterThanOrEqualTo(Integer value) {
            addCriterion("mPriceP >=", value, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepLessThan(Integer value) {
            addCriterion("mPriceP <", value, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepLessThanOrEqualTo(Integer value) {
            addCriterion("mPriceP <=", value, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepIn(List<Integer> values) {
            addCriterion("mPriceP in", values, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepNotIn(List<Integer> values) {
            addCriterion("mPriceP not in", values, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepBetween(Integer value1, Integer value2) {
            addCriterion("mPriceP between", value1, value2, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMpricepNotBetween(Integer value1, Integer value2) {
            addCriterion("mPriceP not between", value1, value2, "mpricep");
            return (Criteria) this;
        }

        public Criteria andMcostIsNull() {
            addCriterion("mCost is null");
            return (Criteria) this;
        }

        public Criteria andMcostIsNotNull() {
            addCriterion("mCost is not null");
            return (Criteria) this;
        }

        public Criteria andMcostEqualTo(Integer value) {
            addCriterion("mCost =", value, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostNotEqualTo(Integer value) {
            addCriterion("mCost <>", value, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostGreaterThan(Integer value) {
            addCriterion("mCost >", value, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostGreaterThanOrEqualTo(Integer value) {
            addCriterion("mCost >=", value, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostLessThan(Integer value) {
            addCriterion("mCost <", value, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostLessThanOrEqualTo(Integer value) {
            addCriterion("mCost <=", value, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostIn(List<Integer> values) {
            addCriterion("mCost in", values, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostNotIn(List<Integer> values) {
            addCriterion("mCost not in", values, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostBetween(Integer value1, Integer value2) {
            addCriterion("mCost between", value1, value2, "mcost");
            return (Criteria) this;
        }

        public Criteria andMcostNotBetween(Integer value1, Integer value2) {
            addCriterion("mCost not between", value1, value2, "mcost");
            return (Criteria) this;
        }

        public Criteria andMlimitIsNull() {
            addCriterion("mLimit is null");
            return (Criteria) this;
        }

        public Criteria andMlimitIsNotNull() {
            addCriterion("mLimit is not null");
            return (Criteria) this;
        }

        public Criteria andMlimitEqualTo(Integer value) {
            addCriterion("mLimit =", value, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitNotEqualTo(Integer value) {
            addCriterion("mLimit <>", value, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitGreaterThan(Integer value) {
            addCriterion("mLimit >", value, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("mLimit >=", value, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitLessThan(Integer value) {
            addCriterion("mLimit <", value, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitLessThanOrEqualTo(Integer value) {
            addCriterion("mLimit <=", value, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitIn(List<Integer> values) {
            addCriterion("mLimit in", values, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitNotIn(List<Integer> values) {
            addCriterion("mLimit not in", values, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitBetween(Integer value1, Integer value2) {
            addCriterion("mLimit between", value1, value2, "mlimit");
            return (Criteria) this;
        }

        public Criteria andMlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("mLimit not between", value1, value2, "mlimit");
            return (Criteria) this;
        }

        public Criteria andVstateIsNull() {
            addCriterion("vState is null");
            return (Criteria) this;
        }

        public Criteria andVstateIsNotNull() {
            addCriterion("vState is not null");
            return (Criteria) this;
        }

        public Criteria andVstateEqualTo(String value) {
            addCriterion("vState =", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotEqualTo(String value) {
            addCriterion("vState <>", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateGreaterThan(String value) {
            addCriterion("vState >", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateGreaterThanOrEqualTo(String value) {
            addCriterion("vState >=", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateLessThan(String value) {
            addCriterion("vState <", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateLessThanOrEqualTo(String value) {
            addCriterion("vState <=", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateLike(String value) {
            addCriterion("vState like", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotLike(String value) {
            addCriterion("vState not like", value, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateIn(List<String> values) {
            addCriterion("vState in", values, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotIn(List<String> values) {
            addCriterion("vState not in", values, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateBetween(String value1, String value2) {
            addCriterion("vState between", value1, value2, "vstate");
            return (Criteria) this;
        }

        public Criteria andVstateNotBetween(String value1, String value2) {
            addCriterion("vState not between", value1, value2, "vstate");
            return (Criteria) this;
        }

        public Criteria andVpropertyIsNull() {
            addCriterion("vProperty is null");
            return (Criteria) this;
        }

        public Criteria andVpropertyIsNotNull() {
            addCriterion("vProperty is not null");
            return (Criteria) this;
        }

        public Criteria andVpropertyEqualTo(String value) {
            addCriterion("vProperty =", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyNotEqualTo(String value) {
            addCriterion("vProperty <>", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyGreaterThan(String value) {
            addCriterion("vProperty >", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("vProperty >=", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyLessThan(String value) {
            addCriterion("vProperty <", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyLessThanOrEqualTo(String value) {
            addCriterion("vProperty <=", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyLike(String value) {
            addCriterion("vProperty like", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyNotLike(String value) {
            addCriterion("vProperty not like", value, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyIn(List<String> values) {
            addCriterion("vProperty in", values, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyNotIn(List<String> values) {
            addCriterion("vProperty not in", values, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyBetween(String value1, String value2) {
            addCriterion("vProperty between", value1, value2, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVpropertyNotBetween(String value1, String value2) {
            addCriterion("vProperty not between", value1, value2, "vproperty");
            return (Criteria) this;
        }

        public Criteria andVmemoIsNull() {
            addCriterion("vMemo is null");
            return (Criteria) this;
        }

        public Criteria andVmemoIsNotNull() {
            addCriterion("vMemo is not null");
            return (Criteria) this;
        }

        public Criteria andVmemoEqualTo(String value) {
            addCriterion("vMemo =", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoNotEqualTo(String value) {
            addCriterion("vMemo <>", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoGreaterThan(String value) {
            addCriterion("vMemo >", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoGreaterThanOrEqualTo(String value) {
            addCriterion("vMemo >=", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoLessThan(String value) {
            addCriterion("vMemo <", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoLessThanOrEqualTo(String value) {
            addCriterion("vMemo <=", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoLike(String value) {
            addCriterion("vMemo like", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoNotLike(String value) {
            addCriterion("vMemo not like", value, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoIn(List<String> values) {
            addCriterion("vMemo in", values, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoNotIn(List<String> values) {
            addCriterion("vMemo not in", values, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoBetween(String value1, String value2) {
            addCriterion("vMemo between", value1, value2, "vmemo");
            return (Criteria) this;
        }

        public Criteria andVmemoNotBetween(String value1, String value2) {
            addCriterion("vMemo not between", value1, value2, "vmemo");
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

        public Criteria andVurlIsNull() {
            addCriterion("vUrl is null");
            return (Criteria) this;
        }

        public Criteria andVurlIsNotNull() {
            addCriterion("vUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVurlEqualTo(String value) {
            addCriterion("vUrl =", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlNotEqualTo(String value) {
            addCriterion("vUrl <>", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlGreaterThan(String value) {
            addCriterion("vUrl >", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlGreaterThanOrEqualTo(String value) {
            addCriterion("vUrl >=", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlLessThan(String value) {
            addCriterion("vUrl <", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlLessThanOrEqualTo(String value) {
            addCriterion("vUrl <=", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlLike(String value) {
            addCriterion("vUrl like", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlNotLike(String value) {
            addCriterion("vUrl not like", value, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlIn(List<String> values) {
            addCriterion("vUrl in", values, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlNotIn(List<String> values) {
            addCriterion("vUrl not in", values, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlBetween(String value1, String value2) {
            addCriterion("vUrl between", value1, value2, "vurl");
            return (Criteria) this;
        }

        public Criteria andVurlNotBetween(String value1, String value2) {
            addCriterion("vUrl not between", value1, value2, "vurl");
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