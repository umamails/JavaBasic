package com.basicjava;

import java.util.Scanner;

public class Revisesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int oldsalary;
int experience;
double revisedsalary=-0;
String reward;
Scanner sc = new Scanner(System.in);
System.out.println("enter the old salary: ");
System.out.println("enter the experience: ");
System.out.println("enter the reward ");
oldsalary=sc.nextInt();
experience=sc.nextInt();
reward=sc.next();
if(experience<=5&experience>=3) {
	revisedsalary=oldsalary+(oldsalary*0.1);
	//System.out.println(revisedsalary);
	
}else
if(experience<=9) {
	revisedsalary=oldsalary+(oldsalary*0.15);
	//System.out.println(revisedsalary);
}else
if(experience<=20) {
	revisedsalary=oldsalary+(oldsalary*0.20);
	//System.out.println(revisedsalary);
}else
if(experience>20) {
	revisedsalary=oldsalary+(oldsalary*0.25);
	//System.out.println(revisedsalary);
}
if(reward.equals("yes")) {
	revisedsalary=revisedsalary+1000;
	System.out.println(revisedsalary);
	
}else
	if(reward.equals("no") ){
		System.out.println(revisedsalary);
	}
sc.close();
	}

}
