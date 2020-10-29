package gfg.stringclass;
import static java.lang.System.*;
public class stringToInt {
    public static void main(String [] dd){
        String s="1234";
        //using Integer.parseInt(String);
        int sa=Integer.parseInt(s);
        System.out.println(sa);
        //radix
        sa=Integer.parseInt(s,16);
        System.out.println(sa);
        //using Integer.valueOf(String);
        sa=Integer.valueOf(s);
        System.out.println(sa);
        out.println("wdfghj");
    }
}
