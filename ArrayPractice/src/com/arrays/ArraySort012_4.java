package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArraySort012_4 {

	//Comments
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 0, 1 };
		int arr1[] = new int[arr.length];
		int max = arr[0];
		int min = arr[0];
		List<Integer> al = new ArrayList<>();

		// Copy The Value Into Another Array
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
			// System.out.println(arr1[i]);
		}

		// Calculate Minimum Element In Array
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		al.add(min);

		// Calculate Maximum Element In Array
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		arr[arr.length - 1] = max;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != min && arr1[i] != max) {
				arr[1] = arr1[i];
				//System.out.println(arr1[i]);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
