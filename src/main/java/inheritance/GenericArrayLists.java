package inheritance;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayLists {
    public static void main(String[] args){
        ArrayList<Employee> staff = new ArrayList<Employee>(100);
        System.out.println(staff.size());//0
        staff.ensureCapacity(1000);
        System.out.println(staff.size());//0
        staff.add(new Employee("Harry", 1000, 2001, 1, 4));
        staff.add(new Employee("Bob", 2000, 1999, 2, 4));
        System.out.println(staff.size());//2
        staff.trimToSize();
        System.out.println(staff.size());//2

        //ArrayList<int> list = new ArrayList<int>();尖括号中必须是类，不能是基本数据类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        //自动拆箱，自动装箱
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);//false 判断地址
        System.out.println(a.equals(b));//true
        Integer c = 100;
        Integer d = 100;
        System.out.println(c == d);//true 介于-128~127之间的short和int被自动拆箱


        double m = max(3.1, 40.4, -5);//编译器将new double[]{3.1,40.4,-5}传递给max方法


    }

    public static double max(double... values){
        double largest = Double.MIN_VALUE;
        for(double v : values){
            if(v > largest){
                largest = v;
            }
        }
        return largest;
    }
}
