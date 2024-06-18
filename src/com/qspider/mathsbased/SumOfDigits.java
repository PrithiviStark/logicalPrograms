package com.qspider.mathsbased;

import java.util.Scanner;

public class SumOfDigits 
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in);
System.out.print("Enter the value :");
int num=scn.nextInt();
int sum=0;
while(num>0)
{
int a=num%10;
sum=sum+a;
num=num/10;
}
System.out.println("Output :"+sum);
}
}
