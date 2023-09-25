package com.ccteam;

public class TypePromotion {
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	void sum(long a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		TypePromotion tp=new TypePromotion();
		tp.sum(4l, 6);
		tp.sum(2, 4l);
	}
}
