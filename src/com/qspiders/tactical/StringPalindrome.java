package com.qspiders.tactical;

public class StringPalindrome 
{
public static void main(String[] args) 
{
String s="MALAYALAM";
boolean flag=true;
for(int i=0;i<s.length()/2;i++)
{
if(s.charAt(i)!=s.charAt(s.length()-1-i))
{
flag=false;
break;
}
}
String str= (flag==true)? "palindrom":"not palindrome";
System.out.println(str);
}
}
