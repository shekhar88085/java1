package Lists;

import java.util.ArrayList;

public class ArrayListDEmo {
    public static void main(String [] d){
        ArrayList<String> al=new ArrayList();
        System.out.println("size:"+al.size());
        System.out.println("contents of arraylist:"+al);
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        System.out.println("size:"+al.size());
        System.out.println("contents of arraylist:"+al);
        al.remove("a");
        System.out.println("contents of arraylist:"+al);
        al.remove(1);
        System.out.println("contents of arraylist:"+al);
        al.hashCode();
        Object s[]=al.toArray();
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        System.out.println("contents of arraylist:"+al);
    }
}
