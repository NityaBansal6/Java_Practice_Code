package com.ccteam;
import java.util.*;
class Student{
	private String name;
	private int age;
	public void accept(String n,int a){
		name=n;
		age=a;
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
public class ForTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter your name :");
		String name=sc.nextLine();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		st.accept(name, age);
		st.display();
	}
}
