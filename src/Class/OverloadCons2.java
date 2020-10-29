package Class;
class Boxes2{
    double width,lenght,height;
    Boxes2(){
        height=width=lenght=-1;
    }
    Boxes2(double a){
        height=lenght=width=a;
    }
    Boxes2(double a,double b,double c){
        height=a;width=b;lenght=c;
    }
    double volume(){
        return height*width*lenght;
    }
    Boxes2(Boxes2 ob){
        height=ob.height;
        width=ob.width;
        lenght=ob.lenght;
    }
}
public class OverloadCons2 {
    public static void main(String[] sd){
        Boxes2 Box1=new Boxes2();
        Boxes2 Box2=new Boxes2(23.33);
        Boxes2 Box3=new Boxes2(23,13,132);
        double vol;
        Boxes2 myclone=new Boxes2(Box1);

        vol=Box1.volume();
        System.out.println("without parameter clone:"+myclone.volume());
        System.out.println("Volume with no parameters:"+vol);
        System.out.println("Volume with one parameter:"+Box2.volume());
        System.out.println("Volume with three parameter:"+Box3.volume());
    }
}
