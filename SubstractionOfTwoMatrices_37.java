// 37) Write a program in C for subtraction of two Matrices

import java.util.Scanner;

public class SubstractionOfTwoMatrices_37 {
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
        int b[][]=new int[3][3];
        System.out.println("enter the elment of array");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("display matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.printf("%d ",b[i][j]);
            }
            System.out.println("");
        }
        int c[][]=new int[3][3];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("addtion of two matrix is");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.printf("%d  ",c[i][j]);
            }
            System.out.println("");
        }
        sc.close();
}
}
