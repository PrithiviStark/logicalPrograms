package com.qspiders.testing;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting
{
public static void main(String[] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter array size : ");
	int size=scn.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter array values : ");
	for (int i = 0; i < arr.length; i++)
	{
		arr[i]=scn.nextInt();
	}
	System.out.println("array \"arr\" is created and values are implemented");
	Arrays.sort(arr);
	for(int a:arr) 
	{ 
		System.out.println(a);
	}	
}
}
