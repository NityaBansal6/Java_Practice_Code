package com.ccteam;
import java.util.*;
public class Random {
	public static void main(String[] args) {
		int n,m,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Upper Limit Number...");
		n=sc.nextInt();
		System.out.println("Enter lower ...");
		m=sc.nextInt();
		int num=(int)(Math.random()*(n-m))+m; 
		System.out.println(num);
		//Agr head or tail krna ho toh
		int num1=(int)(Math.random())*2;
		System.out.println(num1);
	}
}
