package spring.jdbc.createtable;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
public class CreateTest {

	public static void main(String[] args) {
		
		 System.out.println( "My JDBC Program Started..........." );
	     ApplicationContext context = new ClassPathXmlApplicationContext("spring/jdbc/createtable/createconfig.xml");
	     JdbcTemplate template = context.getBean( "id2",JdbcTemplate.class);
		SpringJdbcCreateTable sct =(SpringJdbcCreateTable)context.getBean("id3");
		sct.createTable();	
	}

}
