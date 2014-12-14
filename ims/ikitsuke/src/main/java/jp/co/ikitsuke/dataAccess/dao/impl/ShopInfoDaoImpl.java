package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.Date;
import java.util.List;

import jp.co.ikitsuke.dataAccess.client.ShopInfoMapper;
import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.ShopInfo;
import jp.co.ikitsuke.dataAccess.entity.ShopInfoExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShopInfoDaoImpl implements ShopInfoDao {


	ShopInfo record;

	@Autowired
	ShopInfoMapper mapper;

	ShopInfoExample example;


	@Override
	public List<ShopInfo> selectByCategoryId(Integer categoryId) {

		example = new ShopInfoExample();
		//カテゴリID指定による検索
		example.createCriteria().andCategoryIdEqualTo(categoryId);

		return mapper.selectByExample(example);
	}

	@Override
	public int insert(ShopInfo record) {

		return mapper.insert(record);
	}

	@Override
	public int updateByShopId(ShopInfo record) {

		record.setUpdateTime(new Date());

		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByShopId(Integer shopId) {

		record = new ShopInfo();

		record.setShopId(shopId);
		record.setUpdateTime(new Date());
		//論理削除フラグに１をセット
		record.setDeleteFlag("1");

		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByCategoryId(Integer categoryId) {

		record = new ShopInfo();

		record.setUpdateTime(new Date());
		//論理削除フラグに１をセット
		record.setDeleteFlag("1");

		//検索条件にカテゴリーIDをセット
		example.createCriteria().andCategoryIdEqualTo(categoryId);

		return mapper.updateByExampleSelective(record, example);
	}

}
