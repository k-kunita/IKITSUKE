package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopInfo;

public interface ShopInfoDao {

	/***
	 * 登録処理
	 * @param shopInfo
	 * @return
	 */
	Integer insert(ShopInfo shopInfo);

	/***
	 * カテゴリID指定で店舗一覧を取得
	 * @param categoryId
	 * @return
	 */
	List<ShopInfo> selectByCategoryId(Integer categoryId);

	/***
	 * 店舗ID指定による更新処理
	 * @param shopInfo
	 * @return
	 */
	Integer updateByShopId(ShopInfo shopInfo);

	/***
	 * 店舗IO指定による論理削除処理
	 * @param shopId
	 * @return
	 */
	Integer deleteByShopId(Integer shopId);

	/***
	 * カテゴリID指定による論理削除処理
	 * @param categoryId
	 * @return
	 */
	Integer deleteByCategoryId(Integer categoryId);

}
