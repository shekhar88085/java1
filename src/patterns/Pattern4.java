package patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<n;j++){
                System.out.print("* ");
            } System.out.println();
        }
    }
}
