// 39)Write a program in C to find transpose of a given matrix.

import java.util.Scanner;

public class TransposeMatrix_39 {
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
        int c[][]=new int[2][2];
        System.out.println("transpose of matrix is");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] =a[j][i];
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println("");
            sc.close();
        }
    }
}
