package com.qspiders.testing;

import java.util.Scanner;
class CodeCreate
{
	public static long finalCode(long rCode)
	{
		long sum=0;
		while(rCode>0)
		{
		long x=rCode%10;
		sum=sum+x;
		rCode=rCode/10;
		}
		System.out.println(sum);
		if(sum>9)
		{
			long sum2=0;
			while(sum>0)
			{
				long y=sum%10;
				sum2=sum2+y;
				sum=sum/10;
			}
			System.out.println("if - "+sum2);
			if(sum2>9)
			{
				long sum3=0;
				while(sum2>0)
				{
					long z=sum2%10;
					sum3=sum3+z;
					sum2=sum2/10;
				}
				System.out.println("if-if - "+sum3);
				return sum3;
			}
			else
			{
				System.out.println("if-else - "+sum2);
				return sum2;
			}
		}
		else
		{
			System.out.println("else - "+sum);
			return sum;
		}
	}
    public static long codeLogic(String str)
    {
	long code=0;
	str=str.trim();
	String[] arr=str.split(" ");
	for (int i=0;i<arr.length;i++)
	{
		char first=arr[i].charAt(0);
		if((first>='A'&&first<='Z')||(first>='a'&&first<='z'))
		{
			code=code+first;
		}
	}
	System.out.println(code);
	return code;
    }
    public static String symRemover(String str)
    {
    	char[] ch=str.toCharArray();
    	String strg="";
    	for(int i=0;i<ch.length;i++)
    	{
    		
    		if(ch[i]==','||ch[i]=='.'||ch[i]=='&'||ch[i]=='('||ch[i]==')'||ch[i]=='_'||ch[i]==':'||ch[i]=='/')
    		{
    			if(ch[i+1]!=' ')
    			 ch[i]=' ';
    			else
    				ch[i]='Z';
    		}
    		else if(ch[i]>='0'&&ch[i]<='9')
    		{
    			ch[i]='A';
    		}
    		else if(ch[i]=='!'||ch[i]=='?'||ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='*')
    		{
    			ch[i]='a';
    		}
    		strg=strg+ch[i];
    	}
    	System.out.println(strg);
    	return strg;
    }
}
public class CodeGeneration 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter the  text :");
String str=scn.nextLine();
String strg=CodeCreate.symRemover(str);
long rLogic =CodeCreate.codeLogic(strg);
long endCode=CodeCreate.finalCode(rLogic);
System.out.println("The code of the this passage is : "+endCode);
}
}
