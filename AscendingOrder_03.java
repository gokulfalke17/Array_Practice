/*
3) WAP to enter the five element and display in ascending order ?
*/

import java.util.*;
public class AscendingOrder_03 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}

		//ascending order logic
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Ascending Order ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}