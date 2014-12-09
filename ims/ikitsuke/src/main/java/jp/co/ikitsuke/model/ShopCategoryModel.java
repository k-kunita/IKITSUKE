package jp.co.ikitsuke.model;

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
	private int category_id;

	/** 飲食店カテゴリ名 */
	private String category_name;

	/** ユーザID */
	private int user_id;

	/** 無効フラグ */
	private boolean disable_flag;

	/** 更新日付 (YYYYMMDDHHMM) */
	private Date last_update_time;

	/** 飲食店情報リスト */
	private List<ShopInfoModel> ShopInfoList;

	/**
	 * 飲食店カテゴリIDを取得する
	 *
	 * @return category_id
	 */
	public int getCategoryId() {
		return category_id;
	}

	/**
	 * 飲食店カテゴリIDを設定する
	 *
	 * @param category_id
	 *            セットする category_id
	 */
	public void setCategoryId(int category_id) {
		this.category_id = category_id;
	}

	/**
	 * 飲食店カテゴリ名を取得する
	 *
	 * @return category_name
	 */
	public String getCategoryName() {
		return category_name;
	}

	/**
	 * 飲食店カテゴリ名を設定する
	 *
	 * @param category_name
	 *            セットする category_name
	 */
	public void setCategoryName(String category_name) {
		this.category_name = category_name;
	}

	/**
	 * ユーザIDを取得する
	 *
	 * @return user_id
	 */
	public int getUserId() {
		return user_id;
	}

	/**
	 * ユーザIDを設定する
	 *
	 * @param user_id
	 *            セットする user_id
	 */
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * 無効フラグを取得する
	 *
	 * @return disable_flag
	 */
	public boolean isDisableFlag() {
		return disable_flag;
	}

	/**
	 * 無効フラグを設定する
	 *
	 * @param disable_flag
	 *            セットする disable_flag
	 */
	public void setDisableFlag(boolean disable_flag) {
		this.disable_flag = disable_flag;
	}

	/**
	 * 更新日付 (YYYYMMDDHHMM)を取得する
	 *
	 * @return last_update_time
	 */
	public Date getLastUpdateTime() {
		return last_update_time;
	}

	/**
	 * 更新日付 (YYYYMMDDHHMM)を設定する
	 *
	 * @param last_update_time
	 *            セットする last_update_time
	 */
	public void setLastUpdateTime(Date last_update_time) {
		this.last_update_time = last_update_time;
	}

	/**
	 * 飲食店情報リストを取得する
	 *
	 * @return shopInfoList
	 */
	public List<ShopInfoModel> getShopInfoList() {
		return ShopInfoList;
	}

	/**
	 * 飲食店情報リストを設定する
	 *
	 * @param shopInfoList
	 *            セットする shopInfoList
	 */
	public void setShopInfoList(List<ShopInfoModel> shopInfoList) {
		ShopInfoList = shopInfoList;
	}

}
