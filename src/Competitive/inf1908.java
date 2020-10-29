package Competitive;

import java.util.Scanner;

public class inf1908 {
    public static void main(String [] sd){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int sum=n+k;
            sum=sum%10;
            //System.out.println(sum);
            int d=n%10;
            int num=n-d+sum;
            System.out.println(num);
            t--;
        }
    }
}
