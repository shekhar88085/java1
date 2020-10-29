package Inheritance;
    class a{
        int i;
    }
    class b extends  a{
        int i;
        b(int aa,int bb){
            super.i=aa;
            i=bb;
        }
        void show(){
            System.out.println("super var:"+super.i);
            System.out.println("sub var:"+i);
        }
    }
public class UseSuper {
        public static void main(String[] sc){
            a A=new a();
            b B=new b(2,3);
            B.show();
        }
}
