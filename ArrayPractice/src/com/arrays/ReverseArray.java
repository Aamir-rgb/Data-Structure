package com.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		//Brute Force Method For Solving
		int a[] = {1,11,31,41,67,77,87};
		// TODO Auto-generated method stub
		int b[] = new int[a.length];
		for(int i = a.length-1,j =0; i >= 0; i--,j++ ) {
			b[j] = a[i];
		  
		}
		
		System.out.println("Expected Array");
        for(int i = 0; i < b.length; i++) {
        	
        	System.out.print(b[i]+" ");
        }
        System.out.println();
        int temp = 0;
        //Optimized Solution
        for(int i = 0,k = a.length-1; i < a.length/2;i++,k--) {
        	temp = a[i];
        	a[i] = a[k];
        	a[k] = temp;
        }
        for(int i = 0; i <= a.length-1;i++) {
        	System.out.print(a[i]+" ");
        }
        
        
	}

}
