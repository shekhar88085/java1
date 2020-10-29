package gfg.collection;

//import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class MultiDimensionlaArrayList {
    static List create2DArrayList(){
        ArrayList<ArrayList<Integer>> x=new ArrayList<ArrayList<Integer>>();
        x.add(new ArrayList<Integer>());
        x.get(0).add(0,3);
        x.add(new ArrayList<Integer>(Arrays.asList(3,4,6)));
        x.get(1).add(0,366);
        x.get(1).add(4,576);
        x.add(2,new ArrayList<Integer>(Arrays.asList(5,3,2)));
        x.add(new ArrayList<Integer>(Arrays.asList(88,5,32)));
        x.add(new ArrayList<Integer>(Arrays.asList(876)));
        return x;
    }
    public static void main(String[] fdf){
        System.out.println("Create 2d array");
        System.out.println(create2DArrayList());
    }
}
