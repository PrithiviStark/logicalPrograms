package com.qspiders.tactical;

import java.util.Arrays;

public class MergingArrays
{
public static void main(String[] args) 
{
int[] arr1= {12,34,13,14,45,17};
int[] arr2= {23,35,76,78,12,99};
int[] arr=new int[arr1.length+arr2.length];
for (int i = 0; i < arr1.length; i++) 
{
	arr[i]=arr1[i];
}
int pos=arr1.length;
for (int j = 0; j < arr2.length; j++) 
{
arr[pos]=arr2[j];
pos++;
}
Arrays.sort(arr);
for (int k = 0; k < arr.length; k++)
{
	System.out.println(arr[k]);	
}
}
}
