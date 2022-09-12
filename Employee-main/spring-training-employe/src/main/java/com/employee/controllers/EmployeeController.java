package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.IEmployee;

@RestController
@RequestMapping("/employees-restapi")
public class EmployeeController {

	@Autowired
	IEmployee employeeSrivice;

	@PostMapping("/employees-restapi")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		Employee newEmployee = employeeSrivice.addEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "One employee added");

		return ResponseEntity.ok().headers(headers).body(newEmployee);

	}

	@PutMapping("/employees")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {

		employeeSrivice.updateEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Updated");

		return ResponseEntity.ok().headers(headers).body("Updated");

	}

	@DeleteMapping("/employees/employee-by-id/{empId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empId") Integer empId) {

		employeeSrivice.deleteEmployee(empId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Deleted");

		return ResponseEntity.ok().headers(headers).build();

	}

	@GetMapping("/employees/employee-get-id/{empId}")
	 public ResponseEntity<List<Employee>> getByempId(@PathVariable("empId") Integer empId){
		
		List<Employee> employeeList = employeeSrivice.getByempId(empId);
		
		return ResponseEntity.ok().body(employeeList);
		
	}

	@GetMapping("/employees/employee-by-name/{empName}")
	public ResponseEntity<List<Employee>> getByEmpName(@PathVariable("empName") String empName){
		List<Employee> employeeList = employeeSrivice.getByEmpName(empName);
		return ResponseEntity.ok().body(employeeList);
	}

	@GetMapping("/employees/employee-by-manager/{manager}")
	public ResponseEntity<List<Employee>> getEmployeeByProjectManager(@PathVariable("manager") String manager){
	
		List<Employee> employeeList = employeeSrivice.getEmployeeByProjectManager(manager);
		return ResponseEntity.ok().body(employeeList);
		
		
	}

}
