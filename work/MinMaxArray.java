package work;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
      int[] result=  findMaxMinArray(array);
      System.out.println(result[0]);
        System.out.println(result[1]);

    }

    private static int[] findMaxMinArray(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Return an array with max at index 0 and min at index 1

        return new int[]{max, min};
    }
}
//Time Complexity:O(n)
//Space Complexity:O(1)