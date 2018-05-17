package collections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    // HashSet不保证集合的迭代顺序；也许在某些时间迭代的顺序与插入顺序一致，但是不保证该顺序恒久不变。
    static Set<Integer> set1 = new HashSet<Integer>();
    // LinkedHashSet按照元素插入的顺序进行迭代，LinkedHashSet不是线程安全的。
    static Set<Integer> set2 = new LinkedHashSet<Integer>();
    // TreeSet 实现了排序的Set
    static Set<Integer> set3 = new TreeSet<Integer>();

    public static void main(String[] args){
        System.out.println("##########set1##########");
        set1.add(22);
        set1.add(33);
        set1.add(11);
        set1.add(44);
        set1.forEach(k -> System.out.println(k));// 乱序

        System.out.println("##########set2##########");
        set2.add(22);
        set2.add(33);
        set2.add(11);
        set2.add(44);
        set2.forEach(k -> System.out.println(k));// 插入顺序

        System.out.println("##########set3##########");
        set3.add(22);
        set3.add(33);
        set3.add(11);
        set3.add(44);
        set3.forEach(k -> System.out.println(k));// value顺序


    }

}
