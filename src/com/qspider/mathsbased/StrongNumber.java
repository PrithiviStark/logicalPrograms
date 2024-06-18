package com.qspider.mathsbased;

import java.util.Scanner;

public class StrongNumber 
{
static int factorial(int num)
{
int sum=1;	
while(num>0)
{
	sum=sum*num;
	num--;
}
return sum;
}
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the number to check :");
int num=scn.nextInt();
int copy=num;
int sum=0;
while(num>0)
{
int t=num%10;
sum=sum+factorial(t);
num=num/10;
}
System.out.print(sum+"-");
String s=(sum==copy)? "yes,it is Strong number":"no, it is not Strong number";
System.out.println(s);
}
}
