package patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] d){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the  number to print pattern");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
