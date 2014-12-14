package jp.co.ikitsuke.logic.impl;

import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.ShopInfo;
import jp.co.ikitsuke.logic.ShopInfoLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopInfoLogicImpl implements ShopInfoLogic {

	@Autowired
	ShopInfoDao shopInfoDao;

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
