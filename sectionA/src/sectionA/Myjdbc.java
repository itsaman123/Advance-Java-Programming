package sectionA;


import java.sql.*;

public class Myjdbc {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nietdb", "root", "Amsan@2003");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from login");
            while(rs.next())
            System.out.println(rs.getString(1)+" "+ rs.getString(2));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}