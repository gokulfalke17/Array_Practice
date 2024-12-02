/*
5). Write a program to enter the 5 values in ascending order and store in array and find out the 
missing element from array? 
*/

import java.util.*;
public class FindMissingElements_05 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array in Ascending Order ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Missing Elements ");
		for(int i=0;i<arr.length-1;i++) {
			for(int k=arr[i]+1;k<arr[i+1];k++){
				System.out.println(k);
			}
		}
	}
}