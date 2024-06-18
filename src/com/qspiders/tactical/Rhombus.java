package com.qspiders.tactical;

import java.util.Scanner;

public class Rhombus 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);	
System.out.println("For complete size of rhombus,please give odd number");
System.out.print("Enter the rhombus size :");
int n=scn.nextInt();
int spc=n-1;
int str=1;
for(int i=0;i<n;i++)
{
for(int j=0;j<spc;j++)
{
	System.out.print(" "+" ");
}
for(int k=0;k<str;k++)
{
	System.out.print("*"+" ");	
}
System.out.println();
if(i<n/2)
{
	spc--;
	str=str+2;	
}
else
{
	spc++;
	str=str-2;
}
}
}
}
