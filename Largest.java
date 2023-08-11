package com.edu;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 'a' value");
		a= sc.nextInt();
		
		System.out.println("Enter 'b' value");
		b=sc.nextInt();
		
		System.out.println("Enter 'c' value");
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("The largest number is "+ a);
		}else if(b>a && b>c){
			System.out.println("The largest number is "+ b);
		}else {
			System.out.println("The largest number is "+ c);
		}

	}

}
