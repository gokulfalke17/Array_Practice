/*
4) WAP to insert the element on specified position in array  ? 
*/

import java.util.*;
public class InsertValueInPosition_04 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}

		int index=0;
		System.out.println("Enter Index Where You Want to Store Value ");
		index = scn.nextInt();

		int value;
		System.out.println("Enter Which Value Want to Store in Index ");
		value = scn.nextInt();

		for(int i=arr.length-1;i<index;i--){
			arr[index] = arr[i];
		}
		arr[index] = value;
		System.out.println("Modified Array Elements ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}