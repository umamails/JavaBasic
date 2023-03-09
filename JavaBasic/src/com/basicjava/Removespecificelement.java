package com.basicjava;

public class Removespecificelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 4, 1, 3, 5 };
		for (int i = 0; i < 5; i++) {

			if (a[i] == 1)
				continue;

			System.out.println("Array of sepcific no. is:" + a[i]);

		}

	}
}
