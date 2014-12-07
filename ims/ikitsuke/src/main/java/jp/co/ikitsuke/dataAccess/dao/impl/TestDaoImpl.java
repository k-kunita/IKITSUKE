package jp.co.ikitsuke.dataAccess.dao.impl;

import jp.co.ikitsuke.dataAccess.dao.TestDao;

import org.springframework.stereotype.Component;

@Component
public class TestDaoImpl implements TestDao {

	@Override
	public String output() {
		return "test成功！";
	}

}
