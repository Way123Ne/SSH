package com.wayne.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("���÷���ǰ...");
		Object obj = arg0.proceed();
		System.out.println("���÷�����...");
		return obj;
	}

}