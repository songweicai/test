package com.jsh.erp.datasource.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("CategoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("CategoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("CategoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("CategoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("CategoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("CategoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("CategoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("CategoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("CategoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("CategoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMfrsIsNull() {
            addCriterion("Mfrs is null");
            return (Criteria) this;
        }

        public Criteria andMfrsIsNotNull() {
            addCriterion("Mfrs is not null");
            return (Criteria) this;
        }

        public Criteria andMfrsEqualTo(String value) {
            addCriterion("Mfrs =", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsNotEqualTo(String value) {
            addCriterion("Mfrs <>", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsGreaterThan(String value) {
            addCriterion("Mfrs >", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsGreaterThanOrEqualTo(String value) {
            addCriterion("Mfrs >=", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsLessThan(String value) {
            addCriterion("Mfrs <", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsLessThanOrEqualTo(String value) {
            addCriterion("Mfrs <=", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsLike(String value) {
            addCriterion("Mfrs like", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsNotLike(String value) {
            addCriterion("Mfrs not like", value, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsIn(List<String> values) {
            addCriterion("Mfrs in", values, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsNotIn(List<String> values) {
            addCriterion("Mfrs not in", values, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsBetween(String value1, String value2) {
            addCriterion("Mfrs between", value1, value2, "mfrs");
            return (Criteria) this;
        }

        public Criteria andMfrsNotBetween(String value1, String value2) {
            addCriterion("Mfrs not between", value1, value2, "mfrs");
            return (Criteria) this;
        }

        public Criteria andSafetystockIsNull() {
            addCriterion("SafetyStock is null");
            return (Criteria) this;
        }

        public Criteria andSafetystockIsNotNull() {
            addCriterion("SafetyStock is not null");
            return (Criteria) this;
        }

        public Criteria andSafetystockEqualTo(BigDecimal value) {
            addCriterion("SafetyStock =", value, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockNotEqualTo(BigDecimal value) {
            addCriterion("SafetyStock <>", value, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockGreaterThan(BigDecimal value) {
            addCriterion("SafetyStock >", value, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SafetyStock >=", value, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockLessThan(BigDecimal value) {
            addCriterion("SafetyStock <", value, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SafetyStock <=", value, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockIn(List<BigDecimal> values) {
            addCriterion("SafetyStock in", values, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockNotIn(List<BigDecimal> values) {
            addCriterion("SafetyStock not in", values, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SafetyStock between", value1, value2, "safetystock");
            return (Criteria) this;
        }

        public Criteria andSafetystockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SafetyStock not between", value1, value2, "safetystock");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("Model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("Model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("Model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("Model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("Model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("Model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("Model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("Model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("Model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("Model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("Model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("Model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("Model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("Model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("Standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("Standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("Standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("Standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("Standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("Standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("Standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("Standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("Standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("Standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("Standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("Standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("Standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("Standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("UnitId is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("UnitId is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(Long value) {
            addCriterion("UnitId =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(Long value) {
            addCriterion("UnitId <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(Long value) {
            addCriterion("UnitId >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(Long value) {
            addCriterion("UnitId >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(Long value) {
            addCriterion("UnitId <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(Long value) {
            addCriterion("UnitId <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<Long> values) {
            addCriterion("UnitId in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<Long> values) {
            addCriterion("UnitId not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(Long value1, Long value2) {
            addCriterion("UnitId between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(Long value1, Long value2) {
            addCriterion("UnitId not between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("Enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("Enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("Enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("Enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("Enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("Enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("Enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("Enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("Enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("Enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOtherfield1IsNull() {
            addCriterion("OtherField1 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield1IsNotNull() {
            addCriterion("OtherField1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield1EqualTo(String value) {
            addCriterion("OtherField1 =", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotEqualTo(String value) {
            addCriterion("OtherField1 <>", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1GreaterThan(String value) {
            addCriterion("OtherField1 >", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField1 >=", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1LessThan(String value) {
            addCriterion("OtherField1 <", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1LessThanOrEqualTo(String value) {
            addCriterion("OtherField1 <=", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1Like(String value) {
            addCriterion("OtherField1 like", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotLike(String value) {
            addCriterion("OtherField1 not like", value, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1In(List<String> values) {
            addCriterion("OtherField1 in", values, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotIn(List<String> values) {
            addCriterion("OtherField1 not in", values, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1Between(String value1, String value2) {
            addCriterion("OtherField1 between", value1, value2, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield1NotBetween(String value1, String value2) {
            addCriterion("OtherField1 not between", value1, value2, "otherfield1");
            return (Criteria) this;
        }

        public Criteria andOtherfield2IsNull() {
            addCriterion("OtherField2 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield2IsNotNull() {
            addCriterion("OtherField2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield2EqualTo(String value) {
            addCriterion("OtherField2 =", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotEqualTo(String value) {
            addCriterion("OtherField2 <>", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2GreaterThan(String value) {
            addCriterion("OtherField2 >", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField2 >=", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2LessThan(String value) {
            addCriterion("OtherField2 <", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2LessThanOrEqualTo(String value) {
            addCriterion("OtherField2 <=", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2Like(String value) {
            addCriterion("OtherField2 like", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotLike(String value) {
            addCriterion("OtherField2 not like", value, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2In(List<String> values) {
            addCriterion("OtherField2 in", values, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotIn(List<String> values) {
            addCriterion("OtherField2 not in", values, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2Between(String value1, String value2) {
            addCriterion("OtherField2 between", value1, value2, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield2NotBetween(String value1, String value2) {
            addCriterion("OtherField2 not between", value1, value2, "otherfield2");
            return (Criteria) this;
        }

        public Criteria andOtherfield3IsNull() {
            addCriterion("OtherField3 is null");
            return (Criteria) this;
        }

        public Criteria andOtherfield3IsNotNull() {
            addCriterion("OtherField3 is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfield3EqualTo(String value) {
            addCriterion("OtherField3 =", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotEqualTo(String value) {
            addCriterion("OtherField3 <>", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3GreaterThan(String value) {
            addCriterion("OtherField3 >", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3GreaterThanOrEqualTo(String value) {
            addCriterion("OtherField3 >=", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3LessThan(String value) {
            addCriterion("OtherField3 <", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3LessThanOrEqualTo(String value) {
            addCriterion("OtherField3 <=", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3Like(String value) {
            addCriterion("OtherField3 like", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotLike(String value) {
            addCriterion("OtherField3 not like", value, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3In(List<String> values) {
            addCriterion("OtherField3 in", values, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotIn(List<String> values) {
            addCriterion("OtherField3 not in", values, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3Between(String value1, String value2) {
            addCriterion("OtherField3 between", value1, value2, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andOtherfield3NotBetween(String value1, String value2) {
            addCriterion("OtherField3 not between", value1, value2, "otherfield3");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberIsNull() {
            addCriterion("enableSerialNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberIsNotNull() {
            addCriterion("enableSerialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberEqualTo(String value) {
            addCriterion("enableSerialNumber =", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberNotEqualTo(String value) {
            addCriterion("enableSerialNumber <>", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberGreaterThan(String value) {
            addCriterion("enableSerialNumber >", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("enableSerialNumber >=", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberLessThan(String value) {
            addCriterion("enableSerialNumber <", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberLessThanOrEqualTo(String value) {
            addCriterion("enableSerialNumber <=", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberLike(String value) {
            addCriterion("enableSerialNumber like", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberNotLike(String value) {
            addCriterion("enableSerialNumber not like", value, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberIn(List<String> values) {
            addCriterion("enableSerialNumber in", values, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberNotIn(List<String> values) {
            addCriterion("enableSerialNumber not in", values, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberBetween(String value1, String value2) {
            addCriterion("enableSerialNumber between", value1, value2, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andEnableserialnumberNotBetween(String value1, String value2) {
            addCriterion("enableSerialNumber not between", value1, value2, "enableserialnumber");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Long value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Long value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Long value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Long value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Long value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Long> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Long> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Long value1, Long value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Long value1, Long value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_Flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("delete_Flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("delete_Flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("delete_Flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_Flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("delete_Flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("delete_Flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("delete_Flag like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("delete_Flag not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("delete_Flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("delete_Flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("delete_Flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("delete_Flag not between", value1, value2, "deleteFlag");
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