package cn.royians.sbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MUserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("U_ID is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("U_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("U_ID =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("U_ID <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("U_ID >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_ID >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("U_ID <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("U_ID <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("U_ID in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("U_ID not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("U_ID between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("U_ID not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNull() {
            addCriterion("U_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNotNull() {
            addCriterion("U_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andUOpenidEqualTo(String value) {
            addCriterion("U_OPENID =", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotEqualTo(String value) {
            addCriterion("U_OPENID <>", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThan(String value) {
            addCriterion("U_OPENID >", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("U_OPENID >=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThan(String value) {
            addCriterion("U_OPENID <", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThanOrEqualTo(String value) {
            addCriterion("U_OPENID <=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLike(String value) {
            addCriterion("U_OPENID like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotLike(String value) {
            addCriterion("U_OPENID not like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidIn(List<String> values) {
            addCriterion("U_OPENID in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotIn(List<String> values) {
            addCriterion("U_OPENID not in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidBetween(String value1, String value2) {
            addCriterion("U_OPENID between", value1, value2, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotBetween(String value1, String value2) {
            addCriterion("U_OPENID not between", value1, value2, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUGidIsNull() {
            addCriterion("U_GID is null");
            return (Criteria) this;
        }

        public Criteria andUGidIsNotNull() {
            addCriterion("U_GID is not null");
            return (Criteria) this;
        }

        public Criteria andUGidEqualTo(Integer value) {
            addCriterion("U_GID =", value, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidNotEqualTo(Integer value) {
            addCriterion("U_GID <>", value, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidGreaterThan(Integer value) {
            addCriterion("U_GID >", value, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_GID >=", value, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidLessThan(Integer value) {
            addCriterion("U_GID <", value, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidLessThanOrEqualTo(Integer value) {
            addCriterion("U_GID <=", value, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidIn(List<Integer> values) {
            addCriterion("U_GID in", values, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidNotIn(List<Integer> values) {
            addCriterion("U_GID not in", values, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidBetween(Integer value1, Integer value2) {
            addCriterion("U_GID between", value1, value2, "uGid");
            return (Criteria) this;
        }

        public Criteria andUGidNotBetween(Integer value1, Integer value2) {
            addCriterion("U_GID not between", value1, value2, "uGid");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyIsNull() {
            addCriterion("U_SESSION_KEY is null");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyIsNotNull() {
            addCriterion("U_SESSION_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyEqualTo(String value) {
            addCriterion("U_SESSION_KEY =", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyNotEqualTo(String value) {
            addCriterion("U_SESSION_KEY <>", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyGreaterThan(String value) {
            addCriterion("U_SESSION_KEY >", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("U_SESSION_KEY >=", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyLessThan(String value) {
            addCriterion("U_SESSION_KEY <", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("U_SESSION_KEY <=", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyLike(String value) {
            addCriterion("U_SESSION_KEY like", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyNotLike(String value) {
            addCriterion("U_SESSION_KEY not like", value, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyIn(List<String> values) {
            addCriterion("U_SESSION_KEY in", values, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyNotIn(List<String> values) {
            addCriterion("U_SESSION_KEY not in", values, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyBetween(String value1, String value2) {
            addCriterion("U_SESSION_KEY between", value1, value2, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andUSessionKeyNotBetween(String value1, String value2) {
            addCriterion("U_SESSION_KEY not between", value1, value2, "uSessionKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyIsNull() {
            addCriterion("U_3RD_KEY is null");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyIsNotNull() {
            addCriterion("U_3RD_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyEqualTo(String value) {
            addCriterion("U_3RD_KEY =", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyNotEqualTo(String value) {
            addCriterion("U_3RD_KEY <>", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyGreaterThan(String value) {
            addCriterion("U_3RD_KEY >", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyGreaterThanOrEqualTo(String value) {
            addCriterion("U_3RD_KEY >=", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyLessThan(String value) {
            addCriterion("U_3RD_KEY <", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyLessThanOrEqualTo(String value) {
            addCriterion("U_3RD_KEY <=", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyLike(String value) {
            addCriterion("U_3RD_KEY like", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyNotLike(String value) {
            addCriterion("U_3RD_KEY not like", value, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyIn(List<String> values) {
            addCriterion("U_3RD_KEY in", values, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyNotIn(List<String> values) {
            addCriterion("U_3RD_KEY not in", values, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyBetween(String value1, String value2) {
            addCriterion("U_3RD_KEY between", value1, value2, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andU3rdKeyNotBetween(String value1, String value2) {
            addCriterion("U_3RD_KEY not between", value1, value2, "u3rdKey");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("U_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("U_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("U_NICKNAME =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("U_NICKNAME <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("U_NICKNAME >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NICKNAME >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("U_NICKNAME <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("U_NICKNAME <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("U_NICKNAME like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("U_NICKNAME not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("U_NICKNAME in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("U_NICKNAME not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("U_NICKNAME between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("U_NICKNAME not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlIsNull() {
            addCriterion("U_AVATAR_URL is null");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlIsNotNull() {
            addCriterion("U_AVATAR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlEqualTo(String value) {
            addCriterion("U_AVATAR_URL =", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlNotEqualTo(String value) {
            addCriterion("U_AVATAR_URL <>", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlGreaterThan(String value) {
            addCriterion("U_AVATAR_URL >", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("U_AVATAR_URL >=", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlLessThan(String value) {
            addCriterion("U_AVATAR_URL <", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("U_AVATAR_URL <=", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlLike(String value) {
            addCriterion("U_AVATAR_URL like", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlNotLike(String value) {
            addCriterion("U_AVATAR_URL not like", value, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlIn(List<String> values) {
            addCriterion("U_AVATAR_URL in", values, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlNotIn(List<String> values) {
            addCriterion("U_AVATAR_URL not in", values, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlBetween(String value1, String value2) {
            addCriterion("U_AVATAR_URL between", value1, value2, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("U_AVATAR_URL not between", value1, value2, "uAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUCityIsNull() {
            addCriterion("U_CITY is null");
            return (Criteria) this;
        }

        public Criteria andUCityIsNotNull() {
            addCriterion("U_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andUCityEqualTo(String value) {
            addCriterion("U_CITY =", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotEqualTo(String value) {
            addCriterion("U_CITY <>", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThan(String value) {
            addCriterion("U_CITY >", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThanOrEqualTo(String value) {
            addCriterion("U_CITY >=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThan(String value) {
            addCriterion("U_CITY <", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThanOrEqualTo(String value) {
            addCriterion("U_CITY <=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLike(String value) {
            addCriterion("U_CITY like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotLike(String value) {
            addCriterion("U_CITY not like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityIn(List<String> values) {
            addCriterion("U_CITY in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotIn(List<String> values) {
            addCriterion("U_CITY not in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityBetween(String value1, String value2) {
            addCriterion("U_CITY between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotBetween(String value1, String value2) {
            addCriterion("U_CITY not between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andULanguageIsNull() {
            addCriterion("U_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andULanguageIsNotNull() {
            addCriterion("U_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andULanguageEqualTo(String value) {
            addCriterion("U_LANGUAGE =", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotEqualTo(String value) {
            addCriterion("U_LANGUAGE <>", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageGreaterThan(String value) {
            addCriterion("U_LANGUAGE >", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageGreaterThanOrEqualTo(String value) {
            addCriterion("U_LANGUAGE >=", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageLessThan(String value) {
            addCriterion("U_LANGUAGE <", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageLessThanOrEqualTo(String value) {
            addCriterion("U_LANGUAGE <=", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageLike(String value) {
            addCriterion("U_LANGUAGE like", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotLike(String value) {
            addCriterion("U_LANGUAGE not like", value, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageIn(List<String> values) {
            addCriterion("U_LANGUAGE in", values, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotIn(List<String> values) {
            addCriterion("U_LANGUAGE not in", values, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageBetween(String value1, String value2) {
            addCriterion("U_LANGUAGE between", value1, value2, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andULanguageNotBetween(String value1, String value2) {
            addCriterion("U_LANGUAGE not between", value1, value2, "uLanguage");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeIsNull() {
            addCriterion("U_REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeIsNotNull() {
            addCriterion("U_REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeEqualTo(Date value) {
            addCriterion("U_REGISTER_TIME =", value, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeNotEqualTo(Date value) {
            addCriterion("U_REGISTER_TIME <>", value, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeGreaterThan(Date value) {
            addCriterion("U_REGISTER_TIME >", value, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_REGISTER_TIME >=", value, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeLessThan(Date value) {
            addCriterion("U_REGISTER_TIME <", value, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("U_REGISTER_TIME <=", value, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeIn(List<Date> values) {
            addCriterion("U_REGISTER_TIME in", values, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeNotIn(List<Date> values) {
            addCriterion("U_REGISTER_TIME not in", values, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeBetween(Date value1, Date value2) {
            addCriterion("U_REGISTER_TIME between", value1, value2, "uRegisterTime");
            return (Criteria) this;
        }

        public Criteria andURegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("U_REGISTER_TIME not between", value1, value2, "uRegisterTime");
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