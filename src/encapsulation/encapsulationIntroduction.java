package encapsulation;

public class encapsulationIntroduction {
    public static void main(String [] df){
        Student s1=new Student();
        s1.setAge(25);
        System.out.println(s1.getAge());
        s1.setAge(13);
        System.out.println(s1.getAge());
        //s1.name="Shekhar";
    }
}
