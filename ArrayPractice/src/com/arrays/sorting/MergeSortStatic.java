package com.arrays.sorting;

public class MergeSortStatic {
	
	 static int[] array;
     static int[] tempMergeArray;
	 static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = { 15, 5, 24, 8, 1, 3, 16, 10, 20 };
		array = inputArray;
		length = inputArray.length;
		tempMergeArray = new int[length];
		
		new MergeSortStatic().sort(inputArray);
		for(int i : inputArray) {
			System.out.println(i);
		}

	}

	private  static void sort(int[] inputArray) {
		// TODO Auto-generated method stub
		divideArray(0,length-1);
	}

	private static void divideArray(int lowerindex, int higherindex) {
		// TODO Auto-generated method stub
		if(lowerindex < higherindex) {
			int middle = lowerindex +(higherindex-lowerindex)/2;
			divideArray(lowerindex,middle);
			divideArray(middle+1,higherindex);
			mergeArray(lowerindex,middle,higherindex);
			
		}
	}

	private static void mergeArray(int lowerIndex, int middle, int higherIndex) {
		// TODO Auto-generated method stub
		for(int i = lowerIndex;i <= higherIndex;i++) {
			tempMergeArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i <= middle && j <= higherIndex) {
			
			if(tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			}
			else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while(i <= middle) {
			array[k] = tempMergeArray[i];
			i++;
			k++;
		}
		while(j <= higherIndex) {
			array[k] = tempMergeArray[j];
			j++;
			k++;
		}
		
	}

}
