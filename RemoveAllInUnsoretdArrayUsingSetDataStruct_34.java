// 34)Remove duplicates from unsorted array using Set data structure

import java.util.Scanner;

public class RemoveAllInUnsoretdArrayUsingSetDataStruct_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[8];
        System.out.println("enter the valur of element");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("after removing the dublicate");
        int size=a.length,c=0;
        for (int i = 0; i < size-c; i++) {
            for (int j = i+1; j <size-c; j++) {
                if (a[i]==a[j]) {
                    for (int k = j; k < (size-1)-c; k++)
                    {
                        a[k]=a[k+1];  
                    }
                    j--;
                   c++;
                }
            }
        }
        size=size-c;
        for (int i = 0; i < size; i++) {
            System.out.print(" "+a[i]);
        }
       System.out.println();
    }
}
