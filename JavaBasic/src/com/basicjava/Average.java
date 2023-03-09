package com.basicjava;

import java.util.Scanner;

public class Average {
	public static void calculate(int a, int b, int c) {

		int d = (a + b + c) / 3;
		System.out.println("Average of three numbers:" + d);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the three numbers to find average: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		Average avg = new Average();
		avg.calculate(a, b, c);
	}

}
