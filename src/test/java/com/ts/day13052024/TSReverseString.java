package com.ts.day13052024;

public class TSReverseString {
	public static void usingConcat(String s) {
		// Case1-Using concatination operator
		

	}

	
	public static void usingStringBufferClass(String s) {
		StringBuffer sb = new StringBuffer(s);
		String rev = sb.reverse().toString();
		if (s.equals(rev)) {
			System.out.println("Given String is Palindtrome:" + s);
		} else {
			System.out.println("Given String is NOT Palindtrome:" + s);
		}

	}
	

	public static void main(String[] args) {

		usingConcat("nitin12");
		usingStringBufferClass("WOW");

	}
}
