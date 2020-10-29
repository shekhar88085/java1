package Inheritance;
class A{
    int i,j;
    void showij(){
        System.out.println("i:"+i+" j:"+j);
    }
}
class B extends  A{
    int k;
    void showk(){
        System.out.println("k:"+k);
    }
    void sum(){
        System.out.println(i+j+k);
    }
}
public class SimpleINheritance {
    public static void main(String[] dsf){
        A supob= new A();
        B subob= new B();
        System.out.println("super object:");
        supob.i=4;
        supob.j=9;
        supob.showij();
        System.out.println("sub object");
        subob.i=1;
        subob.j=2;
        subob.k=3;
        subob.showk();
        subob.showij();
        subob.equals(supob);
        subob.sum();
    }
}
