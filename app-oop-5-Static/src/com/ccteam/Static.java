package com.ccteam;

public class Static {
	int a=10; // Non static 
	public static void main(String[] args) {
		Static st=new Static();
		System.out.println(st.a);
		System.out.println("hey I am Main....");	
	}
	static {
		System.out.println("hey I am Static init Block...");	
	}
}
// System.exit(0); // to terminate JVM...