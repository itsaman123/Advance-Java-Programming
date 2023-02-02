package com.spring.jdbc.update;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcTemplate implements StudentDao {
   private DataSource dataSource;
   private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   public void update(int id, String city){
      String query = "update Student set city = ? where id = ?";
      jdbcTemplateObject.update(query, city , id);
      System.out.println("Updated Record with ID = " + id );
      return;
   }
   public Student getStudent(int id) {
      String SQL = "select * from Student where id = ?";
      Student student = jdbcTemplateObject.queryForObject(
         SQL, new Object[]{id}, new StudentMapper()
      );
      return student;
   }
public void update(Integer id, Integer age) {
	// TODO Auto-generated method stub
	
}
public Student getStudent(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
}