package com.qspiders.tactical;

public class EliminateSpaces 
{
public static void main(String[] args) 
{
	String str="my name is prithivi";
	String[] arr=str.split(" ");
	str="";
	for(int i=0;i<arr.length;i++)
	{
		str=str+arr[i];
	}
	System.out.println(str);
}
}
