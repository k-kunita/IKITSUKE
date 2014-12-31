package jp.co.ikitsuke.form.part;

/***
 * ShopCategoryのPartクラス
 * @author yositune64
 *
 */
public class ShopCategoryPart {

	/** 店舗カテゴリID */
	private int categoryId;

	/** 店舗カテゴリ名 */
	private String categoryName;

	/** 無効フラグ */
	private boolean disableFlag;

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

}
