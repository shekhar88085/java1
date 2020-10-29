package Class;
class Motorcycle{
    String make;
    String color;
    boolean engineState;
    void startEngine(){
        if(engineState==true){
            System.out.println("The engine is already on");
        }else{
            engineState=true;
            System.out.println("The engine is now on");
        }
    }
    void showAtts(){
        System.out.println("This motorcyle is a "+color+" "+make);
        if(engineState==true){
            System.out.println("The engine is on");
        }else{
            System.out.println("The engine is off");
        }
    }
}
public class MotarcycleDemo {
    public static void main(String[] d){
        Motorcycle Bike=new Motorcycle();
        Bike.engineState=false;
        Bike.color="Black";
        Bike.make="YAMAHA RZ350";
        Bike.showAtts();
        Bike.startEngine();
    }
}
