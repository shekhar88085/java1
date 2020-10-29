package gfg.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class es extends ArrayList<Integer>{
    public static void main(String [] dd){
        List<Integer> l1=new ArrayList<>();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println(l1);
        List<Integer> l2=new ArrayList<>();
        //add
        l2.add(1);
        l2.add(2);
        l2.add(3);
        System.out.println(l2);
        //addAll
        l2.addAll(1,l1);
        System.out.println(l2);
        //remove
        l2.remove(1);
        System.out.println(l2);
        //get
        System.out.println(l2.get(0));
        System.out.println(l2.indexOf(1));
        System.out.println(l2.lastIndexOf(2));
        ArrayList<Integer> s1=new ArrayList<>();
        for (int i=0;i<10;i++){
            s1.add(i);
        }
        System.out.println(s1);
       // s1.subList(2,5).remove(s1);
        s1.subList(3,7).clear();
        System.out.println(s1);
      //  s1.removeRange(0, 2);
        System.out.println(s1);
    }
}
