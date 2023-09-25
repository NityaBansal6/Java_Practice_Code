package com.ccteam;
class Parent{
	void disp() {
		System.out.println("I provide black nd white pic...");
	}
}
public class Child extends Parent {
	void honk() {
		System.out.println("Beep-Beep");
	}
	public static void main(String[] args) {
		Child ch=new Child();
		ch.disp();
		ch.honk();
	}
}
