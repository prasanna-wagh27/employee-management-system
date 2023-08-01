package com.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getListOfEmployees() {
	
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployeeById(Long empId) {
		
		
		employeeRepository.deleteById(empId);
		
	}

	@Override
	public Employee updateEmployeeById(Long empId, Employee employee) {
		
		Employee empOld= employeeRepository.getById(empId);
		
		empOld.setEmpName(employee.getEmpName());
		empOld.setEmpDepartment(employee.getEmpDepartment());
		
		return employeeRepository.save(empOld);
	}

	@Override
	public Employee getEmployee(Long id) {
		
		return employeeRepository.getById(id);
	}

}
