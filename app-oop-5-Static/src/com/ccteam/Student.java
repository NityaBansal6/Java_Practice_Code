package com.ccteam;
public class Student {
	String name;
	int age;
	static String cname="Infomatics";
	void display() {
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Ur Coaching :"+cname);
		System.out.println();//for blank line
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.name= "Nitya Bansal";
		st.age=20;
		//System.out.println(cname);
		st.display();
		Student st1=new Student();
		st1.name="Pavni Bansal";
		st1.age=15;
		st1.display();
	}
}
