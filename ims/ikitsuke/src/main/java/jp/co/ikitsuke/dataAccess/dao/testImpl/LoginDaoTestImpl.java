package jp.co.ikitsuke.dataAccess.dao.testImpl;

import java.util.Date;

import jp.co.ikitsuke.dataAccess.dao.LoginDao;
import jp.co.ikitsuke.dataAccess.entity.Login;

import org.springframework.stereotype.Component;

@Component
public class LoginDaoTestImpl implements LoginDao {


	Login login = new Login();

	@Override
	public Login selectByMailAddressLoginPassword(String mailAddress,
			String loginPassword) {

		login.setMailAddress(mailAddress);
		login.setUserId(1);
		login.setLoginPassword(loginPassword);
		login.setCreateDateTime(new Date());
		login.setUpdateTime(new Date());

		System.out.println("testImple tuuka!");

		return login;
	}

    @Override
    public Login selectByMailAddress(String mailAddress) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }


}
