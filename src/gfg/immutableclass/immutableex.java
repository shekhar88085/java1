package gfg.immutableclass;
final class immutable{
   private final int x,y;
    immutable(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    int product(){
        return x*y;
    }
}
public class immutableex {
    public static void main(String [] d){
        immutable im=new immutable(2,3);
        System.out.println("x:"+im.getX());
        System.out.println("y:"+im.getY());
        System.out.println(im.product());
    }
}
