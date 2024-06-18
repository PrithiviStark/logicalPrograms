package com.qspiders.tactical;

import java.util.Map;
import java.util.TreeMap;

public class IBMQuestions {

	public static int highestCommonFactor(int a, int b) {
		while (a != b) {

			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public static String stringCompression(String s) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < s.length(); i += 2) {

			char ch = s.charAt(i);
			int count = Character.getNumericValue(s.charAt(i + 1));

			while (count > 0) {
				builder.append(ch);
				count--;
			}
		}

		return builder.toString();
	}

	public static String decimalToBinary(int a) {

		StringBuilder binCode = new StringBuilder();

		while (a > 0) {
			if (a % 2 == 0) {
				binCode.append(0);
				a = a / 2;
			} else {
				binCode.append(1);
				a = a / 2;
			}
		}

		return binCode.reverse().toString();
	}

	public static void generateFibonacciTriangle(int rows) {
		int[] fibonacci = new int[rows * (rows + 1) / 2];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		// Generate the Fibonacci sequence
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		// Print the Fibonacci Triangle
		int index = 0;
		for (int i = 1; i <= rows; i++) {

			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(fibonacci[index++] + " ");
			}
			System.out.println();
		}
	}

	public static String properCompression(String s) {
		StringBuilder compressedStr = new StringBuilder();
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i += 2) {
			freq[s.charAt(i) - 'a'] += (s.charAt(i + 1) - '0');
		}
		for (int i = 0; i < 26; i++) {
			char c = (char) (i + 'a');
			int count = freq[i];
			if (count != 0)
				compressedStr.append(c + "" + count);
		}
		return compressedStr.toString();
	}
	
	 public static String compressString(String s) {
	        Map<Character, Integer> frequencyMap = new TreeMap<>();

	        // Parse the input string
	        for (int i = 0; i < s.length(); i++) 
	        {
	            char character = s.charAt(i);
	            int count = 0;
	            
	            while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) 
	            {
	                count = count * 10 + (s.charAt(++i) - '0');
	          
	            }
	            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + count);
	        }

	        // Build the properly compressed string
	        StringBuilder compressedString = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            compressedString.append(entry.getKey()).append(entry.getValue());
	        }

	        return compressedString.toString();
	    }
	 
	 
	 public static String compressStringPrithivi(String s) {
	        Map<Character, Integer> frequencyMap = new TreeMap<>();

	        // Parse the input string
	        for (int i = 0; i < s.length(); i+=2) {
	            char character = s.charAt(i);
	            int count = 0;
	            
	            if (Character.isDigit(s.charAt(i + 1))) {
	                count = Integer.parseInt(""+s.charAt(i+1)) ;
	            }
	            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + count);
	        }

	        // Build the properly compressed string
	        StringBuilder compressedString = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            compressedString.append(entry.getKey()).append(entry.getValue());
	        }

	        return compressedString.toString();
	    }
	 
	 
	 public static int maxSubArray(int[] nums) {
	        int maxSoFar = nums[0];
	        int maxEndingHere = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);
	        }

	        return maxSoFar;
	    }

	public static void main(String[] args) {
//		System.out.println("highestCommonFactor is " + highestCommonFactor(16, 12));
//		System.out.println("stringCompression is " + stringCompression("A3B5C6A2"));
//		System.out.println("decimalToBinary is " + decimalToBinary(343));
//
//		generateFibonacciTriangle(3);
//
//		System.out.println("properCompression is " + properCompression("a3d3d4f3a3"));
//
//		System.out.println("compressString is " + compressString("A3B5C6A2"));
//
//		System.out.println("compressString is " + compressStringPrithivi("A3B5C6A2"));
		
		
	}
}
