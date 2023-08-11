package com.edu;

import java.util.Scanner;

public class Discount2 {

	public static void main(String[] args) {
		float price,discount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product price");
		price = sc.nextFloat();
		
		if (price<=1000) {
			discount = price*0.02f;
		}else if(price<=3000) {
			discount = price*0.1f;
		}else {
			discount = price*0.15f;
		}
		
		System.out.println("Your product total price will be Rs."+ (price-discount));

	}

}
