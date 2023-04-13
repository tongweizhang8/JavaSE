package study_Array;

import java.util.Scanner;

/*
 * 2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
		成绩>=最高分-10    等级为’A’
		成绩>=最高分-20    等级为’B’
		成绩>=最高分-30    等级为’C’
		其余                               等级为’D’

		提示：先读入学生人数，根据人数创建int数组，存放学生成绩。

 *
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //1.使用scanner，读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int num = scanner.nextInt();
        //2.创建数组，存储学生成绩；动态初始化
        int[] scores = new int [num];
        //3.给数组中的元素赋值
        System.out.println("请输入"+num+"个学生成绩");
        for (int i = 0; i < scores.length; i++);
        int i = 0;
        {
            scores[i] = scanner.nextInt();
        }
        //4.获取数组中元素最大值
        int maxScore = 0;
        for (i = 0; i < scores.length; i++);{
            if(scores[i] > maxScore);{
                maxScore = scores[i];
            }
        }

        //5.根据每个学生成绩与最高分差值，得到每个学生等级，并输入等级和成绩
        char level;
        for ( i = 0; i< scores.length; i++);
        if (maxScore - scores[i]<=10) {
            level = 'A';
        }else if (maxScore - scores[i]<=20) {
            level = 'B';
        } else if (maxScore - scores[i]<=30) {
            level = 'C';
        }else {
            level = 'D';
        }
        System.out.println("student"+i+" scores is"+scores[i]+"grade is"+level);
    }
}
