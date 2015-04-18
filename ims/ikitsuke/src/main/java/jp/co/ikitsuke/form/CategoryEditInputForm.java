package jp.co.ikitsuke.form;

import javax.validation.constraints.Size;

public class CategoryEditInputForm {
    
    /** 店舗カテゴリID */
    private int categoryId;

    /** 店舗カテゴリ名 */
    @Size(min = 3)
    private String categoryName;

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
    
}
