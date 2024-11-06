package work2;

import java.awt.*;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
      int result= findFistSecondLargestElement(arr);
        System.out.println(result);
    }

    private static int findFistSecondLargestElement(int[] arr) {
        int firstLargest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}