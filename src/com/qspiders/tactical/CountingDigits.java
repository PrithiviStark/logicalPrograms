package com.qspiders.tactical;

import java.util.Scanner;

public class CountingDigits 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);	
System.out.print("Enter the values :");
long num=scn.nextLong();
int digit=0;
do
{
	digit++;
	num=num/10;
}
while(num>0);
System.out.println("No of Digits :"+digit);	
}
}
