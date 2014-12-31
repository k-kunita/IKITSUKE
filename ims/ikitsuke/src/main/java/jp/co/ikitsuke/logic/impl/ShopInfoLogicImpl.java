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
	public List<ShopInfoModel> getShopInfo(int categoryId) {

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
	public void register(Integer shopId, Integer categoryId, String shopName,
			String shopTel, String shopMemo, String shopUrl) {

		ShopInfo shopInfo = new ShopInfo();

		shopInfo.setShopId(shopId);
		shopInfo.setCategoryId(categoryId);
		shopInfo.setShopName(shopName);
		shopInfo.setShopTel(shopTel);
		shopInfo.setShopMemo(shopMemo);
		shopInfo.setShopUrl(shopUrl);

		//INSERT処理の実行
		shopInfoDao.insert(shopInfo);
		//TODO 登録失敗時の挙動

	}

	@Override
	public void update(Integer shopId, Integer categoryId, String shopName,
			String shopTel, String shopMemo, String shopUrl) {

		ShopInfo shopInfo = new ShopInfo();

		shopInfo.setShopId(shopId);
		shopInfo.setCategoryId(categoryId);
		shopInfo.setShopName(shopName);
		shopInfo.setShopTel(shopTel);
		shopInfo.setShopMemo(shopMemo);
		shopInfo.setShopUrl(shopUrl);

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

}
