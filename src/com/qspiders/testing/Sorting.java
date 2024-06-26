package com.qspiders.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting
{
//public static void main(String[] args)
//{
//	Scanner scn=new Scanner(System.in);
//	System.out.print("Enter array size : ");
//	int size=scn.nextInt();
//	int[] arr=new int[size];
//	System.out.println("Enter array values : ");
//	for (int i = 0; i < arr.length; i++)
//	{
//		arr[i]=scn.nextInt();
//	}
//	System.out.println("array \"arr\" is created and values are implemented");
//	Arrays.sort(arr);
//	for(int a:arr) 
//	{ 
//		System.out.println(a);
//	}	
//}
	public static void main(String[] args) {
		int[] a= {0,1,2,2,3,0,4,2};
		int[] b= {2,5,6};
		int m=2;
		int n=3;
		//merge(a,m,b,n);
		removeElement(a,m);
		//System.out.println(removeElement(a,m)); 
	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int[] sumArr=new int[m+n];
	        int k=0;
	        for(int i=0;i<nums1.length;i++){
	            if(nums1[i]!=0){
	                sumArr[k]=nums1[i];
	                k++;
	            }
	        }
	        for(int j=0;j<nums2.length;j++){
	            if(nums2[j]!=0){
	                sumArr[k]=nums1[j];
	                k++;
	            }
	        }
	        Arrays.sort(sumArr);
	        for(int a:sumArr) 
	        	{ 
	        		System.out.println(a);
	        	}
	    }
	  public static int removeElement(int[] nums, int val) {
	        ArrayList <Integer>a =new ArrayList<Integer>();
	        int i=0;
	        for(int num : nums){
	                if(num!=val){
	                    a.add(num);
	                    i++;
	                }
	        }
	        for(int aa:a) 
        	{ 
        		System.out.println(aa);
        	}
	        return a.size();
	    }
}
