package jp.co.ikitsuke.controller;

import java.util.Locale;

import jp.co.ikitsuke.form.LoginInputForm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLogin(Locale locale, Model model) {

		//ログイン画面を表示
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login/in", method = RequestMethod.POST)
	public ModelAndView postLogin(@ModelAttribute("LoginInputForm")LoginInputForm loginInputForm) {

		System.out.println(loginInputForm);
		System.out.println("aaaa");

		//ログイン画面を表示
		return new ModelAndView("login");
	}


}
