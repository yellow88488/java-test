package fundamental_programming_structures.constant.bignumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args){
        BigInteger bigInteger =BigInteger.valueOf(100);//任意精度的整数运算
        BigDecimal bigDecimal = BigDecimal.valueOf(100.0D);//任意精度的浮点数运算

        BigInteger bigInteger1 = bigInteger.add(BigInteger.valueOf(20));//加
        System.out.println(bigInteger1);
        BigInteger bigInteger2 = bigInteger.subtract(BigInteger.valueOf(20));//减
        System.out.println(bigInteger2);
        BigInteger bigInteger3 = bigInteger.multiply(BigInteger.valueOf(20));//乘
        System.out.println(bigInteger3);
        BigInteger bigInteger4 = bigInteger.divide(BigInteger.valueOf(20));//除
        System.out.println(bigInteger4);

    }
}
