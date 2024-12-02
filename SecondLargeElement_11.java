/*
11). Write a program in java to find the second largest element in an array ? 
*/

import java.util.*;
public class SecondLargeElement_11 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size;
		System.out.println("Enter Array size ");
		size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		
		int large=0, second=0;
		for(int i=0;i<size;i++) {
			if(large<arr[i]) {
				second = large;
				large = arr[i];
			}else if(large>arr[i] && second<arr[i]) {
				second = arr[i];
			}
		}

		System.out.println("Large Element "+large);
		System.out.println("Second Large Elements "+second);
	}
}