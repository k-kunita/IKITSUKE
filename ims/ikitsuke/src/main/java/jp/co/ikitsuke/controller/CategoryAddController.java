package jp.co.ikitsuke.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import jp.co.ikitsuke.form.CategoryAddInputForm;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.model.ShopCategoryModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryAddController {

    LoginModel loginModel;
    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    
    @RequestMapping(value = "/categoryList/add" , method = RequestMethod.GET)
    public ModelAndView categoryAdd(@ModelAttribute("CatetgoryAddInputForm") CategoryAddInputForm categoryAddInputForm) {

        // ModelAndViewのインスタンス生成
        ModelAndView mv = new ModelAndView("categoryAdd");

        // ModelAndViewにセット
        mv.addObject("CategoryAddInputForm", categoryAddInputForm);

        // カテゴリ一覧画面の表示
        return mv;
    }

    @RequestMapping(value = "/categoryList/add/doAdd", method = RequestMethod.POST)
    public String doCategoryAdd(@Valid @ModelAttribute("CategoryAddInputForm") CategoryAddInputForm categoryAddInputForm,
                                BindingResult bindingResult, 
                                HttpServletRequest request) {

        //バリデーションチェック
        if(bindingResult.hasErrors()){
            return "/categoryAdd";
        }

    	//セッションの取得
        loginModel = (LoginModel) request.getSession().getAttribute("loginModel");

        //カテゴリーオブジェクト作成
        ShopCategoryModel model = new ShopCategoryModel();
        
        // Modelに入力値をセット
        model.setCategoryName(categoryAddInputForm.getCategoryName());
        model.setUserId(loginModel.getUserId());
       
        // カテゴリーの追加
        shopCategoryLogic.add(model);

        return "redirect:/categoryList";
    }

    
}
