package jp.co.ikitsuke.dataAccess.client;

import java.util.List;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.dataAccess.entity.ShopCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface ShopCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int countByExample(ShopCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int deleteByExample(ShopCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int deleteByPrimaryKey(Integer categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int insert(ShopCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int insertSelective(ShopCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    List<ShopCategory> selectByExample(ShopCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    ShopCategory selectByPrimaryKey(Integer categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByExampleSelective(@Param("record") ShopCategory record, @Param("example") ShopCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByExample(@Param("record") ShopCategory record, @Param("example") ShopCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByPrimaryKeySelective(ShopCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_category
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByPrimaryKey(ShopCategory record);
}