// 33) Write a program in C to convert the array in such a way that double its value and replace the 
// next number with 0 if current and next element are same and rearrange the array such that all 0's 
// shifted to the end.

import java.util.Scanner;

public class DubleReplace_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the  value of element");
        int a[]=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();

        }
        System.out.println("after replacing dublicates");
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j] && a[i]!=0) {
                    a[i]=a[i]+a[j];
                    a[j]=0;
                    break;
                }
            }
        }
        int c=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0) {
                a[c]=a[i];
                c++;
            }

        }
        for (int i = c; i < a.length; i++) {
            a[i]=0;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" "+a[i]);
        }
      
	  System.out.println();
    }
}
