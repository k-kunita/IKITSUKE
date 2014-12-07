package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategory;

public interface ShopCategoryDao {

	//店舗カテゴリ一覧の取得
	public List<ShopCategory> findByUserId(Integer userId);

	//店舗カテゴリ名更新処理
	public void updateByCategoryName(Integer categoryId,String categoryName);

	//店舗カテゴリ未使用更新処理
	public void updateByDisabledFlag(Integer categoryId);

}
