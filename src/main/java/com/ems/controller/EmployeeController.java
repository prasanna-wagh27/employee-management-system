package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getListOfEmployees(){
		
		return employeeService.getListOfEmployees();
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable ("id") Long empId) {
		
		employeeService.deleteEmployeeById(empId);
	}
	
	@PutMapping("/employees/update/{id}")
	public Employee updateEmployeeById(@PathVariable ("id") Long empId, @RequestBody Employee employee) {
		
		return employeeService.updateEmployeeById(empId, employee);
	}
	
	@GetMapping("/employees/byid")
	@ResponseBody
	public Employee getEmployee(@RequestParam (name = "id") Long id) {
		
		return employeeService.getEmployee(id);
	}
	
	

}
