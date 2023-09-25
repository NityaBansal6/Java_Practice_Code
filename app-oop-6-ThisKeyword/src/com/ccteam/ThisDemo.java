package com.ccteam;

public class ThisDemo {
	
          int num=10;   //instance variable
          void disp()
          {
           	 int num=20;    //local variable
            System.out.println("The value of num is "+num);  //20 Shadowing
	        System.out.println("Now the value of num is "+this.num);  //10
           }
         static public void main(String[] args)
          {
                    ThisDemo obj=new ThisDemo();
                    obj.disp();
           
           }
}
