package Inheritance;

public class MainClass {
    public static void main(String[] d){
        Teacher t=new Teacher();
//        t.name="Mrs. Lata Chaudhary";
//        t.eat();
//        t.walk();
//        t.teach();
//        Singer s=new Singer();
//        s.name="K";
//        s.sing();
//        s.eat();
//        s.walk();
        Person p=t;//upcasting
       boolean yo=t instanceof Teacher;
        System.out.println(yo);
        yo=p instanceof Person;
        System.out.println(yo);
        Teacher t2=new Teacher();
        t2.name="Akash";
        t2.eat();
    }
}
