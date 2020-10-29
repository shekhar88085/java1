package Class.Box;
class Box{
    double width,lenght,height;
    void volume(){
        System.out.println("The volume of the box is");
        System.out.println(height*lenght*width);
    }
    void setDimen(double h,double l,double w){
        height=h;
        width=w;
        lenght=l;
    }
    Box(double w,double l,double h){
        width=w;
        lenght=l;
        height=h;
    }
}
public class BoxDemo {
    public static void main(String[] c){
        Box Box1=new Box(1233.444,34343.344,3434);
        Box1.volume();
//        Box newbox=new Box();
//        newbox.height=11.2322;
//        newbox.lenght=232.2323;
//        newbox.width=223.32;
//        double vol=newbox.height*newbox.width*newbox.lenght;
//        System.out.println(vol);
//        newbox.volume();
//        newbox.setDimen(23213.123,232132,132323);
//        newbox.volume();
//        double vol1=newbox.height*newbox.width*newbox.lenght;
//        System.out.println(vol1);

    }
}
