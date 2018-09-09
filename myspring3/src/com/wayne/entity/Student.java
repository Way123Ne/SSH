package com.wayne.entity;

public class Student {
	private String name;
	
	//Java类默认都有一个无参的构造函数
	public Student(){
		System.out.println("Student被创建");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
