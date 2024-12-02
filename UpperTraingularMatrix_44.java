// 44)Write a program in C to print or display upper triangular matrix
import java.util.Scanner;

public class UpperTraingularMatrix_44 {
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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i<j) {
                    a[i][j]=0;
                }
            }
        }
        System.out.println("upper traingular matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println("");
            sc.close();
        }
    }
}
