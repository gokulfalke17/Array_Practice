/*
24) Write a program in java to count the number of inversion in a given array 
*/

import java.util.*;
public class CountInversionNumbers_24 {

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

		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					System.out.print("("+arr[i]+","+arr[j]+") ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of Inversion can be Formed  Array "+count);
	}
}