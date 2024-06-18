package com.qspiders.tactical;

import java.util.Scanner;

public class ReversingNumber 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter the input value :");
long num=scn.nextLong();
long rev=0;
while(num>0)
{
	long val=num%10;
	rev=rev*10+val;
	num=num/10;
}
System.out.println("Reversal of input value :"+rev);
}
}
