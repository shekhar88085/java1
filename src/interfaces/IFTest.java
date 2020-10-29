package interfaces;
interface IntStack{
    void push(int item);
    int pop();
}
class FixedStack implements IntStack{
    private int stck[];
    private int tos;
    //allocate and initialize stack
    FixedStack(int size){
        stck=new int[size];
        tos=-1;
    }
    //push
    public void push(int item){
        if(tos==stck.length-1){
            System.out.println("Stack is full");
        }else {
            stck[++tos]=item;
        }
    }
    //pop
    public int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
public class IFTest {
    public static void main(String[] x){
        FixedStack f1=new FixedStack(5);
        FixedStack f2=new FixedStack(8);
        for(int i=0;i<5;i++)f1.push(i*2);
        for(int j=0;j<8;j++)f2.push(j*4);
        System.out.println("Stack in f1");
        for(int i=0;i<5;i++)
            System.out.println(f1.pop());
        for(int j=0;j<8;j++)
            System.out.println(f2.pop());
    }
}
