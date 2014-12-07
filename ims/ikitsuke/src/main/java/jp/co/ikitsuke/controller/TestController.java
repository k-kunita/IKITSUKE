package jp.co.ikitsuke.controller;

import java.util.List;
import java.util.Locale;

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

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome test! The client locale is {}.", locale);

		List<ShopCategory> shopCategoryList = shopCategoryLogic.findByUserId(2);

		System.out.println(shopCategoryList);

		return new ModelAndView("home");
	}

}
