package jp.co.ikitsuke.controller;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.form.LoginInputForm;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.model.LoginModel;

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

	LoginModel loginModel;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("LoginInputForm")LoginInputForm loginInputForm) {

		loginInputForm.setMailAddress("ikitsuke@ims.com");
		loginInputForm.setLoginPassword("password");

		//ログイン画面を表示
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("LoginInputForm")LoginInputForm loginInputForm, HttpServletRequest request) {

		//遷移先
		String redirect;

		//メールアドレスとパスワードによりログイン情報を取得
		loginModel = loginLogic.executeLogin(loginInputForm.getMailAddress(), loginInputForm.getLoginPassword());

		//モデルの有無判定
		if(loginModel != null){
			//ログイン成功時
			//ログインモデルをセッションに保管
			request.getSession().setAttribute("loginModel", loginModel);
			redirect = "redirect:/shop";
		}else{
			//ログイン失敗時
			redirect = "redirect:/login";
		}

		System.out.println(loginInputForm.getMailAddress());
		System.out.println(loginInputForm.getLoginPassword());

		request.getSession().setAttribute("unko", "うんこ");

		return redirect;
	}

}
