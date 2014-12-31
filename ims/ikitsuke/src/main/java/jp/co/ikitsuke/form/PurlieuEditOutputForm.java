/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.form.part.ShopInfoPart;

/**
 * 行きつけ一覧<br>
 * 編集ボタン Output<br>
 *
 * @author r-watanabe
 *
 */
public class PurlieuEditOutputForm {

	/** 店舗情報のリスト */
	private List<ShopInfoPart> shopInfoList;

	/***
	 * 店舗情報リストのgetter
	 * @return
	 */
	public List<ShopInfoPart> getShopInfoList() {
		return shopInfoList;
	}

	/***
	 * 店舗情報リストのsetter
	 * @param shopInfoList
	 */
	public void setShopInfoList(List<ShopInfoPart> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}
}
