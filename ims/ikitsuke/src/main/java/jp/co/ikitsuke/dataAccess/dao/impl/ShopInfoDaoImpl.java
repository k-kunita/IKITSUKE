package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.ShopInfo;

import org.springframework.stereotype.Component;

@Component
public class ShopInfoDaoImpl implements ShopInfoDao {


	@Override
	public List<ShopInfo> selectByCategoryId(Integer categoryId) {

		//テスト用に値を返します

		List<ShopInfo> shopInfoList = new ArrayList<>();

		// システム日付
		Date currentDate = new Date();

		if (categoryId == 1) {
			shopInfoList.add(setValue(new ShopInfo(), 1, 1, "焼肉　叙庵", "339807595",
					"ハラミがうまい",
					"http://tabelog.com/tokyo/A1305/A130501/13003894/", "0",
					currentDate));
			shopInfoList.add(setValue(new ShopInfo(), 2, 1, "紅龍門", "353911898",
					"ランチは担々麺。階段が急なので雨の日は注意。",
					"http://tabelog.com/tokyo/A1305/A130501/13093393/", "0",
					currentDate));
		} else {
			shopInfoList.add(setValue(new ShopInfo(), 4, 2, "てば次郎 ", "5057877699",
					"平日は翌５時まで、日曜日は23時まで営業",
					"http://r.gnavi.co.jp/j0yj9mgu0000/", "0", currentDate));
		}
		return shopInfoList;
	}

	/***
	 * 店舗情報のセット処理
	 * <pre>
	 * テスト用のメソッド
	 * </pre>
	 *
	 * @param shopInfo
	 * @param shopId
	 * @param categoryId
	 * @param shopName
	 * @param shopTel
	 * @param shopMemo
	 * @param shopUrl
	 * @param deleteFlag
	 * @param updateTime
	 * @return 店舗情報
	 */
	private ShopInfo setValue(ShopInfo shopInfo, Integer shopId,
			Integer categoryId, String shopName, String shopTel,
			String shopMemo, String shopUrl, String deleteFlag, Date updateTime) {

		shopInfo.setShopId(shopId);
		shopInfo.setCategoryId(categoryId);
		shopInfo.setShopName(shopName);
		shopInfo.setShopTel(shopTel);
		shopInfo.setShopMemo(shopMemo);
		shopInfo.setShopUrl(shopUrl);
		shopInfo.setDeleteFlag(deleteFlag);
		shopInfo.setUpdateTime(updateTime);

		return shopInfo;
	}

	@Override
	public Integer insert(ShopInfo shopInfo) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Integer updateByShopId(ShopInfo shopInfo) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Integer deleteByShopId(Integer shopId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Integer deleteByCategoryId(Integer categoryId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}