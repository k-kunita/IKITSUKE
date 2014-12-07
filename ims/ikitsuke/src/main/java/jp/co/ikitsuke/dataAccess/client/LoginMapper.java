package jp.co.ikitsuke.dataAccess.client;

import java.util.List;
import jp.co.ikitsuke.dataAccess.entity.Login;
import jp.co.ikitsuke.dataAccess.entity.LoginExample;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int countByExample(LoginExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int deleteByExample(LoginExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int deleteByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int insert(Login record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int insertSelective(Login record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	List<Login> selectByExample(LoginExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	Login selectByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int updateByExampleSelective(@Param("record") Login record,
			@Param("example") LoginExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int updateByExample(@Param("record") Login record,
			@Param("example") LoginExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int updateByPrimaryKeySelective(Login record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table login
	 * @mbggenerated  Sun Dec 07 22:06:14 JST 2014
	 */
	int updateByPrimaryKey(Login record);
}