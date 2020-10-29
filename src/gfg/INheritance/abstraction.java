package gfg.INheritance;
abstract class shape{
    String color;
    abstract double area();
    public abstract String toString();
    public shape(String color){
        System.out.println("shape constructor call");
        this.color=color;
    }
    public String getColor(){
    return color;
    }
}
class circle extends shape{
    double radius;
    public circle(String color,double radius){
        super(color);
        System.out.println("circle sontructor call");
        this.radius=radius;
    }
    double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public String toString(){
        return "Circle color is "+super.color+" and radius is "+radius+" and " +
                "area is "+area();
    }
}
class rectangle extends shape{
    double l,b;
    public rectangle(String  color,double l,double b){
        super(color);
        this.b=b;
        this.l=l;
        System.out.println("rectangle contructor");
    }
    double area(){
        return l*b;
    }
    public String toString(){
        return "Reactange color is "+super.color+" length is "+l+" breadth is" +
                " "+b+" and area is "+area();
    }
}
public class abstraction {
    public static void main(String [] s){
    shape s1=new circle("red",34);
    shape s2=new rectangle("blue",45,75);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
