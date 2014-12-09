package jp.co.ikitsuke.model;

import java.util.Date;

/**
 * ���H�X��񃂃f��
 *
 * @author watanabe
 *
 */
public class ShopInfoModel {

	/** ���H�XID */
	private int shop_id;

	/** ���H�X�J�e�S��ID */
	private int category_id;

	/** ���H�X�� */
	private String shop_name;

	/** �d�b�ԍ� */
	private String shop_tel;

	/** ���l */
	private String shop_memo;

	/** �Q��URL */
	private String shop_page_url;

	/** �����t���O */
	private boolean delete_flag;

	/** �X�V���� (YYYYMMDDHHMM) */
	private Date last_update_time;

	/**
	 * ���H�XID���擾����
	 *
	 * @return shop_id
	 */
	public int getShopId() {
		return shop_id;
	}

	/**
	 * ���H�XID��ݒ肷��
	 *
	 * @param shop_id
	 *            �Z�b�g���� shop_id
	 */
	public void setShopId(int shop_id) {
		this.shop_id = shop_id;
	}

	/**
	 * ���H�X�J�e�S��ID���擾����
	 *
	 * @return category_id
	 */
	public int getCategoryId() {
		return category_id;
	}

	/**
	 * ���H�X�J�e�S��ID��ݒ肷��
	 *
	 * @param category_id
	 *            �Z�b�g���� category_id
	 */
	public void setCategoryId(int category_id) {
		this.category_id = category_id;
	}

	/**
	 * ���H�X�����擾����
	 *
	 * @return shop_name
	 */
	public String getShopName() {
		return shop_name;
	}

	/**
	 * ���H�X����ݒ肷��
	 *
	 * @param shop_name
	 *            �Z�b�g���� shop_name
	 */
	public void setShopName(String shop_name) {
		this.shop_name = shop_name;
	}

	/**
	 * �d�b�ԍ����擾����
	 *
	 * @return shop_tel
	 */
	public String getShopTel() {
		return shop_tel;
	}

	/**
	 * �d�b�ԍ���ݒ肷��
	 *
	 * @param shop_tel
	 *            �Z�b�g���� shop_tel
	 */
	public void setShopTel(String shop_tel) {
		this.shop_tel = shop_tel;
	}

	/**
	 * ���l���擾����
	 *
	 * @return shop_memo
	 */
	public String getShopMemo() {
		return shop_memo;
	}

	/**
	 * ���l��ݒ肷��
	 *
	 * @param shop_memo
	 *            �Z�b�g���� shop_memo
	 */
	public void setShopMemo(String shop_memo) {
		this.shop_memo = shop_memo;
	}

	/**
	 * �Q��URL���擾����
	 *
	 * @return shop_page_url
	 */
	public String getShopPageUrl() {
		return shop_page_url;
	}

	/**
	 * �Q��URL��ݒ肷��
	 *
	 * @param shop_page_url
	 *            �Z�b�g���� shop_page_url
	 */
	public void setShopPageUrl(String shop_page_url) {
		this.shop_page_url = shop_page_url;
	}

	/**
	 * �����t���O���擾����
	 *
	 * @return delete_flag
	 */
	public boolean isDeleteFlag() {
		return delete_flag;
	}

	/**
	 * �����t���O��ݒ肷��
	 *
	 * @param delete_flag
	 *            �Z�b�g���� delete_flag
	 */
	public void setDeleteFlag(boolean delete_flag) {
		this.delete_flag = delete_flag;
	}

	/**
	 * �X�V���� (YYYYMMDDHHMM)���擾����
	 *
	 * @return last_update_time
	 */
	public Date getLastUpdateTime() {
		return last_update_time;
	}

	/**
	 * �X�V���� (YYYYMMDDHHMM)��ݒ肷��
	 *
	 * @param last_update_time
	 *            �Z�b�g���� last_update_time
	 */
	public void setLastUpdateTime(Date last_update_time) {
		this.last_update_time = last_update_time;
	}

}
