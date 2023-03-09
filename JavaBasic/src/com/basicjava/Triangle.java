package com.basicjava;

public class Triangle {

	int area;
	int parameter;

	Triangle() {
	}

	public static void main(String[] args) {
		Triangle s1 = new Triangle();
		s1.area = (3 + 4 + 5) / 2;
		s1.parameter = 3 + 4 + 5;
		System.out.println(s1.area);
		System.out.println(s1.parameter);

	}

}
