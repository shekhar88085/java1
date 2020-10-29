package Inheritance;

public class Teacher extends Person{
    public void teach(){
        System.out.println("Teacher is teaching");
    }
    public void eat(){
        super.eat();
        System.out.println("Teacher "+name+" is eating" );
    }
    public void walk(){
        System.out.println("Teacher "+name+" is Walking");
    }
    public static void laughing(){
        System.out.println("Teacher is laughing");
    }
}
