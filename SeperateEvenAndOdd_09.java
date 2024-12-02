/*
9) . Write a program in java to separate odd and even integers in separate arrays ? 
*/

import java.util.Scanner;
public class SeperateEvenAndOdd_09 {
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int size;
		System.out.println("Enter Array Size ");
		size = scn.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements ");
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Even Elements ");
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd Elements ");
		for(int i=0;i<size;i++){
			if(arr[i]%2!=0){
				System.out.println(arr[i]);
			}
		}
	}
}