package com.employee.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployee {
	
	@Autowired
	IEmployeeRepository iEmployeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return iEmployeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		iEmployeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		iEmployeeRepository.deleteById(empId);
	}

	@Override
	public List<Employee> getAll() {
		return iEmployeeRepository.findAll();
	}

	@Override
	public List<Employee> getByempId(Integer empId) {
		return iEmployeeRepository.findByempId(empId);
	}

	@Override
	public List<Employee> getByEmpName(String empName) {
		return iEmployeeRepository.findByEmpName(empName);
	}

	@Override
	public List<Employee> getEmployeeByProjectManager(String manager) {
		// TODO Auto-generated method stub
		return iEmployeeRepository.findEmployeeByProjectManager(manager);
	}

	

	
	
	

	

}
