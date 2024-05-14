package com.ts.day14052024;

import java.util.Set;
import java.util.TreeSet;

public class FindMaxAndMinFromArray {
	public static void findMaxAndMin(int[] x) {
		TreeSet<Integer> tset=new TreeSet<Integer>();
		for (Integer i : x) {
			tset.add(i);
		}
		System.out.println("Max no from Array is "+tset.last());
		System.out.println("Min no from Array is "+tset.first());
		//System.out.println("Elements less than 40 are "+tset.ceiling(300));
		//System.out.println("Elements greater than 40 are "+tset.floor(20));
		System.out.println("Second Max no from Array is "+tset.headSet(tset.last()).last());

	}

	public static void main(String[] args) {
		int[] x= {10,20,60,40,88,30,40,88,50};
		
		findMaxAndMin(x);

	}

}
