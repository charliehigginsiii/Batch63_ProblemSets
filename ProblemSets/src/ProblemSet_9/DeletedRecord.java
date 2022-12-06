package ProblemSet_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletedRecord {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8","Batch63User","Batch632022.");
			PreparedStatement results=connect.prepareStatement("delete from students where stname=?");
			results.setString(1,"Anna" );
			results.execute();
			System.out.println("Record Deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
