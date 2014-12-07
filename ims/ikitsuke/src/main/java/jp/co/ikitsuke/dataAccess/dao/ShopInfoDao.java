package jp.co.ikitsuke.dataAccess.dao;

import java.util.List;

import jp.co.ikitsuke.dataAccess.entity.ShopInfo;

public interface ShopInfoDao {

	//店舗情報登録処理
	//TODO

	//店舗情報一覧取得処理
	List<ShopInfo> findByCategoryId(Integer categoryId);

	//店舗情報更新処理
	//TODO

	//店舗情報削除処理
	//TODO
}
