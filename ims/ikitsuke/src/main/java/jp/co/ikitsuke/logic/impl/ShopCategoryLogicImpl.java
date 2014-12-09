package jp.co.ikitsuke.logic.impl;

import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.logic.ShopCategoryLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 *カテゴリー一覧処理
 * @author yositune64
 *
 */
@Component
public class ShopCategoryLogicImpl implements ShopCategoryLogic{

	@Autowired
	ShopCategoryDao shopCategoryDao;

	@Override
	public List<ShopCategory> findByUserId(Integer userId) {

		return shopCategoryDao.selectByUserId(userId);
	}

}
