/**
 *
 */
package jp.co.ikitsuke.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * カテゴリ一覧<br>
 * 追加ボタン Input<br>
 *
 * @author r-watanabe
 *
 */
public class CategoryAddInputForm extends AbstractForm {

    /** カテゴリ名 */
    @NotEmpty
    @Size(max = 10, message = "{categoryName}")
    private String categoryName;

    /**
     * カテゴリ名を取得する
     *
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * カテゴリ名を設定する
     *
     * @param categoryName
     *            セットする categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
