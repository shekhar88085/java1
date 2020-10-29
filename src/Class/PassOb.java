package Class;
class Tst{
    int a,b;
    Tst(int i,int j){
        a=i;b=j;
    }
    boolean equals(Tst o){
        if(o.a==a&&o.b==b)return true;
        else return false;
    }
}
public class PassOb {
    public  static  void main(String[] sd){
        Tst test1=new Tst(3,4);
        Tst test2=new Tst(3,4);
        Tst test3=new Tst(5,4);
        System.out.println("test1=test1:"+test1.equals(test1));
        System.out.println("test1=test2:"+test1.equals(test2));
        System.out.println("test2=test3:"+test2.equals(test3));
    }
}
