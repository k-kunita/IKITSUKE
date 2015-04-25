package jp.co.ikitsuke.model;


/**
 * カテゴリ情報モデル
 *
 * @author watanabe
 *
 */
public class CategoryInfoModel {

    /** 店舗名 */
    private String categoyName;


    /**
     * 店舗名を取得する
     *
     * @return shopName
     */
    public String getCategoryName() {
        return this.categoyName;
    }

    /**
     * 店舗名を設定する
     *
     * @param shopName
     *            セットする shopName
     */
    public void setCategoryName(String categoyName) {
        this.categoyName = categoyName;
    }
}
