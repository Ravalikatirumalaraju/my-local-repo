package com.flp.ems.domain;

public class Project {

	private String Project_id;
	private String Description;
	private String Name;
	private String Department_id;
	
	public String getProject_id() {
		return Project_id;
	}
	public void setProject_id(String project_id) {
		Project_id = project_id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	
	@Override
	public String toString() {
		return "Project [Project_id=" + Project_id + ", Description=" + Description + ", Name=" + Name
				+ ", Department_id=" + Department_id + "]";
	}
	
}
