package jp.co.ikitsuke.controller;

import java.security.Principal;
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
public class ErrorpageController {
    
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView error() {
        // エラー画面を表示
        return new ModelAndView("error");
    }

}
