package work;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean result = palindromeString(str);
        System.out.println(result);
    }

    private static boolean palindromeString(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
            if (str.equals(str1)) {
                return true;
            }
        }
        return false;
    }
}
//Time Complexity:0(n)
//Space Complexity:O(1)