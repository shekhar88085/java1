package gfg.stringclass.stringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class newClass {
    public static void main(String [] sd){
        ArrayList<String> al=new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        StringJoiner sj1=new StringJoiner(",");
        //setEmptyValue();
        sj1.setEmptyValue("this is empty now");
        System.out.println(sj1);
        //add();
        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1);
        //length();
        System.out.println(sj1.length());
        StringJoiner sj2=new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));
        System.out.println(sj2);
        //merging
        sj1.merge(sj2);
        System.out.println(sj1);
    }
}
