/**
 *
 */
package jp.co.ikitsuke.form;

/**
 * 行きつけ一覧<br>
 * 追加ボタン Output<br>
 *
 * @author r-watanabe
 *
 */
public class ShopAddOutputForm extends AbstractForm {

    /** カテゴリーID */
    private int categoryId;

    /** 店舗カテゴリ名 */
    private String categoryName;

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

}
