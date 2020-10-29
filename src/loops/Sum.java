package loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] df){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        float result=0;
        for(float i=1;i<=n;i++){
            result=result+1/i;
           // System.out.println(result);
        }
        System.out.println(result);
    }
}
