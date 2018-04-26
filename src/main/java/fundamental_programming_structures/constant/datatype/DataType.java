package fundamental_programming_structures.constant.datatype;

public class DataType {
    public static void main(String[] args) throws Exception{
        //8 primitive type 8种基本类型
        //4种整形
        int a = 2147483647;               //4字节， -2147483648~2147483647（正好超过20亿）
        short b = 32767;                  //2字节， -31768~32767
        long c = 9223372036854775807L;    //8字节，-9223372036854775808~9223372036854775807 注意数字后面加上字母L
        byte d = 127;                     //1字节， -128~127

        int d16 = 0x123F;//十六进制表示法，加前缀0x， 0~9和字母A到F
        int d8 = 01237;  //八进制表示法，  加前缀0, 0~7
        int d2 = 0b0110; //二进制表示法，  加前缀0b,

        System.out.println(Integer.toHexString(a));//十进制转成十六进制
        System.out.println(Integer.toOctalString(a));//十进制转成八进制
        System.out.println(Integer.toBinaryString(a));//十进制转成二进制
        System.out.println(Integer.valueOf("FFFF",16));//radix位进制转为十进制
        System.out.println(Integer.parseInt("FFFF",16));//radix位进制转为十进制
        System.out.println(1.0/0);//Infinity  正无穷大
        System.out.println(-1.0/0);//-Infinity  负无穷大
        System.out.println(0.0/0);//NaN  不是一个数字
        double x = 0.0/0;
        System.out.println(x == Double.NaN);//false  所有NaN都是不同的
        System.out.println(Double.isNaN(x));//true
        //2种浮点类型
        float e = 3.14F;//单精度浮点类型，4字节，有效位数6~7位
        double f = 3.14D;//双精度浮点类型，8字节，有效位数15位，小数后不写字母F或D，默认为D
        System.out.println(2.0-1.1);//结果为0.8999999999999999，浮点数值不适用禁止出现舍入误差的金融计算中，应使用BigDecimal类
        //1种用于表示Unicode编码的字符单元的字符类型
        char g = 'A';
        System.out.println('\u0022');//用\u0000表示Unicode代码单元的编码，范围从\u0000 到 \uffff
        System.out.println('\u2122');//™
        System.out.println('\u03C0');//π
        System.out.println(g=='A');//true  char类型判断是否相等
        System.out.println(Character.compare(g,'A')==0);//true  char类型判断是否相等
        String s1 = String.valueOf('A'); //效率最高的方法
        String s2 = String.valueOf(new char[]{'h','e','l','l','o'}); //将一个char数组转换成String
        System.out.println(s2);
        System.out.println(s2 instanceof String);//true判断是字符串
        System.out.println(String.class.isInstance(s2));//true与上个方法等价
        //1种用于表示真值的boolean类型
        boolean h = true;//布尔类型，true/false  布尔值与整型值不能转换

        //包装类（封装类）
        //Integer Short Long Byte Float Double Character Boolean在java.lang.下
        System.out.println(Integer.MIN_VALUE);//-2147483648
        int m = 100;
        Integer obj = m;//自动装箱
        int m1 = obj;//自动拆箱
        //jdk1.5后支持自动装箱与拆箱

        //枚举？？？？？？

    }
}
