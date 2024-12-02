/*
22) Write a program in java to find the maximum circular subarray sum of a given array. 
*/

import java.util.*;
public class MaxSubarraySum_22 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size;
		System.out.println("Enter Array Size ");
		size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		int max = arr[0];
		int sum;
		for(int i=0;i<size;i++) {
			sum = arr[i];
			for(int j=0;j<size;j++) {
				sum = sum+arr[j];
				if(sum>max) {
					max = sum;
				}
			}
		}
		System.out.println("Max Sum "+max);
	}
}