package com.qspiders.tactical;

import java.util.Scanner;

public class Pramids 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the pramid size : ");
	int n=scn.nextInt();
	int spc=n-1;
	int str=1;
	for (int i = 0; i < n; i++)
	{	char ch='a';
		for(int j=0;j<spc;j++){
			System.out.print(" "+" ");
		}
		for(int k=0;k<str;k++)
		{
		System.out.print(ch+" ");
		int num=(str/2)-1;
		if(k<=num)
			ch++;
		else
			ch--;
		}
		System.out.println();
		str=str+2;
		spc--;
	}
}
}
