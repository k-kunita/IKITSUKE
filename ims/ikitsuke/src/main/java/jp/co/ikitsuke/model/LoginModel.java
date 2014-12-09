package jp.co.ikitsuke.model;

import java.util.Date;
import java.util.List;

/**
 * ログイン情報モデル
 *
 * @author watanabe
 *
 */
public class LoginModel {

	/** ユーザID */
	private int user_id;

	/** メールアドレス */
	private String mail_address;

	/** ログインパスワード */
	private String login_password;

	/** 登録日付 (YYYYMMDDHHMM) */
	private Date create_date_time;

	/** 更新日付 (YYYYMMDDHHMM) */
	private Date last_update_time;

	/** 飲食店カテゴリリスト */
	private List<ShopCategoryModel> ShopCategoryList;

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
	 * メールアドレスを取得する
	 *
	 * @return mail_address
	 */
	public String getMailAddress() {
		return mail_address;
	}

	/**
	 * メールアドレスを設定する
	 *
	 * @param mail_address
	 *            セットする mail_address
	 */
	public void setMailAddress(String mail_address) {
		this.mail_address = mail_address;
	}

	/**
	 * ログインパスワードを取得する
	 *
	 * @return login_password
	 */
	public String getLoginPassword() {
		return login_password;
	}

	/**
	 * ログインパスワードを設定する
	 *
	 * @param login_password
	 *            セットする login_password
	 */
	public void setLoginPassword(String login_password) {
		this.login_password = login_password;
	}

	/**
	 * 登録日付 (YYYYMMDDHHMM)を取得する
	 *
	 * @return create_date_time
	 */
	public Date getCreateDateTime() {
		return create_date_time;
	}

	/**
	 * 登録日付 (YYYYMMDDHHMM)を設定する
	 *
	 * @param create_date_time
	 *            セットする create_date_time
	 */
	public void setCreateDateTime(Date create_date_time) {
		this.create_date_time = create_date_time;
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
	 * 飲食店カテゴリリストを取得する
	 *
	 * @return shopCategoryList
	 */
	public List<ShopCategoryModel> getShopCategoryList() {
		return ShopCategoryList;
	}

	/**
	 * 飲食店カテゴリリストを設定する
	 *
	 * @param shopCategoryList
	 *            セットする shopCategoryList
	 */
	public void setShopCategoryList(List<ShopCategoryModel> shopCategoryList) {
		ShopCategoryList = shopCategoryList;
	}

}
