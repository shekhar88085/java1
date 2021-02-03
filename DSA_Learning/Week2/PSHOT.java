package DSA_Learning.Week2;

import java.util.Scanner;

public class PSHOT {
    public static void main(String bbj[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
           int n=sc.nextInt();
           String s=sc.next();
           int sa=0,sb=0;
           int ra=n,rb=n;
           int goal=0;
           int i=0;
            for (i=0;i<s.length();i++){
                goal=s.charAt(i);
                if(i%2==0) {
                    if (goal == '1') sa++;
                    ra--;
                }
                else {
                    if(goal=='1') sb++;
                        rb--;
                    }

          //  System.out.println("sa "+ra+" ra "+ra+"" +
                            //           " sb "+sb+" rb "+rb);
         //       System.out.println("i= "+i);
                if((ra<(sb-sa))||(rb<(sa-sb)))break;}
            System.out.println(i<s.length()?(i+1):s.length());
            }
        }
    }
