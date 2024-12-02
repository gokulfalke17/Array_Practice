/*
13) Write a program in java to find the majority element of an array ? 
*/

import java.util.*;
public class MajorityElement_13 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int arr[] = new int[10];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			count=1;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
		}
		if(count>=arr.length/2){
			System.out.println("It is Majoraity Array");
		}else{
			System.out.println("It is Not Majority Array");
		}
	}
}