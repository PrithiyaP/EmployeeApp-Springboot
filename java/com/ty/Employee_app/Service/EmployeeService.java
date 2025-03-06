package com.ty.Employee_app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.Employee_app.Dao.EmployeeDao;
import com.ty.Employee_app.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public Employee updateEmployee(Employee employee,int id) {
		Employee employee2=dao.findEmployeeById(id);
		
		if (employee2 !=null) {
			employee.setId(id);
			dao.updateEmployee(employee);		
			
			return employee;			
		}
		return null;
		
	}

}
