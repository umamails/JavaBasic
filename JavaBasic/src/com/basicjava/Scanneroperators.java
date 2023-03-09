package com.basicjava;

import java.util.Scanner;

public class Scanneroperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.print("enter an int float double Boolean: ");
		int a = sc1.nextInt();
		float b = sc1.nextFloat();
		double c = sc1.nextDouble();
		boolean d = sc1.nextBoolean();

		System.out.println("\n" + a + "\n" + b + "\n" + c);
		System.out.println(d);
		System.out.println(a + b);

		System.out.println("enter a Name Age Gender Address: ");
		// String info = sc2.next();
		String Name = sc2.next();
		String Age = sc2.next();
		String Gender = sc2.next();
		String Address = sc2.next();
		System.out.println(Name + "\n" + Age + "\n" + Gender + "\n" + Address);
		System.out.println("enter 3 numbers: ");
		int m = sc3.nextInt();
		int n = sc3.nextInt();
		int o = sc3.nextInt();
		System.out.println(m + n + o);
		System.out.println((m + n + o) / 3);
		sc1.close();
		sc2.close();
		sc3.close();

	}

}
