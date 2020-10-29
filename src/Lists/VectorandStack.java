package Lists;

import java.util.Stack;
import java.util.Vector;

public class VectorandStack {
    public static void main(String [] d){
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(8);
        System.out.println(stack);
        int popped=stack.pop();
        System.out.println("popped:"+popped);
        System.out.println(stack);
        System.out.println("peek:"+stack.peek());
    }
}
