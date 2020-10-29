package userInput;
import java.util.Scanner;
public class ScannerUserInput {
    public static void main(String[] f)
    {
        Scanner sc =new Scanner(System.in);
//        int x=sc.nextInt();
//        System.out.print(x);
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println("enter principal time and rate of interest");
        int principal=sc.nextInt();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        float simpleinterest=principal*time*rate/100;
        System.out.println("The simple interest is "+simpleinterest);
    }
}
