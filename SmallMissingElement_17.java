/*
17)  Write a program in java to find the smallest missing element from a sorted array? 
*/

import java.util.*;
public class SmallMissingElement_17 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size;
		System.out.println("Enter Array Size ");
		size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Element ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
		boolean flag = false;
		for(int i=0;i<size-1;i++) {
			for(int k=arr[i]+1;k<arr[i+1];k++) {
				System.out.println("Smallest Missing Element "+k);
				flag = true;
				break;
			}
			if(flag)
				break;
		}
	}
}