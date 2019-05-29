package cn.royians.sbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MCourseExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCUidIsNull() {
            addCriterion("C_UID is null");
            return (Criteria) this;
        }

        public Criteria andCUidIsNotNull() {
            addCriterion("C_UID is not null");
            return (Criteria) this;
        }

        public Criteria andCUidEqualTo(Integer value) {
            addCriterion("C_UID =", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotEqualTo(Integer value) {
            addCriterion("C_UID <>", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThan(Integer value) {
            addCriterion("C_UID >", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_UID >=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThan(Integer value) {
            addCriterion("C_UID <", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThanOrEqualTo(Integer value) {
            addCriterion("C_UID <=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidIn(List<Integer> values) {
            addCriterion("C_UID in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotIn(List<Integer> values) {
            addCriterion("C_UID not in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidBetween(Integer value1, Integer value2) {
            addCriterion("C_UID between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotBetween(Integer value1, Integer value2) {
            addCriterion("C_UID not between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCContentIsNull() {
            addCriterion("C_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCContentIsNotNull() {
            addCriterion("C_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCContentEqualTo(String value) {
            addCriterion("C_CONTENT =", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotEqualTo(String value) {
            addCriterion("C_CONTENT <>", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThan(String value) {
            addCriterion("C_CONTENT >", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTENT >=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThan(String value) {
            addCriterion("C_CONTENT <", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLessThanOrEqualTo(String value) {
            addCriterion("C_CONTENT <=", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentLike(String value) {
            addCriterion("C_CONTENT like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotLike(String value) {
            addCriterion("C_CONTENT not like", value, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentIn(List<String> values) {
            addCriterion("C_CONTENT in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotIn(List<String> values) {
            addCriterion("C_CONTENT not in", values, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentBetween(String value1, String value2) {
            addCriterion("C_CONTENT between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCContentNotBetween(String value1, String value2) {
            addCriterion("C_CONTENT not between", value1, value2, "cContent");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsIsNull() {
            addCriterion("C_IMG_URLS is null");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsIsNotNull() {
            addCriterion("C_IMG_URLS is not null");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsEqualTo(String value) {
            addCriterion("C_IMG_URLS =", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsNotEqualTo(String value) {
            addCriterion("C_IMG_URLS <>", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsGreaterThan(String value) {
            addCriterion("C_IMG_URLS >", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("C_IMG_URLS >=", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsLessThan(String value) {
            addCriterion("C_IMG_URLS <", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsLessThanOrEqualTo(String value) {
            addCriterion("C_IMG_URLS <=", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsLike(String value) {
            addCriterion("C_IMG_URLS like", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsNotLike(String value) {
            addCriterion("C_IMG_URLS not like", value, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsIn(List<String> values) {
            addCriterion("C_IMG_URLS in", values, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsNotIn(List<String> values) {
            addCriterion("C_IMG_URLS not in", values, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsBetween(String value1, String value2) {
            addCriterion("C_IMG_URLS between", value1, value2, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCImgUrlsNotBetween(String value1, String value2) {
            addCriterion("C_IMG_URLS not between", value1, value2, "cImgUrls");
            return (Criteria) this;
        }

        public Criteria andCVidUrlIsNull() {
            addCriterion("C_VID_URL is null");
            return (Criteria) this;
        }

        public Criteria andCVidUrlIsNotNull() {
            addCriterion("C_VID_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCVidUrlEqualTo(String value) {
            addCriterion("C_VID_URL =", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlNotEqualTo(String value) {
            addCriterion("C_VID_URL <>", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlGreaterThan(String value) {
            addCriterion("C_VID_URL >", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlGreaterThanOrEqualTo(String value) {
            addCriterion("C_VID_URL >=", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlLessThan(String value) {
            addCriterion("C_VID_URL <", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlLessThanOrEqualTo(String value) {
            addCriterion("C_VID_URL <=", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlLike(String value) {
            addCriterion("C_VID_URL like", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlNotLike(String value) {
            addCriterion("C_VID_URL not like", value, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlIn(List<String> values) {
            addCriterion("C_VID_URL in", values, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlNotIn(List<String> values) {
            addCriterion("C_VID_URL not in", values, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlBetween(String value1, String value2) {
            addCriterion("C_VID_URL between", value1, value2, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCVidUrlNotBetween(String value1, String value2) {
            addCriterion("C_VID_URL not between", value1, value2, "cVidUrl");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNull() {
            addCriterion("C_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIsNotNull() {
            addCriterion("C_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeEqualTo(Date value) {
            addCriterion("C_CREATE_TIME =", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotEqualTo(Date value) {
            addCriterion("C_CREATE_TIME <>", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThan(Date value) {
            addCriterion("C_CREATE_TIME >", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_CREATE_TIME >=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThan(Date value) {
            addCriterion("C_CREATE_TIME <", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("C_CREATE_TIME <=", value, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeIn(List<Date> values) {
            addCriterion("C_CREATE_TIME in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotIn(List<Date> values) {
            addCriterion("C_CREATE_TIME not in", values, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeBetween(Date value1, Date value2) {
            addCriterion("C_CREATE_TIME between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("C_CREATE_TIME not between", value1, value2, "cCreateTime");
            return (Criteria) this;
        }

        public Criteria andCIsDelIsNull() {
            addCriterion("C_IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andCIsDelIsNotNull() {
            addCriterion("C_IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andCIsDelEqualTo(Boolean value) {
            addCriterion("C_IS_DEL =", value, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelNotEqualTo(Boolean value) {
            addCriterion("C_IS_DEL <>", value, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelGreaterThan(Boolean value) {
            addCriterion("C_IS_DEL >", value, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("C_IS_DEL >=", value, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelLessThan(Boolean value) {
            addCriterion("C_IS_DEL <", value, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("C_IS_DEL <=", value, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelIn(List<Boolean> values) {
            addCriterion("C_IS_DEL in", values, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelNotIn(List<Boolean> values) {
            addCriterion("C_IS_DEL not in", values, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("C_IS_DEL between", value1, value2, "cIsDel");
            return (Criteria) this;
        }

        public Criteria andCIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("C_IS_DEL not between", value1, value2, "cIsDel");
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