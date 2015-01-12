package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.Date;
import java.util.List;

import jp.co.ikitsuke.dataAccess.client.ShopCategoryMapper;
import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.dataAccess.entity.ShopCategoryExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/***
 * 店舗カテゴリーDAO
 *
 * @author yositune64
 *
 */
@Repository
public class ShopCategoryDaoImpl implements ShopCategoryDao {

	ShopCategory record;

	@Autowired
	ShopCategoryMapper mapper;

	ShopCategoryExample example;

	@Override
	public List<ShopCategory> selectByUserId(int userId) {

		example = new ShopCategoryExample();

		// ユーザIDによる検索
		example.createCriteria().andUserIdEqualTo(userId);

		return mapper.selectByExample(example);
	}

	@Override
	public int updateCategoryNameByCategoryId(int categoryId, String categoryName) {

		record = new ShopCategory();

		record.setCategoryId(categoryId);
		record.setUpdateTime(new Date());
		// 変更後のカテゴリー名をセット
		record.setCategoryName(categoryName);
		// 無効フラグに0をセット
		record.setDisableFlag("0");

		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateDisabledFlagByCategoryId(int categoryId) {

		record = new ShopCategory();

		record.setCategoryId(categoryId);
		record.setUpdateTime(new Date());
		// 無効フラグに1をセット
		record.setDisableFlag("1");

		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public ShopCategory selectByCategoryId(int categoryId) {
		
		return mapper.selectByPrimaryKey(categoryId);
	}

}
