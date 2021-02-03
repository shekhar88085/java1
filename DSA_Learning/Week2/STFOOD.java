package DSA_Learning.Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class STFOOD {
    public static void main(String dfghj[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s,v,p,max=Integer.MIN_VALUE;
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                s=sc.nextInt();
                v=sc.nextInt();
                p=sc.nextInt();

                al.add((int) Math.floor((p/(s+1))*v));
            }
            System.out.println(Collections.max(al));
        }
    }
}
