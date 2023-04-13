package com.ztw.study_for;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("请输入2个数");
        Scanner java = new Scanner(System.in);
        int a = java.nextInt();
        int b = java.nextInt();

        int max = 0;
        int min = 0;
        for(int j = max;j >= max ;j++){
            if (j%a==0&&j%b==0){
                min = j;
                break;
            }
        }

        System.out.println(min);
    }
}
