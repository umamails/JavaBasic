package com.basicjava;

import java.util.Scanner;

public class Scannerbiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the three numbers:");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		if (a > b & a > c) {
			System.out.println("\n" + a);
		} else if (b > a & b > c) {
			System.out.println("\n" + b);
		} else
			System.out.println("\n" + c);
		sc1.close();

	}

}
