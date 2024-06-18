package com.qspider.mathsbased;

import java.util.Scanner;

public class Armstrong 
{
static int countDigits(int num)
{
int count=0;
do 
{
	count++;
	num=num/10;
}
while(num>0);
return count;
}
static int basePower(int base,int power)
{
int t=1;
while(power>0)
{
	t=t*base;
	power--;
}
return t;
}
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.print("Enter the value to check :");
int num=scn.nextInt();
int copy=num;
int power=countDigits(num);
int sum=0;
while(num>0)
{
	int base=num%10;
	sum=sum+basePower(base,power);
	num=num/10;
}
String s= (sum==copy)? "yes,it is armstrong":"no,it isn't armstrong";
System.out.println(s);
}
}
