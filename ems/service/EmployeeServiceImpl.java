package com.flp.ems.service;

import java.util.Map;

import com.flp.ems.domain.*;

public class EmployeeServiceImpl {

	Employee employee= new Employee();
	Department dept= new Department();
	Project pro= new Project();
	Role role= new Role();
	
	public void AddEmployee(Map<String, String> map){
		
		employee.setEmployee_id((String) map.get("Employee_id"));
		employee.setName((String) map.get("Name"));
		employee.setKin_id((String) map.get("Kin_id"));
		employee.setEmail_id((String) map.get("Email_id"));
		employee.setPhone_no((String) map.get("Phone_no"));
		employee.setDate_Of_Birth((String) map.get("Date_Of_Birth"));
		employee.setDate_Of_Joining((String) map.get("Date_Of_Joining"));
		employee.setAddress((String) map.get("Address"));
		
		employee.setDepartment_id(map.get("Department_id"));
		
		dept.setDepartment_id(map.get("Department_id"));
		dept.setName(map.get("Department_name"));
		dept.setDescription(map.get("Department_Desc"));
		
		employee.setProject_id(map.get("Project_id"));
		
		pro.setDescription(map.get("Project_Desc"));
		pro.setName(map.get("Project_Name"));
		
		employee.setRoles_id(map.get("Role_id"));
		
		
		role.setDescription(map.get("Role_Desc"));
		role.setName(map.get("Role_Name"));
				
	
		
	}
	
	
	
	
}
