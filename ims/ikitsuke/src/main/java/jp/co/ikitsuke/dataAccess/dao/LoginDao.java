package jp.co.ikitsuke.dataAccess.dao;

import jp.co.ikitsuke.dataAccess.entity.Login;

public interface LoginDao {

	//ログイン情報の取得
	public Login findByMailAddressAndLoginPassword(String mailAddress,String loginPassword);

}
