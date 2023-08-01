package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;
import com.ems.entity.EmployeeSalary;
import com.ems.repository.EmployeeRepository;
import com.ems.repository.EmployeeSalaryRepository;
import com.ems.service.EmployeeSalaryService;

import jakarta.persistence.EntityNotFoundException;

@RestController
public class EmployeeSalaryController {
	
	@Autowired
	private EmployeeSalaryService employeeSalaryService;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeSalaryRepository employeeSalaryRepository;
	
	@PostMapping("/employeesalary/add")
	public EmployeeSalary addEmployeeSalary(@RequestBody EmployeeSalary employeeSalary) {
		
	Employee employee= employeeSalary.getEmployee();
//		
		return employeeSalaryService.addEmployeeSalary(employeeSalary);
//		
		
		
//		Long employeeId = employeeSalary.getEmployee().getEmpId();
//        Employee employee = employeeRepository.findById(employeeId)
//            .orElseThrow(() -> new EntityNotFoundException("Employee not found with ID: " + employeeId));
//
//        employeeSalary.setEmployee(employee);
//
//        return employeeSalaryRepository.save(employeeSalary);
	}
	
	@GetMapping("/employeesalary/{id}")
	public EmployeeSalary getEmployeeSalary(@PathVariable Long id) {
		
		
		return employeeSalaryService.getEmployeeSalary(id);
	}

}
