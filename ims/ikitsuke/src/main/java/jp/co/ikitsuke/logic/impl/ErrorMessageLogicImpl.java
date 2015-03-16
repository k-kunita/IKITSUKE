package jp.co.ikitsuke.logic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Service;

import jp.co.ikitsuke.logic.ErrorMessageLogic;
import jp.co.ikitsuke.model.ErrorMessageModel;

@Service
public class ErrorMessageLogicImpl implements ErrorMessageLogic{

    @Override
    public List<ErrorMessageModel> addMessage(Set<ConstraintViolation<Object>> violations) {
        
        List<ErrorMessageModel> modelList = null;
        
        ErrorMessageModel model = null;
        
        //空チェック
        if(violations != null && !violations.isEmpty()){
            modelList = new ArrayList<>();;
            
            //エラーメッセージをモデルにセット
            for (ConstraintViolation<Object> violation : violations) {
                model = new ErrorMessageModel();
                model.setErrorItem(violation.getPropertyPath().toString());
                model.setErrorMessage(violation.getMessage());
                modelList.add(model);
           }
        }
        
        return modelList;
    }


    
    
    
}
