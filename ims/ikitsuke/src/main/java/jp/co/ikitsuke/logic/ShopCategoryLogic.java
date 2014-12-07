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

	/** カテゴリー一覧の取得 */
	public List<ShopCategory> findByUserId(Integer usrId);

}
