package com.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.EmployeeSalary;
import com.ems.repository.EmployeeSalaryRepository;
import com.ems.service.EmployeeSalaryService;

@Service
public class EmployeeSalaryServiceImpl implements EmployeeSalaryService{

	@Autowired
	private EmployeeSalaryRepository employeeSalarayRepository;

	@Override
	public EmployeeSalary addEmployeeSalary(EmployeeSalary employeeSalary) {
		
		return employeeSalarayRepository.save(employeeSalary);
	}

	@Override
	public EmployeeSalary getEmployeeSalary(Long id) {
		
		return employeeSalarayRepository.getById(id);
	}
}
