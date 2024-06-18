package com.qspiders.tactical;

public class NumberPalindrome 
{
public static void main(String[] args) 
{
int num=12321;
int copy=num;
int sum=0;
while(num>0)
{
	int val=num%10;
	sum=(sum*10)+val;
	num=num/10;
}
String str=(sum==copy)? "yes,it is palindrome":"no,it is not palindrome";
System.out.println(str);
}
}
