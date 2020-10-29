package gfg.collection.list.linklist;

import java.util.LinkedList;

public class ex {
    public static void main(String [] dd){
        LinkedList<String> object=new LinkedList<>();
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println(object);
        System.out.println(object.peek());
    }
}
