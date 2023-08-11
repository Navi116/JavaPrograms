package com.edu;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		marks = sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Invalid marks! Enter correct marks");
		}else if(marks>=90){
			System.out.println("You got 'A' grade");
		}else if(marks>=70) {
			System.out.println("You got 'B' grade");
		}else if(marks>=50){
			System.out.println("You got 'C' grade");
		}else {
			System.out.println("You got 'D' grade");
		}

	}

}
