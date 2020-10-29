package gfg.search;

import java.util.Arrays;

public class binarysearch {
    public static void main(String [] d){
        int arr[]={3,4,5,7,5,2,4,6,8,5,876};
        Arrays.sort(arr);
        int key=5;
        int res=Arrays.binarySearch(arr,key);
        System.out.println(res);
    }
}
