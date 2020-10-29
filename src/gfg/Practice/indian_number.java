package gfg.Practice;

import java.util.Scanner;

public class indian_number {
    static int digits(long n){
        return (int)Math.floor(Math.log10(n)+1);
    }
    public static void main(String[] dq){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t!=0){
            long n;
            n=sc.nextLong();
            int d=digits(n);
           System.out.println("digits="+d);
            if(d>9&&d<13){
                if(d==10){
                    if(n/d>7&&n/d<10){
                        System.out.println("Valid");
                    }
                }
                if(d==11){
                    if(n/d==0){
                        d=10;
                        if(n/d>7&&n/d<10){
                            System.out.println("Valid");
                        }
                    }else System.out.println("invalid");
                }
                if (d==12){
                    if(n/d==9&&n/(d-1)==1){
                        d=10;
                        if(n/d>7&&n/d<10){
                            System.out.println("Valid");
                        }
                    }
                    else System.out.println("Invalid");
                }
            }else{
                System.out.println("Invalid");
            }
            t--;
        }
    }
}
