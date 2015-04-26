package jp.co.ikitsuke.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.exception.ForbiddenException;
import jp.co.ikitsuke.form.ShopAddInputForm;
import jp.co.ikitsuke.form.ShopAddOutputForm;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.logic.ShopInfoLogic;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.model.ShopInfoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopAddController {

    @Autowired
    LoginLogic loginLogic;

    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    @Autowired
    ShopInfoLogic shopInfoLogic;

    @RequestMapping(value = "/categoryList/{categoryId}/shopAdd", method = RequestMethod.GET)
    public ModelAndView shopAdd(@PathVariable("categoryId") String categoryId,
            @ModelAttribute("ShopAddOutputForm") ShopAddOutputForm shopAddOutputForm,
            @ModelAttribute("ShopAddInputForm") ShopAddInputForm shopAddInputForm,
            Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId),loginModel.getUserId());

        // Model取得不可の場合はForbiddenException
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        // ModelAndViewのインスタンス生成
        ModelAndView mav = new ModelAndView("shopAdd");

        shopAddOutputForm.setCategoryId(categoryModel.getCategoryId());
        shopAddOutputForm.setCategoryName(categoryModel.getCategoryName());

        // ModelAndViewにセット
        mav.addObject("ShopAddOutputForm", shopAddOutputForm);
        mav.addObject("ShopAddInputForm", shopAddInputForm);

        // 店舗詳細画面の表示
        return mav;
    }

    @RequestMapping(value = "/categoryList/{categoryId}/shopAdd/doAdd", method = RequestMethod.POST)
    public String doShopAdd(@PathVariable("categoryId") String categoryId,
            @ModelAttribute("ShopEditInputForm") ShopAddInputForm shopAddInputForm,
            HttpServletRequest request,
            Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId),loginModel.getUserId());

        // Model取得不可の場合はForbiddenException
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        ShopInfoModel shopInfoModel = new ShopInfoModel();

        // Modelを入力値をセット
        shopInfoModel.setCategoryId(Integer.parseInt(categoryId));
        shopInfoModel.setShopName(shopAddInputForm.getShopName());
        shopInfoModel.setShopTel(shopAddInputForm.getShopTel());
        shopInfoModel.setShopPageUrl(shopAddInputForm.getShopPageUrl());
        shopInfoModel.setShopMemo(shopAddInputForm.getShopMemo());

        // 店舗情報の登録
        shopInfoLogic.register(shopInfoModel);

        return "redirect:/categoryList/" + categoryId + "/shopList";
    }

}
