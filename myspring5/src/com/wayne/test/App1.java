package com.wayne.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.entity.Graduate;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/test/beans.xml");
		Graduate graduate = (Graduate) ac.getBean("graduate");
		System.out.println(graduate.getName()+" "+graduate.getAge()+" "+graduate.getDegree());
	}

}
