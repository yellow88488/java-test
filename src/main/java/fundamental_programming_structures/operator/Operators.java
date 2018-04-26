package fundamental_programming_structures.operator;

public class Operators {
    public static void main(String[] args){
        //+-*/% 加减乘除取模
        int x = 1;
        x += 4;//等价于 x = x + 4;
        System.out.println(x);

        //自增，自减运算符
        int m = 7;
        int n = 7;
        int a = 2 * ++m;//16 先自增，再计算
        int b = 2 * n++;//14 先计算，再自增
        System.out.println(a);
        System.out.println(b);

        //关系运算
        //== != < > <= >=
        //逻辑运算符 &&表示逻辑“与”，||表示逻辑“或”，按照“短路”方式求值，当第一个能确定值，第二个不计算
        //三元运算符?:  condition?expression1:expression2,condition为true执行表达式1，否则执行表达式2

        //位运算符
        //&（“与”）、|（“或”）、^（“异或”）、~（“非”）
        //>>和<< 将二进制位进行右移或左移操作

        //数学函数
        double d = 4;
        double y1 = Math.sqrt(d);//求平方根  若引入import static java.lang.Math.*; 则代码中不需要写Math.
        System.out.println(y1);//2.0
        double y2 = Math.pow(d, 3);//求d的3次幂
        System.out.println(y2);//64.0
        System.out.println(Math.PI);//3.141592653589793
        System.out.println(Math.E);//2.718281828459045

        //数据类型转换
        double dx = 9.999;
        int ix = (int) dx;
        System.out.println(ix);//9 截断取整
        System.out.println(Math.round(dx));//10 舍入运算
        double dx2 = -9.99;
        int ix2 = (int) dx2;
        System.out.println(ix2);//-9 截断取整
        System.out.println(Math.round(dx2));//-10 舍入运算

        //括号与运算符级别
        //a && b || c  等价于 (a && b) || c
        //a += b += c 等价于 a += (b += c) 右结合





    }
}
