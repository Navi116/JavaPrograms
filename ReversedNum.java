package com.edu;

public class ReversedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 731, rev=0;
		int b = String.valueOf(a).length();
		System.out.println(b);
		while (b>=0) {
			rev+= a%10;
			rev*=(10^b);
			a=a/10;
			b-=1;
		}
		System.out.println("Reversed num of "+a+" is "+rev);
		
		

	}

}
