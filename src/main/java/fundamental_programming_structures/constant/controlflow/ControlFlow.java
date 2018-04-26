package fundamental_programming_structures.constant.controlflow;

public class ControlFlow {
    public static void main(String[] args){
        //条件语句
        int age = 19;
        if(age >= 18){
            System.out.println("You can enter");
        }else if(age >= 16 ){
            System.out.println("You can enter with parent");
        }else{
            System.out.println("You can't enter");
        }

        //循环
        boolean condition = false;
        while(condition){
            System.out.println("Enter");//不执行
        }

        do{
            System.out.println("Enter2");//执行
        }while(condition);
        /*
        while循环语句先检测循环条件，循环体有可能不执行
        do/while循环语句先执行循环体，后检测条件，循环体至少执行一次
         */

        //确定循环
        for(int i = 10; i > 0; i--){
            System.out.println("Counting down..." + i);
        }
        //for each 循环

        //多重选择
        int choice = 2;
        switch(choice){
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            case 3:
                System.out.println("This is 3");
                break;
            case 4:
                System.out.println("This is 4");
                break;
           default:
                System.out.println("This is not 1,2,3,4");
                break;
        }
        //如果case分支语句末尾没有break语句，则有可能触发多个case分支。不建议使用switch语句

        //中断控制流程语句
        //break
        //带标签的break
        //continue  越过当前循环体的剩余部分
        //带标签的continue
        //全部不建议使用
    }
}
