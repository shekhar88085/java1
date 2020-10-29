package loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] d) {
        int t;
        // System.out.println("Entyer the test cases");
        Scanner sc = new Scanner(System.in);
        // t = sc.nextInt();
        int num;
        System.out.println("Enter the number    to check whether it is prim  or not");
        num = sc.nextInt();
        int i;
        boolean isprime = true;
        for (i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        if (num < 2) isprime = false;
        System.out.println("isprime " + isprime + " ");
    }
}