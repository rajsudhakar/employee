package com.employee.service;

import java.util.List;
import java.util.Set;

import com.employee.model.Employee;

public interface IEmployee {
	Employee addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Integer empId);

	List<Employee> getAll();

	List<Employee> getByempId(Integer empId);
	List<Employee> getByEmpName(String empName);
	List<Employee> getEmployeeByProjectManager(String manager);

}
