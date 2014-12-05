package jp.co.ikitsuke.dataAccess.client;

import java.util.List;
import jp.co.ikitsuke.dataAccess.entity.ShopInfo;
import jp.co.ikitsuke.dataAccess.entity.ShopInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int countByExample(ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int deleteByExample(ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int deleteByPrimaryKey(Integer shopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int insert(ShopInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int insertSelective(ShopInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    List<ShopInfo> selectByExample(ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    ShopInfo selectByPrimaryKey(Integer shopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByPrimaryKeySelective(ShopInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_info
     *
     * @mbggenerated Thu Dec 04 20:22:10 JST 2014
     */
    int updateByPrimaryKey(ShopInfo record);
}