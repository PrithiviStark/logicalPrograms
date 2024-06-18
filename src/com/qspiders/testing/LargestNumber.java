package com.qspiders.testing;

public class LargestNumber
{
public static void main(String[] args)
{
	int[] arr= {17,14,15,18,16,20,13};
	int large=arr[0];
	int slarge=arr[1];
	int tlarge=arr[2];
	for (int i = 1; i < arr.length; i++)
	{
		if(arr[i]>large)
		{
			tlarge=slarge;
			slarge=large;
			large=arr[i];
		}
		else if(arr[i]>slarge)
		{
			tlarge=slarge;
			slarge=arr[i];
		}
		else if(arr[i]>tlarge)
		{
			tlarge=arr[i];
		}
	}
	System.out.println("third large number :"+tlarge);
}
}
