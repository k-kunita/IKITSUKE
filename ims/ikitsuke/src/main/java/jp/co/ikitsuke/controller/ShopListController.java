package jp.co.ikitsuke.controller;

import java.security.Principal;
import java.util.List;

import jp.co.ikitsuke.exception.ForbiddenException;
import jp.co.ikitsuke.form.ShopListOutputForm;
import jp.co.ikitsuke.logic.LoginLogic;
import jp.co.ikitsuke.logic.ShopCategoryLogic;
import jp.co.ikitsuke.logic.ShopInfoLogic;
import jp.co.ikitsuke.model.LoginModel;
import jp.co.ikitsuke.model.ShopCategoryModel;
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
    LoginLogic loginLogic;

    @Autowired
    ShopInfoLogic shopInfoLogic;

    @Autowired
    ShopCategoryLogic shopCategoryLogic;

    @RequestMapping(value = "categoryList/{categoryId}/shopList", method = RequestMethod.GET)
    public ModelAndView shopListView(
            @PathVariable("categoryId") String inputCategoryId,
            @ModelAttribute("ShopEditOutputForm") ShopListOutputForm shopEditOutputForm,
            Principal principal) {

        // ログイン時情報よりuser情報取得
        LoginModel loginModel = loginLogic.getModel(principal.getName());

        int categoryId = Integer.parseInt(inputCategoryId);

        // カテゴリーModelの取得
        ShopCategoryModel categoryModel = shopCategoryLogic.getCategory(categoryId,loginModel.getUserId());

        // Model取得不可の場合はForbiddenException
        if (categoryModel == null || categoryModel.getCategoryId() == 0) {
            throw new ForbiddenException("ForbiddenException");
        }

        // FormにカテゴリーID・Nameをセット
        shopEditOutputForm.setCategoryId(categoryModel.getCategoryId());
        shopEditOutputForm.setCategoryName(categoryModel.getCategoryName());

        // カテゴリーIDで店舗一覧取得
        List<ShopInfoModel> modelList = shopInfoLogic.getShopInfoList(categoryId);

        // 一覧を取得した場合
        if (modelList != null && !modelList.isEmpty()) {
            shopEditOutputForm.setShopInfoList(ConvertUtil.toShopInfoParts(modelList));
        }

        // 店舗一覧画面を表示
        return new ModelAndView("shopList", "PurlieuEditOutputForm", shopEditOutputForm);
    }

}
