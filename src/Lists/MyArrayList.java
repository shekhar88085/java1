package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyArrayList {
    public static void main(String[] s){
       // ArrayList<String> fruits=new ArrayList();
        //List<String > fruits=new ArrayList<>();
        List<String> fruits=new LinkedList<>();
        List<String> vegetables=new ArrayList<>();
        List<Integer> marks=new Stack<>();
        marks.add(5);
        marks.add(6);
        System.out.println(marks);
        fruits.add("Apple");
        fruits.add("Orange");
        vegetables.add("LadyFinger");
        vegetables.add("Brinjal");
        vegetables.add("Potato");

        fruits.addAll(vegetables);
        System.out.println(fruits);
        vegetables.set(1,"Tomato");
        System.out.println(vegetables);
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
       // fruits.clear();
        List<String> toRemove=new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("Orange");
        fruits.removeAll(toRemove);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Guava"));
        System.out.println(fruits.isEmpty());

       // Pair<String,Integer> p1=new Pair("Shekhar",43);
        //Pair<Boolean,String> p2=new Pair(true,"Me");
        //p1.getDescription();
        //p2.getDescription();
    }
}