package inheritance;

import static java.lang.Class.forName;

public class Reflection {
    public static void main(String[] args){
        Employee e;
        e = new Employee("Lucy", 5000, 2002, 1, 1);
        Class clazz = e.getClass();
        System.out.println(clazz.getName() + " " + e.getName());//clazz.getName()获取类名

        //根据类名获得对应的Class对象
        String className = "java.util.Date";
        try {
            Class cl = forName(className);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        System.out.println(e.getClass() == Employee.class);//true

        try {
            Object o = e.getClass().newInstance();//创建e类型的实例
            System.out.println(o.getClass().getName());//inheritance.Employee
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }


    }
}
