package com.qspider.mockTest;

import java.util.Scanner;

public class StrongNumber
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.println("enter the the number");
int num=scn.nextInt();
int copy=num;
int n=0;
while(num>0)
{	
	int sum=1;
	int val=num%10;
	num=num/10;
	while(val>0)
	{
	sum=sum*val;
	val--;
	}
	n=n+sum;
}
String s= (copy==n)? "yes,it is strong number":"no,it is not strong number";
System.out.println(s);
}
}
