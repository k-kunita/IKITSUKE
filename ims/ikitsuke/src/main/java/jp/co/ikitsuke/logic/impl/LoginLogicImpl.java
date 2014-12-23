package jp.co.ikitsuke.logic.impl;

import jp.co.ikitsuke.dataAccess.dao.LoginDao;
import jp.co.ikitsuke.dataAccess.entity.Login;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.model.LoginModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogicImpl implements LoginLogic {

	@Autowired
	LoginDao loginDao;

	@Override
	public LoginModel executeLogin(String mailAddress, String loginPassword) {

		// ログインモデル
		LoginModel loginModel = null;

		// ログインユーザ情報の取得
		Login login = loginDao.selectByMailAddressLoginPassword(mailAddress,loginPassword);

		// 取得に成功した場合
		if (login != null) {
			loginModel = new LoginModel();
			loginModel.setMailAddress(login.getMailAddress());
			loginModel.setLoginPassword(login.getLoginPassword());
			loginModel.setUserId(login.getUserId());
			loginModel.setCreateDateTime(login.getCreateDateTime());
			loginModel.setLastUpdateTime(login.getUpdateTime());
		}

		return loginModel;
	}

}
