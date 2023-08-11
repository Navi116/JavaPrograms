package com.edu;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		float price,discount;
		String pName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product name");
		pName = sc.nextLine();
		
		System.out.println("Enter product price");
		price = sc.nextFloat();
		
		if(price <= 10000) {
			discount = 0.05f*price;
		}else if(price <= 20000) {
			discount = 0.1f*price;
		}else if(price <= 35000) {
			discount = 0.15f*price;
		}else {
			discount = 0.2f*price;
		}
		
		System.out.println("Your "+pName + "'s total cost will be " + (price-discount));

	}

}
