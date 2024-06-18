package com.qspiders.tactical;

public class StringReverse2 {
	public static void main(String[] args) {
		String str ="Qspider training";
		String[] arr = str.split(" ");
		str="";
		for(int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			int b=s.length();
			char[] ch =s.toCharArray();
			s="";
			for(int j=b-1;j>=0;j--)
			{
				s=s+ch[j];
			}
			str=str+s+" ";
		}
		System.out.println(str);
	}
}