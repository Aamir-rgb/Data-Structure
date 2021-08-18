package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MoveNegativeElementOnseSide5 {

	public static void main(String[] args) {
		
		int arr[] = {1,-11,64,-10};
		int arr1[] = new int[arr.length];
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]<0) {
				al.add(arr[i]);
			}
		}
		
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]>0) al.add(arr[i]);
		}
		System.out.println(al);

	
	for(int i = 0; i < al.size();i++) {
		arr[i] = al.get(i);
		System.out.println(arr[i]);
	 }
	}
}
