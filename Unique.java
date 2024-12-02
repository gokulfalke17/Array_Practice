import java.util.*;

public class Unique {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the value of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        // System.out.println("***************************");
        System.out.println("unique element is");
        int c ;
        for (int i = 0; i < a.length; i++) {
            c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++;
                    // System.out.println(c);
                }
            }
            if (c == 1) {
                System.out.printf("%d ", a[i]);
            }
        }
        // System.out.println("***************************");
        // System.out.println("unique element is");
        // int c ;
        // for (int i = 0; i < a.length; i++) {
        //     c = 0;
        //     for (int j = i+1; j < a.length; j++) {
        //         if (a[i] == a[j] && a[i]!=-1) {
        //           a[j]=-1;
        //         }

        //     }
        // }
        
        sc.close();
    }
}
