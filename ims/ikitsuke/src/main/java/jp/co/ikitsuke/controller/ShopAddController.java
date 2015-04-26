package jp.co.ikitsuke.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import jp.co.ikitsuke.form.ShopAddInputForm;
import jp.co.ikitsuke.form.ShopAddOutputForm;
import jp.co.ikitsuke.form.ShopEditInputForm;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.logic.ShopInfoLogic;
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
public class ShopAddController {

    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    @Autowired
    ShopInfoLogic shopInfoLogic;

    @RequestMapping(value = "/categoryList/{categoryId}/shopAdd", method = RequestMethod.GET)
    public ModelAndView shopAdd(@PathVariable("categoryId") String categoryId, @ModelAttribute("ShopAddOutputForm") ShopAddOutputForm shopAddOutputForm, @ModelAttribute("ShopAddInputForm") ShopAddInputForm shopAddInputForm) {

        // ModelAndViewのインスタンス生成
        ModelAndView mv = new ModelAndView("shopAdd");

        // カテゴリーModelの取得
        ShopCategoryModel shopCategoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId));
        // Modelが取得できた場合はIDとカテゴリーをセット
        if (shopCategoryModel != null) {
            shopAddOutputForm.setCategoryId(shopCategoryModel.getCategoryId());
            shopAddOutputForm.setCategoryName(shopCategoryModel.getCategoryName());
        }

        // ModelAndViewにセット
        mv.addObject("ShopAddOutputForm", shopAddOutputForm);
        mv.addObject("ShopAddInputForm", shopAddInputForm);

        // 店舗詳細画面の表示
        return mv;
    }

    @RequestMapping(value = "/categoryList/{categoryId}/shopAdd/doAdd", method = RequestMethod.POST)
    public String doShopAdd(@PathVariable("categoryId") String categoryId, 
                            @ModelAttribute("ShopAddOutputForm") ShopAddOutputForm shopAddOutputForm,
                            @Valid @ModelAttribute("ShopAddInputForm") ShopAddInputForm shopAddInputForm, 
                            BindingResult bindingResult,
                            HttpServletRequest request) {

        //バリデーションチェック
        if(bindingResult.hasErrors()){
            // カテゴリー名の再取得
            ShopCategoryModel shopCategoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId));
            shopAddOutputForm.setCategoryName(shopCategoryModel.getCategoryName());
            return "/shopAdd";
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
