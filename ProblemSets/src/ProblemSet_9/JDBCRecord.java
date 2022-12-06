package ProblemSet_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRecord {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8","Batch63User","Batch632022.");
			Statement results=connect.createStatement();
			ResultSet result=results.executeQuery("Select * from students");
			while(result.next()) {
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
