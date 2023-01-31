package sectionA;

public class TBableCreation {
	public static void main(String[] args) {
		try{
			Connection con;
			Statement s;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb", "root", "Amsan@2003");
            s = con.createStatement();
            s.execute("create table CSESECTIONA(ename varcha(20),address varchar(20))");
            
            
            System.out.println("Table is created");
     
        }
        catch(Exception e){
            System.out.println(e);
        }
	}
	

}
