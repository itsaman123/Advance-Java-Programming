import java.sql.*;

public class insertElem {

	public static void main(String[] args) {
		try{
			Connection con;
			Statement s;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb", "root", "Amsan@2003");
            s = con.createStatement();
           s.execute("create table csesecA11(sname varchar(20),rollno int,branch varchar(20))");
           s.execute("insert into csesecA11 values('aman',41,'cse')");
            s.execute("select * from csesecA11");
            
            
            System.out.println("Table is created and  records are inserted");
     
        }
        catch(Exception e){
            System.out.println(e);
        }
	}

}
