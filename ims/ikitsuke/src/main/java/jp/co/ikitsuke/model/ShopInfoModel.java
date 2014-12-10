package fores.ikitsuke.model;

import java.util.Date;

/**
 * 飲食店情報モデル
 *
 * @author watanabe
 *
 */
public class ShopInfoModel {

	/** 飲食店ID */
	private int shopId;

	/** 飲食店カテゴリID */
	private int categoryId;

	/** 飲食店名 */
	private String shopName;

	/** 電話番号 */
	private String shopTel;

	/** 備考 */
	private String shopMemo;

	/** 参照URL */
	private String shopUrl;

	/** 無効フラグ */
	private boolean deleteFlag;

	/** 更新履歴 (YYYYMMDDHHMM) */
	private Date updateTime;

	/**
	 * 飲食店IDを取得する
	 *
	 * @return shopId
	 */
	public int getShopId() {
		return this.shopId;
	}

	/**
	 * 飲食店IDを設定する
	 *
	 * @param shopId
	 *            セットする shopId
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	/**
	 * 飲食店カテゴリIDを取得する
	 *
	 * @return categoryId
	 */
	public int getCategoryId() {
		return this.categoryId;
	}

	/**
	 * 飲食店カテゴリIDを設定する
	 *
	 * @param categoryId
	 *            セットする categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * 飲食店名を取得する
	 *
	 * @return shopName
	 */
	public String getShopName() {
		return this.shopName;
	}

	/**
	 * 飲食店名を設定する
	 *
	 * @param shopName
	 *            セットする shopName
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * 電話番号を取得する
	 *
	 * @return shopTel
	 */
	public String getShopTel() {
		return this.shopTel;
	}

	/**
	 * 電話番号を設定する
	 *
	 * @param shopTel
	 *            セットする shopTel
	 */
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	/**
	 * 備考を取得する
	 *
	 * @return shopMemo
	 */
	public String getShopMemo() {
		return this.shopMemo;
	}

	/**
	 * 備考を設定する
	 *
	 * @param shopMemo
	 *            セットする shopMemo
	 */
	public void setShopMemo(String shopMemo) {
		this.shopMemo = shopMemo;
	}

	/**
	 * 参照URLを取得する
	 *
	 * @return shopUrl
	 */
	public String getShopPageUrl() {
		return this.shopUrl;
	}

	/**
	 * 参照URLを設定する
	 *
	 * @param shopUrl
	 *            セットする shopUrl
	 */
	public void setShopPageUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	/**
	 * 無効フラグを取得する
	 *
	 * @return deleteFlag
	 */
	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	/**
	 * 無効フラグを設定する
	 *
	 * @param deleteFlag
	 *            セットする deleteFlag
	 */
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * 更新履歴 (YYYYMMDDHHMM)を取得する
	 *
	 * @return updateTime
	 */
	public Date getLastUpdateTime() {
		return this.updateTime;
	}

	/**
	 * 更新履歴 (YYYYMMDDHHMM)を設定する
	 *
	 * @param updateTime
	 *            セットする updateTime
	 */
	public void setLastUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
