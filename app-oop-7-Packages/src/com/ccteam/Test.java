package com.ccteam;
import java.math.*;
import java.util.*;
public class Test {
	
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Absolute value of -27 is :"+Math.abs(-27));// minus ka
		 // plus kr dega plus ka plus hi rehne dega
		  System.out.println("Ceil value of 5.9 is :"+Math.ceil(5.9));//double value
		  System.out.println("Ceil value of -16.28 is :"+Math.ceil(-16.28));// negative
		 // main agar value bhadegi toh vo ghategi
		  System.out.println("Floor value of -16.39 is :"+Math.floor(-16.39));
		  System.out.println("Floor value of 16.39 is :"+Math.floor(16.39));
		  System.out.println("Enter the value of a"); double a=sc.nextDouble();
		  System.out.println("Enter the value of b"); double b=sc.nextDouble();
		  System.out.println("Maximum value is :"+Math.max(a,b)); 
		  System.out.println("Square root of a number :"+Math.sqrt(4));	
		  System.out.println("Cube root of a number :"+Math.cbrt(8));//cube root
	      System.out.println(Math.pow(5, 3));
	      System.out.println(Math.random());//to get random value
		  }
}
