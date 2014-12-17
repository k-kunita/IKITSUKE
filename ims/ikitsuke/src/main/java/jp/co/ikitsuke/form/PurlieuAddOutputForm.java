/**
 *
 */
package jp.co.ikitsuke.form;

/**
 * 行きつけ一覧<br>
 * 追加ボタン Output<br>
 *
 * @author r-watanabe
 *
 */
public class PurlieuAddOutputForm extends AbstractForm {

	/** 店舗カテゴリ名 */
	private String categoryName;

	/**
	 * 店舗カテゴリ名を取得する
	 *
	 * @return categoryName
	 */
	public String getCategoryName() {
		return categoryName;
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

}
