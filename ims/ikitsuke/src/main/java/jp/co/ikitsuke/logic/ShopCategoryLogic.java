package jp.co.ikitsuke.logic;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopCategory;

/***
 * カテゴリ処理
 *
 * @author yositune64
 *
 */
public interface ShopCategoryLogic {

	/***
	 * カテゴリ一覧取得
	 * @param usrId
	 * @return
	 */
	public List<ShopCategory> getCategoryList(int usrId);

	/***
	 * カテゴリ名変更
	 * @param categoryId
	 * @param categoryName
	 */
	public void rename(int categoryId,String categoryName);

	/***
	 * カテゴリ削除
	 * @param categoryId
	 */
	public void delete(int categoryId);

}