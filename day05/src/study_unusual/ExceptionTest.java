package study_unusual;
import java.io.File;
import java.io.FileInputStream;
import java.sql.JDBCType;
import java.util.Date;
import java.util.Scanner;

import org.testng.annotations.Test;

import static java.sql.JDBCType.NULL;

/*
 * 一、异常体系结构
 *
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理。
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|------编译时异常(checked)
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 			|------运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException
 * 					|-----ArrayIndexOutOfBoundsException
 * 					|-----ClassCastException
 * 					|-----NumberFormatException
 * 					|-----InputMismatchException
 * 					|-----ArithmeticException
 *
 *
 *
 * 面试题：常见的异常都有哪些？举例说明
 */
public class ExceptionTest {
     //******************以下是运行时异常***************************
     //NuLLPointerException
     @Test
     public void test1(){

//		int[] arr = null;
//		System.out.println(arr[3]);

          String str = "abc";
          str = null;
          System.out.println(str.charAt(0));

     }

     //ArrayIndexOutOfBoundsException
     @Test
     public void test2(){
//          int[] arr = new int[10];
//          System.out.println(arr[10]);
          String str = "abc";
          System.out.println(str.charAt(3));

     }

     //ClassCastException
     @Test
     public void test3(){
          Object obj = new Object();
          String str  = (String) obj;
     }

     //NumberFormatException
     @Test
     public void test4(){
          String str = "abc";
          str = "123";
          int num = Integer.valueOf(str);
     }

     //InputMismatchException
     @Test
     public void test5(){
          Scanner scanner = new Scanner(System.in);
          int score = scanner.nextInt();
          System.out.println(score);
     }

     //ArithmeticException
     @Test
     public void test6(){
          int a = 5;
          int b = 0;
          System.out.println(a/b);
     }
}
