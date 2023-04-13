package study_unusual;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
try-catch-finally中使用
1.finally是可选的
2.finally中声明的是一定会被执行的代码，即使catch中又出现异常，try中有return语句，catch中有return语句等情况
3.像数据库连接，输入输出流，网络编程Socket等资源，JVM不能自动回收，我们需要自己手动进行资源的释放。此时的资源释放，就需要声明在finally中
 */
public class FinallyTest {
    @Test
    public void testMethod(){
        int num = method();
        System.out.println(num);
    }
    public int method(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("执行");
            return 3;
        }
    }
    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e) {
            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("!!!");
        }
    }
    @Test
    public void test2(){
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (fis != null)
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
