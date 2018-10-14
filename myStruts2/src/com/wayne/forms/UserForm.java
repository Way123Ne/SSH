package com.wayne.forms;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm{
	//定义属性[这个有一个规范，就是我们定义属性名字的时候]
	//应该和jsp页面的控件名称一样，如有人提出疑问：说表单的属性名字是不是一定和控件名一样？
	//只要保证set和get方法和控件的属性名一样即可
	
	/*private String name;
	private String pass;
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getPassword() {
		return pass;
	}
	public void setPassword(String password) {
		this.pass = password;
	}*/
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
} 
