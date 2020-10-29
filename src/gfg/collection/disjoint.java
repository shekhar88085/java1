package gfg.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class disjoint {
    public static void main(String [] sdfg){
        List<String> m1=new ArrayList<String>();
        m1.add("a");
        m1.add("b");
        m1.add("c");
        m1.add("d");
        List<String> m2=new ArrayList<>();
        m2.add("a");
        m2.add("5");
        //m2.add("3");
        //m2.add("78");
        List<String> m3=new ArrayList<>();
        m2.add("4w");
        m2.add("5wer");
        m2.add("3er");
        m2.add("7824");
        //disjoint will return true when all  ellement of later is match with
        // former i.e. true if the two specified collections have no elements in common.
        System.out.println("m1 and m2:"+ Collections.disjoint(m1,m2));
        System.out.println("m2 and m3:"+Collections.disjoint(m2,m3));
        System.out.println(",3 and m1:"+Collections.disjoint(m3,m1));
    }
}
