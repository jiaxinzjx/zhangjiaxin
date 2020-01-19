package com.example.demo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCriteria() {
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

        public Criteria andVcorpidIsNull() {
            addCriterion("vCorpId is null");
            return (Criteria) this;
        }

        public Criteria andVcorpidIsNotNull() {
            addCriterion("vCorpId is not null");
            return (Criteria) this;
        }

        public Criteria andVcorpidEqualTo(Integer value) {
            addCriterion("vCorpId =", value, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidNotEqualTo(Integer value) {
            addCriterion("vCorpId <>", value, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidGreaterThan(Integer value) {
            addCriterion("vCorpId >", value, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vCorpId >=", value, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidLessThan(Integer value) {
            addCriterion("vCorpId <", value, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidLessThanOrEqualTo(Integer value) {
            addCriterion("vCorpId <=", value, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidIn(List<Integer> values) {
            addCriterion("vCorpId in", values, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidNotIn(List<Integer> values) {
            addCriterion("vCorpId not in", values, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidBetween(Integer value1, Integer value2) {
            addCriterion("vCorpId between", value1, value2, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorpidNotBetween(Integer value1, Integer value2) {
            addCriterion("vCorpId not between", value1, value2, "vcorpid");
            return (Criteria) this;
        }

        public Criteria andVcorptitleIsNull() {
            addCriterion("vCorpTitle is null");
            return (Criteria) this;
        }

        public Criteria andVcorptitleIsNotNull() {
            addCriterion("vCorpTitle is not null");
            return (Criteria) this;
        }

        public Criteria andVcorptitleEqualTo(String value) {
            addCriterion("vCorpTitle =", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleNotEqualTo(String value) {
            addCriterion("vCorpTitle <>", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleGreaterThan(String value) {
            addCriterion("vCorpTitle >", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleGreaterThanOrEqualTo(String value) {
            addCriterion("vCorpTitle >=", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleLessThan(String value) {
            addCriterion("vCorpTitle <", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleLessThanOrEqualTo(String value) {
            addCriterion("vCorpTitle <=", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleLike(String value) {
            addCriterion("vCorpTitle like", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleNotLike(String value) {
            addCriterion("vCorpTitle not like", value, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleIn(List<String> values) {
            addCriterion("vCorpTitle in", values, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleNotIn(List<String> values) {
            addCriterion("vCorpTitle not in", values, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleBetween(String value1, String value2) {
            addCriterion("vCorpTitle between", value1, value2, "vcorptitle");
            return (Criteria) this;
        }

        public Criteria andVcorptitleNotBetween(String value1, String value2) {
            addCriterion("vCorpTitle not between", value1, value2, "vcorptitle");
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

        public Criteria andMpredecIsNull() {
            addCriterion("mPreDec is null");
            return (Criteria) this;
        }

        public Criteria andMpredecIsNotNull() {
            addCriterion("mPreDec is not null");
            return (Criteria) this;
        }

        public Criteria andMpredecEqualTo(Integer value) {
            addCriterion("mPreDec =", value, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecNotEqualTo(Integer value) {
            addCriterion("mPreDec <>", value, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecGreaterThan(Integer value) {
            addCriterion("mPreDec >", value, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecGreaterThanOrEqualTo(Integer value) {
            addCriterion("mPreDec >=", value, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecLessThan(Integer value) {
            addCriterion("mPreDec <", value, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecLessThanOrEqualTo(Integer value) {
            addCriterion("mPreDec <=", value, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecIn(List<Integer> values) {
            addCriterion("mPreDec in", values, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecNotIn(List<Integer> values) {
            addCriterion("mPreDec not in", values, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecBetween(Integer value1, Integer value2) {
            addCriterion("mPreDec between", value1, value2, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMpredecNotBetween(Integer value1, Integer value2) {
            addCriterion("mPreDec not between", value1, value2, "mpredec");
            return (Criteria) this;
        }

        public Criteria andMsumnetIsNull() {
            addCriterion("mSumNet is null");
            return (Criteria) this;
        }

        public Criteria andMsumnetIsNotNull() {
            addCriterion("mSumNet is not null");
            return (Criteria) this;
        }

        public Criteria andMsumnetEqualTo(Integer value) {
            addCriterion("mSumNet =", value, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetNotEqualTo(Integer value) {
            addCriterion("mSumNet <>", value, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetGreaterThan(Integer value) {
            addCriterion("mSumNet >", value, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetGreaterThanOrEqualTo(Integer value) {
            addCriterion("mSumNet >=", value, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetLessThan(Integer value) {
            addCriterion("mSumNet <", value, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetLessThanOrEqualTo(Integer value) {
            addCriterion("mSumNet <=", value, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetIn(List<Integer> values) {
            addCriterion("mSumNet in", values, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetNotIn(List<Integer> values) {
            addCriterion("mSumNet not in", values, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetBetween(Integer value1, Integer value2) {
            addCriterion("mSumNet between", value1, value2, "msumnet");
            return (Criteria) this;
        }

        public Criteria andMsumnetNotBetween(Integer value1, Integer value2) {
            addCriterion("mSumNet not between", value1, value2, "msumnet");
            return (Criteria) this;
        }

        public Criteria andDpaytimeIsNull() {
            addCriterion("dPayTime is null");
            return (Criteria) this;
        }

        public Criteria andDpaytimeIsNotNull() {
            addCriterion("dPayTime is not null");
            return (Criteria) this;
        }

        public Criteria andDpaytimeEqualTo(Integer value) {
            addCriterion("dPayTime =", value, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeNotEqualTo(Integer value) {
            addCriterion("dPayTime <>", value, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeGreaterThan(Integer value) {
            addCriterion("dPayTime >", value, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dPayTime >=", value, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeLessThan(Integer value) {
            addCriterion("dPayTime <", value, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("dPayTime <=", value, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeIn(List<Integer> values) {
            addCriterion("dPayTime in", values, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeNotIn(List<Integer> values) {
            addCriterion("dPayTime not in", values, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeBetween(Integer value1, Integer value2) {
            addCriterion("dPayTime between", value1, value2, "dpaytime");
            return (Criteria) this;
        }

        public Criteria andDpaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dPayTime not between", value1, value2, "dpaytime");
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

        public Criteria andVtypeIsNull() {
            addCriterion("vType is null");
            return (Criteria) this;
        }

        public Criteria andVtypeIsNotNull() {
            addCriterion("vType is not null");
            return (Criteria) this;
        }

        public Criteria andVtypeEqualTo(String value) {
            addCriterion("vType =", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotEqualTo(String value) {
            addCriterion("vType <>", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeGreaterThan(String value) {
            addCriterion("vType >", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeGreaterThanOrEqualTo(String value) {
            addCriterion("vType >=", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLessThan(String value) {
            addCriterion("vType <", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLessThanOrEqualTo(String value) {
            addCriterion("vType <=", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLike(String value) {
            addCriterion("vType like", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotLike(String value) {
            addCriterion("vType not like", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeIn(List<String> values) {
            addCriterion("vType in", values, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotIn(List<String> values) {
            addCriterion("vType not in", values, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeBetween(String value1, String value2) {
            addCriterion("vType between", value1, value2, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotBetween(String value1, String value2) {
            addCriterion("vType not between", value1, value2, "vtype");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vName is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vName is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vName =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vName <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vName >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vName >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vName <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vName <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vName like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vName not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vName in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vName not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vName between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vName not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVtelIsNull() {
            addCriterion("vTel is null");
            return (Criteria) this;
        }

        public Criteria andVtelIsNotNull() {
            addCriterion("vTel is not null");
            return (Criteria) this;
        }

        public Criteria andVtelEqualTo(String value) {
            addCriterion("vTel =", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelNotEqualTo(String value) {
            addCriterion("vTel <>", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelGreaterThan(String value) {
            addCriterion("vTel >", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelGreaterThanOrEqualTo(String value) {
            addCriterion("vTel >=", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelLessThan(String value) {
            addCriterion("vTel <", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelLessThanOrEqualTo(String value) {
            addCriterion("vTel <=", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelLike(String value) {
            addCriterion("vTel like", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelNotLike(String value) {
            addCriterion("vTel not like", value, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelIn(List<String> values) {
            addCriterion("vTel in", values, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelNotIn(List<String> values) {
            addCriterion("vTel not in", values, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelBetween(String value1, String value2) {
            addCriterion("vTel between", value1, value2, "vtel");
            return (Criteria) this;
        }

        public Criteria andVtelNotBetween(String value1, String value2) {
            addCriterion("vTel not between", value1, value2, "vtel");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNull() {
            addCriterion("vAddress is null");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNotNull() {
            addCriterion("vAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVaddressEqualTo(String value) {
            addCriterion("vAddress =", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotEqualTo(String value) {
            addCriterion("vAddress <>", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThan(String value) {
            addCriterion("vAddress >", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vAddress >=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThan(String value) {
            addCriterion("vAddress <", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThanOrEqualTo(String value) {
            addCriterion("vAddress <=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLike(String value) {
            addCriterion("vAddress like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotLike(String value) {
            addCriterion("vAddress not like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressIn(List<String> values) {
            addCriterion("vAddress in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotIn(List<String> values) {
            addCriterion("vAddress not in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressBetween(String value1, String value2) {
            addCriterion("vAddress between", value1, value2, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotBetween(String value1, String value2) {
            addCriterion("vAddress not between", value1, value2, "vaddress");
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