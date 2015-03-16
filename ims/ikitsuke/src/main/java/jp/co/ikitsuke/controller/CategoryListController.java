package jp.co.ikitsuke.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.form.CategoryInputForm;
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
    public ModelAndView categoryList(@ModelAttribute("CategoryOutputForm") CategoryOutputForm categoryOutputForm,
            @ModelAttribute("CategoryInputForm") CategoryInputForm categoryInputForm,HttpServletRequest request) {
        
        // ModelAndViewのインスタンス生成
        ModelAndView mv = new ModelAndView("categoryList");
        
        // セッションからログイン情報を取得
        loginModel = (LoginModel) request.getSession().getAttribute("loginModel");
        
        List<ShopCategoryModel> shopCategoryModelList = shopCategoryLogic.getCategoryList(loginModel.getUserId());
        
        // TODO modelListにnullが返ってきた場合
        
        // ModelをPartに変換しFormにセット
        categoryOutputForm.setShopCategoryList(ConvertUtil.toShopCategoryParts(shopCategoryModelList));
        
        mv.addObject("CategoryOutputForm", categoryOutputForm);
        mv.addObject("CategoryInputForm", categoryInputForm);
        
        // カテゴリ一覧画面を表示
        return mv;
    }
    
    @RequestMapping(value = "/categoryList/rename", method = RequestMethod.POST)
    public String doRename(@ModelAttribute("CategoryInputForm") CategoryInputForm categoryInputForm, HttpServletRequest request) {
        
        // カテゴリ名の修正
        shopCategoryLogic.rename(categoryInputForm.getCategoryId(), categoryInputForm.getCategoryName());
        
        // カテゴリ一覧画面を表示
        return "redirect:/categoryList";
    }
    
    @RequestMapping(value = "/categoryList/delete", method = RequestMethod.POST)
    public String doDelete(@ModelAttribute("CategoryInputForm") CategoryInputForm categoryInputForm, HttpServletRequest request) {
        
        // セッションからログイン情報を取得
        LoginModel loginModel = (LoginModel)request.getSession().getAttribute("loginModel");
        
        // 取得に成功した場合のみ処理実行
        if(loginModel != null){
            // カテゴリの削除（カテゴリに含む店舗も削除）
            shopCategoryLogic.delete(categoryInputForm.getCategoryId());
            
            // 削除レコードの代替初期レコードを作成する
            shopCategoryLogic.add(loginModel.getUserId());
        }else{
            
        }
        
        // カテゴリ一覧画面を表示
        return "redirect:/categoryList";
    }
    
}
