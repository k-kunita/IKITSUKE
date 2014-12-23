package jp.co.ikitsuke.controller;

import java.util.List;
import java.util.Locale;

import jp.co.ikitsuke.dataAccess.dao.LoginDao;
import jp.co.ikitsuke.dataAccess.dao.ShopCategoryDao;
import jp.co.ikitsuke.dataAccess.dao.ShopInfoDao;
import jp.co.ikitsuke.dataAccess.entity.Login;
import jp.co.ikitsuke.dataAccess.entity.ShopCategory;
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
	ShopCategoryDao shopCategoryDao;

	@Autowired
	ShopInfoDao shopInfoDao;


	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome test! The client locale is {}.", locale);

		Login login = loginDao.selectByMailAddressLoginPassword("ikitsuke@ims.com", "password");

		List<ShopCategory> shopCategoryList = shopCategoryDao.selectByUserId(1);
		int shopCategoryUpdateResult = shopCategoryDao.updateCategoryNameByCategoryId(2, "朝飯");
		int shopCategoryUpdateResult2 = shopCategoryDao.updateDisabledFlagByCategoryId(1);

//		List<ShopInfo> shopInfoList = shopInfoDao.selectByCategoryId(2);
//		ShopInfo shopInfo = shopInfoList.get(0);
//		shopInfo.setShopId(null);
//		int result3 = shopInfoDao.insert(shopInfo);
//		ShopInfo shopInfo2 = shopInfoList.get(1);
//		shopInfo2.setShopTel("99999");
//		int result4 = shopInfoDao.updateByShopId(shopInfo2);
//
//		int result5 = shopInfoDao.deleteByShopId(2);
//		request.getSession().setAttribute("unko", "うんこ");

		System.out.println("test 通過！！");

		return new ModelAndView("home");
	}

}
