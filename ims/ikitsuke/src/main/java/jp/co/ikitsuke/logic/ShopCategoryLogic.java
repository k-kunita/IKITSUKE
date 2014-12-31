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
	 * <pre>
	 * ユーザIDをキーにカテゴリー情報のListを取得する。
	 * リストが取得できない場合はnullを返す。
	 * </pre>
	 * @param usrId
	 * @return カテゴリ一覧
	 */
	public List<ShopCategoryModel> getCategoryList(int usrId);

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