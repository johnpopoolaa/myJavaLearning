package com.acmetech.web.dao;

import java.sql.*;
import com.acmetech.web.model.Alien;

public class AlienDao {
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/john", "root", "#$@123John");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next()) // move to the next row
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
	
	// method for adding an alien to the db
	public boolean addAlien(Alien a)
	{
		String sql = "INSERT into alien (aid, aname, tech) values (?, ?, ?)"; // SQL query - used a prepared one because it is cleaner and safer
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/john", "root", "#$@123John"); // create the connection
			
			PreparedStatement ps = con.prepareStatement(sql); // create the statement/query
			// user inputed values
			ps.setInt(1, a.getAid());
			ps.setString(2, a.getAname());
			ps.setString(3, a.getTech());
			
			int rowsInserted = ps.executeUpdate();
			return rowsInserted > 0;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
