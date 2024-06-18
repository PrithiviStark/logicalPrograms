package com.qspiders.testing;
class Alpha
{
	int val=10;
}
public class Upcast extends Alpha
{
	int val=20;
public static void main(String[] args)
{
	Alpha a= new Upcast();//
	Upcast r=(Upcast)a;//
	System.out.println(r.val);// 10-super class(Alpha) cannot access property of subclass(Upcast)
	//after upcasting, the value of val is re-intialise from 20 to 10
}
}
