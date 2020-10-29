package loops;

import java.util.Scanner;

public class While {
    public static void main(String[] df){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to know its sum of digit");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println(sum);
        int ndig=(int)Math.log10(temp)+1;
        System.out.println("the number of digit in number is "+ndig);
    }
}
