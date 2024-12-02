/*
21) Write a program in C to find if a given integer x appears more than n/2 times in a sorted array 
of n integers ? 
*/

import java.util.*;
public class X_Appears_21 {
	
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

		System.out.println("Sorted Array Elements ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();

		int num;
		System.out.println("Enter Any Number ");
		num = scn.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		if(count>size/2) {
			System.out.println(num+" is More Than "+size/2+" Times in This Array[]");

		}
	}
}