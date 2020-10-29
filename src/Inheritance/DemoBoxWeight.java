package Inheritance;
 class Box{
     double width,
             lenght,height;
     Box(Box ob){
        width= ob.width;
        height=ob.height;
        lenght=ob.lenght;
     }
     Box(){
         height=width=lenght=-1;
     }
     Box(double a){
         height=width=lenght=a;
     }
     Box(double h,double l,double w){
         height=h;
         lenght=l;
         width=w;
     }
     double volume(){
         return height*width*lenght;
     }
 }
 class BoxWeight extends Box{
     double weight;
     BoxWeight(double h,double w,double l,double we){
         height=h;
         weight=we;
         width=w;
         lenght=l;
     }
 }
public class DemoBoxWeight {
     public static void main(String[] b){
         BoxWeight B1=new BoxWeight(1,2,3,4);
         double vol= B1.volume();
         System.out.println(vol);
         // clone of object B1
         Box b1=new Box(B1);
         //b1.notifyAll();
     }
}
