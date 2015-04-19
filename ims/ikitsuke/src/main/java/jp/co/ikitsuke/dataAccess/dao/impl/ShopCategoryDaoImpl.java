package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.Date;
import java.util.List;

import jp.co.ikitsuke.dataAccess.client.ShopCategoryMapper;
import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.dataAccess.entity.ShopCategoryExample;
import jp.co.ikitsuke.model.ShopCategoryModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/***
 * 店舗カテゴリーDAO
 *
 * @author yositune64
 *
 */
@Repository
public class ShopCategoryDaoImpl implements ShopCategoryDao {

    ShopCategory record;

    @Autowired
    ShopCategoryMapper mapper;

    ShopCategoryExample example;

    @Override
    public List<ShopCategory> selectByUserId(int userId) {

        example = new ShopCategoryExample();

        // ユーザIDによる検索
        example.createCriteria().andUserIdEqualTo(userId);

        return mapper.selectByExample(example);
    }

    @Override
    public int updateByCategoryId(ShopCategoryModel model) {

        record = new ShopCategory();

        record.setCategoryId(model.getCategoryId());
        record.setCategoryName(model.getCategoryName());
        record.setUpdateTime(new Date());
        record.setDisableFlag("0");

        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateDisabledFlagByCategoryId(int categoryId) {

        record = new ShopCategory();

        record.setCategoryId(categoryId);
        record.setUpdateTime(new Date());
        // 無効フラグに1をセット
        record.setDisableFlag("1");

        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public ShopCategory selectByCategoryId(int categoryId) {

        return mapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public int insert(ShopCategory shopCategory) {

        // 更新結果
        int result = 0;

        // userIdが入力されている場合にInsert処理を実施
        if (shopCategory == null || shopCategory.getUserId() == 0) {
            return result;
        }

        shopCategory.setDisableFlag("0");
        shopCategory.setUpdateTime(new Date());
        // 追加処理の実行
        mapper.insert(shopCategory);
        result = 1;

        return result;
        
    }

}
