package jp.co.ikitsuke.logic.impl;

import jp.co.ikitsuke.dataAccess.dao.LoginDao;
import jp.co.ikitsuke.dataAccess.entity.Login;
import jp.co.ikitsuke.logic.LoginLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogicImpl implements LoginLogic {

	@Autowired
	LoginDao loginDao;

	@Override
	public boolean executeLogin(String mailAddress, String loginPassword) {

		//登録済みユーザ
		boolean registeredUser = false;

		//ログインユーザ情報の取得
		Login login = loginDao.selectByMailAddressLoginPassword(mailAddress, loginPassword);

		//取得に成功した場合
		if(login != null){
			registeredUser = true;
			//TODO ログイン情報のセッションを作成
		}
		return registeredUser;
	}

}
