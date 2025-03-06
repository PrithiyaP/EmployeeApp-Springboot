package com.ty.Employee_app.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ty.Employee_app.dto.Employee;
import com.ty.Employee_app.repository.EmployeeRepo;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee saveEmployee(Employee employee) {
			return employeeRepo.save(employee);		
	}
	public Employee findEmployeeById(int id) {
		return employeeRepo.findById(id).get();
		
	}
	public String deleteById(int id) {
		employeeRepo.deleteById(id);
		
		return "deleted";	
	}
	public Employee findbyEname(String name) {
		return employeeRepo.findByEname(name);
	}
	
	public Employee findbySalary(String salary) {
		return employeeRepo.findByEname(salary);
	}
	
	public Employee findbyDesignation(String designation) {
		return employeeRepo.findByEname(designation);
	}
	
	public List<Employee> getAll(){
		return employeeRepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
		
				
				
	}
}
