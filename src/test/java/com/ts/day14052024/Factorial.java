package com.ts.day14052024;

public class Factorial {
	
	public static void factorial(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is "+fact);

	}

	public static void main(String[] args) {
		
		factorial(4);
	}

}
