package com.qspider.mathsbased;

import java.util.Scanner;

public class PrimeNumberRanges
{
static boolean prime(int num)
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
if(i>num/2)
	return true;
else
	return false;
}
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the starting value : ");
	int num1=scn.nextInt();
	System.out.print("Enter the end value : ");
	int num2=scn.nextInt();
	boolean b;
	int count=0;
	for (int i = num1; i <= num2; i++)
	{
		b=prime(i);
		if(b==true)
		{
			count++;
			System.out.println(i);
		}
	}
	System.out.println("No. of prime numbers : "+count);
}
}
