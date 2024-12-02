/*
10). Write a program in java to delete an element at desired position from an array.  
*/

import java.util.*;
public class DeleteElements_10 {
	
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
		int position;
		System.out.println("Enter Which Element You Want to Delete ");
		position = scn.nextInt();

		System.out.println("After Deletation Elements ");
		for(int i=0;i<size;i++){
			if(arr[i]!=position){
				System.out.println(arr[i]);
			}
		}
	}
}