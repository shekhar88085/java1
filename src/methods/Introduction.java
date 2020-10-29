package methods;

public class Introduction {
    public  static void main(String [] sd){
        int first=10;
        int second=20;
        int result=maxOf(10,20);
        System.out.println(result);
        sayhi();
    }
   static int maxOf(int a,int b){
  //      if(a>b)
    //    return a;
      //  else return b;
        return a>b?a:b;
    }
    static void sayhi(){
        System.out.println("Hiiiiiiiiiiiiiii........!!!!!!!!");
    }
}
