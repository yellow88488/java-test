package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList和LinkedList的大致区别如下:
 1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。
 2.对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。
 3.对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据。
 */
public class ListTest {
    static final int N = 50000;
    static long timeList(List list){
        long start = System.currentTimeMillis();
        Object o = new Object();
        for(int i=0; i<N; i++){
            list.add(0, o);
        }
        return System.currentTimeMillis() - start;
    }

    static long readList(List list){
        long start = System.currentTimeMillis();
        for(int i = 0, j = list.size(); i < j; i++){

        }
        return System.currentTimeMillis() - start;
    }

    static List addList(List list){
        Object o = new Object();
        for(int i = 0; i < N; i++){
            list.add(0, o);
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println("ArrayList添加" + N + "条耗时：" + timeList(new ArrayList()));
        System.out.println("LinkedList添加"+N+"条耗时："+timeList(new LinkedList()));

        List list1=addList(new ArrayList<>());
        List list2=addList(new LinkedList<>());
        System.out.println("ArrayList查找"+N+"条耗时："+readList(list1));
        System.out.println("LinkedList查找"+N+"条耗时："+timeList(list2));

        //算法
        Collections.sort(list1);//排序
        Collections.shuffle(list2);//乱序
        Collections.binarySearch(list1, "1");//二分法查找
        Collections.max(list1);//最大值
        Collections.swap(list1,0,1);//交还位置
        Collections.reverse(list1);//逆序
        Collections.rotate(list1,2);//偏移2个单位
        int num = Collections.frequency(list1, new Object());//返回与o相同元素的个数
        Collections.disjoint(list1,list2);//如果两个集合没有共同的元素，则返回true
    }
/*
 ArrayList添加50000条耗时：162
 LinkedList添加50000条耗时：5
 ArrayList查找50000条耗时：1
 LinkedList查找50000条耗时：2
 */
/*
ArrayList更适合读取数据，linkedList更适合添加或删除数据。

ArrayList内部是使用可増长数组实现的，所以是用get和set方法是花费常数时间的，但是如果插入元素和删除元素，除非插入和删除的位置都在表末尾，否则代码开销会很大，因为里面需要数组的移动。
LinkedList是使用双链表实现的，所以get会非常消耗资源，除非位置离头部很近。但是插入和删除元素花费常数时间。
 */

}
