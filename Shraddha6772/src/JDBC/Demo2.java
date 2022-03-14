package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Demo6772","root","12345");
			Statement st = con.createStatement();
//			String s = "create table Student1(rollNo int, Name varchar(10),Address varchar(15))";
//			st.executeUpdate(s);
			st.executeUpdate("insert into Student1 values(3,'Ramya','Mumbai')");
			
			
			ResultSet rs = st.executeQuery("delete from Student1 where id=3");
			while(rs.next())
			{
				System.out.println(rs.getInt("rollNo")+"\t"+rs.getString("Name"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}























