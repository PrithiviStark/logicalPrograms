package com.qspiders.testing;

import java.util.Scanner;

public class PatternPalindrome 
{
	public static void main(String[] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the string : ");
	String str=scn.next();
	int n=str.length();
	char[] ch=str.toCharArray();
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)	
	{
		if(i==j||i+j==n-1)
			System.out.print(ch[i]+" ");
		else
			System.out.print(" "+" ");
	}
	System.out.println();
	}
	}
}

