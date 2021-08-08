package com.arrays.sorting;

public class MergeSort {
	
	int[] array;
	int[] tempMergeArray;
	int length;

	public static void main(String[] args) {
		int inputArray[] = { 15, 5, 24, 8, 1, 3, 16, 10, 20 };

		MergeSort ms = new MergeSort();

		ms.sort(inputArray);
		
		for(int k : inputArray) {
		   System.out.println(k);	
		}

	}

	public void sort(int inputArray[]) {
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergeArray = new int[length];
		divideArray(0,length-1);
		
	}

	// public static void mergeArrays(int [],int lb,in)
	private  void divideArray(int lowerindex,int higherindex) {
		
		if(lowerindex < higherindex) {
			
			int middle = lowerindex + (higherindex - lowerindex)/2;
			
			//It will sort the left side of an array
			divideArray(lowerindex,middle);
			
			
			//It will sort the right side of an array
			divideArray(middle+1,higherindex);
			
			mergeArray(lowerindex,middle,higherindex);
			
		}
	}

	public void mergeArray(int lowerIndex,int middle,int higherIndex) {
		// System.out.println(i);

		for(int i = lowerIndex;i <= higherIndex;i++) {
			
			tempMergeArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		
		while ( i <= middle && j <= higherIndex) {
			
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			}
			else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		
		while( i <= middle) {
			array[k] = tempMergeArray[i];
			i++;
			k++;
			
		}
		while( j <= higherIndex) {
			array[k] = tempMergeArray[j];
			j++;
			k++;
			
		}

	}

}
