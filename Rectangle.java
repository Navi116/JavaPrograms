package com.edu;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//area of a rectangle
		int l,b,area;
		
		//accept data from input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		l = sc.nextInt(); //This reads integer value
		System.out.println("Enter breadth");
		b = sc.nextInt(); //This reads integer value and assigns it to b
		area = l*b;
		
		System.out.println("The area of the rectangle of length "+ l+ " and breadth "+ b+ " is = " + area);
	}

}
