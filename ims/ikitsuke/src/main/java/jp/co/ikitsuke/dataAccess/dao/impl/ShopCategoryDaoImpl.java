package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;

import org.springframework.stereotype.Component;

/***
 * 店舗カテゴリーDAO
 *
 * @author yositune64
 *
 */
@Component
public class ShopCategoryDaoImpl implements ShopCategoryDao {

	@Override
	public List<ShopCategory> selectByUserId(Integer userId) {

		//テスト用に、DB接続せず適当な値を返します。

		Date newDate = new Date();

		List<ShopCategory> shopCategoryList = new ArrayList<>();

		shopCategoryList.add(setValue(new ShopCategory(),1,"ランチ",userId,"0",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),2,"居酒屋",userId,"0",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),3,"",userId,"1",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),4,"",userId,"1",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),5,"",userId,"1",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),6,"",userId,"1",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),7,"",userId,"1",newDate));
		shopCategoryList.add(setValue(new ShopCategory(),8,"",userId,"1",newDate));

		return shopCategoryList;
	}

	@Override
	public void updateByCategoryName(Integer categoryId, String categoryName) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void updateByDisabledFlag(Integer categoryId,String disabledFlag) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/***
	 * カテゴリ情報のセット処理
	 * <pre>
	 * テスト用のメソッド
	 * </pre>
	 *
	 * @param shopCategory
	 * @param categoryId
	 * @param categoryName
	 * @param userId
	 * @param disableFlag
	 * @param updateTime
	 * @return
	 */
	private ShopCategory setValue(ShopCategory shopCategory,
			Integer categoryId, String categoryName, Integer userId,
			String disableFlag,Date updateTime) {

		shopCategory.setCategoryId(categoryId);
		shopCategory.setCategoryName(categoryName);
		shopCategory.setUserId(userId);
		shopCategory.setDisableFlag(disableFlag);
		shopCategory.setUpdateTime(updateTime);

		return shopCategory;
	}

}
