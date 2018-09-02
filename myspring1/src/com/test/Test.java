package com.test;

import com.service.UserService;
import com.utils.ApplicationContextUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//传统方法-调用userService的sayHello()
//		UserService userService = new UserService();
//		userService.setName("lisan");
//		userService.sayHello();
		
		//Spring完成上面任务
		//1.得到spring的applicationContext对象(容器对象)
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService us = (UserService) ac.getBean("userService");
//		us.sayHello();
		
		//2.使用将applicationContext对象封装好的工具类
		((UserService)ApplicationContextUtil.getApplicationContext().getBean("userService")).sayHello();
	}

}
