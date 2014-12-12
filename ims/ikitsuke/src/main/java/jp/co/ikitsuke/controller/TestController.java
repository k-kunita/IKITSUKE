package jp.co.ikitsuke.controller;

import java.util.List;
import java.util.Locale;

import jp.co.ikitsuke.dataAccess.client.LoginMapper;
import jp.co.ikitsuke.dataAccess.client.ShopInfoMapper;
import jp.co.ikitsuke.dataAccess.dao.LoginDao;
import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.Login;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
import jp.co.ikitsuke.dataAccess.entity.ShopInfo;
import jp.co.ikitsuke.logic.ShopCategoryLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@Autowired
	ShopCategoryLogic shopCategoryLogic;

	@Autowired
	LoginDao loginDao;

	@Autowired
	ShopInfoDao shopInfoDao;

	@Autowired
	LoginMapper loginMapper;

	@Autowired
	ShopInfoMapper shopInfoMapper;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome test! The client locale is {}.", locale);

		List<ShopCategory> shopCategoryList = shopCategoryLogic.findByUserId(2);

		List<ShopInfo> shopInfoList = shopInfoDao.selectByCategoryId(1);

		ShopInfo shopInfo = shopInfoList.get(1);
		shopInfo.setCategoryId(1);
		shopInfo.setShopId(4);
		//インサート文の実行
		shopInfoMapper.insert(shopInfo);


//		Login login = loginDao.selectByMailAddressLoginPassword("mail", "pass");

		Login login = loginMapper.selectByPrimaryKey(1);

		System.out.println(shopCategoryList);
		System.out.println("test 通過！！");

		return new ModelAndView("home");
	}

}
