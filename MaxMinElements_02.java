/*
2) WAP to enter the five elements in array and find out the maximum and minimum elements 
*/

import java.util.*;
public class MaxMinElements_02 {
	
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
		System.out.println("Min and Max Elements in Given Array ");
		int max = arr[0], min = arr[0];
		for(int i=0;i<size;i++) {
			if(max<arr[i]){
				max = arr[i];
			}
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("Max "+max);
		System.out.println("Min "+min);
	}

}