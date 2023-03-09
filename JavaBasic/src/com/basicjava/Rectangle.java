package com.basicjava;

public class Rectangle {

	public static void Area(int length, int breadth) {

		int a = length * breadth;
		System.out.println("rectangle of length and breadth:" + length + " " + breadth);
		System.out.println("rectangle of area:" + a);
	}

	public static void main(String[] args) {
		Rectangle s1 = new Rectangle();
		Rectangle s2 = new Rectangle();
		s1.Area(4, 5);
		s2.Area(5, 8);
	}

}
