// 35) Write a program in C for a 2D array of size 3x3 and print the matrix ?

import java.util.Scanner;

public class PrintMatrix_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("enter the elment of array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("display matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}
