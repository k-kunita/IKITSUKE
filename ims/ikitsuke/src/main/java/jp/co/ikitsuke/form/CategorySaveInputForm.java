/**
 *
 */
package jp.co.ikitsuke.form;

/**
 *
 * カテゴリ一覧<br>
 * 編集画面<br>
 * 保存ボタン Input<br>
 *
 * @author r-watanabe
 *
 */
public class CategorySaveInputForm {

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
