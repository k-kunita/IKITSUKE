package jp.co.ikitsuke.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static ApplicationContext app;

	public static void main(String[] args){

//		app = new ClassPathXmlApplicationContext("bean.xml");
		app = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		IMyBean<String> bean = (IMyBean<String>) app.getBean("bean1");

		bean.addData("Hello AOP World!!");
		System.out.println(bean);
	}


}
