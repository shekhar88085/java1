package oops.Abstraction;

public class RepairShop {
    public static void repairCar(car car){
        System.out.println("car is repaired");
    }
    public static void main(String[] s){
        wagonor w=new wagonor();
        audi a=new audi();
        repairCar(a);
        repairCar(w);
        a.accelerate();
        w.accelerate();
    }
}
