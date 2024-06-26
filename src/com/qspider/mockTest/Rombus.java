package com.qspider.mockTest;

import java.util.Scanner;

public class Rombus 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter the size of rombus");
int n=scn.nextInt();
int spc=n/2;
int str=1;
for (int i = 0; i < n; i++) 
{
	for(int j=0;j<spc;j++)
	{
		System.out.print(" "+" ");
	}
	for(int k=0;k<str;k++)
	{
		if(k%2==0)
			System.out.print(1+" ");
		else
			System.out.print(0+" ");
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
