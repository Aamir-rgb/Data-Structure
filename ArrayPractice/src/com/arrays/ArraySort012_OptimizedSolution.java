package com.arrays;

public class ArraySort012_OptimizedSolution {

	public static void main(String[] args) {
		int arr[] = { 2,1,0,0,1, 1 ,1,2};
		int arr1[] = new int[arr.length];
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i] == 0) count0++;
			else if(arr[i] == 1) count1++;
			else {
				count2++;
			}
		}
		System.out.println(count0+" "+count1+" "+count2);
		int i = 0;
        while(i < count0) {
        	arr[i] = 0;
        	System.out.println(arr[i]);
        	i++;
        }
        int j = i;
        int k = 0;
        while(k < count1) {
        	arr[j] = 1;
        	System.out.println(arr[j]);
        	j++;
        	k++;
        }
        int l = j;
        int m = 0;
        while(m < count2) {
        	arr[m] = 2;
        	System.out.println(arr[m]);
        	m++;
        	l++;
        }
	}

}
