/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.model.ShopInfoModel;

/**
 *
 * 行きつけ一覧<br>
 * 編集画面<br>
 * 削除ボタン OUtput<br>
 *
 * @author r-watanabe
 *
 */
public class ShopDeletetOutputForm extends AbstractForm {

	/** 店舗カテゴリ名 */
	private String categoryName;

	/** 店舗カテゴリ詳細情報リスト */
	private List<ShopInfoModel> shopCategoryDetailList;

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

	/**
	 * 店舗カテゴリ詳細情報リストを取得する
	 *
	 * @return shopCategoryDetailList
	 */
	public List<ShopInfoModel> getShopCategoryDetailList() {
		return shopCategoryDetailList;
	}

	/**
	 * 店舗カテゴリ詳細情報リストを設定する
	 *
	 * @param shopCategoryDetailList
	 *            セットする shopCategoryDetailList
	 */
	public void setShopCategoryDetailList(
			List<ShopInfoModel> shopCategoryDetailList) {
		this.shopCategoryDetailList = shopCategoryDetailList;
	}

}
