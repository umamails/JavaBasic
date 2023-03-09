package com.basicjava;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 5);
		System.out.println("the sum of 5 natural no.s is:" + sum);

	}

}
