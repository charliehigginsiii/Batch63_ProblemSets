package ProblemSet_3;

import java.sql.*;
public class Problem9 {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection conn=DriverManager.getConnection(url,"Batch63User","Batch632022.");
			Statement smt=conn.createStatement();
			ResultSet set=smt.executeQuery("Select * from students");
			while(set.next()) {
				System.out.println(set.getString(2));
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
