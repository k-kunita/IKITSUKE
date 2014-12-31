package jp.co.ikitsuke.controller;

import java.util.List;

import jp.co.ikitsuke.form.PurlieuEditOutputForm;
import jp.co.ikitsuke.logic.ShopInfoLogic;
import jp.co.ikitsuke.model.ShopInfoModel;
import jp.co.ikitsuke.utils.ConvertUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopManageController {

	@Autowired
	ShopInfoLogic shopInfoLogic;

	@RequestMapping(value = "/shopManage/{categoryId}", method = RequestMethod.GET)
	public ModelAndView login(@PathVariable("categoryId") String categoryId,
			@ModelAttribute("PurlieuEditOutputForm")PurlieuEditOutputForm purlieuEditOutputForm) {

		//カテゴリーIDで店舗一覧取得
		List<ShopInfoModel> modelList = shopInfoLogic.getShopInfo(Integer.parseInt(categoryId));

		//一覧を取得した場合
		if(modelList != null){

			purlieuEditOutputForm.setShopInfoList(ConvertUtil.toShopInfoParts(modelList));
		}

		//店舗一覧画面を表示
		return new ModelAndView("shopList","PurlieuEditOutputForm",purlieuEditOutputForm);
	}

}
