package com.basicjava;

public class dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		do {
			if (i % 2 == 1)
				sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println("the sum of 10 no.s is:" + sum);
	}

}
