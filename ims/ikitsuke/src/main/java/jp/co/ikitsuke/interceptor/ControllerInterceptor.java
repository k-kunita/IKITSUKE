package jp.co.ikitsuke.interceptor;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class ControllerInterceptor {

	public static final Logger log = Logger.getLogger(Object.class);

	@Around("execution(* jp.co.ikitsuke.controller..*.*(..))")
	public Object checkSession(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("*execute method before...*");

		System.out.println("AOPクラスで、@Aroundを使って、メソッド実行「前後」に引数を取得します。");



		StopWatch stopWatch = new StopWatch();

		Logger.getLogger(this.getClass()).info("Method Start");

		stopWatch.start();

	    // ここで対象のメソッドを呼び出します。
		Object retVal = joinPoint.proceed();

	    Object[] objArray = joinPoint.getArgs();

	    for (Object obj : objArray) {
	        System.out.println("引数の値です。 : " + obj.toString());
	    }

		stopWatch.stop();

		StringBuffer logMessageStringBuffer = new StringBuffer();
		logMessageStringBuffer.append(joinPoint.getTarget().getClass().getName());
		logMessageStringBuffer.append(".");
		logMessageStringBuffer.append(joinPoint.getSignature().getName());
		logMessageStringBuffer.append("(");
		logMessageStringBuffer.append(joinPoint.getArgs());
		logMessageStringBuffer.append(")");
		logMessageStringBuffer.append(" execution time: ");
		logMessageStringBuffer.append(stopWatch.getTotalTimeMillis());
		logMessageStringBuffer.append(" ms");
		logMessageStringBuffer.append(" end");
		Logger.getLogger(this.getClass()).info(logMessageStringBuffer.toString());

		return retVal;
	}

}
