package loops;

import conditionalStatement.SwitchCase;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] f) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to knoiw whether it is palindrome or not");
        int n = sc.nextInt();
        int temp = n;
        int r = 0 ;
        while (temp > 0) {
            r = r * 10 + temp % 10;
            temp = temp / 10;
        }
        if(r==n){
            System.out.println("this number is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
}
