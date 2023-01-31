package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class Test {
	public static void main(String[] arg) {
		//spring jdbc-->jdbcTemplet
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/JdbcConfig.xml");
		JdbcTemplate templet=(JdbcTemplate)context.getBean("objJdbcTemplet",JdbcTemplate.class);
		//Insert query
		String query="insert into student(id,name,city) values(?,?,?)";
		int i=templet.update(query,22,"Rahul","Delhi");
		System.out.println("NO of row inserted!!"+i);
		//select query
		
	         
	         System.out.println("------Listing Multiple Records--------" );
	         List<Student> students = template.listStudents();
	         
	         for (Student record : students) {
	            System.out.print("ID : " + record.getId() );
	            System.out.print(", Name : " + record.getName() );
	            System.out.println(", Age : " + record.getCity()); 
	         }  
	}

}



