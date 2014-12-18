/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategoryModel;

/**
 * カテゴリ一覧<br>
 * 編集画面<br>
 * 保存ボタン Output<br>
 *
 * @author r-watanabe
 *
 */
public class CategorySaveOutputForm {

	/** 店舗カテゴリ情報リスト */
	private List<ShopCategoryModel> shopCategoryList;

	/**
	 * 店舗カテゴリ情報リストを取得する
	 *
	 * @return shopCategoryList
	 */
	public List<ShopCategoryModel> getShopCategoryList() {
		return shopCategoryList;
	}

	/**
	 * 店舗カテゴリ情報リストを設定する
	 *
	 * @param shopCategoryList
	 *            セットする shopCategoryList
	 */
	public void setShopCategoryList(List<ShopCategoryModel> shopCategoryList) {
		this.shopCategoryList = shopCategoryList;
	}
}
