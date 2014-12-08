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
	private int shop_id;

	/** 飲食店カテゴリID */
	private int category_id;

	/** 飲食店名 */
	private String shop_name;

	/** 電話番号 */
	private String shop_tel;

	/** 備考 */
	private String shop_memo;

	/** 参照URL */
	private String shop_page_url;

	/** 無効フラグ */
	private boolean delete_flag;

	/** 更新履歴 (YYYYMMDDHHMM) */
	private Date last_update_time;

	/**
	 * 飲食店IDを取得する
	 *
	 * @return shop_id
	 */
	public int getShopId() {
		return shop_id;
	}

	/**
	 * 飲食店IDを設定する
	 *
	 * @param shop_id
	 *            セットする shop_id
	 */
	public void setShopId(int shop_id) {
		this.shop_id = shop_id;
	}

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
	 * 飲食店名を取得する
	 *
	 * @return shop_name
	 */
	public String getShopName() {
		return shop_name;
	}

	/**
	 * 飲食店名を設定する
	 *
	 * @param shop_name
	 *            セットする shop_name
	 */
	public void setShopName(String shop_name) {
		this.shop_name = shop_name;
	}

	/**
	 * 電話番号を取得する
	 *
	 * @return shop_tel
	 */
	public String getShopTel() {
		return shop_tel;
	}

	/**
	 * 電話番号を設定する
	 *
	 * @param shop_tel
	 *            セットする shop_tel
	 */
	public void setShopTel(String shop_tel) {
		this.shop_tel = shop_tel;
	}

	/**
	 * 備考を取得する
	 *
	 * @return shop_memo
	 */
	public String getShopMemo() {
		return shop_memo;
	}

	/**
	 * 備考を設定する
	 *
	 * @param shop_memo
	 *            セットする shop_memo
	 */
	public void setShopMemo(String shop_memo) {
		this.shop_memo = shop_memo;
	}

	/**
	 * 参照URLを取得する
	 *
	 * @return shop_page_url
	 */
	public String getShopPageUrl() {
		return shop_page_url;
	}

	/**
	 * 参照URLを設定する
	 *
	 * @param shop_page_url
	 *            セットする shop_page_url
	 */
	public void setShopPageUrl(String shop_page_url) {
		this.shop_page_url = shop_page_url;
	}

	/**
	 * 無効フラグを取得する
	 *
	 * @return delete_flag
	 */
	public boolean isDeleteFlag() {
		return delete_flag;
	}

	/**
	 * 無効フラグを設定する
	 *
	 * @param delete_flag
	 *            セットする delete_flag
	 */
	public void setDeleteFlag(boolean delete_flag) {
		this.delete_flag = delete_flag;
	}

	/**
	 * 更新履歴 (YYYYMMDDHHMM)を取得する
	 *
	 * @return last_update_time
	 */
	public Date getLastUpdateTime() {
		return last_update_time;
	}

	/**
	 * 更新履歴 (YYYYMMDDHHMM)を設定する
	 *
	 * @param last_update_time
	 *            セットする last_update_time
	 */
	public void setLastUpdateTime(Date last_update_time) {
		this.last_update_time = last_update_time;
	}

}
