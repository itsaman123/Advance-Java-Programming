package spring.jdbc.createtable;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcCreateTable
{
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}

	public void createTable()
	{
		jt.execute("create table employee(eid int(12), ename varchar(20), eadd varchar(20))");
		// execute() returns void
		System.out.println("table created");
	}
}
