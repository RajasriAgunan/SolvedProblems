package work3;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String result=reverseString(input);
        System.out.print(result);

   }

    private static String reverseString(String input) {
      String[] words= input.trim().split("\\s+")  ;
      int left=0;
      int right=words.length-1;
      while(left<=right) {
          String temp = words[left];
          words[left] = words[right];
          words[right] = temp;
          left++;
          right--;
      }
    return String.join( " ", words);

}

} 