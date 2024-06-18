package com.qspiders.tactical;

public class StringReverse {
	public static void main(String[] args) {
		String str ="Qspiders returns";
		String[] arr = str.split(" ");
		str="";
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			for(int j=s.length()-1;j>=0;j--)
			{
				str=str+s.charAt(j);
			}
			str=str+" ";
		}
		System.out.println(str);
	}
}
