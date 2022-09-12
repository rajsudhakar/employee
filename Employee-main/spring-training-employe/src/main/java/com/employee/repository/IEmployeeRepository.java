package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByempId(Integer empId );
	List<Employee> findByEmpName(String empName);
	
//	List<Employee> findAll();
	
	@Query("from Employee e INNER JOIN e.projectList mn WHERE mn.manager=?1")
	List<Employee> findEmployeeByProjectManager(String manager);
	

}
