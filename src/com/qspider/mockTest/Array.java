package com.qspiders.mock2;

import java.util.Scanner;

public class Array 
{
public static void main(String[] args) 
{
	System.out.println("enter the which position of large value");
	Scanner scn =new Scanner(System.in);
int[] arr= {18,15,16,17,19};
int fLarge=arr[0];
int sLarge=arr[1];
for (int i = 0; i < arr.length; i++) 
{
	for(int j=i+1;j<arr.length;j++)
	{
	if(arr[i]<arr[j])
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	}
}
int n=scn.nextInt();
System.out.println(n+"th largest value is :"+arr[n-1]);
}
}
