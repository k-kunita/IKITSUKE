package jp.co.ikitsuke.logic;

import java.util.List;

import jp.co.ikitsuke.model.ShopCategoryModel;

/***
 * カテゴリ処理
 *
 * @author yositune64
 *
 */
public interface ShopCategoryLogic {

    /***
     * カテゴリ一覧取得
     *
     * <pre>
     * ユーザIDをキーにカテゴリー情報のListを取得する。
     * リストが取得できない場合はnullを返す。
     * </pre>
     *
     * @param usrId
     * @return カテゴリ一覧
     */
    public List<ShopCategoryModel> getCategoryList(int usrId);

    /***
     * カテゴリー情報取得
     *
     * <pre>
     * カテゴリーIDをキーにカテゴリー情報を取得する。
     * カテゴリー情報が取得できない場合はnullを返す。
     * </pre>
     *
     * @param categoryId
     * @return ShopCategoryModel
     */
    public ShopCategoryModel getCategory(int categoryId,int userId);

    /***
     * カテゴリー更新処理
     *
     * @param model
     * @return
     */
    public int update(ShopCategoryModel model);

    /***
     * カテゴリ削除
     *
     * <pre>
     * カテゴリ情報と対象カテゴリに登録されている店舗情報を論理削除
     * </pre>
     *
     * @param categoryId
     */
    public int delete(int categoryId);

    /***
     * カテゴリ情報追加
     *
     * <pre>
     * 初期レコードの作成
     * </pre>
     *
     * @param userId
     */
    public int add(ShopCategoryModel model);

}