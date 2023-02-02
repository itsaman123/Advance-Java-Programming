package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StrudentDao {

	private JdbcTemplate jdbcTemplate;
	
	
		public JdbcTemplate getJdbcTeplate() {
		return jdbcTemplate;
	}

	public void setJdbcTeplate(JdbcTemplate jdbcTeplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

		public int insert(Student student) {
		
			//insert query
	        String query ="insert into student(id,name,city) values(?,?,?)";
			int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		  return r;
	}

}
