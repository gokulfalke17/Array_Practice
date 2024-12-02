/*
8) . Write a program in java to merge two arrays of same size sorted in decending order.
*/

import java.util.*;
public class MargeTwoArray_08 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];

		System.out.println("Enter Elements in First Array ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt(); 
		}

		System.out.println("Enter Elements in Second Array ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = scn.nextInt(); 
		}

		int arr3[] = new int[arr1.length+arr2.length];
		for(int i=0;i<arr3.length;i++) {
			if(i<arr3.length/2){
				arr3[i]=arr1[i];
			}else {
				arr3[i] = arr2[i-arr3.length/2];
			}
		}

		System.out.println("Display Marge Array Elements ");
		for(int i=0;i<arr3.length;i++) {
			System.out.printf(arr3[i]+" ");
		}
		System.out.println();

		System.out.println("Sorting Array Elements ");
		for(int i=0;i<arr3.length;i++) {
			for(int j=i+1;j<arr3.length;j++) {
				if(arr3[i]<arr3[j]){
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.printf(arr3[i]+" ");
		}
		System.out.println();
	}
}