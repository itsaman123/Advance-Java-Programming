package com.spring.jdbc.update;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.update.StudentJdbcTemplate;
public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/update/updateconfig.xml");
	      StudentJdbcTemplate studentJDBCTemplate = 
	         (StudentJdbcTemplate)context.getBean("studentJdbcTemplate");
	      
	      System.out.println("----Updating Record with ID = 222 -----" );
	      studentJDBCTemplate.update(222, "Kanpur");
	      
	      System.out.println("----Listing Record with ID = 222 -----" );
	      Student student = studentJDBCTemplate.getStudent(222);
	      System.out.print("ID : " + student.getId() );
	      System.out.print(", Name : " + student.getName() );
	      System.out.println(", Age : " + student.getCity());  
	   }
	
		 
	}
	



