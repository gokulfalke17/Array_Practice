	/*
6).WAP to enter the five element in array and reverse it ? 
*/

import java.util.*;
public class ReverseArray_06 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array size ");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int start = 0;
		int end = size-1;
		int mid = size/2;

		for(start=0;start<mid;start++) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
		}

		System.out.println("Reverse Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}