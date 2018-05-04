package inheritance;

import java.util.Scanner;

public class EnumerationClasses {
    public static void main(String[] args){
        System.out.println(Size.SMALL);//SMALL
        System.out.println(Size.SMALL.toString());//SMALL 返回枚举常量名
        Size s = Size.SMALL;
        String s1 = Size.SMALL.toString();

        //toString的逆方法是静态方法valueOf
        Size s2 = Enum.valueOf(Size.class, "SMALL");//将s2设置成Size.SMALL

        Size[] values = Size.values();//返回包含全部枚举值的数组
        System.out.println(values.length);

        System.out.println(Size.MEDIUM.ordinal());//1   返回声明中枚举常量的位置，从0开始

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIU, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the _.");
        }




    }
}

//enum Size{SMALL,MEDIUM,LARGE,EXTRA_LARGE};
//比较两个枚举类型的值时，永远不用equals，直接用“==”

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String abbreviation;//缩写

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
}
