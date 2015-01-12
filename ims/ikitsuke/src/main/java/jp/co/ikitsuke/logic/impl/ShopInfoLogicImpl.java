package jp.co.ikitsuke.logic.impl;

import java.util.ArrayList;
import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.ShopInfo;
import jp.co.ikitsuke.logic.ShopInfoLogic;
import jp.co.ikitsuke.model.ShopInfoModel;
import jp.co.ikitsuke.utils.ConvertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopInfoLogicImpl implements ShopInfoLogic {

	@Autowired
	ShopInfoDao shopInfoDao;


	@Override
	public List<ShopInfoModel> getShopInfoList(int categoryId) {

		List<ShopInfoModel> shopInfoModelList = null;

		List<ShopInfo> shopInfoList = shopInfoDao.selectByCategoryId(categoryId);

		//検索結果が存在する場合はmodelに変換
		if(shopInfoList != null && !shopInfoList.isEmpty() ){
			shopInfoModelList = new ArrayList<>();

			//取得した結果をすべてmodelにセット
			for(ShopInfo entity:shopInfoList){

				ShopInfoModel model = new ShopInfoModel();
				model.setShopId(entity.getShopId());
				model.setShopName(entity.getShopName());
				model.setCategoryId(entity.getCategoryId());
				model.setShopMemo(entity.getShopMemo());
				model.setShopPageUrl(entity.getShopUrl());
				model.setShopTel(entity.getShopTel());
				model.setDeleteFlag(ConvertUtil.convertStringFlg(entity.getDeleteFlag()));
				model.setLastUpdateTime(entity.getUpdateTime());

				shopInfoModelList.add(model);
			}
		}

		return shopInfoModelList;
	}

	@Override
	public void register(ShopInfoModel shopInfoModel) {

		ShopInfo shopInfo = new ShopInfo();

		shopInfo.setCategoryId(shopInfoModel.getCategoryId());
		shopInfo.setShopName(shopInfoModel.getShopName());
		shopInfo.setShopTel(shopInfoModel.getShopTel());
		shopInfo.setShopMemo(shopInfoModel.getShopMemo());
		shopInfo.setShopUrl(shopInfoModel.getShopPageUrl());

		//INSERT処理の実行
		shopInfoDao.insert(shopInfo);
		//TODO 登録失敗時の挙動

	}

	@Override
	public void update(ShopInfoModel shopInfoModel) {

		ShopInfo shopInfo = new ShopInfo();

		shopInfo.setShopId(shopInfoModel.getShopId());
		shopInfo.setCategoryId(shopInfoModel.getCategoryId());
		shopInfo.setShopName(shopInfoModel.getShopName());
		shopInfo.setShopTel(shopInfoModel.getShopTel());
		shopInfo.setShopMemo(shopInfoModel.getShopMemo());
		shopInfo.setShopUrl(shopInfoModel.getShopPageUrl());
		

		//UPDATE処理の実行
		shopInfoDao.updateByShopId(shopInfo);
		//TODO 更新失敗時の挙動
	}

	@Override
	public void delete(Integer shopId) {

		//論理削除処理の実行
		shopInfoDao.deleteByShopId(shopId);
		//TODO 更新失敗時の挙動
	}

	@Override
	public ShopInfoModel getShopInfo(int shopId) {
		
		ShopInfoModel shopInfoModel = null;
		
		//店舗IDによる店舗情報の取得
		ShopInfo shopInfo = shopInfoDao.selectByShopId(shopId);
		
		//取得成功の場合はModelに値をセット
		if(shopInfo != null && shopInfo.getShopId() != null){
			shopInfoModel = new ShopInfoModel();
			shopInfoModel.setShopId(shopInfo.getShopId());
			shopInfoModel.setShopName(shopInfo.getShopName());
			shopInfoModel.setShopTel(shopInfo.getShopTel());
			shopInfoModel.setShopPageUrl(shopInfo.getShopUrl());
			shopInfoModel.setShopMemo(shopInfo.getShopMemo());
			shopInfoModel.setCategoryId(shopInfo.getCategoryId());
			shopInfoModel.setLastUpdateTime(shopInfo.getUpdateTime());
			shopInfoModel.setDeleteFlag(ConvertUtil.convertStringFlg(shopInfo.getDeleteFlag()));
		}
		
		return shopInfoModel;
	}

}
