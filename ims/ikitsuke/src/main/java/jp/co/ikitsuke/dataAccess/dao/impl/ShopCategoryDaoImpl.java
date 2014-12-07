package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * 店舗カテゴリーDAO
 *
 * @author yositune64
 *
 */
@Component
public class ShopCategoryDaoImpl implements ShopCategoryDao {

	@Autowired
	private ShopCategory shopCategory1;

	@Autowired
	private ShopCategory shopCategory2;

	@Autowired
	private ShopCategory shopCategory3;

	@Autowired
	private ShopCategory shopCategory4;

	@Autowired
	private ShopCategory shopCategory5;

	@Autowired
	private ShopCategory shopCategory6;

	@Autowired
	private ShopCategory shopCategory7;

	@Autowired
	private ShopCategory shopCategory8;

	@Override
	public List<ShopCategory> findByUserId(Integer userId) {

		Date newDate = new Date();

		List<ShopCategory> shopCategoryList = new ArrayList<>();

		shopCategoryList.add(setValue(shopCategory1,1,"ランチ",userId,"0",newDate));
		shopCategoryList.add(setValue(shopCategory2,2,"居酒屋",userId,"0",newDate));
		shopCategoryList.add(setValue(shopCategory3,3,"",userId,"1",newDate));
		shopCategoryList.add(setValue(shopCategory4,4,"",userId,"1",newDate));
		shopCategoryList.add(setValue(shopCategory5,5,"",userId,"1",newDate));
		shopCategoryList.add(setValue(shopCategory6,6,"",userId,"1",newDate));
		shopCategoryList.add(setValue(shopCategory7,7,"",userId,"1",newDate));
		shopCategoryList.add(setValue(shopCategory8,8,"",userId,"1",newDate));

		return shopCategoryList;
	}

	@Override
	public void updateByCategoryName(Integer categoryId, String categoryName) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void updateByDisabledFlag(Integer categoryId) {
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
