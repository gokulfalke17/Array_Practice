/*
14) Write a program in java to rotate an array by N positions ? 
*/

import java.util.*;
public class RotateArray_14 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size;
		System.out.println("Enter Arary Size ");
		size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
		int index;
		System.out.println("Enter Index ");
		index = scn.nextInt();
		int j;
		for(int i=0;i<index;i++) {
			int temp = arr[0];
			for(j=0;j<size-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		System.out.println("Rotating Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
	}
}