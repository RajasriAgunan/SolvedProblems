package work;

import java.util.Scanner;

public class GcdOfTwoNumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num1= scan.nextInt();
        int num2=scan.nextInt();

     int result=   gcdOfTwoNumbers(num1,num2);
       System.out.println(result);
    }

    private static int gcdOfTwoNumbers(int num1, int num2) {
        int min=num1<num2?num1:num1;
         for(int i=min;i>1;i--) {

    if ((num1 % i== 0) && (num2 % i == 0)) {
        return i;
    }
}
        return 1;
    }
}
 //Time Complexity:O(min(a,b))
//Space Complexity:O(1)