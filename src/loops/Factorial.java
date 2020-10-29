package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] d){
        int fact,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which u want to know the factorial");
        fact=sc.nextInt();
        for(int i=fact;i>=1;i--){
            f=f*i;
        }
        System.out.println("The factorial for number "+fact+" is "+f+"");
    }
}
