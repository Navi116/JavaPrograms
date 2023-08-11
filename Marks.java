package com.edu;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		char grade;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter student's grade (A/B/C/D)");
		grade = sc.next().charAt(0);
		
		if(grade == 'A' || grade == 'a') {
			System.out.println("Your marks are in the range of 90 - 100");			
		}else if(grade == 'B' || grade == 'b') {
			System.out.println("Your marks are in the range of 70 - 89");
		}else if(grade == 'C' || grade == 'c') {
			System.out.println("Your marks are in the range of 50 - 69");
		}else if(grade == 'D' || grade == 'd') {
			System.out.println("Your marks are in the range of 0 - 49");
		}else {
			System.out.println("Enter a valid grade");
		}

	}

}
