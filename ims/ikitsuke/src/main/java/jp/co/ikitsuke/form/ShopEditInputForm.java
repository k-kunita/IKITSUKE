/**
 *
 */
package jp.co.ikitsuke.form;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * 行きつけ一覧<br>
 * 編集画面<br>
 * 保存ボタン Input<br>
 *
 * @author r-watanabe
 *
 */
public class ShopEditInputForm extends AbstractForm {

    /** 店舗ID */
    private int shopId;

    /** 店舗名 */
    @NotEmpty
    @Size(max=16)
    private String shopName;

    /** 電話番号 */
    @Size(max = 11)
    private String shopTel;

    /** 備考 */
    @Size(max=1000)
    private String shopMemo;

    /** 参照URL */
    @Size(max=1024)
    private String shopPageUrl;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    /**
     * 店舗名を取得する
     *
     * @return shopName
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 店舗名を設定する
     *
     * @param shopName
     *            セットする shopName
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 電話番号を取得する
     *
     * @return shopTel
     */
    public String getShopTel() {
        return shopTel;
    }

    /**
     * 電話番号を設定する
     *
     * @param shopTel
     *            セットする shopTel
     */
    public void setShopTel(String shopTel) {
        this.shopTel = shopTel;
    }

    /**
     * 備考を取得する
     *
     * @return shopMemo
     */
    public String getShopMemo() {
        return shopMemo;
    }

    /**
     * 備考を設定する
     *
     * @param shopMemo
     *            セットする shopMemo
     */
    public void setShopMemo(String shopMemo) {
        this.shopMemo = shopMemo;
    }

    /**
     * 参照URLを取得する
     *
     * @return shopPageUrl
     */
    public String getShopPageUrl() {
        return shopPageUrl;
    }

    /**
     * 参照URLを設定する
     *
     * @param shopPageUrl
     *            セットする shopPageUrl
     */
    public void setShopPageUrl(String shopPageUrl) {
        this.shopPageUrl = shopPageUrl;
    }

}
