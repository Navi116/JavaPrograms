package com.edu;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		int units;
		String consName;
		float bill;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter consumer Name");
		consName = sc.nextLine();
		
		System.out.println("Enter the number of units consumed");
		units = sc.nextInt();
		
		if(units<= 200) {
			bill = (units *3.80f);
		}else if(units<=300) {
			bill = 200*3.80f + (units-200)*4.40f;
		}else if(units <= 400) {
			bill = 200*3.80f + 100* 4.40f +(units-300)*5.10f;
		}else {
			bill = 200*3.80f+ 100*4.40f + 100*5.10f + (units-400)*5.80f;
		}
		
		System.out.println("Hi "+ consName + ". Your electricity bill is Rs."+ bill);

	}

}
