package jp.co.ikitsuke.dataAccess.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class ShopInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.shop_id
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private Integer shopId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.category_id
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private Integer categoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.shop_name
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private String shopName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.shop_tel
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private String shopTel;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.shop_memo
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private String shopMemo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.shop_url
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private String shopUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.delete_flag
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private String deleteFlag;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column shop_info.update_time
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.shop_id
	 * @return  the value of shop_info.shop_id
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public Integer getShopId() {
		return shopId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.shop_id
	 * @param shopId  the value for shop_info.shop_id
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.category_id
	 * @return  the value of shop_info.category_id
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.category_id
	 * @param categoryId  the value for shop_info.category_id
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.shop_name
	 * @return  the value of shop_info.shop_name
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.shop_name
	 * @param shopName  the value for shop_info.shop_name
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.shop_tel
	 * @return  the value of shop_info.shop_tel
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public String getShopTel() {
		return shopTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.shop_tel
	 * @param shopTel  the value for shop_info.shop_tel
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.shop_memo
	 * @return  the value of shop_info.shop_memo
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public String getShopMemo() {
		return shopMemo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.shop_memo
	 * @param shopMemo  the value for shop_info.shop_memo
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setShopMemo(String shopMemo) {
		this.shopMemo = shopMemo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.shop_url
	 * @return  the value of shop_info.shop_url
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public String getShopUrl() {
		return shopUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.shop_url
	 * @param shopUrl  the value for shop_info.shop_url
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.delete_flag
	 * @return  the value of shop_info.delete_flag
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public String getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.delete_flag
	 * @param deleteFlag  the value for shop_info.delete_flag
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column shop_info.update_time
	 * @return  the value of shop_info.update_time
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column shop_info.update_time
	 * @param updateTime  the value for shop_info.update_time
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}