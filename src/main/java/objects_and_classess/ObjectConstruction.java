package objects_and_classess;

public class ObjectConstruction {
    static{
        System.out.println("Hello,World");
        System.exit(0);
    }
    public int indexOf(int x){return x * 2;};
    public int indexOf(int x, int y){return x * y;};//重载
    //public double indexOf(int x){return x * 3;}//方法签名不包括返回值类型

    //Employee e = new Employee();//存在一个构造器，则不写参数视为不合法


}

class Employee1{
    private static int nextId;

    private int id;
    private String name;
    private double salary;

    {//初始化块，无论调用哪个构造器，都会执行这段代码
        id = nextId;
        nextId++;
    }

    public Employee1(String n, double s){
        name = n;
        salary = s;
    }

    public Employee1(){
        name = "";
        salary = 0;
    }
}
