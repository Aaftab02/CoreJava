package com.edubridge.jdbcpreparedstatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step 1-load the jdbc driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2-Establish the connection
		String url ="jdbc:mysql://localhost:3306/feb28";
		String uname="root";
		String password="root";
		
		//Step 3-connect with database
		
		Connection conn=DriverManager.getConnection(url,uname,password);
		
		//Step 4- inserting record using preparedstatement
		
		String sql = "insert into user(uid,uname,location)values(?,?,?)";
		
		/*PreparedStatement ps =conn.prepareStatement(sql);
		
		ps.setInt(1, 101);
		ps.setString(2, "Aaftab");
		ps.setString(3, "mumbai");
		
		int i = ps.executeUpdate();
		*/
		CallableStatement cs = conn.prepareCall(sql);
		
		cs.setInt(1, 102);
		cs.setString(2, "Adil");
		cs.setString(3, "pune");
		cs.execute();
		
		System.out.println("Database inserted successfully");

	}

}
