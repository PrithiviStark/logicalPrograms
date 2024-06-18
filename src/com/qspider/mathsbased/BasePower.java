package com.qspider.mathsbased;

import java.util.Scanner;

public class BasePower 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.print("Enter the base value :");
int base=scn.nextInt();
System.out.print("Enter the power value :");
int power=scn.nextInt();
int res=1;
while(power>0)
{
	res=res*base;
	power--;
}
System.out.println(res);
}
}
