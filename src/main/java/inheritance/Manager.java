package inheritance;

public class Manager extends Employee {//父类必须有无参数的构造器
    //Employee称为超类、基类、父类
    //Manager称为子类、派生类、孩子类
    private double bonus;

    public void setBonus(double b){
        bonus = b;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public Manager(String n, double s, int year, int month, int day){
        super(n, s, year, month, day);//必须出现在第一句
        bonus = 0;
    }

    public Manager(){

    }

    public static void main(String[] args){
        Manager boss = new Manager("Carl Cracker", 20000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println(boss.getName());
        System.out.println(boss.getSalary());

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tony", 4000, 1990, 3, 15);
        boss.setBonus(6000);//正确
        //staff[0].setBonus(3000);//错误，staff[0]看成是Employee对象
        //Manager m = staff[1];//不能将超类的引用赋给子类变量
        for(Employee e : staff){
            System.out.println(e.getName() + " " + e.getSalary());//e可以自动判断是Employee引用还是Manager引用，分别调用自身的getSalary方法
            //e可以指示多种实际类型的现象称为多态，在运行时自动选择调用哪个方法称为动态绑定
        }

        Employee e;
        e = new Employee("Jim", 6000, 2001, 3, 3);
        e = new Manager("Lily", 5600, 2000, 4, 4);
        //一个Employee变量既可以引用一个Employee类对象，也可以应用一个Employee类的任何一个子类的对象
        if(staff[1] instanceof Manager){//
            boss = (Manager) staff[1];
        }

    }


}
