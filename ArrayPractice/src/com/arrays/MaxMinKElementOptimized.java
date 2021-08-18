package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxMinKElementOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,10,60,30,50,40};
		System.out.println("Enter the value of K");
		int k = 0;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		if(k > a.length) {
			System.out.println("K outside array");
		}
		else {
			
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		//Reverse Sort To Get Minimum
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < k;i++) {
			pq.add(a[i]);
			pq1.add(a[i]);
		}
		System.out.println(pq);
		
		//Maximum Print Logic
		for(int i = k; i < a.length;i++) {
			if(pq.peek()< a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
		}
	    System.out.println(pq.peek());
	    
	  //Minimum Print Logic
	  		for(int i = k; i < a.length;i++) {
	  			if(pq1.peek() > a[i]) {
	  				pq1.poll();
	  				pq1.add(a[i]);
	  			}
	  		}
	  	    System.out.println(pq1.peek());

	}
	}
}
