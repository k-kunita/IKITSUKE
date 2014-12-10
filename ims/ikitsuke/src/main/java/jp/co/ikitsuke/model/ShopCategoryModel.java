package fores.ikitsuke.model;

import java.util.Date;
import java.util.List;

/**
 * 飲食店カテゴリ情報モデル
 *
 * @author watanabe
 *
 */
public class ShopCategoryModel {

	/** 飲食店カテゴリID */
	private int categoryId;

	/** 飲食店カテゴリ名 */
	private String categoryName;

	/** ユーザID */
	private int userId;

	/** 無効フラグ */
	private boolean disableFlag;

	/** 更新日付 (YYYYMMDDHHMM) */
	private Date updateTime;

	/** 飲食店情報リスト */
	private List<ShopInfoModel> shopInfoList;

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
	 * 飲食店カテゴリ名を取得する
	 *
	 * @return categoryName
	 */
	public String getCategoryName() {
		return this.categoryName;
	}

	/**
	 * 飲食店カテゴリ名を設定する
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
	 * 飲食店情報リストを取得する
	 *
	 * @return shopInfoList
	 */
	public List<ShopInfoModel> getShopInfoList() {
		return this.shopInfoList;
	}

	/**
	 * 飲食店情報リストを設定する
	 *
	 * @param shopInfoList
	 *            セットする shopInfoList
	 */
	public void setShopInfoList(List<ShopInfoModel> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}

}
