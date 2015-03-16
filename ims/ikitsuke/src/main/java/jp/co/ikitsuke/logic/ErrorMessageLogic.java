package jp.co.ikitsuke.logic;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import jp.co.ikitsuke.model.ErrorMessageModel;

public interface ErrorMessageLogic {
    
    
    /***
     * エラーメッセージセット
     * <pre>
     * violationクラスのエラーメッセージをModelにセットして返す
     * </pre>
     * @param validator
     * @return
     */
    public List<ErrorMessageModel> addMessage(Set<ConstraintViolation<Object>> violations);

}
