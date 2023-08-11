package com.edu;

import java.util.Scanner;

class Employee{
	int empId,empAge;
	String empName,empDept;
	float empSal;
	
	//Creating a method to input employee details
	void employeeDetailsData() {
		//Creating a scanner class to input details
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		empName = sc.nextLine();
		
		System.out.println("Enter Employee ID");
		empId= sc.nextInt();
		
		System.out.println("Enter Employee Age");
		empAge = sc.nextInt();
		
		System.out.println("Enter Employee Department");
		empDept = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Employee Salary");
		empSal= sc.nextFloat();
	}
	
	void employeeDetailsDisplay() {
		System.out.println("Employee Details");
		System.out.println("Employee name="+ empName);
		System.out.println("Employee ID="+ empId);
		System.out.println("Employee Age="+ empAge);
		System.out.println("Employee Department="+ empDept);
		System.out.println("Employee Salary="+ empSal);
	}
	
	
	
	
}

public class MainApp {
	public static void main(String[] args) {
		Employee emp= new Employee();
		
		emp.employeeDetailsData();
		emp.employeeDetailsDisplay();
	}

}
