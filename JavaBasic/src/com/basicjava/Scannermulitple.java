package com.basicjava;

import java.util.Scanner;

public class Scannermulitple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the two numbers:");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		System.out.println("\n" + a * b);

		sc1.close();

	}

}
