import java.util.Arrays;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception{
        List<String> list = Arrays.asList("a","b","c","d");
        for(String s : list){       //before java8
            System.out.println(s);
        }
        list.stream().forEach(x -> System.out.println(x));//java8 lambda

        //注释方式一  单行注释
        /*注释方式二
          多行注释
        */
        /**
         * 注释方式三 文档注释
         （1）类注释。类注释用于说明整个类的功能、特性等，它应该放在所有的“import”语句之后，在class定义之前。
         这个规则也适用于接口（interface）注释。
         （2）方法注释。方法注释用来说明方法的定义，比如，方法的参数、返回值及说明方法的作用等。方法注释应该放在它所描述的方法定义前面。
         （3）属性注释。默认情况下，javadoc只对公有（public）属性和受保护属性（protected）产生文档——通常是静态常量。
         （4）包注释。类、方法、属性的注释都直接放到Java的源文件中，而对于包的注释，无法放到Java文件中去，只能通过在包对应的目录中添加一个package.html的文件来达到这个目的。当生成HTML文件时，package.html文件的<BODY>和</BODY>部分的内容将会被提取出来当做包的说明。关于包注释，后面还会有更进一步的解释。
         （5）概要注释。除了包注释外，还有一种类型的文档无法从Java源文件中提取，就是对所有类文件提供概要说明的文件。同样的，也可以为这类注释单独新建一个HTML文件，这个文件的名字为“overview.html”，它的<BODY>和</BODY>标记之间的内容都会被提取。
         ·@author：作者。
         ·@version：版本。
         ·@docroot：表示产生文档的根路径。
         ·@deprecated：不推荐使用的方法。
         ·@param：方法的参数类型。
         ·@return：方法的返回类型。
         ·@see：用于指定参考的内容。
         ·@exception：抛出的异常。
         ·@throws：抛出的异常，和exception同义
         */

    }
}