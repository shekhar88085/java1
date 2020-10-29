package Class;
class Stack{
    int stck[]=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9){
            System.out.println("Stack overflow");
        }else
            stck[++tos]=item;
    }
    void pop(){
        if(tos<0){
            System.out.println("Stack Underflow");
          //  return 0;
        }
        else{
            System.out.println(stck[tos--]);
          //  return stck[tos--];
        }
    }
        }
public class TestStack {
    public static void main(String[] sd){
        Stack mystack1=new Stack();
        Stack mystack2=new Stack();
        for (int i=0;i<10;i++)mystack1.push(i);
        for (int i=10;i<20;i++)mystack2.push(i);
        System.out.println("Stack 1:");
        for (int i=0;i<10;i++)mystack1.pop();
        System.out.println("Stack 2:");
        for(int i=0;i<10;i++)mystack2.pop();
    }
}
