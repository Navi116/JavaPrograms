package com.edu;

import java.util.Scanner;

public class TernanryLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("a val");
		a= sc.nextInt();
		
		System.out.println("b val");
		b= sc.nextInt();
		
		System.out.println("c val");
		c= sc.nextInt();
		
		d=(a>b && a>c)? a: (a>b && a<c)? c :b;
		System.out.println("The Largest number is = "+ d);
		
	}

}
