package gfg.collection;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class sx {
    public static void main(String [] dd){
        AbstractCollection<Object> abs=new ArrayList<>();
        abs.add("1");
        abs.add("dshs");
        abs.add("2");
        abs.add("1");
        abs.add(1);
        abs.add(1);
        System.out.println(abs);
    }
}
