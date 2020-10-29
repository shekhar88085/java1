package Class;
 class varargs{
     static void fun(int...a) {
         System.out.println("length of arguments:" + a.length);

         for (int i : a)
             System.out.print(i + " ");
         System.out.println();
     }
 }
public class Varags {
     public static void main(String[] d){
         varargs.fun();
         varargs.fun(12333);
         varargs.fun(1,2,3,4,4,5,5,6);
     }
}
