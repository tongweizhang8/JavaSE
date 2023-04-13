package com.ztw.study_SwichCase;/*
编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天。

2  15:  31 + 15

5 7: 31 + 28 + 31 + 30 + 7

....

说明:break在switch-case中是可选的
*/
import java.util.Scanner;
public class SwichCaseTest2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        System.out.println("请输入2019年月");
        int month = scan.nextInt();
        System.out.println("请输入2019年天");
        int day = scan.nextInt();

        //定义一个变量来保存总天数
        int sumDays = 0;

        switch(month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }

        System.out.println("2019年" + month + "月" + day + "日是当年的第" + sumDays + "天");
    }
}
