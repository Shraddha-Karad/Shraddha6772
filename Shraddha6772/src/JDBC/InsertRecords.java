package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class InsertRecords {

	
	public static void main(String[] args) throws SQLException 
	{

		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql:///rahelsane_6772","root","12345");
			
			Statement stmt = (Statement) con.createStatement();
			
			//String query = "create table teacher (Teacher_Id int,Teacher_Name varchar(20),Teacher_Education varchar(20),Teacher_Address varchar(30),Teacher_Salary varchar(10))";
			
			String query = "insert into teacher values(101,'Dwarka','MA','Shivajinagar','45000'),(102,'Ragini','MSC','Kothrud','55000'),(103,'Dipali','BBA','Sangvi','40000'),(104,'Ashwini','MCS','Pashan','50000'),(105,'Asha','MBA','Dhanori','75000')";
			
			
			//stmt.executeUpdate(query);
			
			
			
			
			int i = ((java.sql.Statement) stmt).executeUpdate(query);
			if(i>0)
			{
				System.out.println("RECORD INSERTED !!!!!");
			}
			else
			{
				System.out.println("ERROR !!!!!");
			}
			
			
		
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			
			//System.out.println("Exception has Occured"+e);
			e.printStackTrace();
		}
		

	}
	
}
