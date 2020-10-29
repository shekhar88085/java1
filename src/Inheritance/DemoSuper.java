package Inheritance;
    class Box1{
        private double width,length,height;
        Box1(Box1 ob){
            width=ob.width;
            length=ob.length;
            height=ob.height;
        }
        Box1(){
            height=length=width=-1;
        }
        Box1(double a){
            height=length=width=a;
        }
        Box1(double h,double w,double l){
            height=h;
            length=l;
            width=w;
        }
        double volume(){
            return height*width*length;
        }
            }
    class BoxWeight1 extends Box1{
        double weight;
        BoxWeight1(BoxWeight1 ob){
            super(ob);
            weight=ob.weight;
        }
        BoxWeight1(double h,double w,double l,double we){
            super(h,w,l);
            weight=we;
        }
        BoxWeight1(){
            super();
            weight=-1;
        }
        BoxWeight1(double len,double w){
            super(len);
            weight=w;
        }
        BoxWeight1(double a){
            super(a);
            weight=a;
        }
    }
public class DemoSuper {
        public static void main(String[] j){
            BoxWeight1 b1=new BoxWeight1(1,2,3,4);
            System.out.println("volume:"+b1.volume());
            System.out.println("weight:"+b1.weight);
            BoxWeight1 b2=new BoxWeight1();
            System.out.println("volume:"+b2.volume());
            System.out.println("weight:"+b2.weight);
            BoxWeight1 b3=new BoxWeight1(23.33);
            System.out.println("volume:"+b3.volume());
            System.out.println("weight:"+b3.weight);
            BoxWeight1 b4=new BoxWeight1(122.22,232);
            System.out.println("volume:"+b4.volume());
            System.out.println("weight:"+b4.weight);
        }
}
