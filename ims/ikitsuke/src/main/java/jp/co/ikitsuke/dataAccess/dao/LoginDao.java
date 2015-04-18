package jp.co.ikitsuke.dataAccess.dao;

import jp.co.ikitsuke.dataAccess.entity.Login;

public interface LoginDao {

    // メールアドレスとパスワード指定によるログイン情報の取得
    public Login selectByMailAddressLoginPassword(String mailAddress, String loginPassword);
    
    // メールアドレスからログイン情報の取得
    public Login selectByMailAddress(String mailAddress);
}
