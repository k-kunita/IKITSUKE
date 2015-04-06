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
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true)
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

	@Override
	public ShopCategoryModel getCategory(int categoryId) {
		
		ShopCategoryModel  shopCategoryModel = null;
		
		//ショップカテゴリー情報の取得
		ShopCategory shopCategory = shopCategoryDao.selectByCategoryId(categoryId);
		
		//取得成功の場合
		if(shopCategory != null && shopCategory.getCategoryId() != null){
			//Modelのインスタンス生成
			shopCategoryModel = new ShopCategoryModel();
			//Modelにカテゴリー情報をセット
			shopCategoryModel.setCategoryId(categoryId);
			shopCategoryModel.setCategoryName(shopCategory.getCategoryName());
			shopCategoryModel.setShopInfoList(null);
			shopCategoryModel.setUserId(shopCategory.getUserId());
			shopCategoryModel.setLastUpdateTime(shopCategory.getUpdateTime());
			shopCategoryModel.setDisableFlag(ConvertUtil.convertStringFlg(shopCategory.getDisableFlag()));
		}

		return shopCategoryModel;
	}

    @Override
    public void add(int userId) {
        
        // ユーザIDが入力されている場合のみ
        if(userId != 0){
        // 追加するエンティティのインスタンス
            ShopCategory shopCategory = new ShopCategory();
            shopCategory.setUserId(userId);
            shopCategory.setCategoryName(null);
            
            shopCategoryDao.insert(shopCategory);
        }else{
            // TODO ユーザID未入力時の処理がない
        }
    }

}
