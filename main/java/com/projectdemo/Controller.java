package com.projectdemo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	
	@GetMapping("/employee")
	public List<Employee> getAllEmp() throws ClassNotFoundException, SQLException
	{
		List<Employee> list =service.getAllEmp();
		return list;
	}
	
	@PostMapping("/employee")
	public String insertEmployee(@RequestBody Employee emp) throws ClassNotFoundException, SQLException
	{
		String msg=service.insertEmployee(emp);
		return msg;
	}
	
	@DeleteMapping("/employee/{empId}")
	public String DeleteById(@PathVariable int empId) throws ClassNotFoundException, SQLException
	{
		String msg=service.DeleteById(empId);
		return msg;
	}
	
	@PutMapping("/employee/{empId}")
	public String updateById(@RequestBody Employee emp) throws ClassNotFoundException, SQLException
	{
		String msg=service.UpdatedById(emp);
		return msg;
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getdataById(@PathVariable int empId) throws ClassNotFoundException, SQLException
	{
		 Employee msg=service.getById(empId);
		 return msg;
	}

}
