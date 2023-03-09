package com.basicjava;

public class Insertspecificelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 4, 1, 3, 5 };
		int n = a.length;
		int b[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
			if (i == 6) {

				b[i] = 0;
			}

			System.out.println("Array of sepcific no. is:" + b[i]);

		}

	}
}
