package com.ztw.study_Scanner;/*
* 如何从键盘上获取不同类型的变量 ： 需要使用Scanner类
* 具体实现步骤：
*   1.导包 import java.util.Scanner;
*   2.Scanner实例化（也就是创建一个Scanner的对象)  Scanner sc = new Scanner(System.in);
*   3.调用Scanner类的相关方法，next()/nextxxx() 来获取指定类型的变量  int sum = sc.nextInt();
注意
需要根据相应的方法，来输入指定类型的值，如果输入的数据类型与要求不匹配时，会报异常；InputMisMatchException，导致程序终止
 */
import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = sc.next();
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        Double weight = sc.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了呢（true/faise）");
        boolean islove = sc.nextBoolean();
        System.out.println(islove);

        //对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的姓别 （男/女）");
        String gender = sc.next();
        System.out.println(gender);
        char genderChar = gender.charAt(0);//获取索引0位置上的字符
        System.out.println(genderChar);

    }
}
