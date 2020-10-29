package Inheritance;

import java.nio.file.WatchEvent;

class Bx{
        private double width,height,lenght;
        Bx(Bx ob){
            height=ob.height;
            width=ob.width;
            lenght=ob.lenght;
        }
        Bx(){
            height=lenght=width=-1;
        }
        Bx(double h,double l,double w){
            height=h;width=w;lenght=l;
        }
        Bx(double a){
            height=lenght=width=a;
        }
        double volume(){
            return height*width*lenght;
        }
        void show(){
            System.out.println("volume:"+volume());
            System.out.println("dimension hlw:"+height+" "+lenght+" "+width);
        }
    }
    class Weigh extends Bx{
        double weight;
        Weigh(Weigh ob){
            super(ob);
            weight=ob.weight;
        }
        Weigh(){
            super();
            weight=-1;
        }
        Weigh(double a){
            super(a);
            weight=a;
        }
        Weigh(double h,double w,double l,double we){
            super(h,l,w);
            weight=we;
        }
        Weigh(double a, double we){
            super(a);
            weight=we;
        }
        void show(){
            super.show();
            System.out.println("weight:"+weight);
        }
    }
    class Ship extends Weigh{
        double cost;
        Ship(Ship ob){
            super(ob);
            cost=ob.cost;
        }
        Ship(){
            super();
            cost=-1;
        }
        Ship(double a){
            super(a);
            cost=-1;
        }
        Ship(double a,double b,double c){
            super(a,b);
            cost=c;
        }
        Ship(double h,double l,double w,double we,double c){
            super(h,l,w,we);
            cost=c;
        }
        void show(){
            super.show();
            System.out.println("cost:"+cost);
        }
    }
public class DemoShipment {
    public static void main(String[] sd){
        Ship s1=new Ship();
        Ship s2=new Ship(1);
        Ship s3=new Ship(1,2,3);
        Ship s4=new Ship(3,4,56,6,7);
        System.out.println("s1:");
        s1.show();
        System.out.println("s2:");
        s2.show();
        System.out.println("s3:");
        s3.show();
        System.out.println("s4:");
        s4.show();
    }
}
//yeah i did it hureeeeaaaahhhh!!!!!!!!
