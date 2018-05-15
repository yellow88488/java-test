package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        String s = "abc";
        list.add(s);
        list.add(s);
        System.out.println(list.get(0)==list.get(1));//true
        System.out.println(list.size());//2
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        it.remove();
        System.out.println(it.next());
        System.out.println(list.size());





    }
}
