package com.qspiders.testing;

public class PassObject 
{
int a;
double b;
String c;
 PassObject(int x,double y,String z)
 {
   a=x;
   b=y;
   c=z;
 }
 static void passObject(int x, double y,String z)
 {
	 double sum = x+y;
	 System.out.println("output of "+z+" of inputs is :"+sum);
 }
 public static void main(String[] args)
 {
	PassObject.passObject(10,10.0,"Sum");
	PassObject p1=new PassObject(10,10.0,"Sum");
 }
}
