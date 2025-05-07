package com.projectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;


@Repository
public class DaoRepo {
	
	
	public ArrayList<Employee> getAllEmp() throws ClassNotFoundException, SQLException
	{
		ArrayList<Employee> al =new ArrayList<Employee>();
//		///step 1 load class driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		//step 2 connection
//		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/EmployeeDB","root","root");
		 Connection con=DBConnection.DbConnect();
		//step 3 create statement
		 Statement st=con.createStatement();
		 //step 4 execute query
		 ResultSet rs=st.executeQuery("select * from Employee");
		 
		 //iteraator
		 while(rs.next())
		 {
				String empName=rs.getString("empName");
				int empAge=rs.getInt("empAge");
				int empSalary=rs.getInt("empSalary");
				String empLocation= rs.getString("empLocation");
				int empId=rs.getInt("empId");
				
				Employee Emp=new Employee(empName,empAge,empSalary,empLocation,empId);
				al.add(Emp);
				
		 }
		 return al;	
	}
	
	public Employee getById(int empId) throws ClassNotFoundException, SQLException {
	    Connection con = DBConnection.DbConnect();
	    PreparedStatement pst = con.prepareStatement("SELECT * FROM Employee WHERE empId = ?");
	    pst.setInt(1, empId);
	    ResultSet rs = pst.executeQuery();

	    Employee emp = null; // Initialize to null

	    if (rs.next()) {
	        emp = new Employee();
	        
	        emp.setEmpName(rs.getString("empName"));
	        emp.setEmpAge(rs.getInt("empAge"));
	        emp.setEmpSalary(rs.getInt("empSalary"));
	        emp.setEmpLocation(rs.getString("empLocation"));
	        emp.setEmpId(rs.getInt("empId"));
	    }

	    return emp; // Return the filled Employee object or null if not found
	}

	public String insertEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		Connection con=DBConnection.DbConnect();
		PreparedStatement pst= con.prepareStatement("insert into Employee values(?,?,?,?,?)");
		//set data
		pst.setString(1,emp.getEmpName());
		pst.setInt(2, emp.getEmpAge());
		pst.setInt(3, emp.getEmpSalary());
		pst.setString(4, emp.getEmpLocation());
		pst.setInt(5, emp.getEmpId());
		
		pst.executeUpdate();
		
		return "data has been inserted..!";
		
	}
	
	public String Update(Employee emp) throws ClassNotFoundException, SQLException
	{
		Connection con= DBConnection.DbConnect();
		
		PreparedStatement pst=con.prepareStatement("update Employee set EmpName=?,EmpAge=?,EmpSalary=?, EmpLocation=? where empId=?");
		pst.setString(1,emp.getEmpName());
		pst.setInt(2, emp.getEmpAge());
		pst.setInt(3, emp.getEmpSalary());
		pst.setString(4, emp.getEmpLocation());
		pst.setInt(5, emp.getEmpId());
		
		pst.executeUpdate();
		return "updated all..!";
	}
	
	public String Delete(int empId) throws ClassNotFoundException, SQLException
	{ 
		Connection con=DBConnection.DbConnect();
		PreparedStatement pst=con.prepareStatement("delete from Employee where empId=?");
		
		pst.setInt(1, empId);
		pst.executeUpdate();
		
		return "Deleted By ID";
		
		
	}
     
	
}
