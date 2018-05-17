package collections;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map主要用于存储健值对，根据键得到值，因此不允许键重复（重复了覆盖了），但允许值重复。
 */
public class MapTest {
    /**
     * HashMap 是一个最常用的Map，它根据键的HashCode 值存储数据，根据键可以直接获取它的值，具有很快的访问速度。遍历时，取得数据的顺序是完全随机的。
     　　HashMap最多只允许一条记录的键为Null；允许多条记录的值为 Null。
     　　HashMap不支持线程的同步（即任一时刻可以有多个线程同时写HashMap），可能会导致数据的不一致。如果需要同步，可以用 Collections的synchronizedMap方法使HashMap具有同步的能力，或者使用ConcurrentHashMap。
     　　Hashtable与 HashMap类似，它继承自Dictionary类。不同的是：它不允许记录的键或者值为空；它支持线程的同步（即任一时刻只有一个线程能写Hashtable），因此也导致了 Hashtable在写入时会比较慢。
     */
    static Map<Integer, String> map1 = new HashMap<Integer, String>();
    /**
     * LinkedHashMap保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的。也可以在构造时带参数，按照应用次数排序。
     在遍历的时候会比HashMap慢，不过有种情况例外：当HashMap容量很大，实际数据较少时，遍历起来可能会比LinkedHashMap慢。因为LinkedHashMap的遍历速度只和实际数据有关，和容量无关，而HashMap的遍历速度和他的容量有关。
     */
    static Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
    /**
     * TreeMap实现SortMap接口，能够把它保存的记录根据键排序。
     　　默认是按键值的升序排序，也可以指定排序的比较器，当用Iterator 遍历TreeMap时，得到的记录是排过序的。
     */
    static Map<Integer, String> map3 = new TreeMap<Integer, String>();

    public static void main(String[] args){
        System.out.println("##########map1##########");
        map1.put(22,"b");
        map1.put(33,"c");
        map1.put(11,"a");
        map1.put(44,"d");
        map1.put(11,"aa");//覆盖上一次赋值
        for(int i = 0; i<3; i++){//输出无顺序
            map1.forEach((k, v) -> System.out.println("key:value = " + k + ":" + v));//java8
        }

        System.out.println("##########map2##########");
        map2.put(22,"b");
        map2.put(33,"c");
        map2.put(11,"a");
        map2.put(44,"d");
        map2.put(11,"aa");//覆盖上一次赋值
        map2.forEach((k, v) -> System.out.println("key:value = " + k + ":" + v));//java8 输出按插入顺序

        System.out.println("##########map3##########");
        map3.put(22,"b");
        map3.put(33,"c");
        map3.put(11,"a");
        map3.put(44,"d");
        map3.put(11,"aa");//覆盖上一次赋值，但是顺序按第一次赋值的顺序
        map3.forEach((k, v) -> System.out.println("key:value = " + k + ":" + v));//java8 输出按key的顺序

    }

}
