package Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex {
    public static void main(String [] d){
        Scanner sc=new Scanner(System.in);
        char gender=sc.next().charAt(0);
        System.out.println(gender);
        double n=123.4563;
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.println(df.format(n));
    }
}
