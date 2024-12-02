// 47)Write a program in C to accept two matrices and check whether they are equal

import java.util.Scanner;

public class CheckMatrixIsEqual_47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        System.out.println("eneter the element of first array");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
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
        System.out.println("eneter the element of second array");
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
        boolean flag=true;
       
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
               if (a[i][j]!=b[i][j]) {
                flag=false;
               }
            }
        }
        if (flag) {
            System.out.println("matrix are equal");
        }
        else{
            System.out.println("matrix are not equal");
        }
        sc.close();
    }
}
