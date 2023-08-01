package com.ems.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	private String empName;
	private String empDepartment;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private EmployeeSalary employeeSalary;
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private EmployeeAddress employeeAddress;
}
