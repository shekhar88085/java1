package gfg.ClassesndObject;
class car{
    int no,model;
    car(int no,int model){
        this.no=no;
        this.model=model;
    }
    void print(){
        System.out.println("no= "+no+" model= "+model);
    }
}
class CarWrapper{car c;
CarWrapper(car c){
    this.c=c;
}
}
public class swapObjects {
    public static void swap(CarWrapper c1,CarWrapper c2){
    car temp=c1.c;
    c1.c=c2.c;
    c2.c=temp;
    }
    public static void main(String [] dsd){
        car c1=new car(2,100);
        car c2=new car(1,200);
        CarWrapper cw1=new CarWrapper(c1);
        CarWrapper cw2=new CarWrapper(c2);
        swap(cw1,cw2);
        System.out.println("c1 "+c1.no);
        System.out.println("c2 "+c2.no);
    }
}
