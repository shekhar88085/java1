package Competitive;

import java.util.Scanner;

public class intest {
    public  static  void main(String [] d){
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        while (n!=0){
            int num ,c=0;
            num=sc.nextInt();
            if (num%k==0){
                c++;
            }
            System.out.println(c);
            n--;
        }
    }
}
