/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.form.part.ShopCategoryPart;

/**
 * カテゴリ一覧画面<br>
 * カテゴリボタン Output<br>
 *
 * @author watanabe
 *
 */
public class CategoryOutputForm {

    /** カテゴリー情報リスト */
    private List<ShopCategoryPart> shopCategoryList;

    /***
     * カテゴリー情報リストのgetter
     *
     * @return
     */
    public List<ShopCategoryPart> getShopCategoryList() {
        return shopCategoryList;
    }

    /***
     * カテゴリー情報リストのsetter
     *
     * @param shopCategoryList
     */
    public void setShopCategoryList(List<ShopCategoryPart> shopCategoryList) {
        this.shopCategoryList = shopCategoryList;
    }

}
