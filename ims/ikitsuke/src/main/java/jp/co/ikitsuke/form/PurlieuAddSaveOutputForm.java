/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.model.ShopInfoModel;


/**
 * 行きつけ一覧<br>
 * 追加画面<br>
 * 保存ボタン<br>
 *
 * @author r-watanabe
 *
 */
public class PurlieuAddSaveOutputForm extends AbstractForm {

	/** 店舗カテゴリ名 */
	private String categoryName;

	/** 店舗カテゴリ情報詳細リスト */
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
	 * 店舗カテゴリ情報詳細リストを取得する
	 *
	 * @return shopCategoryDetailList
	 */
	public List<ShopInfoModel> getShopCategoryDetailList() {
		return shopCategoryDetailList;
	}

	/**
	 * 店舗カテゴリ情報詳細リストを設定する
	 *
	 * @param shopCategoryDetailList
	 *            セットする shopCategoryDetailList
	 */
	public void setShopCategoryDetailList(List<ShopInfoModel> shopCategoryDetailList) {
		this.shopCategoryDetailList = shopCategoryDetailList;
	}

}
