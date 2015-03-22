package jp.co.ikitsuke.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SessionCheckAspect {

//	@Before("execution(* jp.co.ikitsuke.controller..*.*(..)) && !jp.co.ikitsuke.aop.PointcutDefinition.loginControllerClass()")
//	public void checkSession(JoinPoint joinPoint){
//		System.out.println("*execute checkSession...*");
//
//	}

}
