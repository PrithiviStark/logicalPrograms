package com.qspiders.testing;
import java.util.Scanner;
public class PrimeNumbers
{
	static int sumOdd(int[] arr)
	{
		int a=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				a=a+arr[i];
			}
				
		}
		return a;
	}
	static int sumEven(int[] arr)
	{
		int a=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				a=a+arr[i];
			}
				
		}
		return a;
	}
	static int sumPrime(int[] arr)
	{
		int a =0;
		for (int i = 0; i < arr.length; i++) 
		{
			int x=2;
			while(x<=arr[i]/2)
			{
				if(arr[i]%x==0)
					{
						break;
					}
				x++;
			}
			if(x>arr[i]/2)
			{
				a=a+arr[i];
			}
		}
			return a;
	}
	static int findMaxOdd(int[] arr)
	{
		int a=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2!=0)
			{
				if(a<arr[i])
				{
					a=arr[i];
				}
			}
				
		}
		return a;
	}
	static int findMaxEven(int[] arr)
	{
		int a=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				if(a<arr[i])
				{
					a=arr[i];
				}
			}
				
		}
		return a;
	}
	static int findMaxPrime(int[] arr)
	{
		int a =0;
		for (int i = 0; i < arr.length; i++) 
		{
			int x=2;
			while(x<=arr[i]/2)
			{
				if(arr[i]%x==0)
					{
						break;
					}
				x++;
			}
			if(x>arr[i]/2)
			{
				if(arr[i]>a)
				{
					a=arr[i];
				}
			}
		}	
		return a;  
	}
	static void oddNumbers(int[] arr)
	{
		String y="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				y=y+arr[i]+",";
		}
		System.out.println("Odd numbers are :"+y);
		System.out.println();
	}
	static void evenNumbers(int[] arr)
	{
		String y="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				y=y+arr[i]+",";
		}
		System.out.println("Even numbers are :"+y);
		System.out.println();
	}
	static void primeNumber(int[] arr)
	{
		String y="";
		for (int i = 0; i < arr.length; i++) 
		{
			int x=2;
			while(x<=arr[i]/2)
			{
				if(arr[i]%x==0)
					{
						break;
					}
				x++;
			}
			if(x>arr[i]/2)
			{
				y=y+arr[i]+",";
			}
		}
		System.out.println("Prime numbers are :"+y);
		System.out.println();
	}
public static void main(String[] args)
   {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scn .nextInt();
		int[] arr= new int[size];
		System.out.println("enter the array values");
		for (int i = 0; i < arr.length; i++) 
		  {
			arr[i]=scn.nextInt();
		  }
		int maxEven=findMaxEven(arr);
		int maxOdd=findMaxOdd(arr);
		int maxPrime=findMaxPrime(arr);
		int sumE=sumEven(arr);
		int sumO=sumOdd(arr);
		int sumP=sumPrime(arr);
		PrimeNumbers.evenNumbers(arr);
		PrimeNumbers.oddNumbers(arr);
		PrimeNumbers.primeNumber(arr);
		System.out.println("sum of prime numbers :"+sumP);
		System.out.println("sum of odd numbers :"+sumO);
		System.out.println("sum of even numbers :"+sumE);
		System.out.println("maximum odd number :"+maxOdd);
		System.out.println("maximum even number :"+maxEven);
		System.out.println("maximum prime number :"+maxPrime);
	}
}
