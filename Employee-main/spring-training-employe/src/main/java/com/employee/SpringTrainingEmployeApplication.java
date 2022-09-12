package com.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.Address;
import com.employee.model.Employee;
import com.employee.model.Project;
import com.employee.service.EmployeeServiceImpl;

@SpringBootApplication
public class SpringTrainingEmployeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringTrainingEmployeApplication.class, args);
	}

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@Override
	public void run(String... args) throws Exception {

//		Project project = new Project("Sql", 5, "Tom");
//		Project project1 = new Project("Web", 1, "Jerry");
//		List<Project> projectList = new ArrayList<>(Arrays.asList(project, project1));
//
//		Address address = new Address("Bidar", 5782589, "kar");
//		// Address address1 = new Address("Mys", 5214, "Kerla");
//
//		Employee employee = new Employee("Jack", address, projectList);
//		// Employee employee = new Employee("ABc", projectList, address);
//		
//		employeeServiceImpl.addEmployee(employee);

		employeeServiceImpl.getEmployeeByProjectManager("Tom").forEach(System.out::println);
	
	}

}
