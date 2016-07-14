package com.flp.ems.view;

import java.util.*;

import com.flp.ems.util.Validate;

public class UserInteraction {
	
	private String Employee_id;
	private String Name;
	private String Kin_id;
	private String Email_id;
	private String Phone_no;
	private String Date_Of_Birth ;
	private String Date_Of_Joining;
	private String Address;
	private String Department_id;
	private String Department_Name;
	private String Department_Desc;
	private String Project_id;
	private String Project_Name;
	private String Project_Desc;
	private String Role_id;
	private String Role_Name;
	private String Role_Desc;
	
	Scanner sc= new Scanner(System.in);
	HashMap<String,String> map= new HashMap<String,String>();
	Validate vd= new Validate();
	
	public void AddEmployee(){
		System.out.println("Enter Employee Id:");
		Employee_id= sc.next();
		map.put("Employee_id", Employee_id);
		
		System.out.println("Enter Name:");
		Name= sc.next();
		map.put("Name", Name);
		
		System.out.println("Enter Kin Id:");
		Kin_id= sc.next();
		map.put("Kin_id", Kin_id);
		
		System.out.println("Enter Email Id:");
		Email_id= sc.next();
		map.put("Email_id", Email_id);
		
		System.out.println("Enter Phone No:");
		Phone_no= sc.next();
		map.put("Phone_no", Phone_no);
		
		System.out.println("Enter Date Of Birth:");
		Date_Of_Birth= sc.next();
		if(vd.valid_Date(Date_Of_Birth))
		{
		map.put("Date_Of_Birth", Date_Of_Birth);}
		else
		{
			System.out.println("Invalid Date Entered.");
		}
		
		
		
		System.out.println("Enter Date Of Joining:");
		Date_Of_Joining= sc.next();
		if(vd.valid_Date(Date_Of_Joining))
		{
		map.put("Date_Of_Joining", Date_Of_Joining);}
		else
		{
			System.out.println("Invalid Date Entered:");
		}
		
		
		
		System.out.println("Enter Address:");
		Address= sc.next();
		map.put("Address", Address);
		
		System.out.println("Enter Department Id:");
		Department_id= sc.next();
		map.put("Department_id", Department_id);
		
		System.out.println("Enter Department Name:");
		Department_Name= sc.next();
		map.put("Department_Name", Department_Name);
		
		System.out.println("Enter Department Description:");
		Department_Desc= sc.next();
		map.put("Department_Desc", Department_Desc);
		
		System.out.println("Enter Project Id:");
		Project_id= sc.next();
		map.put("Project_id", Project_id);
		
		System.out.println("Enter Project Name:");
		Project_Name= sc.next();
		map.put("Project_Name", Project_Name);
		
		System.out.println("Enter Project Description:");
		Project_Desc= sc.next();
		map.put("Project_Desc", Project_Desc);
			
		System.out.println("Enter Roles Id:");
		Role_id= sc.next();
		map.put("Role_id", Role_id);
		
		System.out.println("Enter Role Name:");
		Role_Name= sc.next();
		map.put("Role_Name", Role_Name);
	
		System.out.println("Enter Role Description:");
		Role_Desc= sc.next();
		map.put("Role_Desc", Role_Desc);
	}
	
	
public void ModifyEmployee(){
		
		
		
	}
	
public void RemoveEmployee(){
	
	
	
}
public void SearchEmployee(){
	
	
	
}
public void getAllEmployee(){
	
	
	
}
	
	
	
}
