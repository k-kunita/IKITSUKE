package jp.co.ikitsuke.dataAccess.dao.impl;

import java.util.ArrayList;
import java.util.List;

import jp.co.ikitsuke.dataAccess.client.LoginMapper;
import jp.co.ikitsuke.dataAccess.dao.LoginDao;
import jp.co.ikitsuke.dataAccess.entity.Login;
import jp.co.ikitsuke.dataAccess.entity.LoginExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	Login record;

	List<Login> loginList;

	@Autowired
	LoginMapper mapper;

	LoginExample example;

	@Override
	public Login selectByMailAddressLoginPassword(String mailAddress,
			String loginPassword) {

		record = null;

		loginList = new ArrayList<>();

		example = new LoginExample();

		// 検索条件の作成
		example.createCriteria().andMailAddressEqualTo(mailAddress)
				.andLoginPasswordEqualTo(loginPassword);

		// メールアドレス・パスワードによる検索
		loginList = mapper.selectByExample(example);

		// 複数取得の場合
		if (loginList.size() == 1) {
			System.out.println("レコード取得成功");
			// 取得数が1の場合、配列0を返す
			record = loginList.get(0);
		} else {
			System.out.println("取得レコード数が不正");
			System.out.println("mailAddress:" + mailAddress + ",loginPassword:"
					+ loginPassword);
			System.out.println("取得レコード数：" + loginList.size());
			System.out.println(loginList);
		}
		return record;
	}

}
