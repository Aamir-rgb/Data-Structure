package com.arrays;

public class MaxMinArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSelectArray[] = {-1,-9,-5,-8,9,8,5,-1};
		int minSelectArray[] = maxSelectArray;
		
		//Logic For Maximum Selection
		int max = maxSelectArray[0];
		int min = minSelectArray[0];
		for(int i = 0; i < maxSelectArray.length;i++) {
			if(max < maxSelectArray[i]) 
				max = maxSelectArray[i];
		}
		System.out.println(max);
		
		//Logic For Minimum Selection
		for(int i = 0; i < maxSelectArray.length;i++) {
			if(min > maxSelectArray[i]) 
				min = maxSelectArray[i];
		}
		System.out.println(min);

	}

}
