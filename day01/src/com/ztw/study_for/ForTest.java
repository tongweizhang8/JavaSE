package com.ztw.study_for;

/*
for循环结构的使用
一。循环结构的四个要素
1.初始化条件
2.循环条件-->是boolean类型
3.循环体
4.迭代条件
二。for循环的结构
for（1；2；4）{
    3
}
执行过程；1-2-3-4-2-3-4-...-2
 */
public class ForTest{
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println("hello world");
        }
        //i；在for循环内有效，出了for循环就失效了
        //System.out.println(i);

        //练习
        int num=1;
        for (System.out.println('a');num<=3; System.out.println('c'),num++){
            System.out.println('b');
        }
        //运行结果；abcbcbc

        //例题；遍历100以内偶数,输出所有偶数的和，输出偶数的个数
        int sum=0;//记录所有偶数的和
        int count=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println("总和为"+sum);
        System.out.println("个数为"+count);
    }
}
