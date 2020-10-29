package gfg.Practice;

import java.util.Scanner;
public class switchpractice {
 //   public static Object obj;
    public static void main(String [] d){
       // System.out.println(obj);
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while (t!=0){
            int c;
            c=sc.nextInt();
            switch (c){
                case 1:{
                    int r;
                    r=sc.nextInt();
                    System.out.println(Math.PI*r*r);
                    break;
                }
                case 2:{
                    int l,b;
                    l=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println(l*b);
                }
            }
            t--;
        }
    }
}
