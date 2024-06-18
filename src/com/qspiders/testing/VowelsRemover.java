package com.qspiders.testing;

public class VowelsRemover
{
public static void main(String[] args) {
	String str="communication gieee";
	char[] arr=str.toCharArray();
	
	str="";
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!='a'&&arr[i]!='e'&&arr[i]!='i'&&arr[i]!='o'&&arr[i]!='u'&&arr[i]!=' ')
		{
			str=str+arr[i];
		}
	}
	System.out.println(str);
}
}
