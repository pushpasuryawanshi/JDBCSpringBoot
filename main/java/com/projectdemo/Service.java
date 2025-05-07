package com.projectdemo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	DaoRepo Dao;
	
	public List<Employee> getAllEmp() throws ClassNotFoundException, SQLException
	{
		List<Employee> list=Dao.getAllEmp();
		return list;
		
	}
	
	public String insertEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		String msg=Dao.insertEmployee(emp);
		return msg;
	}
	
	public String DeleteById(int empId) throws ClassNotFoundException, SQLException
	{
		String msg=Dao.Delete(empId);
		return msg;
	}
	
	public String UpdatedById(Employee emp) throws ClassNotFoundException, SQLException
	{
		String msg=Dao.Update(emp);
		return msg;
		
	}
    public Employee getById(int empId) throws ClassNotFoundException, SQLException
    {
    	Employee msg=Dao.getById(empId);
    	return msg;
    }
}

