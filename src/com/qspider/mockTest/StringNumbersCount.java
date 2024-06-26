package com.qspider.mockTest;

public class StringNumbersCount 
{
public static void main(String[] args) 
{
String str="Aravind15";
char[] ch=str.toCharArray();
int digit=0;
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='0'&&ch[i]<='9')
{
	digit++;
}
}
System.out.println(digit);
}
}
