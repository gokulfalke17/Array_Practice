// 38)Write a program in C for multiplication of two square Matrices

import java.util.Scanner;

public class MultiplicationTwoMatrix_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.println("enter the elment of array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("display matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println("");
        }
        int b[][] = new int[2][2];
        System.out.println("enter the elment of array");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("display matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println("");
        }
        int sum = 0;
        int c[][] = new int[2][2];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                sum = 0;
                for (int j2 = 0; j2 < c.length; j2++) {
                    sum = sum + (a[i][j2] * b[j2][j]);
                }
                c[i][j] = sum;
            }
        }
        System.out.println("addtion of two matrix is");

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}