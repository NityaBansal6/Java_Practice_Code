package com.ccteam;
class Sport{
	String getName(){
		return "Generic Sports";
	}
	void getNumberOfTeamMembers(){
	   System.out.println("Each team has n players in "+getName());
	}
}
class Soccer extends Sport{
	String getName(){
	     return "Soccer Class";
	}
}
public class NB {
	public static void main(String[] args) {
		Soccer sc=new Soccer();
		sc.getName();
		sc.getNumberOfTeamMembers();

	}

}

