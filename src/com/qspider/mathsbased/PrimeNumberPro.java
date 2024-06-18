package com.qspider.mathsbased;

import java.util.Scanner;

public class PrimeNumberPro 
{
public static void main(String[] args)
{
System.out.print("Please, Enter the start value :");
Scanner scn=new Scanner(System.in);
int num=scn.nextInt();
System.out.print("Enter the end value :");
int val=scn.nextInt();
System.out.println("Do you want prime number 'or' non prime numer?");
String sl=scn.next();
int primeDigits=0;
int nonPrimeDigits=0;
while(num<=val)
{
int i=2;
while(i<=num/2)
{
	if(num%i==0)
	{
		break;
	}
	i++;
}
boolean boo=(i>num/2);
String s= boo? num+"":num+" ";
if(sl.contains("prime"))
{
	if(boo==true)
	{
		primeDigits++;
		System.out.println(s);
	}
}
else
{
	if(boo==false)
	{
		nonPrimeDigits++;
		System.out.println(s);
	}
}	
num++;
}
if(primeDigits>0)
System.out.println("number of prime number :"+primeDigits);
if(nonPrimeDigits>0)
System.out.println("number of non prime number :"+nonPrimeDigits);
}
}
