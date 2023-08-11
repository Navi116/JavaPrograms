package com.edu;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a= sc.nextInt();
		
		if(a%3==0) {
			if(a%5==0) {
				System.out.println(a +" is divisible by 3 and 5");
			}else {
				System.out.println(a +" is divisible by 3");
			}
		}else {
			System.out.println(a +" is not divisible by 3 or 5");
		}
	}

}
