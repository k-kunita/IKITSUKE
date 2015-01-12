package jp.co.ikitsuke.controller;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.form.ShopAddInputForm;
import jp.co.ikitsuke.form.ShopEditInputForm;
import jp.co.ikitsuke.form.ShopEditOutputForm;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.logic.ShopInfoLogic;
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
public class ShopDetailController {
	
	@Autowired
	ShopCategoryLogic shopCategoryLogic;
	
	@Autowired
	ShopInfoLogic shopInfoLogic;
	
	@RequestMapping(value = "/categoryList/{categoryId}/shopDetail/{shopId}", method = RequestMethod.GET)
	public ModelAndView shopDetail(@PathVariable("categoryId") String categoryId,
			@PathVariable("shopId") String shopId,
			@ModelAttribute("ShopEditOutputForm")ShopEditOutputForm shopEditOutputForm
			,@ModelAttribute("ShopEditInputForm")ShopEditInputForm shopEditInputForm) {
		
		//ModelAndViewのインスタンス生成
		ModelAndView mv = new ModelAndView("shopDetail");
		
		//店舗Modelの取得
		ShopInfoModel shopInfoModel = shopInfoLogic.getShopInfo(Integer.parseInt(shopId));
		
		//カテゴリーModelの取得
		ShopCategoryModel shopCategoryModel = shopCategoryLogic.getCategory(Integer.parseInt(categoryId));
		
		//Modelが取得できた場合はFormに値をセット
		if(shopInfoModel !=null && shopCategoryModel != null){			
			shopEditOutputForm.setCategoryId(shopCategoryModel.getCategoryId());	
			shopEditOutputForm.setCategoryName(shopCategoryModel.getCategoryName());
			shopEditInputForm.setShopId(shopInfoModel.getShopId());
			shopEditInputForm.setShopName(shopInfoModel.getShopName());
			shopEditInputForm.setShopTel(shopInfoModel.getShopTel());
			shopEditInputForm.setShopPageUrl(shopInfoModel.getShopPageUrl());
			shopEditInputForm.setShopMemo(shopInfoModel.getShopMemo());
		}
		
		//TODO shopInfoModelがnullの場合のエラー処理
		
		//ModelAndViewにセット
		mv.addObject("ShopEditOutputForm", shopEditOutputForm);
		mv.addObject("ShopEditInputForm", shopEditInputForm);
		
		//店舗詳細画面の表示
		return mv;
	}
	
	@RequestMapping(value = "/categoryList/{categoryId}/shopDetail/{shopId}/edit", method = RequestMethod.POST)
	public String doShopEdit(@PathVariable("categoryId") String categoryId,
			@ModelAttribute("ShopEditInputForm")ShopEditInputForm shopEditInputForm, HttpServletRequest request) {
		
		ShopInfoModel shopInfoModel = new ShopInfoModel();
		//Modelを入力値をセット
		shopInfoModel.setCategoryId(Integer.parseInt(categoryId));
		shopInfoModel.setShopId(shopEditInputForm.getShopId());
		shopInfoModel.setShopName(shopEditInputForm.getShopName());
		shopInfoModel.setShopTel(shopEditInputForm.getShopTel());
		shopInfoModel.setShopPageUrl(shopEditInputForm.getShopPageUrl());
		shopInfoModel.setShopMemo(shopEditInputForm.getShopMemo());
		
		//店舗情報の登録
		shopInfoLogic.update(shopInfoModel);
		
		return "redirect:/categoryList/" + categoryId + "/shopList";
	}
	
	@RequestMapping(value = "/categoryList/{categoryId}/shopDetail/{shopId}/delete", method = RequestMethod.GET)
	public String doShopDelete(@PathVariable("categoryId") String categoryId,@PathVariable("shopId") String shopId,
			HttpServletRequest request) {
		
		if(shopId != null && !shopId.equals("")){
			//店舗情報の削除
			shopInfoLogic.delete(Integer.parseInt(shopId));
		}
		
		//店舗一覧画面へ戻る
		return "redirect:/categoryList/" + categoryId + "/shopList";
	}
	
	
}
