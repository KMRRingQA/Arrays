package com.qa.main;

public class Q2_Arrays {

	public void arrayMethod() {

		int[] numsArray = new int[10];
		for (int i = 0; i < 10; i++) {
			numsArray[i] = i + 1;
			System.out.print(numsArray[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			numsArray[i] *= 10;
			System.out.print(numsArray[i] + "\t");
		}

	}

}
