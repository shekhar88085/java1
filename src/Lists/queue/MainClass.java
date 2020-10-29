package Lists.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String [] h){
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(6);
        q.add(7);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.offer(9));
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
    }
}
