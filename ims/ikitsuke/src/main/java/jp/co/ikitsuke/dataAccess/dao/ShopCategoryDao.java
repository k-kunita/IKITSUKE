package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategory;

public interface ShopCategoryDao {

	/***
	 * ユーザID指定で取得
	 * @param userId
	 * @return
	 */
	public List<ShopCategory> selectByUserId(Integer userId);

	/***
	 * ユーザID指定でカテゴリ名を更新
	 * @param categoryId
	 * @param categoryName
	 */
	public void updateByCategoryName(Integer categoryId,String categoryName);

	/***
	 * カテゴリID指定で無効フラグを更新
	 * @param categoryId
	 */
	public void updateByDisabledFlag(Integer categoryId,String disabledFlag);

}
