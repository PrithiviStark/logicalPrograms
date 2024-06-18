package com.qspider.mathsbased;

import java.util.Scanner;

/*fibanacci series uses the first two values and sum them to provide third value
 * example: fibanacci series upto 5 numbers(num) ;
 * 0,1,1,2,3*/
public class FibanacciSeries
{
public static void main(String[] args) 
{
Scanner scn=new Scanner(System.in); 
System.out.println("enter the number for series upto");
int num=scn.nextInt();
int f1=0;
int f2=1;
int f3=f1+f2;
while(num>0)
{
	System.out.println(f1);
	f1=f2;
	f2=f3;
	f3=f1+f2;
	num--;
}
}
}
