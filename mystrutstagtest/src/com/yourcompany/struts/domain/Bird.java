package com.yourcompany.struts.domain;
/**
 * 
 * @author Wayne
 * Bird的一个实例，是一个domain对象/同时也可以视为一个javabean
 * 面试题:请解释javabean的属性的含义?
 * 不能把属性理解为就是属性变量的名称,而是他的setXxx和getXxx
 */
public class Bird {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
