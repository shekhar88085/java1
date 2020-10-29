package gfg.collection.list;

import java.util.Collections;
import java.util.List;

public class singleLIneInitialization {
    public static <T> List<T> createList(T N){
        List<T> list= Collections.nCopies(1,N);
        return list;
    }
    public static void main(String [] df){
        int n=1024;
        System.out.println(createList(n));
        System.out.println(createList("fghjkl"));
    }
}
