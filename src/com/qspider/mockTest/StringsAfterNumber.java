package com.qspiders.interview;

public class StringsAfterNumber 
{
public static void main(String[] args) 
{
String str="Akash75isnewcreatedidandnumberis1260";	
String a="5";
String b="6";
int countn=0;
int countm=0;
int n=str.indexOf(a)+1;
int m=str.indexOf(b)+1;
for (n=n; n>=0; n++) 
{
	if(str.charAt(n)>='A'&&str.charAt(n)<='Z')
	{
		countn++;
	}
	else if(str.charAt(n)>='a'&&str.charAt(n)<='z')
	{	
		countn++;
	}
	else
	{
		break;
	}
}
for (m=m; m>=0; m++) 
{
	if(str.charAt(m)>='A'&&str.charAt(m)<='Z')
	{
		countm++;
	}
	else if(str.charAt(m)>='a'&&str.charAt(m)<='z')
	{	
		countm++;
	}
	else
	{
		break;
	}
}
System.out.println("After :"+a+",there are"+countn+"character and after "+b+" ,no character exist!!.");

}
}
