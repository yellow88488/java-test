import java.util.Arrays;
import java.util.List;

public class Test{
    public static void main(String[] args) throws Exception{
        System.out.println("abc");
        System.out.println("def");
        System.out.println("ghi");
        System.out.println("jkl");

        List<String> list = Arrays.asList("a","b","c","d");
        for(String s : list){
            System.out.println(s);
        }
        list.stream().forEach(x -> System.out.println(x));//java8 lambda


    }
}