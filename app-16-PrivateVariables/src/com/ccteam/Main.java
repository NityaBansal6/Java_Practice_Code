package com.ccteam;
import java.util.*;
class ReturnDemo{
	private int l, b;
	void accept(int length,int breadth) {
		l=length;
		b=breadth;
	}
	public int rectangle() {
		int result=l*b;
		System.out.println("Area of rectangle is :"+result);
		return result;
	}
}
public class Main {
	 static public void main(String... args) {
		Scanner sc=new Scanner(System.in);
		ReturnDemo rd=new ReturnDemo();
		System.out.println("Enter the length of rectangle");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int breadth=sc.nextInt();
		rd.accept(length,breadth);
		rd.rectangle();
	}
}
