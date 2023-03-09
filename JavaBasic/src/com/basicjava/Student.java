package com.basicjava;

public class Student {

//	
	// TODO Auto-generated method

	String name;
	int roll_no;
	String phone_no;
	String address;

	Student(String name1, int roll_no1, String phone_no1,String address1) {
		name = name1;
		roll_no = roll_no1;
	    phone_no = phone_no1;
	    address = address1;

	}

	void display() {
		System.out.println(name + " " + roll_no+ " " +phone_no+" " +address);
	}

	public static void main(String[] args) {
		Student s1 = new Student("John", 2,"8602210432", "8k lake view apartment,NJ");
		Student s2 = new Student("Sam", 3, "8603310567", "22 lake view apartment,NJ");
		s1.display();
		s2.display();
		
	}

}
