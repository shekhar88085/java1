package arrays;

import java.util.Scanner;

public class AverageMarks {
    public  static void main(String[] d){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many students in ur class?");
        int n=sc.nextInt();
        int sum=0;
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
             marks[i]=sc.nextInt();
             sum=sum+marks[i];
        }
        double av=sum/n;
        System.out.println(av);
    }
}
