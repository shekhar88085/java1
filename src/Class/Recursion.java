package Class;
 class Factorial{
     int i;
     int Factorial(int n){
         int result;
         if(n==1){
             return  1;
         }else{
             result=Factorial(n-1)*n;
         }
         //System.out.println(result);
         return result;

     }
 }
public class Recursion {
     public static void main(String[] d){
         Factorial Factorial1=new Factorial();
        int res= Factorial1.Factorial(5);
         System.out.println(res);
     }
}
