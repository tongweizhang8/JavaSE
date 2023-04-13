package com.ztw.study_for;

/*
100以内所有质数
质数：素数，只能被1和它本身整除的自然数->从2开始，到这个数-1结束为止都不能被这个数本身整除
最小的质数；2
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值
        for (int i=2;i<=100;i++){//遍历100以内自然数
            for (int j=2;j<i;j++){//j；i被除尽
                if (i%j==0){
                    isFlag=false;
                }
            }
            if (isFlag==true){
                System.out.println(i);
            }
            isFlag=true;//重置isflag
        }
    }
}
