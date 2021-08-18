package com.arrays;

import java.util.HashMap;

public class ArraySortMultiple012_4_BruteForce {

	public static void main(String[] args) {
		int arr[] = { 2,1,0,0,1, 1 ,1,2};
		int arr1[] = new int[arr.length];
		int max = arr[0];
		int min = arr[0];
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int betweenMinMax = 0;
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i] == 0) count0++;
			else if(arr[i] == 1) count1++;
			else {
				count2++;
			}
		}
		System.out.println(count0+" "+count1+" "+count2);

	
	
	// Copy The Value Into Another Array
			for (int i = 0; i < arr.length; i++) {
				arr1[i] = arr[i];
				 //System.out.println(arr1[i]);
			}
			
         
			// Calculate Minimum Element In Array
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}

			}
			hm.put("min", min);
			
			// Calculate Maximum Element In Array
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}

			}
			

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != min && arr1[i] != max) {
					betweenMinMax = arr1[i];
					//System.out.println(arr1[i]);
				}
			}
			hm.put("betweenMinMax", betweenMinMax);
			hm.put("max", max);
			
			int i = 0;
			while(i < count0) {
				//System.out.println(hm.get("min"));
				arr[i] = hm.get("min");
				System.out.println(arr[i]);
				++i;
			}
			
			int j = count0;
			//System.out.println(j);
			int count1repeat = 0;
			while( count1repeat < count1) {
				//System.out.println(hm.get("betweenMinMax"));
				arr[j] = hm.get("betweenMinMax");
				//System.out.println(arr[j]);
				++j;
				count1repeat++;
			}
			int k = count0+count1repeat;
			int count2repeat = 0;
			System.out.println( k);
			System.out.println("///////////////////");
			
			while( k < arr.length) {
				if(count2repeat < count2) {
				arr[k] = hm.get("max");
				//System.out.println(arr[k]);
				k++;
				count2repeat++;
				}
			}
			
			for(int l = 0 ; l < arr.length;l++) {
				System.out.println(arr[l]);
			}
			
	}

}
