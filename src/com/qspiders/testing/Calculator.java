package com.qspiders.testing;
import java.util.Scanner;
public class Calculator 
{
public static void main(String[] args)
  {
	Scanner scn =new Scanner(System.in);
	System.out.println("*** Calculator---is---Opened ***");
	System.out.println("Do you want help for operator usage?--\"yes\" or\"no\"");
	String res=scn.next();
	String[] arr= {"(+)Addition operator","(-)Subraction operator","(*)Multiplication operator","(/)Division operator[output is divided value]","(%)Modulus operator[output is remainder]","(^)Base[first value]and Power[second value] operator","(~)Average operator[output is average of two values]"};
	if(res.equalsIgnoreCase("yes"))
	{
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	while(1>0)
	{	
		System.out.println("enter first value :");
		int a= scn.nextInt();
		System.out.println("enter the operator(+,-,*,/,%,^,~):");
		String s= scn.next();
		System.out.println("enter second value :");
		int b= scn.nextInt();
		long c=0;
		long d;                                                  
		switch(s)
		{
			case "+":c=a+b;
			break;
			case "-":c=a-b;
			break;
			case "*":c=a*b;
			break;
			case "/":c=a/b;
			break;
			case "%":c=a%b;
			break;
			case "^":
				c=1;
				while(b>0)
				{
					c=c*a;
					b--;
				}
			break;//////////
			case"~":
				    d=a+b;
					c=d/2;
			break;
			default:System.out.println("invalid operator,use valid operators(+,-,*,/,%)");
		}
	System.out.println("Output of the calculations :"+c);
	System.out.println();
	System.out.println("Do you want to continue? \"yes\" or \"no\"");
	String str=scn.next();
	if(str.equalsIgnoreCase("no"))
	{
		System.out.println("*** Calculator---is---Closed ***");
		break;
	}
	}
  }
}
