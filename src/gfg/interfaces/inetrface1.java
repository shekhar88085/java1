package gfg.interfaces;
interface A{
   void  studentname();
}
interface  B{
    void studentcollege();
}
interface  C extends A,B{
    void studentaddress();
}
public class inetrface1 implements C{
    @Override
    public void studentcollege() {
        System.out.println("IET Lucknow");
    }

    @Override
    public void studentname() {
        System.out.println("Chandra shekhar");
    }

    @Override
    public void studentaddress() {
        System.out.println("Kanpur");
    }

    public static void main(String []sd){
        inetrface1 i=new inetrface1();
        i.studentcollege();
        i.studentname();
        i.studentaddress();
    }
}
