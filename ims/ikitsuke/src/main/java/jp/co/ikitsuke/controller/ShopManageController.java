package jp.co.ikitsuke.controller;

import jp.co.ikitsuke.form.LoginInputForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopManageController {

	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("LoginInputForm")LoginInputForm loginInputForm) {

		loginInputForm.setMailAddress("mailAddress");
		loginInputForm.setLoginPassword("loginPassword");


		//ログイン画面を表示
		return new ModelAndView("login");
	}

}
