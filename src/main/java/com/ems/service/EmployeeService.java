package com.ems.service;

import java.util.List;

import com.ems.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getListOfEmployees();

	void deleteEmployeeById(Long empId);

	Employee updateEmployeeById(Long empId, Employee employee);

	Employee getEmployee(Long id);

}
