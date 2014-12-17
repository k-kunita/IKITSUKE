package jp.co.ikitsuke.controller;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.form.LoginInputForm;
import jp.co.ikitsuke.logic.LoginLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	LoginLogic loginLogic;
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("LoginInputForm")LoginInputForm loginInputForm) {

		loginInputForm.setMailAddress("mailAddress");
		loginInputForm.setLoginPassword("loginPassword");
		
		//ログイン画面を表示
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("LoginInputForm")LoginInputForm loginInputForm, HttpServletRequest request) {
		
		String forward;
		
		if(loginLogic.executeLogin(loginInputForm.getMailAddress(), loginInputForm.getLoginPassword())){
			
			forward = "forward:/shop";
		}else{
			forward = "forward:/login";
		}
		
		System.out.println(loginInputForm.getMailAddress());
		System.out.println(loginInputForm.getLoginPassword());
		
		request.getSession().setAttribute("unko", "うんこ");

		//ログイン画面を表示
		return str;
	}

}
