package oops.packages;

import oops.packages.models.Students;
import oops.packages.models.Teacher;

import java.util.Scanner;

public class MainClass {
    public static void main(String [] dsf){
        Students obj=new Students("shekhar");
        System.out.println(obj.getName());
        Teacher teacher=new Teacher();
       // System.out.println(obj.getPassword());
        //we cannot access password bcoz it is private method in stsudent class
    }
}
