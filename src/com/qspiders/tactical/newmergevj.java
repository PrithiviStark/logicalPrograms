package com.qspiders.tactical;

public class newmergevj 
{
	public static void main(String[] args)
	{
		int[]arr1= {13,45,87,3,75};
		int[]arr2= {65,986,98,56};
		int arr3 = 0;
		int[]arr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length+1;j++)
			{	
				System.out.println("start");
			if(arr1[i]>arr1[j])
			{
				arr1[i]=arr1[i]+arr[j];
				arr1[j]=arr1[i]-arr1[j];
				arr3=arr1[i]-arr1[j];
			}
			System.out.println(arr3);
			}
		}
		
		
		
	}

}
