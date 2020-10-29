package gfg.staticuse;
class student{
    String name;
    int rollno;
    static String colgname;
    static int counter=0;
    public student(String name){
        this.name=name;
        this.rollno=setroll();
    }
    static int setroll(){
        counter++;
        return counter;
    }
    static void setcolgmane(String name){
        colgname=name;
    }
    void getstudentinfo(){
        System.out.println("name:"+this.name);
        System.out.println("rollno:"+this.rollno);
        System.out.println("college name:"+colgname);
    }
}
public class staticDemo {
    public static void main(String [] d){
    student.setcolgmane("IET lucknow");
    student s1=new student("Avinash");
    student s2=new student("Akash");
    s1.getstudentinfo();
    s2.getstudentinfo();
    }
}
