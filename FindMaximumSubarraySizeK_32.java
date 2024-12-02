// 32)Write a program in C to find the maximum for each and every contigious subarray of size k 
// from a given array.

import java.util.Scanner;

public class FindMaximumSubarraySizeK_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter the element of array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int max=0,k;
        System.out.println("enter the number that repetation we want");
        k=sc.nextInt();
        for (int i = 0; i < a.length-k; i++) {
            max=a[i];
            for (int j = i; j < k+i; j++) {
                System.out.printf("%d ",a[j]);
                if (a[j]>max) {
                    max=a[j];
                }

            }
            System.out.println("-------> "+max);
        }
        sc.close();
    }
}
