package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxMinKElement {
	
	
	public static void main(String args[])   
	{   
	//creating an array to be converted  
	int arr[] = { 15, 12, 14,11 };   
	int n = arr.length;
	//prints array before conversion  
	//System.out.println("Array before conversion: "+ Arrays.toString(arr));   
	//calling generic method that converts Array into List  
	List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());   
	System.out.println(list);  
	Collections.sort(list);
	System.out.println(list);
	System.out.println("Enter the value for kth maximum");
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();
	System.out.println("Enter the value for kth minimum");
	int l = sc.nextInt();
	System.out.println(list.get(n-k));
	System.out.println(list.get(l-1));

	
	
	}   
	

	

}
