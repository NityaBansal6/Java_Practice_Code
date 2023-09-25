package com.ccteam;

public class InitDemo1 {
	InitDemo1(){
		System.out.println("I am non param Constructor");
	}
	InitDemo1(int x){
		System.out.println("Hey I am Param-1");
	}
	// Instance Initializer Block (IIB).....
	{
		System.out.println("Hey I am IIB...");
		System.out.println("1-Statement-1");
		System.out.println("2-Statememt-2");
		System.out.println("3-Statement-3");
	}
	public static void main(String[] args) {
		InitDemo1 obj= new InitDemo1();
		System.out.println();
		InitDemo1 obj2=new InitDemo1(5);
	}
}
