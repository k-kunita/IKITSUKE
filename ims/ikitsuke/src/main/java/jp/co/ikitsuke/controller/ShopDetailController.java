package jp.co.ikitsuke.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import jp.co.ikitsuke.exception.ForbiddenException;
import jp.co.ikitsuke.form.ShopEditInputForm;
import jp.co.ikitsuke.form.ShopEditOutputForm;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.logic.ShopInfoLogic;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.model.ShopInfoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopDetailController {

    @Autowired
    LoginLogic loginLogic;

    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    @Autowired
    ShopInfoLogic shopInfoLogic;

    @RequestMapping(value = "/categoryList/{categoryId}/shopDetail/{shopId}", method = RequestMethod.GET)
    public ModelAndView shopDetail(
            @PathVariable("categoryId") String categoryId,
            @PathVariable("shopId") String shopId,
            @ModelAttribute("ShopEditOutputForm") ShopEditOutputForm shopEditOutputForm,
            @ModelAttribute("ShopEditInputForm") ShopEditInputForm shopEditInputForm,
            Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // 店舗Modelの取得
        ShopInfoModel shopModel = shopInfoLogic.getShopInfo(Integer.parseInt(shopId));

        if(shopModel == null || shopModel.getShopId() == 0){
            throw new ForbiddenException("ForbiddenException");
        }

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(shopModel.getCategoryId(),loginModel.getUserId());

        // Model取得不可の場合はForbiddenException
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        // ModelAndViewのインスタンス生成
        ModelAndView mav = new ModelAndView("shopDetail");

        // 店舗Modelの取得
        ShopInfoModel shopInfoModel = shopInfoLogic.getShopInfo(Integer.parseInt(shopId));

        // Modelが取得できた場合はFormに値をセット
        shopEditOutputForm.setCategoryId(categoryModel.getCategoryId());
        shopEditOutputForm.setCategoryName(categoryModel.getCategoryName());
        shopEditInputForm.setShopId(shopInfoModel.getShopId());
        shopEditInputForm.setShopName(shopInfoModel.getShopName());
        shopEditInputForm.setShopTel(shopInfoModel.getShopTel());
        shopEditInputForm.setShopPageUrl(shopInfoModel.getShopPageUrl());
        shopEditInputForm.setShopMemo(shopInfoModel.getShopMemo());

        // ModelAndViewにセット
        mav.addObject("ShopEditOutputForm", shopEditOutputForm);
        mav.addObject("ShopEditInputForm", shopEditInputForm);

        // 店舗詳細画面の表示
        return mav;
    }

    @RequestMapping(value = "/categoryList/{categoryId}/shopDetail/{shopId}/edit", method = RequestMethod.POST)
    public String doShopEdit(
        @PathVariable("categoryId") String categoryId,
        @PathVariable("shopId") String shopId,
        @ModelAttribute("ShopEditOutputForm") ShopEditOutputForm shopEditOutputForm,
        @Valid @ModelAttribute("ShopEditInputForm") ShopEditInputForm shopEditInputForm,
        BindingResult bindingResult,
        HttpServletRequest request,
        Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // 店舗Modelの取得
        ShopInfoModel shopModel = shopInfoLogic.getShopInfo(Integer.parseInt(shopId));

        if(shopModel == null || shopModel.getShopId() == 0){
            throw new ForbiddenException("ForbiddenException");
        }

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(shopModel.getCategoryId(),loginModel.getUserId());

        // Model取得不可の場合はForbiddenException
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        //Validationチェック
        if(bindingResult.hasErrors()){
            shopEditOutputForm.setCategoryName(categoryModel.getCategoryName());
            return "/shopDetail";
        }

        // Modelに入力値をセット
        shopModel.setCategoryId(Integer.parseInt(categoryId));
        shopModel.setShopId(shopEditInputForm.getShopId());
        shopModel.setShopName(shopEditInputForm.getShopName());
        shopModel.setShopTel(shopEditInputForm.getShopTel());
        shopModel.setShopPageUrl(shopEditInputForm.getShopPageUrl());
        shopModel.setShopMemo(shopEditInputForm.getShopMemo());

        // 店舗情報の登録
        shopInfoLogic.update(shopModel);

        return "redirect:/categoryList/" + categoryId + "/shopList";
    }

    @RequestMapping(value = "/categoryList/{categoryId}/shopDetail/{shopId}/delete", method = RequestMethod.GET)
    public String doShopDelete(
            @PathVariable("categoryId") String categoryId,
            @PathVariable("shopId") String shopId,
            HttpServletRequest request,
            Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // 店舗Modelの取得
        ShopInfoModel shopModel = shopInfoLogic.getShopInfo(Integer.parseInt(shopId));

        if(shopModel == null || shopModel.getShopId() == 0){
            throw new ForbiddenException("ForbiddenException");
        }

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(shopModel.getCategoryId(),loginModel.getUserId());

        // Model取得不可の場合はForbiddenException
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        shopInfoLogic.delete(Integer.parseInt(shopId));

        // 店舗一覧画面へ戻る
        return "redirect:/categoryList/" + categoryId + "/shopList";
    }

}
