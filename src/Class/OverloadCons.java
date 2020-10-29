package Class;
class Boxes{
    double width,lenght,height;
    Boxes(){
        height=width=lenght=-1;
    }
    Boxes(double a){
        height=lenght=width=a;
    }
    Boxes(double a,double b,double c){
        height=a;width=b;lenght=c;
    }
    double volume(){
        return height*width*lenght;
    }
}
public class OverloadCons {
    public static void main(String[] sd){
        Boxes Box1=new Boxes();
        Boxes Box2=new Boxes(23.33);
        Boxes Box3=new Boxes(23,13,132);
        double vol;
        vol=Box1.volume();
        System.out.println("Volume with no parameters:"+vol);
        System.out.println("Volume with one parameter:"+Box2.volume());
        System.out.println("Volume with three parameter:"+Box3.volume());
    }
}
