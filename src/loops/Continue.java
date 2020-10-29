package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] d){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
