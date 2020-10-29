package gfg.collection.Queue.priorityQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ex {
    public static void main(String [] dd){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        pq.add(12);
        pq.add(765);
        pq.add(321);
      //  Comparator
        Iterator it=pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        // int[] arr1=pq.toArray();
        Object[] arr=pq.toArray();
        System.out.println("array");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i].toString()+" ");
        arr.notifyAll();
    }
}
