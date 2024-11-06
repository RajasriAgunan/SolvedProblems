package work;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(2*i);
        }
    }

}
//Time Complexity:O(n)
//Space Complexity:O(1)