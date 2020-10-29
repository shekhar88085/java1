package Lists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] d){
        LinkedList ll=new LinkedList();
        ll.add("b");
        ll.add("c");
        System.out.println("contents:"+ll);
        ll.addFirst("a");
        ll.addLast("3");
        System.out.println("contents:"+ll);
        ll.offerFirst("av");
        System.out.println("contents:"+ll);
    }
}
