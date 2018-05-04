package objects_and_classess;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for(Employee e : staff){
            e.raiseSalary(5);//e是隐式参数，5是显示参数
        }

        for(Employee e: staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}

//在一个源文件中，只能有一个公有类，但是可以有任意数目的非公有类
class Employee{
    private String name;//private确保封装性
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {//构造器与类名相同，伴随new操作符的执行被调用
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Employee other){
        return name.equals(other.name);//访问所属类的所有对象的私有数据
    }
}