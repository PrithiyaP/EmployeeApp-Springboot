package com.ty.Employee_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.Employee_app.dto.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

	public Employee findByEname(String ename);
	public Employee findBySalary(double salary);
	public Employee findByDesignation(String designation);
	
	
	
}
