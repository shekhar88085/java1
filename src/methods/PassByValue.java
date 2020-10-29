package methods;

public class PassByValue {
    public static void main(String[] ed){
//        int a=9;
//        int b=8;
//        swap(a,b);
//        System.out.println("a="+a+" b="+b);
//        Dog c =new Dog();
//        Dog d=new Dog();
//        c.legs=3;
//        d.legs=4;
//        System.out.println("c="+c+" d="+d);
//        swap(c,d);
//        System.out.println("c="+c+" d="+d);
//        swap(c,d);
        Dog a=new Dog();
        a.legs=6;
        changeDog(a);
        System.out.println(a.legs);

    }
   static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void swap(Dog a,Dog b){
        Dog temp=a;
        a=b;
        b=temp;
    }
    static void changeDog(Dog dog){
        dog.legs=9;
    }
}
class Dog{
    int legs;
}