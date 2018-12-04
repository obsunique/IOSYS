package com.example.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table groups
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public GroupsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groups
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table groups
     *
     * @mbggenerated
     */
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

        public Criteria andGroupsidIsNull() {
            addCriterion("groupsid is null");
            return (Criteria) this;
        }

        public Criteria andGroupsidIsNotNull() {
            addCriterion("groupsid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsidEqualTo(Integer value) {
            addCriterion("groupsid =", value, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidNotEqualTo(Integer value) {
            addCriterion("groupsid <>", value, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidGreaterThan(Integer value) {
            addCriterion("groupsid >", value, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupsid >=", value, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidLessThan(Integer value) {
            addCriterion("groupsid <", value, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidLessThanOrEqualTo(Integer value) {
            addCriterion("groupsid <=", value, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidIn(List<Integer> values) {
            addCriterion("groupsid in", values, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidNotIn(List<Integer> values) {
            addCriterion("groupsid not in", values, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidBetween(Integer value1, Integer value2) {
            addCriterion("groupsid between", value1, value2, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupsid not between", value1, value2, "groupsid");
            return (Criteria) this;
        }

        public Criteria andGroupsnameIsNull() {
            addCriterion("groupsname is null");
            return (Criteria) this;
        }

        public Criteria andGroupsnameIsNotNull() {
            addCriterion("groupsname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsnameEqualTo(String value) {
            addCriterion("groupsname =", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameNotEqualTo(String value) {
            addCriterion("groupsname <>", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameGreaterThan(String value) {
            addCriterion("groupsname >", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupsname >=", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameLessThan(String value) {
            addCriterion("groupsname <", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameLessThanOrEqualTo(String value) {
            addCriterion("groupsname <=", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameLike(String value) {
            addCriterion("groupsname like", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameNotLike(String value) {
            addCriterion("groupsname not like", value, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameIn(List<String> values) {
            addCriterion("groupsname in", values, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameNotIn(List<String> values) {
            addCriterion("groupsname not in", values, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameBetween(String value1, String value2) {
            addCriterion("groupsname between", value1, value2, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsnameNotBetween(String value1, String value2) {
            addCriterion("groupsname not between", value1, value2, "groupsname");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoIsNull() {
            addCriterion("groupsinfo is null");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoIsNotNull() {
            addCriterion("groupsinfo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoEqualTo(String value) {
            addCriterion("groupsinfo =", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoNotEqualTo(String value) {
            addCriterion("groupsinfo <>", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoGreaterThan(String value) {
            addCriterion("groupsinfo >", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoGreaterThanOrEqualTo(String value) {
            addCriterion("groupsinfo >=", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoLessThan(String value) {
            addCriterion("groupsinfo <", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoLessThanOrEqualTo(String value) {
            addCriterion("groupsinfo <=", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoLike(String value) {
            addCriterion("groupsinfo like", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoNotLike(String value) {
            addCriterion("groupsinfo not like", value, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoIn(List<String> values) {
            addCriterion("groupsinfo in", values, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoNotIn(List<String> values) {
            addCriterion("groupsinfo not in", values, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoBetween(String value1, String value2) {
            addCriterion("groupsinfo between", value1, value2, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsinfoNotBetween(String value1, String value2) {
            addCriterion("groupsinfo not between", value1, value2, "groupsinfo");
            return (Criteria) this;
        }

        public Criteria andGroupsownerIsNull() {
            addCriterion("groupsowner is null");
            return (Criteria) this;
        }

        public Criteria andGroupsownerIsNotNull() {
            addCriterion("groupsowner is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsownerEqualTo(Integer value) {
            addCriterion("groupsowner =", value, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerNotEqualTo(Integer value) {
            addCriterion("groupsowner <>", value, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerGreaterThan(Integer value) {
            addCriterion("groupsowner >", value, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupsowner >=", value, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerLessThan(Integer value) {
            addCriterion("groupsowner <", value, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerLessThanOrEqualTo(Integer value) {
            addCriterion("groupsowner <=", value, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerIn(List<Integer> values) {
            addCriterion("groupsowner in", values, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerNotIn(List<Integer> values) {
            addCriterion("groupsowner not in", values, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerBetween(Integer value1, Integer value2) {
            addCriterion("groupsowner between", value1, value2, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andGroupsownerNotBetween(Integer value1, Integer value2) {
            addCriterion("groupsowner not between", value1, value2, "groupsowner");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("workTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("workTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterion("workTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterion("workTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterion("workTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("workTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterion("workTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterion("workTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterion("workTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterion("workTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterion("workTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterion("workTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table groups
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table groups
     *
     * @mbggenerated
     */
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