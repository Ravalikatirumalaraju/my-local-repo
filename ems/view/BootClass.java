package com.flp.ems.view;
import java.util.*;

public class BootClass {
	static UserInteraction ui= new UserInteraction();
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		do{
		System.out.println("Menu:\n1.AddEmployee,\n2.ModifyEmployee\n3.RemoveEmployee\n4.SearchEmployee\n5.getAllEmployee\n6.Exit");
		ch=sc.nextInt();
	    menuSelection(ch);
	
		}
		while(ch<7);
	
	}
	
public static void menuSelection(int ch){
		
		switch(ch)
		
		{
		case 1:
			ui.AddEmployee();
			break;
		
		case 2: 
			ui.ModifyEmployee();
			break;
			
		case 3: 
			ui.RemoveEmployee();
			break;
			
		case 4: 
			ui.SearchEmployee();
			break;
			
		case 5: 
			ui.getAllEmployee();
			break;
			
		case 6:
			System.exit(0);
			
		default:
				System.out.println("Entered invalid option");
		

		}	
	
}
}
	
	
	

