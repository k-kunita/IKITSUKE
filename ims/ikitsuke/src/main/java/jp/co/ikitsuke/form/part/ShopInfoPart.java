package jp.co.ikitsuke.form.part;

/***
 * ShopInfoのPartクラス
 * @author yositune64
 *
 */
public class ShopInfoPart {

	/** 店舗ID */
	private int shopId;

	/** 店舗カテゴリID */
	private int categoryId;

	/** 店舗名 */
	private String shopName;

	/** 電話番号 */
	private String shopTel;

	/** 備考 */
	private String shopMemo;

	/** 参照URL */
	private String shopUrl;

	/**
	 * 店舗IDを取得する
	 *
	 * @return shopId
	 */
	public int getShopId() {
		return this.shopId;
	}

	/**
	 * 店舗IDを設定する
	 *
	 * @param shopId
	 *            セットする shopId
	 */
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

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
	 * 店舗名を取得する
	 *
	 * @return shopName
	 */
	public String getShopName() {
		return this.shopName;
	}

	/**
	 * 店舗名を設定する
	 *
	 * @param shopName
	 *            セットする shopName
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * 電話番号を取得する
	 *
	 * @return shopTel
	 */
	public String getShopTel() {
		return this.shopTel;
	}

	/**
	 * 電話番号を設定する
	 *
	 * @param shopTel
	 *            セットする shopTel
	 */
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	/**
	 * 備考を取得する
	 *
	 * @return shopMemo
	 */
	public String getShopMemo() {
		return this.shopMemo;
	}

	/**
	 * 備考を設定する
	 *
	 * @param shopMemo
	 *            セットする shopMemo
	 */
	public void setShopMemo(String shopMemo) {
		this.shopMemo = shopMemo;
	}

	/**
	 * 参照URLを取得する
	 *
	 * @return shopUrl
	 */
	public String getShopPageUrl() {
		return this.shopUrl;
	}

	/**
	 * 参照URLを設定する
	 *
	 * @param shopUrl
	 *            セットする shopUrl
	 */
	public void setShopPageUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

}
