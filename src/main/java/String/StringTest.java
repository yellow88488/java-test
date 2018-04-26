package String;

public class StringTest {
    public static void main(String[] args){
        String greeting = "Hello";
        String s = greeting.substring(0,3);//Hel  子串
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;//Expletivedeleted 拼接
        //任何java对象都可以转换成字符串

        //检查字符串相等
        System.out.println("hello".equals(greeting));//equals
        System.out.println("hello".equalsIgnoreCase(greeting));//不区分大小写

        String str = greeting;
        System.out.println(greeting==str);//true  ==判断存放在同一位置
        String str2 = "Hello";
        System.out.println(greeting==str2);//true
        System.out.println("Hello"==greeting);//true
        System.out.println("He"+"llo"==greeting);//true
        System.out.println("Hel"==s);//false 值相同，地址不同

        //StringBuffer  线程安全
        //StringBuilder   线程不安全
        StringBuilder sb = new StringBuilder();
        sb.append("abc").append("defg").toString();
        //运行速度快慢为：StringBuilder > StringBuffer > String
        //原因：String为字符串常量，而StringBuilder和StringBuffer均为字符串变量，即String对象一旦创建之后该对象是不可更改的，但后两者的对象是变量，是可以更改的。
        //在线程安全上，StringBuilder是线程不安全的，而StringBuffer是线程安全的
        //String：适用于少量的字符串操作的情况
        //StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况
        //StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况

        //格式化输出
        String name = "zhangsan";
        int age = 18;
        System.out.printf("Hello, %s.you age is %d",name,age);




    }
}
