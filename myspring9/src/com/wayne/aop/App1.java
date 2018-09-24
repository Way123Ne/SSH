package com.wayne.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/aop/beans.xml");
		//TestService ts = (TestService) ac.getBean("testService");
		//System.out.println(">>>>>>"+ts.getName());
		
		TestServiceInter ts = (TestServiceInter) ac.getBean("proxyFactoryBean");
		System.out.println("调用sayHi()>>>>>>>>>>>>>>>>");
		ts.sayHi();
		System.out.println("调用sayBye()>>>>>>>>>>>>>>>>");
		((TestServiceInter2)ts).sayBye();
	}

}
