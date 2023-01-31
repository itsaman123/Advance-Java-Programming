package com.sprintcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sprintcore/collections/Config.xml");
		Emp oPerson=(Emp)context.getBean("objEmp");
		System.out.println(oPerson);
	}
}