package com.projectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection DbConnect() throws SQLException, ClassNotFoundException
	{
		///step 1 load class driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost/EmployeeDB","root","root");
	return con;
	}

}
