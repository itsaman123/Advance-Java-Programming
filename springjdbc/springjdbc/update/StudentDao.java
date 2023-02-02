package com.spring.jdbc.update;
import java.util.List;
import javax.sql.DataSource;

public interface StudentDao {
			 
	   public void setDataSource(DataSource ds);
	  
	   public void update(Integer id, Integer age);
	  
	   public Student getStudent(Integer id); 
	
}
