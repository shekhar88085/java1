package gfg.collection.list.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ex2 {
    public static void main(String [] dd){
        int n=5;
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for (int i=0;i<3;i++)al2.add(i);
        for (int i=0;i<=5;i++){
            al.add(i);
        }
        //forEach
        for (int f:al
             ) {
            System.out.print(f);
            al.forEach((j)-> System.out.print(j));
        }
        //retain
        al.retainAll(al2);
        System.out.println(al);
        al.removeIf(a->(a%2==0));
        System.out.println(al);
       // System.out.println(al2.listIterator());
        //iterator
        ListIterator<Integer> iterator=al2.listIterator(2);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
