/*
1) WAP to enter the five elements in array and show it  
2) WAP to enter the five elements in array and calculate the sum of all elements 
*/

import java.util.*;
public class ArrayShowAndSum_01 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int size;
		int sum=0;
		System.out.println("Enter Array Size ");
		size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("Sum of "+sum);
	}
}