package gfg.thiskeyword;

public class Test {
    int a;
    int b;
    Test(){
        this(7,8);
        System.out.println("default constructor");
    }
    Test(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("a="+a+"   b="+b);
    }
    public static void main(String [] d){
        Test t=new Test(2,3);
        t.display();
        Test tc=new Test();
        tc.display();
    }
}
