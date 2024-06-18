package com.qspiders.tactical;

public class Swaping
{
public static void main(String[] args) {
	int a=55;
	int b=35;
	System.out.println("Before swap");
	System.out.println("a value :"+ a);
	System.out.println("b value :"+b);
	//for swaping the values in  variables
	System.out.println("After swap");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value :"+ a);
	System.out.println("b value :"+b);
	
}
}
