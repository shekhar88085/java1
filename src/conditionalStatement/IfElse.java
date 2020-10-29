package conditionalStatement;

import java.util.Scanner;

public class IfElse {
    public  static void main(String[] d){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur age:");
        int age=sc.nextInt();
        int mage =23,max;
        if(age>18){
            System.out.println("You can vote!!!");
        }else {
            System.out.println("You are not adult now!!!");
        }
        max=age>mage?age:mage;
        System.out.println(max);
        int a,b,c,r;
        System.out.println("Enter the value of a,b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                r=a;
            }else {
                r=c;
            }
        }
        else {
            if(b>c){
                r=b;
            }else {
                r=c;
            }
        }
        System.out.println("The largest number is "+r);
        r=a<b?a<c?a:c:b<c?b:c;
        System.out.println("The smallest number is "+r);
    }
}
