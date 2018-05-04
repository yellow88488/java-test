package objects_and_classess;

import java.text.NumberFormat;

public class StaticFieldsAndMethods {
    private static int count = 1;//静态域，属于类
    public int sum = 0;//实例域
    /**
     * 圆周率
     */
    public static final double PI = 3.1415926;//静态常量

    public static int getField(){//静态方法
        int a = count;//可以访问静态域
        //int b = sum;//不可以访问实例域
        return a;
    }




    public static void main(String[] args){
        double pi = StaticFieldsAndMethods.PI;//通过类名获取常量

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

    }
}
