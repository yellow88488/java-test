package fundamental_programming_structures.constant.arraystest;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args){
        int[] aa;//数组声明
        int[] a = new int[100];//创建数组，创建后不能改变大小
        for(int i = 0; i<100; i++){
            a[i] = i;
        }
        //foreach循环
        for(int element : a){
            System.out.println(element);
        }
        System.out.println(Arrays.toString(a));

        //初始化以及匿名数组
        int[] smallPrimes = {2, 3, 5, 7, 11,13};//简化书写形式
        smallPrimes = new int[] {17, 19, 23, 29, 31, 37, 41};//匿名数组，给数组变量重新初始化
        System.out.println(Arrays.toString(smallPrimes));

        //数组拷贝
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[0] = 100;//smallPrimes[0]也会改变
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(smallPrimes));//同时改变

        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers,luckyNumbers.length);
        copiedLuckyNumbers[0] = 1000;
        System.out.println(Arrays.toString(copiedLuckyNumbers));
        System.out.println(Arrays.toString(luckyNumbers));//不改变

        //数组排列
        int[] b = {123, 22, 663, 27, 105};
        Arrays.sort(b);//使用了优化的快速排序算法
        System.out.println(Arrays.toString(b));

        //多维数组
        double[][] balances;
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        }





    }
}
