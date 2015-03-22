package jp.co.ikitsuke.aopTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBeanAspect {

	@Before("execution(* jp.co.ikitsuke.aopTest.IMyBean.addData(..))")
	public void addDataBefore(JoinPoint joinPoint){
		System.out.println("*addData before...*");
		String args = "args: \"";

		for(Object ob : joinPoint.getArgs()){
			args += ob + "\" ";
		}
		System.out.println(args);
	}

}
