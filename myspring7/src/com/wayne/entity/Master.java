package com.wayne.entity;

public class Master {
	private String name;
	private Dog dog;

	public Master(Dog dog){
		System.out.println("调用了master的构造函数");
		this.dog = dog;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
