package com.wayne.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.inter.ChangeLetter;
import com.wayne.letter.UpperLetter;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//applicationContext.xml的另外一种写法
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/test/beans.xml");
	
		//不用接口进行大小写转换
//		UpperLetter upperLetter = (UpperLetter) ac.getBean("upperLetter");
//		System.out.println(upperLetter.change());
		
		//用接口的方法实现大小写转换
		//重点:接口与类相互转换
		//通过注释beans.xml文件中的bean实现大写/小写转换
		ChangeLetter changeLetter = (ChangeLetter) ac.getBean("changeLetter");
		System.out.println(changeLetter.change());
	}

}
