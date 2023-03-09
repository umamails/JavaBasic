package com.basicjava;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fruit = 3;
		String abc;
		switch (fruit) {
		case 1:
			abc = "Apple";
			break;
		case 2:
			abc = "orange";
			break;
		case 3:
			abc = "Mango";
			break;
		case 4:
			abc = "banana";
			break;
		case 5:
			abc = "Kiwi";
			break;
		default:
			abc = "Invalid fruit";
		}

		System.out.println("The fruit is :" + abc);
	}
}