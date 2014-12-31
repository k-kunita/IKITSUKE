/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.form.part.ShopCategoryPart;

/**
 * カテゴリ一覧画面<br>
 * カテゴリボタン Output<br>
 *
 * @author watanabe
 *
 */
public class CategoryOutputForm {

	/** カテゴリー情報リスト */
	private List<ShopCategoryPart> shopCategoryList;

	/***
	 * カテゴリー情報リストのgetter
	 * @return
	 */
	public List<ShopCategoryPart> getShopCategoryList() {
		return shopCategoryList;
	}

	/***
	 * カテゴリー情報リストのsetter
	 * @param shopCategoryList
	 */
	public void setShopCategoryList(List<ShopCategoryPart> shopCategoryList) {
		this.shopCategoryList = shopCategoryList;
	}

	//	/** 店舗カテゴリＩＤ */
//	private int categoryId;
//
//	/** 店舗カテゴリ名 */
//	private int categoryName;
//
//	/** 店舗情報リスト */
//	private List<ShopInfoModel> shopInfoList;
//
//	/**
//	 * 店舗カテゴリＩＤを取得する
//	 *
//	 * @return categoryId
//	 */
//	public int getCategoryId() {
//		return categoryId;
//	}
//
//	/**
//	 * 店舗カテゴリＩＤを設定する
//	 *
//	 * @param categoryId
//	 *            セットする categoryId
//	 */
//	public void setCategoryId(int categoryId) {
//		this.categoryId = categoryId;
//	}
//
//	/**
//	 * 店舗カテゴリ名を取得する
//	 *
//	 * @return categoryName
//	 */
//	public int getCategoryName() {
//		return categoryName;
//	}
//
//	/**
//	 * 店舗カテゴリ名を設定する
//	 *
//	 * @param categoryName
//	 *            セットする categoryName
//	 */
//	public void setCategoryName(int categoryName) {
//		this.categoryName = categoryName;
//	}
//
//	/**
//	 * 店舗情報リストを取得する
//	 *
//	 * @return shopInfoList
//	 */
//	public List<ShopInfoModel> getShopInfoList() {
//		return shopInfoList;
//	}
//
//	/**
//	 * 店舗情報リストを設定する
//	 *
//	 * @param shopInfoList
//	 *            セットする shopInfoList
//	 */
//	public void setShopInfoList(List<ShopInfoModel> shopInfoList) {
//		this.shopInfoList = shopInfoList;
//	}

}
