/**
 *
 */
package jp.co.ikitsuke.form;

/**
 * Formの親モデル
 *
 * @author watanabe
 *
 */
public abstract class AbstractForm {

	/** 店舗カテゴリID */
	private int categoryId;

	/**
	 * 店舗カテゴリIDを取得する
	 *
	 * @return categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * 店舗カテゴリIDを設定する.
	 *
	 * @param categoryId
	 *            integer
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
