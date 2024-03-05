package com.edubridge.singletondesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
	private static JDBCSingleton jdbc;
	private JDBCSingleton() { }
	public static JDBCSingleton getInstance() {
		if(jdbc==null) {
			jdbc=new JDBCSingleton();
		}
		return jdbc;
	}
	private static Connection getConnection() throws ClassNotFoundException,SQLException {
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/singleton", "root", "root");
		return conn;
	}
	public int insert(String name,String pass,int id) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			c=this.getConnection();
			ps = c.prepareStatement("insert into employee(eid,uname,upass)values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, pass);
			recordCounter=ps.executeUpdate();//returns the count 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		return recordCounter;
	}
		public void view() throws SQLException{
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				con=this.getConnection();
				ps=con.prepareStatement("select * from employee");
				
				rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("Id"+rs.getInt(1)+"\tName"+rs.getString(2)+"\tPassword"+rs.getString(3));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				if(ps!=null) {
					ps.close();
				}
				if(con!=null) {
					con.close();
				}
			}
		}
		public int update(int id,String name,String password) throws SQLException {
			Connection c = null;
			PreparedStatement ps = null;
			int recordCounter=0;
			try {
				c=this.getConnection();
				ps=c.prepareStatement("update employee set upass=?, uname =? where eid =?");
				ps.setString(1, password);
				ps.setString(2, name);
				ps.setInt(3, id);
				recordCounter=ps.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				if(ps!=null) {
					ps.close();
				}
				if(c!=null) {
					c.close();
				}
			}
			return recordCounter;
		}
		public int delete(int userid) throws SQLException {
			Connection c=null;
			PreparedStatement ps = null;
			int recordCounter=0;
			try {
				c=this.getConnection();
				ps = c.prepareStatement("delete from employee where eid='"+userid+"' ");
				recordCounter=ps.executeUpdate();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			finally {
				if(ps!=null) {
					ps.close();
				}
				if(c!=null) {
					c.close();
				}
			}
			return recordCounter;		
		}
	}

