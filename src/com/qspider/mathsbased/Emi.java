package com.qspider.mathsbased;
import java.util.Scanner;

public class Emi
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.println("***EMI CALCULATOR***");
	System.out.print("Enter the Price amount:");
	double price=scn.nextDouble();
	System.out.print("Enter the paying duration in years:");
	int tenure=scn.nextInt();
	System.out.print("Enter the interest rate :");
	double rate=scn.nextDouble();
	double totalInterest=price*tenure*rate/100;
	int duration=tenure*12;
	double totalAmount=price+totalInterest;
	double emi=totalAmount/duration;
	System.out.println("EMI per month:"+emi+"Rupees");
}
}
