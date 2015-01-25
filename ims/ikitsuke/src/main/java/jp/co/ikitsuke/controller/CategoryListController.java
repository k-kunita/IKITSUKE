package jp.co.ikitsuke.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.form.CategoryOutputForm;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.utils.ConvertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryListController {

    LoginModel loginModel;

    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    @RequestMapping(value = "/categoryList", method = RequestMethod.GET)
    public ModelAndView categoryList(@ModelAttribute("CategoryOutputForm") CategoryOutputForm categoryOutputForm, HttpServletRequest request) {

        // セッションからログイン情報を取得
        loginModel = (LoginModel) request.getSession().getAttribute("loginModel");

        List<ShopCategoryModel> shopCategoryModelList = shopCategoryLogic.getCategoryList(loginModel.getUserId());

        // TODO modelListにnullが返ってきた場合

        // ModelをPartに変換しFormにセット
        categoryOutputForm.setShopCategoryList(ConvertUtil.toShopCategoryParts(shopCategoryModelList));

        // カテゴリ一覧画面を表示
        return new ModelAndView("categoryList", "CategoryOutputForm", categoryOutputForm);
    }

}
