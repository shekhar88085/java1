package gfg.Practice;

import java.util.Scanner;

public class GFG {
    public static void main(String [] df){
        int t;
        Scanner sc =new Scanner(System.in);
        t=sc.nextInt();
        while (t!=0){
            int n;
            n=sc.nextInt();
            int ev,od;
            ev=n/2;
            //int even=ev*(ev+1);
            //od= (int) Math.ceil(n/2);
            if(n%2==0){
                od=ev;
            }
            else od=ev+1;
           // System.out.println("odd="+od);
            System.out.println(+ev*(ev+1)+" "+(od*od));
            t--;
        }
    }
}
