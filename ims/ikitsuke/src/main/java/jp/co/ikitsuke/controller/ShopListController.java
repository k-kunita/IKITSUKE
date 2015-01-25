package jp.co.ikitsuke.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.ikitsuke.form.LoginInputForm;
import jp.co.ikitsuke.form.ShopAddInputForm;
import jp.co.ikitsuke.form.ShopListOutputForm;
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
public class ShopListController {

    @Autowired
    ShopInfoLogic shopInfoLogic;

    @RequestMapping(value = "categoryList/{categoryId}/shopList", method = RequestMethod.GET)
    public ModelAndView shopListView(@PathVariable("categoryId") String categoryId, @ModelAttribute("ShopEditOutputForm") ShopListOutputForm shopEditOutputForm) {

        // FormにカテゴリーIDをセット
        shopEditOutputForm.setCategoryId(Integer.parseInt(categoryId));

        // カテゴリーIDで店舗一覧取得
        List<ShopInfoModel> modelList = shopInfoLogic.getShopInfoList(Integer.parseInt(categoryId));

        // 一覧を取得した場合
        if (modelList != null) {
            shopEditOutputForm.setShopInfoList(ConvertUtil.toShopInfoParts(modelList));
        }

        // 店舗一覧画面を表示
        return new ModelAndView("shopList", "PurlieuEditOutputForm", shopEditOutputForm);
    }

}
