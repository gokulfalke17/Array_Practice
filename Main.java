/*
import java.util.Scanner;
public class Logic_ceil_and_floor {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("The given array is: 1 3 5 7 8 9");

        for (int num : numbers) {
            int floor = -1;
            int ceil = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    floor = ceil = arr[i];
                    break;
                } else if (arr[i] < num) {
                    floor = arr[i];
                } else if (arr[i] > num) {
                    ceil = arr[i];
                    break;
                }
            }
            System.out.println("Number: " + num + " ceiling is: " + ceil + " floor is: " + floor);
        }
    }

}

*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {38, 44, 63, -51, -35, 19, 84, -69, 4, -46};
        int length = arr.length;
        int[] b = new int[2];
        int smallSum = Integer.MAX_VALUE;

        // Display Array Values
        System.out.println("Array is");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Find pair with smallest sum
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < 0)
                    sum = -sum; // Take absolute value manually
                if (sum < smallSum) {
                    smallSum = sum;
                    b[0] = arr[i];
                    b[1] = arr[j];
                }
            }
        }
        System.out.println("\nPair with smallest sum is: " + b[0] + "," + b[1]);
    }
}
