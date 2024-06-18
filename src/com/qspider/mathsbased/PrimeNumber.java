package com.qspider.mathsbased;

public class PrimeNumber 
{
public static void main(String[] args) 
{
int[] arr= {12,17,14,18,19,23};	
String str="";
int max=0;
for(int i=0;i<arr.length;i++)
{
int num=arr[i];
int t=2;
while(t<=num/2)
{
	if(num%t==0)
	{
		break;
	}
	t++;
}
if(t>num/2)
{
str=str+arr[i]+",";	
}
if(arr[i]>max)
	max=arr[i];
}
System.out.println("prime numbers="+str);
System.out.println("prime="+max);
}
}
