package com.myfirstProgram;
//programm of setter injection-------------->>>>>>>>>>>>>>>>>

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/myfirstProgram/Config.xml");
    	Student student1=(Student)context.getBean("objStudent",Student.class);
    	System.out.println(student1);
    }
}

