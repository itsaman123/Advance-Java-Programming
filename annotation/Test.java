package com.springcore.auto.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] arg) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/AutoWireConfig.xml");
		Emp emp1=(Emp)context.getBean("objEmp",Emp.class);
		System.out.println("\n\n"+emp1);
		
	}

}
