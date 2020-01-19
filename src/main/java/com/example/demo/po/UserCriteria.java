package com.example.demo.po;

import java.util.ArrayList;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCriteria() {
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

        public Criteria andVnicknameIsNull() {
            addCriterion("vNickName is null");
            return (Criteria) this;
        }

        public Criteria andVnicknameIsNotNull() {
            addCriterion("vNickName is not null");
            return (Criteria) this;
        }

        public Criteria andVnicknameEqualTo(String value) {
            addCriterion("vNickName =", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameNotEqualTo(String value) {
            addCriterion("vNickName <>", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameGreaterThan(String value) {
            addCriterion("vNickName >", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("vNickName >=", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameLessThan(String value) {
            addCriterion("vNickName <", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameLessThanOrEqualTo(String value) {
            addCriterion("vNickName <=", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameLike(String value) {
            addCriterion("vNickName like", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameNotLike(String value) {
            addCriterion("vNickName not like", value, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameIn(List<String> values) {
            addCriterion("vNickName in", values, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameNotIn(List<String> values) {
            addCriterion("vNickName not in", values, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameBetween(String value1, String value2) {
            addCriterion("vNickName between", value1, value2, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVnicknameNotBetween(String value1, String value2) {
            addCriterion("vNickName not between", value1, value2, "vnickname");
            return (Criteria) this;
        }

        public Criteria andVusernameIsNull() {
            addCriterion("vUserName is null");
            return (Criteria) this;
        }

        public Criteria andVusernameIsNotNull() {
            addCriterion("vUserName is not null");
            return (Criteria) this;
        }

        public Criteria andVusernameEqualTo(String value) {
            addCriterion("vUserName =", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotEqualTo(String value) {
            addCriterion("vUserName <>", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameGreaterThan(String value) {
            addCriterion("vUserName >", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameGreaterThanOrEqualTo(String value) {
            addCriterion("vUserName >=", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameLessThan(String value) {
            addCriterion("vUserName <", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameLessThanOrEqualTo(String value) {
            addCriterion("vUserName <=", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameLike(String value) {
            addCriterion("vUserName like", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotLike(String value) {
            addCriterion("vUserName not like", value, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameIn(List<String> values) {
            addCriterion("vUserName in", values, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotIn(List<String> values) {
            addCriterion("vUserName not in", values, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameBetween(String value1, String value2) {
            addCriterion("vUserName between", value1, value2, "vusername");
            return (Criteria) this;
        }

        public Criteria andVusernameNotBetween(String value1, String value2) {
            addCriterion("vUserName not between", value1, value2, "vusername");
            return (Criteria) this;
        }

        public Criteria andVpasswordIsNull() {
            addCriterion("vPassword is null");
            return (Criteria) this;
        }

        public Criteria andVpasswordIsNotNull() {
            addCriterion("vPassword is not null");
            return (Criteria) this;
        }

        public Criteria andVpasswordEqualTo(String value) {
            addCriterion("vPassword =", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotEqualTo(String value) {
            addCriterion("vPassword <>", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordGreaterThan(String value) {
            addCriterion("vPassword >", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("vPassword >=", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordLessThan(String value) {
            addCriterion("vPassword <", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordLessThanOrEqualTo(String value) {
            addCriterion("vPassword <=", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordLike(String value) {
            addCriterion("vPassword like", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotLike(String value) {
            addCriterion("vPassword not like", value, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordIn(List<String> values) {
            addCriterion("vPassword in", values, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotIn(List<String> values) {
            addCriterion("vPassword not in", values, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordBetween(String value1, String value2) {
            addCriterion("vPassword between", value1, value2, "vpassword");
            return (Criteria) this;
        }

        public Criteria andVpasswordNotBetween(String value1, String value2) {
            addCriterion("vPassword not between", value1, value2, "vpassword");
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

        public Criteria andVcompanyIsNull() {
            addCriterion("vCompany is null");
            return (Criteria) this;
        }

        public Criteria andVcompanyIsNotNull() {
            addCriterion("vCompany is not null");
            return (Criteria) this;
        }

        public Criteria andVcompanyEqualTo(String value) {
            addCriterion("vCompany =", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyNotEqualTo(String value) {
            addCriterion("vCompany <>", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyGreaterThan(String value) {
            addCriterion("vCompany >", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("vCompany >=", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyLessThan(String value) {
            addCriterion("vCompany <", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyLessThanOrEqualTo(String value) {
            addCriterion("vCompany <=", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyLike(String value) {
            addCriterion("vCompany like", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyNotLike(String value) {
            addCriterion("vCompany not like", value, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyIn(List<String> values) {
            addCriterion("vCompany in", values, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyNotIn(List<String> values) {
            addCriterion("vCompany not in", values, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyBetween(String value1, String value2) {
            addCriterion("vCompany between", value1, value2, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVcompanyNotBetween(String value1, String value2) {
            addCriterion("vCompany not between", value1, value2, "vcompany");
            return (Criteria) this;
        }

        public Criteria andVidcardIsNull() {
            addCriterion("vIdCard is null");
            return (Criteria) this;
        }

        public Criteria andVidcardIsNotNull() {
            addCriterion("vIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andVidcardEqualTo(String value) {
            addCriterion("vIdCard =", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardNotEqualTo(String value) {
            addCriterion("vIdCard <>", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardGreaterThan(String value) {
            addCriterion("vIdCard >", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardGreaterThanOrEqualTo(String value) {
            addCriterion("vIdCard >=", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardLessThan(String value) {
            addCriterion("vIdCard <", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardLessThanOrEqualTo(String value) {
            addCriterion("vIdCard <=", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardLike(String value) {
            addCriterion("vIdCard like", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardNotLike(String value) {
            addCriterion("vIdCard not like", value, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardIn(List<String> values) {
            addCriterion("vIdCard in", values, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardNotIn(List<String> values) {
            addCriterion("vIdCard not in", values, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardBetween(String value1, String value2) {
            addCriterion("vIdCard between", value1, value2, "vidcard");
            return (Criteria) this;
        }

        public Criteria andVidcardNotBetween(String value1, String value2) {
            addCriterion("vIdCard not between", value1, value2, "vidcard");
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