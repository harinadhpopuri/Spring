/**
 * 
 */
package com.personal.arrays;

import java.util.Arrays;

/**
 * @author hpopuri
 * This explains 3 ways of copy Array contents to another array
 *
 */
public class ArrayCopy {
	
	
	
	private void copyArrayUsingSystemMethod(char[] sourceArray, char[] destinationArray) {
		//copy from Source Array to Destination array from index 2 to length of 5 
		System.arraycopy(sourceArray, 2, destinationArray, 0, 5);
	}
	
	private char[] copyArrayArraysMethod(char[] sourceArray, char[] destinationArray) {
		//copy from Source Array to Destination array from index 2 to length of 5 
		destinationArray = Arrays.copyOfRange(sourceArray, 2, 7);
		return destinationArray;
	}

	
	
	private char[] copyArrayIteration(char[] sourceArray, char[] destinationArray) {
		//copy from Source Array to Destination array from index 2 to length of 5 
		for(int i=0, j=0;i<sourceArray.length && i<5 ;i++) {
			destinationArray[j] = sourceArray[i];			
			
		}
		return destinationArray;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] sourceArray = {'a','b','c','d','e','f','g','h'};
		char[] destinationArray = new char[7];
		
		ArrayCopy ac = new ArrayCopy();
		destinationArray = ac.copyArrayArraysMethod(sourceArray, destinationArray);
		System.out.println("Destinaton Array contains   "+ new String(destinationArray));
		
		ac.copyArrayUsingSystemMethod(sourceArray, destinationArray);
		System.out.println("Destinaton Array contains  "+ new String(destinationArray));
		
		destinationArray = ac.copyArrayIteration(sourceArray, destinationArray);
		System.out.println("Destinaton Array contains  "+ new String(destinationArray));
		
		

	}

}
