package Algorithms.Foundation;

import java.util.Scanner;

public class CountDigits<count> {
    System.out.print("Enter number");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    while(num>1){
        num=num/10;
        count++;
    }
    System.out.println(count);
}