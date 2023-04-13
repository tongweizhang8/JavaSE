package com.ztw.study_for;

/*
break和continue关键字的使用
                使用范围            循环中使用的作用(不同点）        相同点
break           switch-case           结束当前循环              关键字后面
                循环结构中                                      不能声明
continue        循环结构中              结束当次循环               执行语句
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            if (i % 4 == 0) {
                //break;//123
                continue;//123567910
            }
            System.out.print(i);
        }
        System.out.println();
            System.out.println("*****************************");
        //*****************************
        label:for (int i=1;i<=4;i++){
            for (int j=1;j<=10;j++){
                if (j % 4 == 0) {
//                     break;//默认跳出包裹此关键字最近的一层循环
                     continue;
//                     break label;//结束指定标识的一层循环
//                    continue label;//结束指定标识的一层循环当次循环
                }
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
