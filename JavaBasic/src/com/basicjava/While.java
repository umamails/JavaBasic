package com.basicjava;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 30;
		int i = 1;
		int sum = 0;
		while (i <= n) {
			if (i % 2 == 0)
				sum = sum + i;
			i++;
		}
		System.out.println("Even numbers are:" + sum);

	}

}
