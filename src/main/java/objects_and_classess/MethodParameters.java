package objects_and_classess;

/**
 * Java程序设计语言总是采用按值调用，方法得到的是所有参数值的一个拷贝，方法不能修改传递给它的任何参数变量的内容
 * 方法参数有两种类型：1、基本数据类型；2、对象引用
 */
public class MethodParameters {
    public static void tripleValue(double x){
        x = 3 * x;
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(100);
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args){
        double percent = 10;
        tripleValue(10);
        System.out.println(percent);//10.0
        Employee harry = new Employee("harry",2500, 2018, 4, 1);
        tripleSalary(harry);
        System.out.println(harry.getSalary());//5000 方法得到的是对象引用的拷贝，对象引用及其他拷贝同时引用同一个对象

        Employee a = new Employee("Alice", 2000, 2018, 4, 1);
        Employee b = new Employee("Bob", 2500, 2018, 1, 3);
        swap(a,b);//交还的是拷贝，真正的a,b没有交换
        System.out.println(a.getName());//Alice
        System.out.println(b.getName());//Bob




    }






}
