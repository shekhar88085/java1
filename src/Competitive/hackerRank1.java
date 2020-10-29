package Competitive;

import java.util.Scanner;

public class hackerRank1 {
    public static void main(String [] d){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many numbers u want to enter in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements to array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(H1(arr));
    }
    public static int H1(int ar[]){
        int n=ar.length;
        int sum=0;
        int m=1;

        for (int i=0;i<n;i++) {
           // for (int j = 2; j < n - 1; j++) {

                // if ((i+1)>n)break;
                if (ar[i] < ar[i+1]) {
                    m++;
                } else {
                    m = 1;
                }
                if(i==n-2){
                    sum=sum+m;
                }
             System.out.println("sum ="+sum);System.out.println("m="+m);
            sum = sum + m;
            }
       // }
        return sum;
    }
}
