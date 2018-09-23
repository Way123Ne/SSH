package com.wayne.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wayne.entity.Department;
import com.wayne.entity.Employee;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/wayne/test/beans.xml");

		System.out.println("************正常装配bean***************");
		// 正常装配bean
		Department department = (Department) ac.getBean("department");
		System.out.println(department.getName());

		System.out.println("**********数组装配bean************");
		// 数组装配bean
		// 遍历取出数组
		for (String empName : department.getEmpName()) {
			System.out.println(empName);
		}

		System.out.println("**************List集合装配bean*************");
		// list集合装配bean
		// 遍历取出list集合,list集合中装的是Employee
		for (Employee emplist : department.getEmpList()) {
			System.out.println(emplist.getName());
		}

		System.out.println("***********Set集合装配bean**************");
		// Set集合装配bean
		// 遍历取出Set集合,Set集合中装的是Employee
		for (Employee empSet : department.getEmpSet()) {
			System.out.println(empSet.getName());
		}

		System.out.println("****************Map装配bean**************");
		// Map集合装配bean
		// 1.迭代器
		Map<String,Employee> empMap = department.getEmpMap();
		Iterator it = empMap.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Employee emp = empMap.get(key);
			System.out.println("key="+key+"value="+emp.getName());
		}
		// 2.高级for
		for (Entry<String, Employee> entry1 : department.getEmpMap().entrySet()) {
			System.out.println("key=" + entry1.getKey() + "value="
					+ entry1.getValue().getName());
		}
		
		System.out.println("****************Properties装配bean**************");
		// Properties集合装配bean(Properties实现Map接口)
		Properties pp = department.getPp();
		for (Entry<Object, Object> ps : pp.entrySet()) {
			System.out.println(ps.getKey().toString()+" "+ps.getValue().toString());
		}
	}

}
