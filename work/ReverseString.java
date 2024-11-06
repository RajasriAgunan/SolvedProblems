package work;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = reversedString(str);
        System.out.print(result);
    }

    public static String reversedString(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        return str1;
    }
}
//Time Complexity:O(n)
//Space ComplexityO(n)`1