package interfaces;
interface Callback{
    void callback(int param);
}
class Client implements Callback{
    public void callback(int p){
        System.out.println("Callback called with "+p);
    }
    void noniterfacemeth(){
        System.out.println("classes that implement interface"+"may also define other memebers,too");
    }
}
public class inter {
    public static void main(String [] s){
        Callback c=new Client();
        c.callback(42);
        Client se=new Client();
        se.noniterfacemeth();
    }
}
