package com.edu;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e_id,e_age;
		String e_name,e_dept;
		float e_salary;
		char e_gender;
		
		//Importing scanner module to read the input from run-time
		Scanner s = new Scanner(System.in);
		
		//reading inputs
		System.out.println("Enter employee ID");
		e_id = s.nextInt();
		//s.nextLine();
		
		System.out.println("Enter employee Age");
		e_age = s.nextInt();
		//s.nextLine();
		
		System.out.println("Enter employee Name");
		e_name = s.next();
		s.nextLine(); // Read string with space
		
		System.out.println("Enter employee Salary");
		e_salary = s.nextFloat();
		//s.nextLine();
		
		System.out.println("Enter employee Department");
		e_dept = s.next();
		s.nextLine();
		
		System.out.println("Enter employee gender (M/F)");
		e_gender = s.next().charAt(0); // (0) represents reading reading first character
		//s.nextLine();
		
		//Printing employee details
		System.out.println("Employee details:");
		System.out.println("Employee ID: "+ e_id);
		System.out.println("Employee Name: "+ e_name);
		System.out.println("Employee Age: "+ e_age);
		System.out.println("Employee Department "+ e_dept);
		System.out.println("Employee Salary "+ e_salary);
		System.out.println("Employee Gender "+ e_gender);
	}

}
