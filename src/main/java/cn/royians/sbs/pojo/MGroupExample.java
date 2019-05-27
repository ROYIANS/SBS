package cn.royians.sbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MGroupExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("G_ID is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("G_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("G_ID =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("G_ID <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("G_ID >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_ID >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("G_ID <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("G_ID <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("G_ID in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("G_ID not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("G_ID between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("G_ID not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("G_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("G_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("G_NAME =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("G_NAME <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("G_NAME >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("G_NAME >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("G_NAME <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("G_NAME <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("G_NAME like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("G_NAME not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("G_NAME in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("G_NAME not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("G_NAME between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("G_NAME not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlIsNull() {
            addCriterion("G_AVATARURL is null");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlIsNotNull() {
            addCriterion("G_AVATARURL is not null");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlEqualTo(String value) {
            addCriterion("G_AVATARURL =", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlNotEqualTo(String value) {
            addCriterion("G_AVATARURL <>", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlGreaterThan(String value) {
            addCriterion("G_AVATARURL >", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlGreaterThanOrEqualTo(String value) {
            addCriterion("G_AVATARURL >=", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlLessThan(String value) {
            addCriterion("G_AVATARURL <", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlLessThanOrEqualTo(String value) {
            addCriterion("G_AVATARURL <=", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlLike(String value) {
            addCriterion("G_AVATARURL like", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlNotLike(String value) {
            addCriterion("G_AVATARURL not like", value, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlIn(List<String> values) {
            addCriterion("G_AVATARURL in", values, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlNotIn(List<String> values) {
            addCriterion("G_AVATARURL not in", values, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlBetween(String value1, String value2) {
            addCriterion("G_AVATARURL between", value1, value2, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGAvatarurlNotBetween(String value1, String value2) {
            addCriterion("G_AVATARURL not between", value1, value2, "gAvatarurl");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeIsNull() {
            addCriterion("G_REGESTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeIsNotNull() {
            addCriterion("G_REGESTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeEqualTo(Date value) {
            addCriterion("G_REGESTER_TIME =", value, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeNotEqualTo(Date value) {
            addCriterion("G_REGESTER_TIME <>", value, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeGreaterThan(Date value) {
            addCriterion("G_REGESTER_TIME >", value, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("G_REGESTER_TIME >=", value, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeLessThan(Date value) {
            addCriterion("G_REGESTER_TIME <", value, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeLessThanOrEqualTo(Date value) {
            addCriterion("G_REGESTER_TIME <=", value, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeIn(List<Date> values) {
            addCriterion("G_REGESTER_TIME in", values, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeNotIn(List<Date> values) {
            addCriterion("G_REGESTER_TIME not in", values, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeBetween(Date value1, Date value2) {
            addCriterion("G_REGESTER_TIME between", value1, value2, "gRegesterTime");
            return (Criteria) this;
        }

        public Criteria andGRegesterTimeNotBetween(Date value1, Date value2) {
            addCriterion("G_REGESTER_TIME not between", value1, value2, "gRegesterTime");
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