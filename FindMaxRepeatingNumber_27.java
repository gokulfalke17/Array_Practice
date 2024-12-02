/*
27) Write a program in java to find the maximum repeating number in a given array. 
*/

import java.util.*;
public class FindMaxRepeatingNumber_27 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}

		int maxElement=0,count;
		int maxCount=0;
		for(int i=0;i<size;i++) {
			count=1;
			for(int j=i+1;j<size;j++) {
				if(arr[j]==arr[i]) {
					count++;
					if(count>maxCount) {
						maxElement = arr[j];
						//System.out.println("arr[j] :"+arr[j]);
						//System.out.println("Count :"+count);
					}
				}
			}
		}
		System.out.println("Maximum Repeating Element "+maxElement);
	}
}
