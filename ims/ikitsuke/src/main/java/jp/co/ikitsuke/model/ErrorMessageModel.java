package jp.co.ikitsuke.model;

import java.util.List;

public class ErrorMessageModel {
    
    /** エラー項目 */
    private String errorItem;
    
    /** エラーメッセージ */
    private String errorMessage;
    
    public String getErrorItem() {
        return errorItem;
    }

    public void setErrorItem(String errorItem) {
        this.errorItem = errorItem;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
}
