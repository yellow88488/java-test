package collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {//栈，后进先出
    static void showPush(Stack<Integer> st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack:" + st);
    }

    static void showPop(Stack<Integer> st){
        System.out.println("pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack:" + st);
    }

    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack:" + st);
        showPush(st, 42);
        showPush(st, 66);
        showPush(st, 99);
        showPop(st);
        showPop(st);
        showPop(st);
        try{
            showPop(st);
        } catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }
}
