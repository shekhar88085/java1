package oops;
import oops.A.B;
import  oops.A.C;
public class staticKeyword {
    static {
        System.out.println("in block 1");
    }
    static {
        System.out.println("In block 2");
    }
    public static void main(String[] d){
        System.out.println(Math.ceil(45.567));
        A objA=new A();
        B objB=objA.new B();
        C objC=new A.C();
        System.out.println("In main");
    } static {
        System.out.println("Outside main");
    }
}
