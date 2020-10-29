package conditionalStatement;

import java.util.Scanner;

public class Rating {
    public static void main(String[] fv){
        int rating;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ratings(1-5)");
        //sc.nextLine();
        rating=sc.nextInt();
        switch (rating){
            case 1: case 2:
                System.out.println("Good");
            case 3:
                System.out.println("Average");
            case 4: case 5:
                System.out.println("Excellent");
        }
    }
}
