package com.wayne.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.wayne.entity.Student;

public class App3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//从applicationContext中取出bean
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/wayne/test/beans.xml");
		//当我们去实例化beans.xml，该文件中配置的bean被实例化，该bean scope=singleton
		//通过spring容器获得该bean时总是返回唯一的实例
		//从bean中取出student
		Student s1 = (Student) ac.getBean("student");
		Student s2 = (Student) ac.getBean("student");
		//以下s1、s2输出同一地址
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		//若 scope=prototype则 每次获得bean都会生成一个新的对象
//		Student s3 = (Student) ac.getBean("student");
//		Student s4 = (Student) ac.getBean("student");
//		//以下s3、s4输出同一地址
//		System.out.println("s1="+s1);
//		System.out.println("s2="+s2);
		
		
		
		//通过文件路径来获取
//		ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\myec ws\\myspring3\\src\\com\\wayne\\test\\beans.xml");
//		Student s3 = (Student) ac.getBean("student");
		
		
		//如果我们使用beanfactory去获取bean,当你只是实例化该容器，那么
		//容器的bean不会被立刻实例化(延迟)，只有当你去使用getBean获得某个bean时，才会实时的创建容器bean所对应的对象
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/wayne/test/beans.xml"));
//		factory.getBean("student");
		
		
	}

}
