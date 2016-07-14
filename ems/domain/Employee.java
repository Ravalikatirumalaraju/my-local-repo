package com.flp.ems.domain;

public class Employee {
	
	private String Employee_id;
	private String Name;
	private String Kin_id;
	private String Email_id;
	private String Phone_no;
	private String Date_Of_Birth ;
	private String Date_Of_Joining;
	private String Address;
	private String Department_id;
	private String Project_id;
	private String Roles_id;
	
	
	Department dept= new Department();
	Project pro= new Project();
	Role role= new Role();
	
	
	public String getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(String employee_id) {
		Employee_id = employee_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getKin_id() {
		return Kin_id;
	}
	public void setKin_id(String kin_id) {
		Kin_id = kin_id;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getDate_Of_Birth() {
		return Date_Of_Birth;
	}
	public void setDate_Of_Birth(String date_Of_Birth) {
		Date_Of_Birth = date_Of_Birth;
	}
	public String getDate_Of_Joining() {
		return Date_Of_Joining;
	}
	public void setDate_Of_Joining(String date_Of_Joining) {
		Date_Of_Joining = date_Of_Joining;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	public String getProject_id() {
		return Project_id;
	}
	public void setProject_id(String project_id) {
		Project_id = project_id;
	}
	public String getRoles_id() {
		return Roles_id;
	}
	public void setRoles_id(String roles_id) {
		Roles_id = roles_id;
	}
	@Override
	public String toString() {
		return "Employee [Employee_id=" + Employee_id + ", Name=" + Name + ", Kin_id=" + Kin_id + ", Email_id="
				+ Email_id + ", Phone_no=" + Phone_no + ", Date_Of_Birth=" + Date_Of_Birth + ", Date_Of_Joining="
				+ Date_Of_Joining + ", Address=" + Address + ", Department_id=" + Department_id + ", Project_id="
				+ Project_id + ", Roles_id=" + Roles_id + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
