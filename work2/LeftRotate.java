package work2;

import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        int k = 1;
        rotateleft(array, k);
    }

    private static void rotateleft(int[] array, int k) {
        int n = array.length;
        for (int i = 0; i < k; i++) {

            rotateoneLeft(array, n);
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
    }

    private static void rotateoneLeft(int[] array, int n) {
        int first_element = array[0];
        for (int i = 0; i < n - 1; i++) {   // 1 2 3 4 5  length=5
            array[i] = array[i + 1];        // 0 1 2 3 4   last_element=n-1
            //a[0]=a[0+1]=a[1]=2,
            // hence a[0]=2 likewise a[2]=3,a[3]=4,a[4]=5

        }
        array[n-1] = first_element;
    }
}
