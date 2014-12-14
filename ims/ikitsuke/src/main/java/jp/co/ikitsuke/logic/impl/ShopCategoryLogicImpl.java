package jp.co.ikitsuke.logic.impl;

import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.logic.ShopCategoryLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCategoryLogicImpl implements ShopCategoryLogic{

	@Autowired
	ShopCategoryDao shopCategoryDao;

	@Autowired
	ShopInfoDao shopInfoDao;

	@Override
	public List<ShopCategory> getCategoryList(int userId) {
		//TODO 取得失敗時の処理
		return shopCategoryDao.selectByUserId(userId);
	}

	@Override
	public void rename(int categoryId, String categoryName) {
		//TODO 更新失敗時の処理
		shopCategoryDao.updateCategoryNameByCategoryId(categoryId, categoryName);
	}

	@Override
	public void delete(int categoryId) {
		//TODO 削除失敗時の処理
		shopCategoryDao.updateDisabledFlagByCategoryId(categoryId);
		shopInfoDao.deleteByCategoryId(categoryId);
	}

}
