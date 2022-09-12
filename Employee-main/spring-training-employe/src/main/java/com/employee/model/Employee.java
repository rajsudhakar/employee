package com.employee.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@GeneratedValue(generator = "emp_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "emp_id", sequenceName = "emp_seq", initialValue = 1)
	private Integer empId;
	private String empName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id")
	private List<Project> projectList;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, Address address, List<Project> projectList) {
		super();
		this.empName = empName;
		this.address = address;
		this.projectList = projectList;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + ", projectList=" + projectList + "]";
	}

	

}
