package jp.co.ikitsuke.logic;

import java.util.List;

import jp.co.ikitsuke.model.ShopInfoModel;


/***
 * 店舗情報処理
 *
 * @author yositune64
 *
 */
public interface ShopInfoLogic {


	/***
	 * 店舗情報一覧取得
	 * <pre>
	 * カテゴリIDによる店舗情報一覧を取得する。
	 * 取得ができない場合はnullを返す。
	 * </pre>
	 * @param categoryId
	 * @return
	 */
	public List<ShopInfoModel> getShopInfo(int categoryId);

	/***
	 * 店舗情報登録
	 * @param shopId
	 * @param categoryId
	 * @param shopName
	 * @param shopTel
	 * @param shopMemo
	 * @param shopUrl
	 */
	public void register(Integer shopId, Integer categoryId, String shopName,
			String shopTel, String shopMemo, String shopUrl);

	/***
	 * 店舗情報更新
	 * @param shopId
	 * @param categoryId
	 * @param shopName
	 * @param shopTel
	 * @param shopMemo
	 * @param shopUrl
	 */
	public void update(Integer shopId, Integer categoryId, String shopName,
			String shopTel, String shopMemo, String shopUrl);
	/***
	 * 店舗情報削除
	 * @param shopId
	 */
	public void delete(Integer shopId);

}
