package com.ty.Employee_app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.Employee_app.Dao.EmployeeDao;
import com.ty.Employee_app.Service.EmployeeService;
import com.ty.Employee_app.dto.Employee;
import com.ty.Employee_app.util.ResponseStructure;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeedao;
	
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping("saveEmployee")
	public ResponseStructure<Employee> saveEmployee(@RequestBody Employee employee) {
		
		ResponseStructure<Employee> responsestructure=new ResponseStructure<Employee>();
		responsestructure.setStatus(HttpStatus.OK.value());
		responsestructure.setMessage("sucessfully stored");
		responsestructure.setData(employeedao.saveEmployee(employee));
		return responsestructure;		
	}
	
	@GetMapping("getEmployeeDetails")
	public ResponseStructure<Employee> findEmployeeById(@RequestParam int id) {
	
		ResponseStructure<Employee> responsestructure=new ResponseStructure<>();
		responsestructure.setStatus(HttpStatus.OK.value());
		responsestructure.setMessage("data recived successfully");
		responsestructure.setData(employeedao.findEmployeeById(id));
		
		return 	responsestructure;
	}
	
	@DeleteMapping("delete")
	public ResponseStructure<String> deleteById(@RequestParam int id) {
		
		ResponseStructure<String> responsestructure=new ResponseStructure<>();
		responsestructure.setStatus(HttpStatus.OK.value());
		responsestructure.setMessage("Deleted successfully");
		responsestructure.setData(employeedao.deleteById(id));	 
		 return responsestructure;	
	}
	
	@GetMapping("getbyname")
	public Employee findbyEname(@RequestParam String name) {
		return employeedao.findbyEname(name);
	}
	
	@GetMapping("getbysalary")
	public Employee findbySalary(String salary) {
		return employeedao.findbySalary(salary);
	}
	@GetMapping("getbydesignation")
	public Employee findbyDesignation(String designation) {
		return employeedao.findbyDesignation(designation);
	}
	
	@GetMapping("getall")
	public ResponseStructure<List<Employee>> getAllDetails(){	
		ResponseStructure<List<Employee>> responsestructure =new ResponseStructure<>();
		responsestructure.setStatus(HttpStatus.OK.value());
		responsestructure.setMessage("Employee Details");
		responsestructure.setData(employeedao.getAll());
		
		return responsestructure ;
	}
	
	@PutMapping("updateEmployee")
	public ResponseStructure<Employee> updateEmployee(@RequestBody Employee employee,@RequestParam int id) {
		
		ResponseStructure<Employee> responsestructure =new ResponseStructure<>();
		responsestructure.setStatus(HttpStatus.OK.value());
		responsestructure.setMessage("update details");
		responsestructure.setData(employeeservice.updateEmployee(employee,id));
		
		return responsestructure ;
	
		
	}


	
	
	

}
