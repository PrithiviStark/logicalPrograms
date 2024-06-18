package com.qspider.mathsbased;
/*factorial is a special operation in maths for find the product of numbers,
 * example 5 factorial :
 * 5*4*3*2*1=120*/
public class Factorial 
{
public static void main(String[] args) 
{
	int a=5;
	int sum=1;
	for (int i = a; i>0; i--) 
	{
		sum=sum*i;
	}
	System.out.println(sum);
}
}
