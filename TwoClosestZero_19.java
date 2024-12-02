/*
19) Write a program in java to find two elements whose sum is closest to zero 
*/

import java.util.*;
public class TwoClosestZero_19 {
	 public static void main(String[] args) {
        int[] arr = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};
		int size = arr.length;
		int b[] = new int[2];
		int smallSum = Integer.MAX_VALUE;

        System.out.println("Array Elements ");
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();

		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				int sum = arr[i]+arr[j];
				if(sum<0)
					sum = -sum;
				if(sum<smallSum) {
					smallSum = sum;
					b[0] = arr[i];
					b[1] = arr[j];
				}
			}
		}
		System.out.println("Two Closest Zero Sum ");
		System.out.println(b[0]+" "+b[1]);
    }
}