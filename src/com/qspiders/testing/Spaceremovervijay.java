package com.qspiders.testing;

public class Spaceremovervijay
{
public static void main(String[] args) 
{
String str="my name is vijay karan";
String[] arr=str.split(" ");
String str1="";
for(int i=0;i<arr.length;i++)
{
str1=arr[i]+str1;
}
System.out.println(str1);
System.out.println(str);
}
}
