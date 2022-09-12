package com.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Project {
	@Id
	@GeneratedValue(generator="pro_id",strategy =GenerationType.AUTO)
	@SequenceGenerator(name = "pro_id",sequenceName = "pro_seq",initialValue = 1)
	private Integer projectId;
	private String projectName;
	private int duration;
	private String manager;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, int duration, String manager) {
		super();
		this.projectName = projectName;
		this.duration = duration;
		this.manager = manager;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", duration=" + duration + ", manager=" + manager + "]";
	}
	
	

	

	

	
	
	
}
