package ProblemSet_3;

import java.sql.*;
public class Problem9 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection conn=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			PreparedStatement smt=conn.prepareStatement("Insert into students(stno,stname,email)values(?,?,?)");
			smt.setInt(1, 7);
			smt.setString(2, "Jack");
			smt.setString(3, "jackson@abcmail.com");
			smt.execute();
			System.out.println("Record Inserted.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
