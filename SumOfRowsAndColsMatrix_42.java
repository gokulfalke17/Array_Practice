// 42)Write a program in C to find sum of rows an columns of a Matrix.

import java.util.Scanner;

public class SumOfRowsAndColsMatrix_42 {
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
        System.out.println("addtion of row and colum");
        int rsum=0,csum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                rsum=rsum+a[i][j];
                System.out.printf("%d  ",a[i][j]);
            }
            System.out.printf("    "+rsum);
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++)
    {
        csum = 0;

        for (int j = 0; j < 3; j++)
        {
            csum = csum + a[j][i];
            
        }
        System.out.printf(""+csum+" ");
    }
    System.out.println();
    }

}
