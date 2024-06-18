package com.qspiders.tactical;

import java.util.Arrays;

public class Anagram
{
	static String removeSpace(String str1)
	{
	char[] ch=str1.toCharArray();
	String str="";
	for (int i = 0; i < ch.length; i++) 
	{
		if(ch[i]!=' ')
		{
			str=str+ch[i];
		}
	}
	return str;
	}

	public static void main(String[] args) 
	{
	String str1="Hitler woman";
	String str2="Mother in law";
	str1=removeSpace(str1);
	str2=removeSpace(str2);
	str1=str1.toUpperCase();
	str2=str2.toUpperCase();
	char[] ch1=str1.toCharArray();
	char[] ch2=str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	boolean status=true;
	if(ch1.length==ch2.length)
	{
		for (int i = 0; i < ch1.length; i++) 
		{
		  if(ch1[i]!=ch2[i])
		  {
			 status=false;
		  	 break;
		  }
		}
	}
	if(status==true)
		System.out.println("yes,it is Anagram");
	else
		System.out.println("no,it is not Anagram");
	}
}
