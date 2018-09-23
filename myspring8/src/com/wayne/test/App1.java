package com.wayne.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.utils.DBUtil;




public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/test/beans.xml");
		DBUtil db = (DBUtil) ac.getBean("dbutil");
		System.out.println(db.getDrivername()+" "+db.getPassword());
	}

}
