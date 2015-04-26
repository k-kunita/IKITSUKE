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
     *
     * <pre>
     * カテゴリIDによる店舗情報一覧を取得する。
     * 取得ができない場合はnullを返す。
     * </pre>
     *
     * @param categoryId
     * @return
     */
    public List<ShopInfoModel> getShopInfoList(int categoryId);

    /***
     * 店舗情報取得
     *
     * <pre>
     * 店舗IDにより店舗情報を取得する。
     * 取得ができない場合はnullを返す。
     * </pre>
     *
     * @param shopId
     * @return
     */
    public ShopInfoModel getShopInfo(int shopId);

    /***
     * 店舗情報登録
     *
     * @param shopInfoModel
     */
    public void register(ShopInfoModel shopInfoModel);

    /***
     * 店舗情報更新
     *
     * @param shopInfoModel
     */
    public void update(ShopInfoModel shopInfoModel);

    /***
     * 店舗情報削除
     *
     * @param shopId
     */
    public void delete(Integer shopId);

}
