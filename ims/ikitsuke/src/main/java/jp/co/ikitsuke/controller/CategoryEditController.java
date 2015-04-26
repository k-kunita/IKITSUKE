package jp.co.ikitsuke.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import jp.co.ikitsuke.exception.ForbiddenException;
import jp.co.ikitsuke.form.CategoryEditInputForm;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.utils.ConvertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryEditController {

    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    @Autowired
    ShopCategoryLogic categoryLogic;

    @Autowired
    LoginLogic loginLogic;

    @RequestMapping(value = "/categoryList/{categoryId}", method = RequestMethod.GET)
    public ModelAndView categoryEdit(
            @PathVariable("categoryId") String categoryId,
            @ModelAttribute("CategoryEditOutputForm") CategoryEditInputForm inputForm,
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
        ModelAndView mav = new ModelAndView("categoryEdit");

        inputForm = ConvertUtil.toCategoryEditInputForm(categoryModel);

        // ModelAndViewにセット
        mav.addObject("CategoryEditInputForm", inputForm);

        // 店舗詳細画面の表示
        return mav;
    }

    @RequestMapping(value = "/categoryList/{categoryId}/edit", method = RequestMethod.POST)
    public String doCategoryEdit(@PathVariable("categoryId") String categoryId,
            @Valid @ModelAttribute("CategoryEditInputForm") CategoryEditInputForm inputForm,
            BindingResult bindingResult,
            HttpServletRequest request,
            Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId),loginModel.getUserId());

        // Model取得不可の場合は403 Forbidden
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        //validationチェック
        if (bindingResult.hasErrors()) {
            System.out.println("errorです");
            return "/categoryEdit";
        }

        ShopCategoryModel model = new ShopCategoryModel();

        // Modelに入力値をセット
        model.setCategoryId(inputForm.getCategoryId());
        model.setCategoryName(inputForm.getCategoryName());

        // カテゴリーの更新
        shopCategoryLogic.update(model);

        return "redirect:/categoryList";
    }

    @RequestMapping(value = "/categoryList/{categoryId}/delete", method = RequestMethod.GET)
    public String doCategoryEdit(@PathVariable("categoryId") String categoryId,
            HttpServletRequest request,
            Principal principal) {


        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId),loginModel.getUserId());

        // Model取得不可の場合は403 Forbidden
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        // カテゴリーの論理削除
        shopCategoryLogic.delete(Integer.parseInt(categoryId));

        return "redirect:/categoryList";
    }

}
