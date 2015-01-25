/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.model.ShopCategoryModel;

/**
 *
 * ログイン画面<br>
 * ログインボタン Output<br>
 *
 * @author watanabe
 *
 */
public class LoginOutputForm {

    /** 店舗カテゴリ情報リスト */
    private List<ShopCategoryModel> shopCategoryInfoList;

    /**
     * 店舗カテゴリ情報リストを取得する
     *
     * @return shopCategoryList
     */
    public List<ShopCategoryModel> getShopCategoryList() {
        return shopCategoryInfoList;
    }

    /**
     * 店舗カテゴリ情報リストを設定する
     *
     * @param shopCategoryList
     *            セットする shopCategoryList
     */
    public void setShopCategoryList(List<ShopCategoryModel> shopCategoryList) {
        this.shopCategoryInfoList = shopCategoryList;
    }

}
