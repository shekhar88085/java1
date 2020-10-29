package conditionalStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] d){
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur age");
        age=sc.nextInt();
        switch (age){
            case 0:case 1: case 2: case 3:case 4: case 5 : case 6: case 7: case 8: case 9: case 10:
                System.out.println("you r too young....!!!");
                break;
            case 11: case 12:case 13: case 14:case 15: case 16:case 17: case 18:
                System.out.println("you r teen still....!!!");
                break;
            default:
                System.out.println("You r adult now...!!!");
        }
    }
}
