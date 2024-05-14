package com.ts.day13052024;

public class PrintFirst100PrimeNumbers {

	public static void RangeOfPrime(int Number) {
		System.out.println("Prime no below "+Number+" are :");
		for (int i = 1; i <Number; i++) {
			int temp=0;
			for (int j = 2; j <i; j++) {
				if(i%j==0) {
					temp++;
					break;
				}
				
			}
			if(temp==0) {
				System.out.println(i);
			}
			
		}

	}

	public static void primeNumberCheck(int number) {
		int temp=0;
		for (int j = 2; j <number; j++) {
			if(number%j==0) {
				temp++;
				break;
			}
			
		}
		if(temp==0) {
			System.out.println("Given Number "+number+" is  prime Number");
		}else
			System.out.println("Given Number "+number+" is NOT prime Number");

	}

	public static void main(String[] args) {
		RangeOfPrime(20);
		primeNumberCheck(15);

	}

}
