package Placement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LogestConsecutiveSubsequence {
    static  int FindLCS(int arr[], int n){
        Arrays.sort(arr);
        ArrayList<Integer> v=new ArrayList<>();
        v.add(23);
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1])v.add(arr[i]);
        }int ans=0,count=0;
        for (int i=0;i<v.size();i++){
            if(i>0&&v.get(i)==v.get(i-1)+1)
            count++;
            else
                count=1;
            ans=Math.max(ans,count);
        }
        return ans+1;
    }
    public static void main(String [] dsaaa){
        int[] ar={1, 9, 3, 10, 4, 20, 2,};
        int n=ar.length;
        System.out.println("LCS is "+FindLCS(ar,n));
    }
}
