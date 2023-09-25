package com.ccteam;
import java.util.*;
class Employee{
	void disp(String ename,int eid) {
		
		System.out.println(ename);
		System.out.println(eid);
	}
}
class Nitya extends Employee{
	void disp() {
	   int hourlySalary=28782;
	   System.out.println("Hourly Salary is :"+hourlySalary);
    }
}
class Khushi extends Employee{
	void disp() {
		int monthlySalary=37673;
		System.out.println("Monthly Salary is :"+monthlySalary);
	}
}
public class SingleInherit {
	public static void main(String[] args) {
		Nitya ni=new Nitya();
		Khushi kh=new Khushi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String ename=sc.nextLine();
		System.out.println("Enter your id :");
		int eid=sc.nextInt();
		if(eid>=50&&eid<=100) {
		ni.disp(ename,eid);
		ni.disp();
		}
		if(eid>=1&&eid<50) {
		kh.disp(ename,eid);
		kh.disp();
	}
 }
}