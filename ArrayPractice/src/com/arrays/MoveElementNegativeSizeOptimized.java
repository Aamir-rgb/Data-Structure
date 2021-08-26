package com.arrays;

public class MoveElementNegativeSizeOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };
		int arr_size = arr.length;
		 shiftall(arr,0,arr_size - 1);
		 display(arr, arr_size - 1);

	}

	private static void display(int[] arr, int i) {
		for(i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void shiftall(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		int temp = 0;
		while(left <= right) {
			
			if(arr[left] < 0 && arr[right]<0) {
				left++;
			}
			
			else if (arr[left] > 0 && arr[right] < 0) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				temp++;
				right--;
			}
			
			else if (arr[left] > 0 && arr[right] > 0) {
				
				right--;
				
			}
			else {
				left++;
				right--;
			}
		}
		
	}

}
