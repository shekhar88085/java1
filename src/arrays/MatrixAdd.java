package arrays;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] sdf){
        int rows,cols;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter matrix rows and columns");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];
        System.out.println("Enter numbers in first matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter numbers in second matrix");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The First array is-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("  ");
                //System.out.println("The adiition of two matrix is ---");
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("The second array is-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("  ");
                //System.out.println("The adiition of two matrix is ---");
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        System.out.println("The sum of the arrays is-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("  ");
                //System.out.println("The adiition of two matrix is ---");
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
