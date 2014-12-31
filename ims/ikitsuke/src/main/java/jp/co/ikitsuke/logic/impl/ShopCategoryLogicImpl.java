package jp.co.ikitsuke.logic.impl;

import java.util.ArrayList;
import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.utils.ConvertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopCategoryLogicImpl implements ShopCategoryLogic{

	@Autowired
	ShopCategoryDao shopCategoryDao;

	@Autowired
	ShopInfoDao shopInfoDao;

	@Override
	public List<ShopCategoryModel> getCategoryList(int userId) {
		//TODO 取得失敗時の処理

		List<ShopCategoryModel> shopCategoryModelList = null;

		List<ShopCategory> shopCategoryList = shopCategoryDao.selectByUserId(userId);

		//要素ありの場合のみ
		if(!shopCategoryList.isEmpty()){

			//ArrayListインスタンスの生成
			shopCategoryModelList = new ArrayList<>();

			//取得した要素をすべてModelListにセット
			for(ShopCategory shopCategory:shopCategoryList){
				ShopCategoryModel shopCategoryModel = new ShopCategoryModel();
				shopCategoryModel.setCategoryId(shopCategory.getCategoryId());
				shopCategoryModel.setCategoryName(shopCategory.getCategoryName());
				shopCategoryModel.setUserId(shopCategory.getUserId());
				shopCategoryModel.setLastUpdateTime(shopCategory.getUpdateTime());
				shopCategoryModel.setDisableFlag(ConvertUtil.convertStringFlg(shopCategory.getDisableFlag()));

				//ModelListに追加
				shopCategoryModelList.add(shopCategoryModel);
			}

		}

		return shopCategoryModelList;
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
