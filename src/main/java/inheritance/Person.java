package inheritance;

abstract  public class Person {//抽象类不能被实例化
    private String name;
    public Person(String n){
        name = n;
    }

    public abstract String getDescription();

    public String getName(){
        return name;
    }

}
