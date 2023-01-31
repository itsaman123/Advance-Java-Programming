package com.niet.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] arg) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("com/niet/constructorinjection/CIConfig.xml");
	Person oPerson=(Person)context.getBean("objPerson");
	System.out.println(oPerson);
	
}
}