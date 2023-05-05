package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDao {
	Connection con;
	public CustomerDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acs","root","root");
			System.out.println("Connected.....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void readAllCustomer() {
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from customer");
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(3)+"\t"+rs.getString(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createCustomer(int custId,String name, String email) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?)");
			ps.setInt(1, custId);
			ps.setString(2, email);
			ps.setString(3, name);
			ps.executeUpdate();
			System.out.println("Customer Created....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
