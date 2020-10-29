package gfg.stringclass;

import java.text.DecimalFormat;
import java.util.StringJoiner;

public class intToString {
    public static void main(String [] dd){
        int a=-1234;
        int b=1342;
        //using Integer.toString(int);
        String sa=Integer.toString(a);
        String sb=Integer.toString(b);
        System.out.println(sa+sb);
        //String.valueOf(int);
        sa=String.valueOf(a);
        sb=String.valueOf(b);
        System.out.println(a);
        System.out.println(b);
        //using Integer(int).toString();
        sa=new Integer(a).toString();
        sb=new Integer(b).toString();
        System.out.println(a);
        System.out.println(b);
        //using DecimalFormat
        DecimalFormat df=new DecimalFormat("#");
        sa=df.format(a);
        System.out.println(sa);
        //stringbuffer or stringbuilder use it
        //to binary hex octal etc
        sa=Integer.toBinaryString(a);
        System.out.println(sa);
        //to octal
        sa=Integer.toOctalString(a);
        System.out.println(sa);
        //to hex
        sa=Integer.toHexString(a);
        System.out.println(sa);
        //custom radix
        sa=Integer.toString(a,2);
        System.out.println(sa);
    }
}
