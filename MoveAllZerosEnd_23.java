/*
23) Write a program in java to move all zeroes to the end of a given array. 
*/

import java.util.*;
public class MoveAllZerosEnd_23 {
	
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

		int count = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		System.out.println("Moving All Zeroes to End ");
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
	}
}