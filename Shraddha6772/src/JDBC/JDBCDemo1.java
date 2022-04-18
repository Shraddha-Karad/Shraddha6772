package JDBC;

import java.sql.*;
import java.util.Scanner;

class JDBCDemo1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Demo6772", "root", "12345");
			Statement stmt = con.createStatement();
			
//			String query = "create table Employee(id int, name varchar(20))";
			

			String query1 = "delete from Employee where id = 3";
				
			stmt.executeUpdate(query1);
			
			
			String query2 = "select * from Employee";
			ResultSet rs = stmt.executeQuery(query2);
			
			System.out.println("ID\tName");
			while(rs.next())
			{
				
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name"));
			}

			System.out.println();
			System.out.println("Deleted Susccessfully !");
		}

		catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}
	}
}