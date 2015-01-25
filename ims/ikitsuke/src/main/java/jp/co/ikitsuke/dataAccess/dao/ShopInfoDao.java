package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopInfo;

public interface ShopInfoDao {

    /***
     * 登録処理
     * 
     * @param shopInfo
     * @return 更新数
     */
    int insert(ShopInfo shopInfo);

    /***
     * カテゴリID指定で店舗一覧を取得
     * 
     * @param categoryId
     * @return 店舗情報リスト
     */
    List<ShopInfo> selectByCategoryId(int categoryId);

    /***
     * 店舗ID指定で店舗情報を取得
     * 
     * @param shopId
     * @return 店舗情報
     */
    ShopInfo selectByShopId(int shopId);

    /***
     * 店舗ID指定による更新処理
     * 
     * @param shopInfo
     * @return 更新数
     */
    int updateByShopId(ShopInfo shopInfo);

    /***
     * 店舗IO指定による論理削除処理
     * 
     * @param shopId
     * @return 更新数
     */
    int deleteByShopId(int shopId);

    /***
     * カテゴリID指定による論理削除処理
     * 
     * @param categoryId
     * @return 更新数
     */
    int deleteByCategoryId(int categoryId);

}
