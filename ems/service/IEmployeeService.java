package com.flp.ems.service;

import java.util.Map;

public interface IEmployeeService {

	Void AddEmployee(Map<String, String> map);
	Void ModifyEmployee();
	Void RemoveEmployee();
	Void SearchEmployee();
	Void getAllEmployee();
	
}
