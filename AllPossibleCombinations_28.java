/*
28) Write a program in java to print all possible combinations of r elements in a given array. 
*/

import java.util.Scanner;
class AllPossibleCombinations_28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println("Enter Any Elements to Combine it ");
		int num = scn.nextInt();

		System.out.println("The Combinations are ");
		for(int i=0;i<=size-num;i++) {
			for(int j=i+1;j<=size-num+1;j++) {
				for(int k=j+1;k<=size-num+2;k++) {
					for(int l=k+1;l<=size-num+3;l++) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
					}
				}
			}
		}
	}
}

