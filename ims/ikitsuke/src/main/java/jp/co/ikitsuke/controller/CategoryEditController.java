package jp.co.ikitsuke.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import jp.co.ikitsuke.form.CategoryEditInputForm;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.model.ShopCategoryModel;
import jp.co.ikitsuke.model.ShopInfoModel;
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

    @RequestMapping(value = "/categoryList/{categoryId}", method = RequestMethod.GET)
    public ModelAndView categoryEdit(
            @PathVariable("categoryId") String categoryId, 
            @ModelAttribute("CategoryEditOutputForm") CategoryEditInputForm inputForm) {

        // ModelAndViewのインスタンス生成
        ModelAndView mv = new ModelAndView("categoryEdit");

        // カテゴリーModelの取得
        ShopCategoryModel model = shopCategoryLogic.getCategory(Integer.parseInt(categoryId));

        // Modelが取得できた場合はFormに値をセット
        if (model != null && model.getCategoryId() != 0) {
            inputForm = ConvertUtil.toCategoryEditInputForm(model);
        }

        // ModelAndViewにセット
        mv.addObject("CategoryEditInputForm", inputForm);

        // 店舗詳細画面の表示
        return mv;
    }

    @RequestMapping(value = "/categoryList/{categoryId}/edit", method = RequestMethod.POST)
    public String doCategoryEdit(@PathVariable("categoryId") String categoryId, 
            @Valid @ModelAttribute("CategoryEditInputForm") CategoryEditInputForm inputForm, 
            BindingResult bindingResult, 
            HttpServletRequest request) {
        
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
            HttpServletRequest request) {
        
        // カテゴリーの論理削除
        shopCategoryLogic.delete(Integer.parseInt(categoryId));
        
        return "redirect:/categoryList";
    }
    
}
