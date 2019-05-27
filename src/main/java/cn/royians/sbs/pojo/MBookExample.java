package cn.royians.sbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MBookExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("B_ID is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("B_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("B_ID =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("B_ID <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("B_ID >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("B_ID >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("B_ID <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("B_ID <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("B_ID in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("B_ID not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("B_ID between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("B_ID not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBUidIsNull() {
            addCriterion("B_UID is null");
            return (Criteria) this;
        }

        public Criteria andBUidIsNotNull() {
            addCriterion("B_UID is not null");
            return (Criteria) this;
        }

        public Criteria andBUidEqualTo(Integer value) {
            addCriterion("B_UID =", value, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidNotEqualTo(Integer value) {
            addCriterion("B_UID <>", value, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidGreaterThan(Integer value) {
            addCriterion("B_UID >", value, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("B_UID >=", value, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidLessThan(Integer value) {
            addCriterion("B_UID <", value, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidLessThanOrEqualTo(Integer value) {
            addCriterion("B_UID <=", value, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidIn(List<Integer> values) {
            addCriterion("B_UID in", values, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidNotIn(List<Integer> values) {
            addCriterion("B_UID not in", values, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidBetween(Integer value1, Integer value2) {
            addCriterion("B_UID between", value1, value2, "bUid");
            return (Criteria) this;
        }

        public Criteria andBUidNotBetween(Integer value1, Integer value2) {
            addCriterion("B_UID not between", value1, value2, "bUid");
            return (Criteria) this;
        }

        public Criteria andBGidIsNull() {
            addCriterion("B_GID is null");
            return (Criteria) this;
        }

        public Criteria andBGidIsNotNull() {
            addCriterion("B_GID is not null");
            return (Criteria) this;
        }

        public Criteria andBGidEqualTo(Integer value) {
            addCriterion("B_GID =", value, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidNotEqualTo(Integer value) {
            addCriterion("B_GID <>", value, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidGreaterThan(Integer value) {
            addCriterion("B_GID >", value, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("B_GID >=", value, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidLessThan(Integer value) {
            addCriterion("B_GID <", value, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidLessThanOrEqualTo(Integer value) {
            addCriterion("B_GID <=", value, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidIn(List<Integer> values) {
            addCriterion("B_GID in", values, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidNotIn(List<Integer> values) {
            addCriterion("B_GID not in", values, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidBetween(Integer value1, Integer value2) {
            addCriterion("B_GID between", value1, value2, "bGid");
            return (Criteria) this;
        }

        public Criteria andBGidNotBetween(Integer value1, Integer value2) {
            addCriterion("B_GID not between", value1, value2, "bGid");
            return (Criteria) this;
        }

        public Criteria andBTitleIsNull() {
            addCriterion("B_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andBTitleIsNotNull() {
            addCriterion("B_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andBTitleEqualTo(String value) {
            addCriterion("B_TITLE =", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotEqualTo(String value) {
            addCriterion("B_TITLE <>", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleGreaterThan(String value) {
            addCriterion("B_TITLE >", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleGreaterThanOrEqualTo(String value) {
            addCriterion("B_TITLE >=", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLessThan(String value) {
            addCriterion("B_TITLE <", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLessThanOrEqualTo(String value) {
            addCriterion("B_TITLE <=", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLike(String value) {
            addCriterion("B_TITLE like", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotLike(String value) {
            addCriterion("B_TITLE not like", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleIn(List<String> values) {
            addCriterion("B_TITLE in", values, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotIn(List<String> values) {
            addCriterion("B_TITLE not in", values, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleBetween(String value1, String value2) {
            addCriterion("B_TITLE between", value1, value2, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotBetween(String value1, String value2) {
            addCriterion("B_TITLE not between", value1, value2, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBDescriptionIsNull() {
            addCriterion("B_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andBDescriptionIsNotNull() {
            addCriterion("B_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andBDescriptionEqualTo(String value) {
            addCriterion("B_DESCRIPTION =", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionNotEqualTo(String value) {
            addCriterion("B_DESCRIPTION <>", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionGreaterThan(String value) {
            addCriterion("B_DESCRIPTION >", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("B_DESCRIPTION >=", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionLessThan(String value) {
            addCriterion("B_DESCRIPTION <", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionLessThanOrEqualTo(String value) {
            addCriterion("B_DESCRIPTION <=", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionLike(String value) {
            addCriterion("B_DESCRIPTION like", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionNotLike(String value) {
            addCriterion("B_DESCRIPTION not like", value, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionIn(List<String> values) {
            addCriterion("B_DESCRIPTION in", values, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionNotIn(List<String> values) {
            addCriterion("B_DESCRIPTION not in", values, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionBetween(String value1, String value2) {
            addCriterion("B_DESCRIPTION between", value1, value2, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBDescriptionNotBetween(String value1, String value2) {
            addCriterion("B_DESCRIPTION not between", value1, value2, "bDescription");
            return (Criteria) this;
        }

        public Criteria andBContentIsNull() {
            addCriterion("B_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andBContentIsNotNull() {
            addCriterion("B_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andBContentEqualTo(String value) {
            addCriterion("B_CONTENT =", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentNotEqualTo(String value) {
            addCriterion("B_CONTENT <>", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentGreaterThan(String value) {
            addCriterion("B_CONTENT >", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentGreaterThanOrEqualTo(String value) {
            addCriterion("B_CONTENT >=", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentLessThan(String value) {
            addCriterion("B_CONTENT <", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentLessThanOrEqualTo(String value) {
            addCriterion("B_CONTENT <=", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentLike(String value) {
            addCriterion("B_CONTENT like", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentNotLike(String value) {
            addCriterion("B_CONTENT not like", value, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentIn(List<String> values) {
            addCriterion("B_CONTENT in", values, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentNotIn(List<String> values) {
            addCriterion("B_CONTENT not in", values, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentBetween(String value1, String value2) {
            addCriterion("B_CONTENT between", value1, value2, "bContent");
            return (Criteria) this;
        }

        public Criteria andBContentNotBetween(String value1, String value2) {
            addCriterion("B_CONTENT not between", value1, value2, "bContent");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeIsNull() {
            addCriterion("B_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeIsNotNull() {
            addCriterion("B_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeEqualTo(Date value) {
            addCriterion("B_CREATE_TIME =", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeNotEqualTo(Date value) {
            addCriterion("B_CREATE_TIME <>", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeGreaterThan(Date value) {
            addCriterion("B_CREATE_TIME >", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("B_CREATE_TIME >=", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeLessThan(Date value) {
            addCriterion("B_CREATE_TIME <", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("B_CREATE_TIME <=", value, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeIn(List<Date> values) {
            addCriterion("B_CREATE_TIME in", values, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeNotIn(List<Date> values) {
            addCriterion("B_CREATE_TIME not in", values, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeBetween(Date value1, Date value2) {
            addCriterion("B_CREATE_TIME between", value1, value2, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("B_CREATE_TIME not between", value1, value2, "bCreateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeIsNull() {
            addCriterion("B_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeIsNotNull() {
            addCriterion("B_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeEqualTo(Date value) {
            addCriterion("B_UPDATE_TIME =", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeNotEqualTo(Date value) {
            addCriterion("B_UPDATE_TIME <>", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeGreaterThan(Date value) {
            addCriterion("B_UPDATE_TIME >", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("B_UPDATE_TIME >=", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeLessThan(Date value) {
            addCriterion("B_UPDATE_TIME <", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("B_UPDATE_TIME <=", value, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeIn(List<Date> values) {
            addCriterion("B_UPDATE_TIME in", values, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeNotIn(List<Date> values) {
            addCriterion("B_UPDATE_TIME not in", values, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("B_UPDATE_TIME between", value1, value2, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("B_UPDATE_TIME not between", value1, value2, "bUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBIsDelIsNull() {
            addCriterion("B_IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andBIsDelIsNotNull() {
            addCriterion("B_IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andBIsDelEqualTo(Boolean value) {
            addCriterion("B_IS_DEL =", value, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelNotEqualTo(Boolean value) {
            addCriterion("B_IS_DEL <>", value, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelGreaterThan(Boolean value) {
            addCriterion("B_IS_DEL >", value, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("B_IS_DEL >=", value, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelLessThan(Boolean value) {
            addCriterion("B_IS_DEL <", value, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("B_IS_DEL <=", value, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelIn(List<Boolean> values) {
            addCriterion("B_IS_DEL in", values, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelNotIn(List<Boolean> values) {
            addCriterion("B_IS_DEL not in", values, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("B_IS_DEL between", value1, value2, "bIsDel");
            return (Criteria) this;
        }

        public Criteria andBIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("B_IS_DEL not between", value1, value2, "bIsDel");
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