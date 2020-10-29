package Class;
class d{
    static final int i=9;
    static int j;

    static {
        System.out.println("Static block initialized");
        j=i*5;
    }
    static void m(){
        System.out.println("from class d");
    }
}
public class Static {
    public static void main(String [] df){
        System.out.println("from main");
        //System.out.println(i);
        d.m();
        System.out.println(d.i);
    }
}
