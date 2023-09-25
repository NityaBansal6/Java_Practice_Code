package com.ccteam;
public class MethodOverloading {
	void sum(int a,int b) {
		System.out.println("Sum is :"+(a+b));
	}
	void sum(int a,int b,int c) {
		System.out.println("Sum is :"+(a+b+c));
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.sum(2,3);
		mo.sum(4, 6, 9);
	}
}
