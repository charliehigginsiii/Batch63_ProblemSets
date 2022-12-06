package ProblemSet_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertedRecord {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8","Batch63User","Batch632022.");
			PreparedStatement results=connect.prepareStatement("insert into students(stno,stname,email)values(?,?,?)");
			results.setInt(1, 8);
			results.setString(2, "Anna");
			results.setString(3, "anna@abc.com");
			results.execute();
			System.out.println("Record Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
