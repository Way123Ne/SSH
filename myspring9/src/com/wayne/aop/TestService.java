package com.wayne.aop;

public class TestService implements TestServiceInter,TestServiceInter2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("hi"+name);
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("bye"+name);
		int i = 9/0;
	}

	
}
