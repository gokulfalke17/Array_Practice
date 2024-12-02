/*
18)  Write a program in java to to print next greater elements in a given unsorted array. Elements for 
which no greater element exist, consider next greater element as -1.
*/

import java.util.*;
public class NextGreaterElements_18 {
	
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
			count = -1;
			for(int j = i+1;j<size;j++) {
				if(arr[i]<arr[j]){
					count = arr[j];
					break;
				}
			}
			System.out.println(arr[i]+" ---> "+count);
		}
		System.out.println("Next Greater Elements Array ");
		for(int i=0;i<size;i++) {
			count = -1;
			for(int j = i+1;j<size;j++) {
				if(arr[i]<arr[j]){
					count = arr[j];
					break;
				}
			}
			System.out.printf(count+" ");
		}
		System.out.println();
	}
}