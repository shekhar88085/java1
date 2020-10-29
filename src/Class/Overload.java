package Class;
class OverloadDemo{
    void test(){
        System.out.println("without paramenter");
    }
    void test(int a){
        System.out.println("With one parameter :"+a);
    }
    void test(int a,int b){
        System.out.println("With two parameter "+a+" and "+b);
    }
    double test(double a){
        System.out.println("Area:"+a);
        System.out.println("Cube :"+a*a*a);
        return 0;
    }
}
public class Overload {
    public static void main(String[] sd){
        OverloadDemo ob=new OverloadDemo();
        ob.test();
        ob.test(3);
        ob.test(23,323);
        ob.test(13123.323213);
    }
}
