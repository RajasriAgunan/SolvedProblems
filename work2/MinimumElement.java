package work2;
//5.Given the rotated sorted array,find the minimum element.

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
       int result= minimumElement(array);

           System.out.print(result);

    }

    private static int minimumElement(int[] array) {
        if(array.length==0){
            return -1;
        }
        if (array.length==1||array[0] <= array[array.length - 1]) {
            return array[0];
        }
        int left=0;
        int right= array.length-1;


        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(array[mid]<array[mid-1]) {
                return mid;
            }
            if(array[mid]>array[mid+1]){
                  return array[mid+1];
            }

            if (array[left]<array[right]) {
                left = mid + 1;
            }
            right = mid - 1;
        }

        return -1;
    }
    }

//Time Complexity:O(log(n))
//Space Complexity:O(1)