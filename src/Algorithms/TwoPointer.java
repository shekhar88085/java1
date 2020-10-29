package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    public static void main (String []hj){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number u wnt to enter in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter number in array:-");
        int i=0;
        for (int io:arr){
            arr[i]=sc.nextInt();
            i++;
        }
        i=0;
        Arrays.sort(arr);
        for (int io:arr){
            System.out.println(arr[i]);
            i++;
        }
        System.out.println(findTriplets(arr,n));
    }
   static public boolean findTriplets(int ar[],int n){
        for (int i=0;i<n-2;i++){
            if(twoSum(ar,-ar[i],i+1))return true;
        }
        return false;
    }
   static public boolean twoSum(int a[],int x,int i){
        int j=a.length-1;
        while (i<j){
            if(a[i]+a[j]>x)j--;
            else if (a[i]+a[j]<x)i++;
            else return true;
        }
        return false;
    }
}
