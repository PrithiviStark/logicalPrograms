package com.qspiders.tactical;

public class LargeNumberInArray 
{
public static void main(String[] args) 
{
int[] arr= {10,32,12,34,54};	
int large=arr[0];
int slarge=arr[1];
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>large)
	{
		slarge=large;
		large=arr[i];
	}
	else if(arr[i]>slarge)
	{
		slarge=arr[i];
	}
}
System.out.println(large+": largest number   "+slarge+": second largest number");
}
}
