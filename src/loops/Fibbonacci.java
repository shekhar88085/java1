package loops;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] df){
        int fibbo,f=0,j=0;
        System.out.println("Enter the range of fibbonacci");
        Scanner sc=new Scanner(System.in);
        fibbo=sc.nextInt();
        for(int i=1;i<=fibbo;i++){
            f=j+i;
            System.out.println(f);
            j=i;
        }
    }
}
