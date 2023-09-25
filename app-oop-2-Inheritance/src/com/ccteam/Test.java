//hierarchical Inheritance.....
package com.ccteam;
class Employee1{
	String fname,lname; //	Class Variable or Instance Variable
	void display() {
		System.out.println("First Name :"+fname);
		System.out.println("Last Name :"+lname);
		System.out.println();
	}
	
}
class FullTimeEmployee extends Employee1{
	int monthySalary;
	
}
class PartTimeEmployee extends Employee1{
	int hourlySalary;
	
}
public class Test {
	public static void main(String[] args) {
		FullTimeEmployee fte=new FullTimeEmployee();
		fte.fname = "Nitya";
		fte.lname = "Bansal";
		fte.monthySalary=74783;
		fte.display();
		PartTimeEmployee pte=new PartTimeEmployee();
		pte.fname="Pavni";
		pte.lname="Bansal";
		pte.hourlySalary=878;
		pte.display();
	}
}
