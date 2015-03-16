package jp.co.ikitsuke.form;

import java.util.List;

import jp.co.ikitsuke.form.part.ErrorMessagePart;

/***
 * エラーメッセージフォーム
 * @author yoshituneMac
 *
 */
public class ErrorMessageForm {
    
    /** エラーメッセージリスト */
    private List<ErrorMessagePart> errorMessageList;

    public List<ErrorMessagePart> getErrorMessageList() {
        return errorMessageList;
    }

    public void setErrorMessageList(List<ErrorMessagePart> errorMessageList) {
        this.errorMessageList = errorMessageList;
    }

}
