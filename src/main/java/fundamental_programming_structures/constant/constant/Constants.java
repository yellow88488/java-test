package fundamental_programming_structures.constant.constant;

public class Constants {
    public static final double CM_PER_INCH = 2.54;//类常量

    public static void main(String[] args){
        //final double CM_PER_INCH = 2.54;//只能赋值一次，赋值之后不能更改，全大写
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
        + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }

    //常量类？？？？？？  https://www.cnblogs.com/lihaoyang/p/6913295.html
    //枚举？？？？？？
}
