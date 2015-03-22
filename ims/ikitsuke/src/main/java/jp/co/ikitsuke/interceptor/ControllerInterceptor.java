package jp.co.ikitsuke.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.co.ikitsuke.controller.LoginController;
import jp.co.ikitsuke.form.LoginInputForm;

import org.apache.catalina.connector.RequestFacade;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerInterceptor {

	@Before("execution(* jp.co.ikitsuke.controller..*.*(..)) && !jp.co.ikitsuke.aop.PointcutDefinition.loginControllerClass()")
	public void checkSession(JoinPoint joinPoint){
		System.out.println("*execute method before...*");

	    Object[] objArray = joinPoint.getArgs();
	    HttpServletRequest request = null;
	    HttpSession session = null;

	    // 引数よりセッション情報を取得
	    for (Object obj : objArray) {
	    	if(obj instanceof RequestFacade){
	    		request = (HttpServletRequest)obj;
	    	}
	    }
	    
	    if(request == null || request.getSession().getAttribute("loginModel") == null){
	    	System.out.println("AccessSession:null");
	    	LoginController login = new LoginController();
	    	login.login(new LoginInputForm());
	    }

	}

}
