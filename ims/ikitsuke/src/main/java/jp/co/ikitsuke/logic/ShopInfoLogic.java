package jp.co.ikitsuke.logic;


/***
 * 店舗情報処理
 *
 * @author yositune64
 *
 */
public interface ShopInfoLogic {

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
