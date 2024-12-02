/*
29) Write a program in java to find a pair with the given difference 
*/

import java.util.*;
public class FindPairsGivenDifference_29 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Enter Two Pairs Difference ");
		int diff = scn.nextInt();
	
		System.out.println("Pairs are ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(arr[i]-arr[j]==diff) {
					System.out.println(arr[j]+","+arr[i]);
				}
			}
		}
	}
}
