package com.qspiders.mock2;

public class Strings1
{
	public static void main(String[] args)
	{
		String str ="Chennai Super Kings";
		String[] arr = str.split(" ");
		str="";
		for (int i = 0; i < arr.length; i++)
		{
			String t=arr[i];
			str=str+t.charAt(t.length()-1);
		}
		System.out.println(str);
	}

}
