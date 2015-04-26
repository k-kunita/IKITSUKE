/**
 *
 */
package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.form.part.ShopInfoPart;

/**
 * 行きつけ一覧<br>
 * 編集ボタン Output<br>
 *
 * @author r-watanabe
 *
 */
public class ShopListOutputForm {

    /** 店舗情報のリスト */
    private List<ShopInfoPart> shopInfoList;

    /** カテゴリーID */
    private int categoryId;

    /** カテゴリー名 */
    private String categoryName;

    /***
     * 店舗情報リストのgetter
     *
     * @return
     */
    public List<ShopInfoPart> getShopInfoList() {
        return shopInfoList;
    }

    /***
     * 店舗情報リストのsetter
     *
     * @param shopInfoList
     */
    public void setShopInfoList(List<ShopInfoPart> shopInfoList) {
        this.shopInfoList = shopInfoList;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /***
     * カテゴリー名のgetter
     *
     * @return
     */
    public String getCategoryName() {
        return categoryName;
    }

    /***
     * カテゴリー名のsetter
     *
     * @return
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
