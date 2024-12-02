/*
12) . Write a program in java to find a pair with given sum in the array.  
*/

import java.util.*;
public class SumTwoPairs_12 {
	
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
		int sum;
		System.out.println("Enter Sum of Two Pairs ");
		sum = scn.nextInt();
		System.out.println("Two Pairs Values are ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.printf("%d %d ",arr[i],arr[j]);
				}
			}
		}
		System.out.println();
	}
}