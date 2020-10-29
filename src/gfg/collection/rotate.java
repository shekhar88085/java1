package gfg.collection;

import java.util.*;

public class rotate {
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.chars().allMatch(Character::isLetter)));
    }
    public static void main(String [] ddd){
        List<String> k=new ArrayList<>();
        k.add("2");
        k.add("34");
        k.add("56");
        k.add("43");
        System.out.println(k);
        Collections.rotate(k,2);
        System.out.println(k);
        //for array
        Integer arr[]={1,2,4,5,6};
        Collections.rotate(Arrays.asList(arr),2);
        System.out.println(Arrays.toString(arr));
        //frequency
        int freq=Collections.frequency(k,"2");
        System.out.println(freq);
        //freq for array
        Integer arrs[] = {10, 20, 20, 30, 20, 40, 50};
        int  freqs=Collections.frequency(Arrays.asList(arrs),20);
        System.out.println(freqs);
        System.out.println(Arrays.toString(arr));
        //nCopies();
        List list=Collections.nCopies(4,"shekhar");
        Iterator iterator = list.iterator();
        System.out.println("nCopies and iterator example:");
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        //shuffle
        System.out.println(k);
        Collections.shuffle(k);
        System.out.println(k);
        //singleton it removes data
        String[] sinlelist={ "1", "2", "4", "2", "1", "2",
                "3", "1", "3", "4", "3", "3" };
        List rlist=new ArrayList(Arrays.asList(sinlelist));
        System.out.println(rlist);
        //remove 1 from list
        rlist.removeAll(Collections.singleton("1"));
        System.out.println(rlist);
        //sort
        Collections.sort(rlist);
        System.out.println(rlist);
        //descending order
        Collections.sort(rlist,Collections.reverseOrder());
        System.out.println(rlist);
     //   int index=Collections.binarySearch(k,2);
       // System.out.println(index);
        String st1="sdfghjk";
        String st2="12345gfds";
        String st3="1234567";
        System.out.println(isStringOnlyAlphabet(st1));
        System.out.println(isStringOnlyAlphabet(st2));
        System.out.println(isStringOnlyAlphabet(st3));
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.forEach(n -> System.out.println(n));
    }
}
