package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrainExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table train
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table train
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table train
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public TrainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
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
     * This method corresponds to the database table train
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
     * This method corresponds to the database table train
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table train
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
     * This class corresponds to the database table train
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

        public Criteria andTrainidIsNull() {
            addCriterion("trainid is null");
            return (Criteria) this;
        }

        public Criteria andTrainidIsNotNull() {
            addCriterion("trainid is not null");
            return (Criteria) this;
        }

        public Criteria andTrainidEqualTo(Integer value) {
            addCriterion("trainid =", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotEqualTo(Integer value) {
            addCriterion("trainid <>", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThan(Integer value) {
            addCriterion("trainid >", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainid >=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThan(Integer value) {
            addCriterion("trainid <", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThanOrEqualTo(Integer value) {
            addCriterion("trainid <=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidIn(List<Integer> values) {
            addCriterion("trainid in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotIn(List<Integer> values) {
            addCriterion("trainid not in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidBetween(Integer value1, Integer value2) {
            addCriterion("trainid between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotBetween(Integer value1, Integer value2) {
            addCriterion("trainid not between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andLinenumberIsNull() {
            addCriterion("lineNumber is null");
            return (Criteria) this;
        }

        public Criteria andLinenumberIsNotNull() {
            addCriterion("lineNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLinenumberEqualTo(String value) {
            addCriterion("lineNumber =", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotEqualTo(String value) {
            addCriterion("lineNumber <>", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberGreaterThan(String value) {
            addCriterion("lineNumber >", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberGreaterThanOrEqualTo(String value) {
            addCriterion("lineNumber >=", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLessThan(String value) {
            addCriterion("lineNumber <", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLessThanOrEqualTo(String value) {
            addCriterion("lineNumber <=", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberLike(String value) {
            addCriterion("lineNumber like", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotLike(String value) {
            addCriterion("lineNumber not like", value, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberIn(List<String> values) {
            addCriterion("lineNumber in", values, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotIn(List<String> values) {
            addCriterion("lineNumber not in", values, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberBetween(String value1, String value2) {
            addCriterion("lineNumber between", value1, value2, "linenumber");
            return (Criteria) this;
        }

        public Criteria andLinenumberNotBetween(String value1, String value2) {
            addCriterion("lineNumber not between", value1, value2, "linenumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberIsNull() {
            addCriterion("stationNumber is null");
            return (Criteria) this;
        }

        public Criteria andStationnumberIsNotNull() {
            addCriterion("stationNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStationnumberEqualTo(Integer value) {
            addCriterion("stationNumber =", value, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberNotEqualTo(Integer value) {
            addCriterion("stationNumber <>", value, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberGreaterThan(Integer value) {
            addCriterion("stationNumber >", value, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("stationNumber >=", value, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberLessThan(Integer value) {
            addCriterion("stationNumber <", value, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberLessThanOrEqualTo(Integer value) {
            addCriterion("stationNumber <=", value, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberIn(List<Integer> values) {
            addCriterion("stationNumber in", values, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberNotIn(List<Integer> values) {
            addCriterion("stationNumber not in", values, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberBetween(Integer value1, Integer value2) {
            addCriterion("stationNumber between", value1, value2, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("stationNumber not between", value1, value2, "stationnumber");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNull() {
            addCriterion("stationName is null");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNotNull() {
            addCriterion("stationName is not null");
            return (Criteria) this;
        }

        public Criteria andStationnameEqualTo(String value) {
            addCriterion("stationName =", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotEqualTo(String value) {
            addCriterion("stationName <>", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThan(String value) {
            addCriterion("stationName >", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThanOrEqualTo(String value) {
            addCriterion("stationName >=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThan(String value) {
            addCriterion("stationName <", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThanOrEqualTo(String value) {
            addCriterion("stationName <=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLike(String value) {
            addCriterion("stationName like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotLike(String value) {
            addCriterion("stationName not like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameIn(List<String> values) {
            addCriterion("stationName in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotIn(List<String> values) {
            addCriterion("stationName not in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameBetween(String value1, String value2) {
            addCriterion("stationName between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotBetween(String value1, String value2) {
            addCriterion("stationName not between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andLaststationIsNull() {
            addCriterion("lastStation is null");
            return (Criteria) this;
        }

        public Criteria andLaststationIsNotNull() {
            addCriterion("lastStation is not null");
            return (Criteria) this;
        }

        public Criteria andLaststationEqualTo(Integer value) {
            addCriterion("lastStation =", value, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationNotEqualTo(Integer value) {
            addCriterion("lastStation <>", value, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationGreaterThan(Integer value) {
            addCriterion("lastStation >", value, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastStation >=", value, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationLessThan(Integer value) {
            addCriterion("lastStation <", value, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationLessThanOrEqualTo(Integer value) {
            addCriterion("lastStation <=", value, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationIn(List<Integer> values) {
            addCriterion("lastStation in", values, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationNotIn(List<Integer> values) {
            addCriterion("lastStation not in", values, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationBetween(Integer value1, Integer value2) {
            addCriterion("lastStation between", value1, value2, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationNotBetween(Integer value1, Integer value2) {
            addCriterion("lastStation not between", value1, value2, "laststation");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeIsNull() {
            addCriterion("lastStationTime is null");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeIsNotNull() {
            addCriterion("lastStationTime is not null");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeEqualTo(Integer value) {
            addCriterion("lastStationTime =", value, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeNotEqualTo(Integer value) {
            addCriterion("lastStationTime <>", value, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeGreaterThan(Integer value) {
            addCriterion("lastStationTime >", value, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastStationTime >=", value, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeLessThan(Integer value) {
            addCriterion("lastStationTime <", value, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastStationTime <=", value, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeIn(List<Integer> values) {
            addCriterion("lastStationTime in", values, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeNotIn(List<Integer> values) {
            addCriterion("lastStationTime not in", values, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeBetween(Integer value1, Integer value2) {
            addCriterion("lastStationTime between", value1, value2, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andLaststationtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastStationTime not between", value1, value2, "laststationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationIsNull() {
            addCriterion("nextStation is null");
            return (Criteria) this;
        }

        public Criteria andNextstationIsNotNull() {
            addCriterion("nextStation is not null");
            return (Criteria) this;
        }

        public Criteria andNextstationEqualTo(Integer value) {
            addCriterion("nextStation =", value, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationNotEqualTo(Integer value) {
            addCriterion("nextStation <>", value, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationGreaterThan(Integer value) {
            addCriterion("nextStation >", value, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationGreaterThanOrEqualTo(Integer value) {
            addCriterion("nextStation >=", value, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationLessThan(Integer value) {
            addCriterion("nextStation <", value, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationLessThanOrEqualTo(Integer value) {
            addCriterion("nextStation <=", value, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationIn(List<Integer> values) {
            addCriterion("nextStation in", values, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationNotIn(List<Integer> values) {
            addCriterion("nextStation not in", values, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationBetween(Integer value1, Integer value2) {
            addCriterion("nextStation between", value1, value2, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationNotBetween(Integer value1, Integer value2) {
            addCriterion("nextStation not between", value1, value2, "nextstation");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeIsNull() {
            addCriterion("nextStationTime is null");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeIsNotNull() {
            addCriterion("nextStationTime is not null");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeEqualTo(Integer value) {
            addCriterion("nextStationTime =", value, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeNotEqualTo(Integer value) {
            addCriterion("nextStationTime <>", value, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeGreaterThan(Integer value) {
            addCriterion("nextStationTime >", value, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nextStationTime >=", value, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeLessThan(Integer value) {
            addCriterion("nextStationTime <", value, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeLessThanOrEqualTo(Integer value) {
            addCriterion("nextStationTime <=", value, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeIn(List<Integer> values) {
            addCriterion("nextStationTime in", values, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeNotIn(List<Integer> values) {
            addCriterion("nextStationTime not in", values, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeBetween(Integer value1, Integer value2) {
            addCriterion("nextStationTime between", value1, value2, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andNextstationtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("nextStationTime not between", value1, value2, "nextstationtime");
            return (Criteria) this;
        }

        public Criteria andTransferstationIsNull() {
            addCriterion("transferStation is null");
            return (Criteria) this;
        }

        public Criteria andTransferstationIsNotNull() {
            addCriterion("transferStation is not null");
            return (Criteria) this;
        }

        public Criteria andTransferstationEqualTo(Integer value) {
            addCriterion("transferStation =", value, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationNotEqualTo(Integer value) {
            addCriterion("transferStation <>", value, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationGreaterThan(Integer value) {
            addCriterion("transferStation >", value, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationGreaterThanOrEqualTo(Integer value) {
            addCriterion("transferStation >=", value, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationLessThan(Integer value) {
            addCriterion("transferStation <", value, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationLessThanOrEqualTo(Integer value) {
            addCriterion("transferStation <=", value, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationIn(List<Integer> values) {
            addCriterion("transferStation in", values, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationNotIn(List<Integer> values) {
            addCriterion("transferStation not in", values, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationBetween(Integer value1, Integer value2) {
            addCriterion("transferStation between", value1, value2, "transferstation");
            return (Criteria) this;
        }

        public Criteria andTransferstationNotBetween(Integer value1, Integer value2) {
            addCriterion("transferStation not between", value1, value2, "transferstation");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table train
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
     * This class corresponds to the database table train
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