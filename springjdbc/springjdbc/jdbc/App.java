package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My JDBC Program Started..........." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean( "jdbcTemplate",JdbcTemplate.class);
        //inser query
        String query ="insert into student(id,name,city) values(?,?,?)";
        //fire the query
        int result = template.update(query,461,"Surya Sharma11","Firozabad11");
        System.out.println("Number of Record inserted"+result);
    }
}
 