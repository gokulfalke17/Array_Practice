/*
7) WAP to enter the 10 element array and print the occurrence of every element ? 
*/

import java.util.*;
public class ArrayOccurrence_07 {

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
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending Order ");
		for(int i=0;i<size;i++) {
			System.out.printf(arr[i]+" ");
		}
		System.out.println();
		int count=1;
		System.out.println("Array Occerrence of Each Elements ");
		for(int i=0;i<size;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else{
				System.out.printf("%d--->%d times\n",arr[i],count);
				count=1;
			}
		}
	}
}