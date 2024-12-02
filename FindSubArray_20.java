/*
20) Write a program in java to find a subarray with given sum from the given array? 
*/

import java.util.*;
public class FindSubArray_20 {
	
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
		
		int sum1;
		System.out.println("Enter Sum to Find Subarray ");
		sum1 = scn.nextInt();

		System.out.println("Two Pairs Sum Subarray ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++){
				int sum = 0;
				int k=0;
				for(k=i;k<j;k++){
					sum = sum+arr[k];
				}
				if(sum == sum1){
					for(int m=i;m<k;m++){
						System.out.print(arr[m]+" ");
					}
					System.out.println();
				}
			}
		}
	}
}