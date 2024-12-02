// 30)Write a program in C to find the minimum distance between two numbers in a given array

import java.util.Scanner;

public class MinimumDistanceTwoNumbers_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int x = 7;
        int y = 11;
        System.out.println("enter the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min_dist = a.length;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if ((x == a[i] && y == a[j]

                        || y == a[i] && x == a[j])

                        && min_dist > Math.abs(i - j)) {

                    min_dist = Math.abs(i - j);

                }

            }

        }
        System.out.printf("Minimum distance between %d and %d is %d\n", x,

                y, min_dist);
                sc.close();

    }
}
