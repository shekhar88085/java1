package gfg.stringclass.stringTokenizer;

import java.util.StringTokenizer;

public class newClass {
    public static void main(String [] d){
        StringTokenizer st1=new StringTokenizer("my name is shekhar");
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());
        st1=new StringTokenizer("java:code:c",":");
        System.out.println("total number of tokens:"+st1.countTokens());
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());

    }
}
