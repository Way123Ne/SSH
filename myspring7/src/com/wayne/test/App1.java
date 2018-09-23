package com.wayne.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.entity.Master;



public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/test/beans.xml");
		Master master =(Master) ac.getBean("master");
		System.out.println(master.getName()+"Ñø"+master.getDog().getName());
	}

}
