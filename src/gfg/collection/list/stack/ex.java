package gfg.collection.list.stack;

import java.util.Stack;

public class ex {
    public static void main(String [] sdd){
        Stack<Integer> st=new Stack<>();
        st.push(2);
        System.out.println(st);
        st.push(4);
        st.push(7);
        st.pop();
        System.out.println(st);
        st.empty();
        System.out.println(st);

    }
}
