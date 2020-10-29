package oops;

import org.jetbrains.annotations.Contract;

class vehicles{
    int wheels;
    int headlights;
    String color;
    vehicles(int wheels){
        this.wheels=wheels;
        headlights=2;
    }
    vehicles(int wheels,String color){
        this.wheels=wheels;
        this.color=color;
        headlights=2;
    }
}
public class constructor {
    constructor(){
        System.out.println("object is now created");
    }
    public static void main(String [] dd){
        constructor obj=new constructor();
        vehicles car=new vehicles(4);
        System.out.println(car.wheels);
        vehicles scooty=new vehicles(2);
        System.out.println(scooty.wheels);
        vehicles eRickshaw=new vehicles(3,"Yellow");
        System.out.println("wheels="+eRickshaw
        .wheels+" color="+eRickshaw.color);
    }
}
