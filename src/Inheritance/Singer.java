package Inheritance;

public class Singer extends Person{
    public void sing(){
        System.out.println("Singer is singing");
    }
    public void walk(){
        System.out.println("Singer "+name+" is Walking");
    }
    public void eat(){
        System.out.println("Singer "+name+" is Eating");
    }
    public static void laughing(){
        System.out.println("Singer is laughing");
    }
}
