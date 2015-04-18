/**
 *
 */
package jp.co.ikitsuke.form;

/**
 *
 * カテゴリ一覧画面<br>
 * カテゴリボタン Input<br>
 *
 * @author watanabe
 *
 */
public class CategoryInputForm extends AbstractForm {
    
    /** カテゴリID */
    private int categoryId;
    
    /** カテゴリ名 */
    private String categoryName;
    
    /** 無効フラグ */
    private boolean disableFlag;
    
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public boolean isDisableFlag() {
        return disableFlag;
    }
    
    public void setDisableFlag(boolean disableFlag) {
        this.disableFlag = disableFlag;
    }
    
}
