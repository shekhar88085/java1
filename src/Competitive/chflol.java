/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t>0){
            int n=sc.nextInt();
            long A[]=new long[n];
            long sum=0;
            for (int i=0;i<n;i++){
                A[i]=sc.nextInt();
                if(A[i]>0) {
                    sum = sum + A[i];
                }
            }
            System.out.println(sum);
            t--;
        }
    }
}
