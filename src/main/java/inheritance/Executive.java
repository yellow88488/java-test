package inheritance;

final class Executive extends Manager {//final修饰类，则该类不可被继承
    String name;
    public final String getName(){//final方法，子类不能覆盖这个方法，final类中的所有方法自动成为final方法
        return name;
    }
}
