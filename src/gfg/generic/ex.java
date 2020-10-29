package gfg.generic;
class test<T>{
    T obj;
    test(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}
class multest<T,U>{
    T obj1;
    U obj2;
    multest(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class ex {
    public static void main(String [] fg){
        test<Integer> i = new test<Integer>(5);
        System.out.println(i.getObject());
        test<String> stringtest = new test<>("shekhar");
        System.out.println(stringtest.getObject());
        //multiple generics
        multest<Float,String> fs = new multest<>(23.34f,"Vishwakarma");
        fs.print();
    }
}
