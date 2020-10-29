package gfg.Practice;

import java.util.Scanner;

public class javaarrayset1 {
    public  static void main(String [] sdd){
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t!=0){
            int n,s=0;
            n=sc.nextInt();
            for (int i=0;i<n;i++){
                int a;
                a=sc.nextInt();
                s+=a;
            }
            double av=s/n;
            System.out.println(s+" "+av);
            t--;
        }
    }
}
