package loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] dc){
        for(int i=0;i<100;i++){
            System.out.println("HEllo World!!!"+i+"");
        }
        System.out.println("multiple of two");
        for (int i=0;i<=100;i=i+2){
            System.out.println(i);
        }
        int tableof;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which u want to print table");
        tableof=sc.nextInt();
        for (int i=1;i<10;i++){
            System.out.println(i*tableof);
        }
    }
}
