package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.model.ShopCategoryModel;

public interface ShopCategoryDao {

    /***
     * ユーザID指定で取得
     *
     * @param userId
     * @return 店舗カテゴリーリスト
     */
    public List<ShopCategory> selectByUserId(int userId);

    /***
     * カテゴリーID・ユーザID指定による取得
     *
     * @param categoryId
     * @return
     */
    public ShopCategory selectByCategoryIdUserId(int categoryId,int userId);

    /***
     * ユーザID指定でカテゴリ名を更新
     *
     * @param categoryId
     * @param categoryName
     * @return 更新数
     */
    public int updateByCategoryId(ShopCategoryModel model);

    /***
     * カテゴリID指定で無効フラグを更新
     *
     * @param categoryId
     * @return 更新数
     */
    public int updateDisabledFlagByCategoryId(int categoryId);

    /***
     * カテゴリー情報の追加
     * @param shopCategory
     * @return
     */
    public int insert(ShopCategory shopCategory);
}
