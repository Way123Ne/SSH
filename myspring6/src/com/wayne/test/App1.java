package com.wayne.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.entity.Employee;


public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/test/beans.xml");
		Employee ee = (Employee) ac.getBean("employee");
		System.out.println(ee.getName()+" " +ee.getAge());
	}

}
