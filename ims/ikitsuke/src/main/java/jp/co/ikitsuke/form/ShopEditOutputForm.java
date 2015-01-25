package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.model.ShopInfoModel;

/**
 * 行きつけ一覧<br>
 * 編集画面<br>
 *
 * @author r-watanabe
 *
 */
public class ShopEditOutputForm extends AbstractForm {

    /** 店舗カテゴリId */
    private int categoryId;

    /** 店舗カテゴリ名 */
    private String categoryName;

    /** 店舗名 */
    private String shopName;

    /** 電話番号 */
    private String shopTel;

    /** 備考 */
    private String shopMemo;

    /** 参照URL */
    private String shopPageUrl;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 店舗カテゴリ名を取得する
     *
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 店舗カテゴリ名を設定する
     *
     * @param categoryName
     *            セットする categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel;
    }

    public String getShopMemo() {
        return shopMemo;
    }

    public void setShopMemo(String shopMemo) {
        this.shopMemo = shopMemo;
    }

    public String getShopPageUrl() {
        return shopPageUrl;
    }

    public void setShopPageUrl(String shopPageUrl) {
        this.shopPageUrl = shopPageUrl;
    }
}
