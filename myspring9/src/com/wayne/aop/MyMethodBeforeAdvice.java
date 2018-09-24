package com.wayne.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class MyMethodBeforeAdvice implements MethodBeforeAdvice{
/**
 * method:被调用方法的名字
 * arg1:给method传递的参数
 * target:目标对象
 */
	@Override
	public void before(Method method, Object[] arg1, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("写日志..."+method.getName());
		
	}

}
