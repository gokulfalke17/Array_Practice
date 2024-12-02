/*
26) Write a program in java to count all distinct pairs for a specific difference 
*/

import java.util.*;
public class CountAllDistinctDiff_26 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		int diff;
		System.out.println("Enter Specific Differece ");
		diff = scn.nextInt();

		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]-arr[j]!=0 || arr[j]-arr[i]!=0) {
					System.out.println(arr[j]+" "+arr[i]);
					count++;
				}
			}
		}
		System.out.println("Number of distinct pairs  difference "+count);
	}
}