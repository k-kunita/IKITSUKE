package jp.co.ikitsuke.model;

import java.util.Date;
import java.util.List;

/**
 * 店舗カテゴリ情報モデル
 *
 * @author watanabe
 *
 */
public class ShopCategoryModel {

	/** 店舗カテゴリID */
	private int categoryId;

	/** 店舗カテゴリ名 */
	private String categoryName;

	/** ユーザID */
	private int userId;

	/** 無効フラグ */
	private boolean disableFlag;

	/** 更新日付 (YYYYMMDDHHMM) */
	private Date updateTime;

	/** 店舗情報リスト */
	private List<ShopInfoModel> shopInfoList;

	/**
	 * 店舗カテゴリIDを取得する
	 *
	 * @return categoryId
	 */
	public int getCategoryId() {
		return this.categoryId;
	}

	/**
	 * 店舗カテゴリIDを設定する
	 *
	 * @param categoryId
	 *            セットする categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * 店舗カテゴリ名を取得する
	 *
	 * @return categoryName
	 */
	public String getCategoryName() {
		return this.categoryName;
	}

	/**
	 * 店舗カテゴリ名を設定する
	 *
	 * @param categoryName
	 *            セットする categoryName
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * ユーザIDを取得する
	 *
	 * @return userId
	 */
	public int getUserId() {
		return this.userId;
	}

	/**
	 * ユーザIDを設定する
	 *
	 * @param userId
	 *            セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 無効フラグを取得する
	 *
	 * @return disableFlag
	 */
	public boolean isDisableFlag() {
		return this.disableFlag;
	}

	/**
	 * 無効フラグを設定する
	 *
	 * @param disableFlag
	 *            セットする disableFlag
	 */
	public void setDisableFlag(boolean disableFlag) {
		this.disableFlag = disableFlag;
	}

	/**
	 * 更新日付 (YYYYMMDDHHMM)を取得する
	 *
	 * @return updateTime
	 */
	public Date getLastUpdateTime() {
		return this.updateTime;
	}

	/**
	 * 更新日付 (YYYYMMDDHHMM)を設定する
	 *
	 * @param updateTime
	 *            セットする updateTime
	 */
	public void setLastUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 店舗情報リストを取得する
	 *
	 * @return shopInfoList
	 */
	public List<ShopInfoModel> getShopInfoList() {
		return this.shopInfoList;
	}

	/**
	 * 店舗情報リストを設定する
	 *
	 * @param shopInfoList
	 *            セットする shopInfoList
	 */
	public void setShopInfoList(List<ShopInfoModel> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}

}
