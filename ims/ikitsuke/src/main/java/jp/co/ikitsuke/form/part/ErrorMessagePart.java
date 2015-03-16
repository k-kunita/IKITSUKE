package jp.co.ikitsuke.form.part;

public class ErrorMessagePart {
    
    /** エラー項目 */
    private String errorItem;
    
    /** エラーメッセージ */
    private String errorMessage;
    
    /** 表示フラグ */
    private boolean displayFlg;
    
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

    public boolean isDisplayFlg() {
        return displayFlg;
    }

    public void setDisplayFlg(boolean displayFlg) {
        this.displayFlg = displayFlg;
    }
    
    
}
