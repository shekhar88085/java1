package Class;
    class Outer{
        int outer_x=133;
        class Inner{
            int y=10;
            void dispy(){
                System.out.println(y);
            }
            void display(){
                System.out.println("Value of Outer_x "+outer_x);
            }
        }
        void test(){
            Inner inner=new Inner();
            inner.display();
            inner.dispy();
        }
    }
public class IneerClassDemo {
        public static void main(String [] sd){
            Outer outer=new Outer();
            outer.test();
        }
}
