package jp.co.ikitsuke.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.Validator;

import jp.co.ikitsuke.form.ErrorMessageForm;
import jp.co.ikitsuke.form.LoginInputForm;
import jp.co.ikitsuke.form.part.ErrorMessagePart;
import jp.co.ikitsuke.logic.ErrorMessageLogic;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.model.ErrorMessageModel;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.utils.ConvertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    LoginLogic loginLogic;

    @Autowired
    private ErrorMessageLogic errorMessageLogic;

    @Autowired
    private Validator validator;

    LoginModel loginModel;
    ErrorMessageModel errorMessageModel;

    @RequestMapping(value = "/login" ,method = RequestMethod.GET )
    public ModelAndView login(@ModelAttribute("LoginInputForm") LoginInputForm loginInputForm) {

        loginInputForm.setMailAddress("ikitsuke@ims.com");
        loginInputForm.setLoginPassword("password123");

        // ログイン画面を表示
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(
            @Valid @ModelAttribute("LoginInputForm") LoginInputForm loginInputForm,
            BindingResult bindingResult,
            HttpServletRequest request) {

        // 遷移先
        String redirect ;

        //バリデーション処理
        if(bindingResult.hasErrors()){
            System.out.println("errorです");
            ErrorMessageForm errorForm = new ErrorMessageForm();

            //InputFormのバリデーションメッセージを取得しエラーPartListにセット
            List<ErrorMessagePart> errorPartList
                = ConvertUtil.toErrorMessageParts(errorMessageLogic.addMessage(validator.validate(loginInputForm)));

            if(errorPartList != null){
                errorForm.setErrorMessageList(errorPartList);
                //セッションにエラーフォームをセット
                System.out.println(errorForm.toString());
                request.getSession().setAttribute("errorMessageForm", errorForm);
            }
            return "/login";
        }

        // メールアドレスとパスワードによりログイン情報を取得
        loginModel = loginLogic.executeLogin(loginInputForm.getMailAddress(), loginInputForm.getLoginPassword());

        // モデルの有無判定
        if (loginModel != null) {
            // ログイン成功時
            // ログインモデルをセッションに保管
            request.getSession().setAttribute("loginModel", loginModel);
            redirect = "redirect:/categoryList";
        } else {
            // ログイン失敗時
            redirect = "redirect:/login";
        }

        request.getSession().setAttribute("unko", "うんこ");

        return redirect;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String doLogout(HttpServletRequest request) {

        // セッションの取り消し
        request.getSession().setAttribute("loginModel", null);

        // ログイン画面を表示
        return "redirect:/login";
    }

}
