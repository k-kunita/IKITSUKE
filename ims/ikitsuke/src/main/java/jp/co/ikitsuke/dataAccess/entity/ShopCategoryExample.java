package jp.co.ikitsuke.dataAccess.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopCategoryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public ShopCategoryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andCategoryIdIsNull() {
			addCriterion("category_id is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIsNotNull() {
			addCriterion("category_id is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryIdEqualTo(Integer value) {
			addCriterion("category_id =", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotEqualTo(Integer value) {
			addCriterion("category_id <>", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdGreaterThan(Integer value) {
			addCriterion("category_id >", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("category_id >=", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdLessThan(Integer value) {
			addCriterion("category_id <", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
			addCriterion("category_id <=", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIn(List<Integer> values) {
			addCriterion("category_id in", values, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotIn(List<Integer> values) {
			addCriterion("category_id not in", values, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
			addCriterion("category_id between", value1, value2, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
			addCriterion("category_id not between", value1, value2,
					"categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryNameIsNull() {
			addCriterion("category_name is null");
			return (Criteria) this;
		}

		public Criteria andCategoryNameIsNotNull() {
			addCriterion("category_name is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryNameEqualTo(String value) {
			addCriterion("category_name =", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameNotEqualTo(String value) {
			addCriterion("category_name <>", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameGreaterThan(String value) {
			addCriterion("category_name >", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
			addCriterion("category_name >=", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameLessThan(String value) {
			addCriterion("category_name <", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameLessThanOrEqualTo(String value) {
			addCriterion("category_name <=", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameLike(String value) {
			addCriterion("category_name like", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameNotLike(String value) {
			addCriterion("category_name not like", value, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameIn(List<String> values) {
			addCriterion("category_name in", values, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameNotIn(List<String> values) {
			addCriterion("category_name not in", values, "categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameBetween(String value1, String value2) {
			addCriterion("category_name between", value1, value2,
					"categoryName");
			return (Criteria) this;
		}

		public Criteria andCategoryNameNotBetween(String value1, String value2) {
			addCriterion("category_name not between", value1, value2,
					"categoryName");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andDisableFlagIsNull() {
			addCriterion("disable_flag is null");
			return (Criteria) this;
		}

		public Criteria andDisableFlagIsNotNull() {
			addCriterion("disable_flag is not null");
			return (Criteria) this;
		}

		public Criteria andDisableFlagEqualTo(String value) {
			addCriterion("disable_flag =", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagNotEqualTo(String value) {
			addCriterion("disable_flag <>", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagGreaterThan(String value) {
			addCriterion("disable_flag >", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagGreaterThanOrEqualTo(String value) {
			addCriterion("disable_flag >=", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagLessThan(String value) {
			addCriterion("disable_flag <", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagLessThanOrEqualTo(String value) {
			addCriterion("disable_flag <=", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagLike(String value) {
			addCriterion("disable_flag like", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagNotLike(String value) {
			addCriterion("disable_flag not like", value, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagIn(List<String> values) {
			addCriterion("disable_flag in", values, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagNotIn(List<String> values) {
			addCriterion("disable_flag not in", values, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagBetween(String value1, String value2) {
			addCriterion("disable_flag between", value1, value2, "disableFlag");
			return (Criteria) this;
		}

		public Criteria andDisableFlagNotBetween(String value1, String value2) {
			addCriterion("disable_flag not between", value1, value2,
					"disableFlag");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterionForJDBCDate("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterionForJDBCDate("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterionForJDBCDate("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterionForJDBCDate("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("update_time between", value1, value2,
					"updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("update_time not between", value1, value2,
					"updateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table shop_category
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shop_category
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 04 20:22:10 JST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}