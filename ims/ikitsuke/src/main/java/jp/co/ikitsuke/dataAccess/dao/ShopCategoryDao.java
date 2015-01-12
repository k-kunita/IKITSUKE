package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategory;

public interface ShopCategoryDao {

	/***
	 * ユーザID指定で取得
	 * @param userId
	 * @return 店舗カテゴリーリスト
	 */
	public List<ShopCategory> selectByUserId(int userId);
	
	/***
	 * カテゴリーID指定で取得
	 * @param categoryId
	 * @return
	 */
	public ShopCategory selectByCategoryId(int categoryId);
	
	/***
	 * ユーザID指定でカテゴリ名を更新
	 * @param categoryId
	 * @param categoryName
	 * @return 更新数
	 */
	public int updateCategoryNameByCategoryId(int categoryId,String categoryName);

	/***
	 * カテゴリID指定で無効フラグを更新
	 * @param categoryId
	 * @return 更新数
	 */
	public int updateDisabledFlagByCategoryId(int categoryId);

}
