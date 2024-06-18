package com.qspiders.tactical;

import java.util.Scanner;

public class ReversePramid 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the pramid size : ");
	int n=scn.nextInt();
	scn.close();
	int spc=0;
	int str=2*n-1;
	for (int i = 0; i < n; i++)
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
		spc++;
		str=str-2;
	}
}
}
