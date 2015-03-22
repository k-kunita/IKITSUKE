package jp.co.ikitsuke.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointcutDefinition {

	  @Pointcut("within(jp.co.ikitsuke.controller..*)")
	  public void controllerLayer() {
	  }

	  @Pointcut("within(jp.co.ikitsuke.controller.LoginController)")
	  public void loginControllerClass() {
	  }

	  @Pointcut("within(jp.co.ikitsuke.service..*)")
	  public void serviceLayer() {
	  }

	  @Pointcut("within(jp.co.dataAccess..*)")
	  public void dataAccessLayer() {
	  }

}
