package com.basicjava;

public class Student2 {

//	
	// TODO Auto-generated method

	String name;
	int roll_no;

	Student2(String name1, int roll_no1) {
		name = name1;
		roll_no = roll_no1;

	}

	void display() {
		System.out.println(name + " " + roll_no);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2("John", 2);
		s1.display();
	}

}
